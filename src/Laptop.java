
public class Laptop {

    public String Name;
    public double Price;
    public String processor;
    public String ram;
    public String HardDrive;


    public Laptop(String Name, int Price, String processor, String ram, String HardDrive) {
        this.Name=Name;
        this.Price=Price;
        this.processor=processor;
        this.ram=ram;
        this.HardDrive=HardDrive;
        System.out.println("Name:" + Name);
        System.out.println("Price: $"+ Price);
        System.out.println("Processor:" + processor);
        System.out.println("Ram:" + ram);
        System.out.println("HardDrive:" + HardDrive );
        System.out.println("*******************************");
    }

}

class Laptop1 extends Laptop {

    public Laptop1(String Name,int Price, String processor, String ram, String HardDrive)
    {
        super(Name,Price,processor,ram,HardDrive);
    }


    public static void main(String[] args) {

        Laptop1 lenova=new Laptop1("Lenovo",1000,"i3","2GB","500GB");
        Laptop1 Mac =new Laptop1("Dell",1500,"i5","4GB","1TB");
        Laptop1 Hp =new Laptop1("Sony",2000,"i9","8GB","1TB");






    }


}
