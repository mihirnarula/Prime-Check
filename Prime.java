package prime;

import java.util.Scanner;

public class Prime {
int n;
Prime(){
    n = 0;
}
void input(int x){
    n = x;
}
void display(){
    int count = 0;
for(int i = 2; i < n; i++){
    
    if(n % i == 0){
        count = 1;
    }
}
 if(count == 0){
System.out.println("It is a prime number");     
}
else
     System.out.println("Not a prime numver");
}


    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int y = sc.nextInt();
Prime ob1 = new Prime();
ob1.input(y);
ob1.display();

    }
    
}
