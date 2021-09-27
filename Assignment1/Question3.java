class fetchData extends Thread{  
    public void run(){ 
        try{
            Thread.sleep(500);
            long endTime = System.currentTimeMillis();
            for(int i=1;i<6;i++){
            System.out.println("fetched "+(endTime - Question3.startTime)+"ms "+i);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }  
    System.out.println("Data Fetch Completed\n"); 
    }  
}
    
class processData implements Runnable{  
    public void run(){ 
        try{
            Thread.sleep(500);
            long endTime = System.currentTimeMillis();
            for(int i=1;i<6;i++){
                 System.out.println("processed "+(endTime - Question3.startTime)+"ms "+i);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);     
        }  
    System.out.println("Data Processing Completed\n"); 
    }  
}
    
public class Question3 {
    static long startTime = System.currentTimeMillis();
    
    public static void main(String args[]){  
        fetchData fetcher = new fetchData();
        processData processer = new processData();
        
        Thread thrd =new Thread(processer); 
        thrd.setPriority(Thread.MIN_PRIORITY);  
        fetcher.setPriority(Thread.MAX_PRIORITY);  
        
        try {
            fetcher.start();
            fetcher.join();
            thrd.start();
        } catch(InterruptedException e) {
             System.out.println(e);    
        }
    }  
}