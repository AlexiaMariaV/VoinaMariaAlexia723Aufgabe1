import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class XMLLogParser {
    public List<Log> parse(String filePath) throws IOException {
        List<Log> logEntries = new ArrayList<>();
        Path file = Path.of(filePath);

        StringBuilder xml = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                xml.append(line.trim());
            }
        }

        String content = xml.toString();
        String[] logs = content.split("</log>");
        for (String log : logs) {
            if (!log.contains("<log>")) continue;
            log = log.substring(log.indexOf("<log>") + 5).trim();

            int id = Integer.parseInt(extractTagValue(log, "id"));
            String team1 = extractTagValue(log, "team1");
            String team2 = extractTagValue(log, "team2");
            LocalDate date = LocalDate.parse(extractTagValue(log, "date"));
            String city = extractTagValue(log, "city");
            int capacity = Integer.parseInt(extractTagValue(log, "capacity"));

            logEntries.add(new Log(id, team1, team2, date, city, capacity));
        }
        return logEntries;
    }

    private String extractTagValue(String log, String tagName) {
        String startTag = "<" + tagName + ">";
        String endTag = "</" + tagName + ">";
        int startIndex = log.indexOf(startTag) + startTag.length();
        int endIndex = log.indexOf(endTag);
        return log.substring(startIndex, endIndex).trim();
    }
}
