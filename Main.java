import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student1 num1 = new Student1("Nurtilek",LocalDate.of(2005,12,16),996776133,"Kg" );
        Student1 num2 = new Student1("Nurmuhammed", LocalDate.of(2006,4,22), 4343443,"Kg");
        Student1 num3 = new Student1("Erlan", LocalDate.of(2004,4,3), 325634543,"Kg");
        Student1 num4 = new Student1("Almaz", LocalDate.of(2000,2,13), 5465643,"Kg");
        Student1 num5 = new Student1("Bekzat", LocalDate.of(2006,6,4),43567345,"Kg" );

        System.out.print(" "+num1);
        System.out.println("Жашы"+" "+num1.calculateAge());
        System.out.print(" "+num2);
        System.out.println("Жашы"+" "+num2.calculateAge());
        System.out.print(" "+num3);
        System.out.println("Жашы"+" "+num3.calculateAge());
        System.out.print(" "+num4);
        System.out.println("Жашы"+" "+num4.calculateAge());
        System.out.print(" "+num5);
        System.out.println("Жашы"+" "+num5.calculateAge());





        }

    }
