package queue;
public class Queue {
    
    String [] data;
    int front, rear;
    int maxElement;
    
    public Queue(int size){
        front = 0;
        rear = 0;
        maxElement = size;
        data = new String[maxElement];
    }
    
    public boolean isFull(){
        return rear==maxElement;
    }
            
    public void Insert(String data){
        
        if (rear==maxElement) {
            System.out.println("Queue is full");
            System.out.println(data + "Is not include in queue");
        } 
        else {
            this.data[rear] = data;
            rear++;
        }
    }
    
    public String infoRear(){
        return "Last posision is: " + data[rear-1];
    }
    
    public String infoFront(){
        return "First posision is: " + data[front];
    }
    
    public boolean isEmpty(){
        return front==0;
    }
    
    public String remove(){
        String a = data[front];
        data[front] = null;
        front++;
        return a;
    }
       
    public void info(){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    
    
}
