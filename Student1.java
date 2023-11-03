import java.time.LocalDate;
import java.time.Period;

public class Student1 {
    String name;
    LocalDate date_of_birdth;
    int phone_numbers;
    String nationaly;

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", date_of_birdth=" + date_of_birdth +
                ", phone_numbers=" + phone_numbers +
                ", nationaly='" + nationaly + '\'' +
                '}';
    }

    public Student1(String name, LocalDate date_of_birdth, int phone_numbers, String nationaly) {
        this.name = name;
        this.date_of_birdth = date_of_birdth;
        this.phone_numbers = phone_numbers;
        this.nationaly = nationaly;
    }
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(date_of_birdth, currentDate);
        return age.getYears();
    }
}
