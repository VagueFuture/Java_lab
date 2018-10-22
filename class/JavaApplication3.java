package javaapplication3;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication3 {


    public static void main(String[] args) {
        telephonbook obj = new telephonbook();
        int index;
        int all=0;
        int key=0;
         Scanner in = new Scanner(System.in);
        ArrayList<Abonent> abon = new ArrayList<Abonent>();
        
        
        while(key !=5){
            System.out.println("1) Добавить");
            System.out.println("2) Посмотреть");
            System.out.println("3) Удалить");
            System.out.println("4) Изменить");
            System.out.println("5) Выход");
            key = in.nextInt();
            
            switch (key){
                case 1:{
                    System.out.println("_____________________");
                    System.out.println("Сколько добавить?");
                    index = in.nextInt();
                    obj.setAbonents(all,index, abon);
                    all+=index;
                    System.out.println("_____________________");
                    break;
                }
                case 2:{
                    System.out.println("_____________________");
                    obj.getAbonents(all, abon);
                    System.out.println("_____________________");
                    break;
                }
                case 3:{
                   
                    System.out.println("Какой номер?");
                    index = in.nextInt();
                    obj.removeAbonents(index-1, abon);
                    all--;
                    System.out.println("Удалено");
                    break;
                }
                case 4:{
                    System.out.println("_____________________");
                    System.out.println("Какой?");
                    index = in.nextInt();
                    obj.changAbonents(index-1, abon);
                    System.out.println("_____________________");
                    break;
                }
            }
        }
    }
 
}
