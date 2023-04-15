//abstraction
abstract class a5 {
    public abstract void shapetest();
}
 class triangle extends a5
{
    public void shapetest()
    {
        System.out.println("3");
    }
}
class in
{
    public static void main(String []args)
    {
        triangle ot=new triangle();
        ot.shapetest();
    }
}

