//method overriding (run-time polymorphism) and inheritance
class a2
{
    public void display()
    {
        System.out.println("a2");
    }
}
class a extends a2
{
    public void display()
    {
        System.out.println("a");
    }
public static void main(String []args)
{
    a oa=new a();
    oa.display();
    a2 ob=new a2();
    ob.display();
}
}
