import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class View {
    private XMLLogParser parser;
    private List<Log> logEntries;

    private final Controller controller;
    private final Scanner scanner = new Scanner(System.in);

    public View() throws IOException {
        this.parser = new XMLLogParser(); // Initialize parser
        this.logEntries = parser.parse("src/spielorte.xml"); // Parse logs
        this.controller = new Controller(logEntries); // Initialize controller with logs
    }

    public void menu() {
        while (true) {
            System.out.println();
            System.out.println("Press:");
            System.out.println("1. Filter");
            String input = scanner.nextLine();

    }
}
