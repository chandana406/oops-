//encapsulation
public class a4
 {
     private String name;
     public String getName()
    {
        return name;

        }
        public void setName(String name)
        {
            this.name=name;
        }
}
class im{
    public static void main(String[] args) {
        a4 od = new a4();
        od.setName("chandana");
        System.out.println("name is " + od.getName());
    }
}
