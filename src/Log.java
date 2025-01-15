import java.time.LocalDate;

public class Log {
    private int id;
    private String team1;
    private String team2;
    private LocalDate date;
    private String city;
    private int capacity;

    public Log(int id, String team1, String team2, LocalDate date, String city, int capacity) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.city = city;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", date=" + date +
                ", city='" + city + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
