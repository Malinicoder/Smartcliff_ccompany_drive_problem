import java.util.*;
class Ticket{
}
public class Main {
    Main(){
         List<Integer> l1=new ArrayList<>(50);
        for(int i=1;i<=50;i++){
            l1.add(i);
        }
        start(l1);
    }
    void start(List l1){
        System.out.println("Movie Ticket booking System");
        System.out.println("1.Book Ticket");
        System.out.println("2.Print Booked Tickets");
        System.out.println("3.Print Available seats");
        System.out.println("4.Exit");
        ch(l1);
    }
    String name;
    int age;
    String gender;
    long phno;
    int seatno;
    ArrayList<String> name1=new ArrayList<>();
    ArrayList<Integer> age1=new ArrayList<>();
    ArrayList<String> gender1=new ArrayList<>();
    ArrayList<Long> ph=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    void choices(List l1,int choice){
        System.out.println();
        switch (choice) {
            case 2:
                System.out.println(name1);
                System.out.println(age1);
                System.out.println(gender1);
                System.out.println(ph);
                System.out.println(seatno);

                break;
            case 3:
                System.out.println("Available");
                System.out.println(l1);
                break;
            case 4:
                System.out.println("thank u");
                break;
        }

    }
    void ch(List l1){
        System.out.println();
        System.out.println("Enter Your Choice");
        int choice=sc.nextInt();

        if(choice==1){
            System.out.println(l1);
            System.out.println("Enter your name");
            name = sc.next();
            name1.add(name);


            System.out.println("Enter your age");
            age = sc.nextInt();
            age1.add(age);

            System.out.println("Enter your gender");
            gender = sc.next();
            gender1.add(gender);

            System.out.println("Enter your contact number");
            phno = sc.nextLong();
            ph.add(phno);
            System.out.println("Enter your seat");
            seatno = sc.nextInt();

             l1.remove(seatno);
            System.out.println(l1);
            start(l1);
        }
        else{
            choices(l1,choice);
            start(l1);
        }
    }
    public static void main(String[] args) {
        Main tc=new Main();



    }
}
