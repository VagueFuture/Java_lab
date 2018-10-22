package javaapplication3;

public class Abonent {
    private String Name;
    private String Number;
    
    public void SetAbonent(String Abon, String NUM){
        this.Name = Abon;
        this.Number = NUM;
    }
    
    public void GETAbonent(){
    System.out.println(this.Name);
    System.out.println(this.Number);
    }
    
}
