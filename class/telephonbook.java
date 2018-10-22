package javaapplication3;
import java.util.ArrayList;
import java.util.Scanner;

public class telephonbook {
  public void setAbonents(int all,int index, ArrayList<Abonent> abon){
      Scanner in = new Scanner(System.in);
     
       
      for(int i =all;i< all+index;i++){
          abon.add(new Abonent());
      }
      
        for(int i =all;i< all+index;i++){
            int j =i+1;
            System.out.println("№"+j);
         abon.get(i).SetAbonent(in.next(), in.next());
      }
    
}
  public void getAbonents (int index,ArrayList<Abonent> abon){
        
      for(int i =0;i< index;i++){
          System.out.print(i+1+") ");
         abon.get(i).GETAbonent();
      }
  }
  
    public void changAbonents (int index,ArrayList<Abonent> abon){
        Scanner in = new Scanner(System.in); 
        abon.get(index).SetAbonent(in.next(), in.next());   
  }
    
     public void removeAbonents (int index,ArrayList<Abonent> abon){
        abon.remove(index);   
  }
}
