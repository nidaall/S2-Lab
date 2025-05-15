import java.util.Scanner;

public class arrofobj {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of objects");
        int no=sc.nextInt();
        demo[] arr=new demo[no];
        for(int i=0;i<no;i++){
            arr[i]=new demo();
        }
        for(int i=0;i<no;i++){
            arr[i].display();
        }
    }
}

class demo{
    
    int no;
    String name;
    demo(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no");
    no=sc.nextInt();
    System.out.println("enter the name");
    name=sc.next();
    }

    void display(){
        System.out.println(this.no+" "+this.name);
    }
}