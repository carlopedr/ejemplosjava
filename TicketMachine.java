package ticketmachine;
import java.util.Scanner;
public class TicketMachine {
    //Definición de los atributos de la clase
    private int price;
    private int balance;
    private int total;
    //Constructores

    public TicketMachine(int price, int balance, int total) {
        this.price = price;
        this.balance = balance;
        this.total = total;
    }
    
    public TicketMachine(int ticketCost){
        this.price=ticketCost;
        this.balance=0;
        this.total=0;
    }
    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotal() {
        return total;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void insertMoney(int amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public String toString() {
        return "TicketMachine{" + "price=" + price + ", balance=" + balance + ", total=" + total + '}';
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Crear objetos
        TicketMachine t1 =new TicketMachine(200,100,100);
        System.out.println("Precio:"+t1.getPrice());
        t1.setPrice(550);
        System.out.println("Precio:"+t1.getPrice());
        System.out.print("Valor del billete:");
        int amount=input.nextInt();
        t1.insertMoney(amount);
        System.out.println("Balance:"+t1.getBalance());
        System.out.println(t1.toString());
        
    }
    
}
