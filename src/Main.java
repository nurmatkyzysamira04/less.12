import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        University university=new University();
        System.out.println("University name");
        university.setName(scanner.nextLine());
        System.out.println("how many para day?");
        university.setPara(scanner.nextInt());
        System.out.println("how many students are at the university?");
        university.setStudent(scanner.nextInt());
        System.out.println(university.getName());
        System.out.println(university.getPara());
        System.out.println(university.getStudent());

        System.out.println("***********************");

        Scanner scanner1=new Scanner(System.in);
        School school=new School();
        System.out.println("name School");
        school.setName(scanner1.nextLine());
        System.out.println("how many lessons per day?");
        school.setLesson(scanner1.nextInt());
        System.out.println("how many pupils in school?");
        school.setPupils(scanner1.nextInt());
        System.out.println(school.getName());
        System.out.println(school.getLesson());
        System.out.println(school.getPupils());

        System.out.println("*****************");

        Scanner scanner2=new Scanner(System.in);
        Car car=new Car();
        System.out.println("brand car");
        car.setBrand(scanner2.nextLine());
        System.out.println("color car");
        car.setColor(scanner2.nextLine());
        System.out.println("price car");
        car.setPrice(scanner2.nextInt());
        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());

        System.out.println("**************");

        Scanner scanner3=new Scanner(System.in);
        Person person=new Person();
        System.out.println("name");
        person.setName(scanner3.nextLine());
        System.out.println("surname");
        person.setSurname(scanner3.nextLine());
        System.out.println("age");
        person.setAge(scanner3.nextInt());
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());









    }
}











