//method overloading (compile-time polymorphism)
class a3
{
    public int display(int a,int b)
    {
        return a+b;
    }
    public double display(double a,double b)
    {
        return a+b;
    }
}
class main1
{
    public static void main(String []args)
    {
        a3 oc=new a3();
        System.out.println(oc.display(2.0,3.1));
    }
}
