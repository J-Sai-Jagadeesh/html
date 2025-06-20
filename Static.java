/*
class Firstclass
{
static int a=5;
static int b=10;
int x=8;
int y=7;
static
{
int a=50;
System.out.println(a+b);	
}
static
{
int b=56;
System.out.println(a+b);
}
{
System.out.println(x+y);
}
{
System.out.println("This is instance block1");
}
{
System.out.println("This is instance block2");
}
static void add()
{
System.out.println(a+b);
}
static void sub()
{
System.out.println(a-b);
}
void mul()
{
System.out.println(x*y);
}
void div()
{
System.out.println(x/y);
}

public static void main(String []ar)
{
Firstclass ob=new Firstclass();
ob.mul();
ob.div();
add();
sub();
}
}
*/

/*2*/

/*
class Static{
int a=10;
int b=20;
static void addandsub()
{
Static ob=new Static();
System.out.println(ob.a+ob.b);
System.out.println(ob.a-ob.b);
}
public static void main(String []jaya)
{
addandsub();
}
}*/

/*3*/

/*
class Instance{
static int a=40;
static int b=20;
void addandsub()
{
System.out.println(a+b);
System.out.println(a-b);
}
public static void main(String []jaya)
{
Instance ob=new Instance();
ob.addandsub();
}
}*/

/*4*/

/*
class Staticmethod{
void instance()
{
System.out.println("call instance methods in static methods");
}
static void good()
{
Staticmethod ob=new Staticmethod();
ob.instance();
}
public static void main(String[] args)
{
good();
}
}
*/

/*5*/

/*
class Instancemethod{
static void good()
{
System.out.println("Call static methods in instance methods");
}
void instance()
{
good();
}
public static void main(String[] args){
Instancemethod ob=new Instancemethod();
ob.instance();
}
}
*/

/*6*/
/*
class Variables{
static int a=10;
static int b=20;
int x=5;
int y=15;
public static void main(String[] args)
{
Variables ob=new Variables();
System.out.println("Static variables:"+(a+b));
System.out.println("Instance variables"+(ob.x+ob.y));
System.out.println("Static variables:"+(a-b));
System.out.println("Instance variables"+(ob.x-ob.y));
}
}*/

/*7*/

class Methods{
static void sm()
{
System.out.println("Static Method");
}
void instance()
{
System.out.println("Instance Method");
}
public static void main(String[] args)
{
Methods ob=new Methods();
ob.instance();
sm();
}
}
