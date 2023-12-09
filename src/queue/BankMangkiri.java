package queue;
public class BankMangkiri {
    
    public static void main(String[] args) {
        Queue que = new Queue(10);
        que.Insert("A");
        que.Insert("B");
        que.Insert("C");
        que.Insert("D");
        que.Insert("E");
        que.Insert("F");
        que.Insert("G");
        que.Insert("H");
        que.Insert("I");
        que.info();
        System.out.println("--------------------");
        
        System.out.println(que.infoRear());
        System.out.println(que.infoFront());
        
        System.out.println("--------------------");
        
        que.remove();
        que.info();
        System.out.println(que.infoRear());
        System.out.println(que.infoFront());
        
        System.out.println("--------------------");
        
    }
}
