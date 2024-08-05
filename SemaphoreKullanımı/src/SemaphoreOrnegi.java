
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemaphoreOrnegi {
    
    Semaphore semaphore = new Semaphore(3);
    //thread sayisini burada veriyoruz.
    
    public void threadFonksiyonu(int id){
        
        try {
            semaphore.acquire();
            //bu fonksiyon kontrol ediyor her threadde1 azalıyor.
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Thread basliyor İD:"+id);
        
        
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread çıkıyor İD:"+id);
        
        semaphore.release();
    }
}
