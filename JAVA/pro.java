import java.util.*;
class product{

    String name;
    int code,price;

    void details(int n){
        
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the name of the product"); 
        name=sc.next();
        code=n;
        System.out.print("enter the price of the product"); 
        price=sc.nextInt();

    }

    void lowest(product a,product b){
        if(this.price<a.price && this.price<b.price){
            System.out.println(this.name+"1 has lowest");
        }
        else if(a.price<b.price){
            System.out.println(a.name+"2 has lowest");

        }
        else{
            System.out.println(b.name+"3 has lowest");

        }
    }
}

class pr{
    public static void main(String args[]){
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.details(1);
        p2.details(2);
        p3.details(3);
        p1.lowest(p2,p3);
    }
}