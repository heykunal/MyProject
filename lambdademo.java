interface calculate
{
int add(int x,int y);
}

class lambdademo
{
public static void main(String ar[])
{
/* calculate t=(a,b)->{return a+b;};
int result =t.add(10,20);
System.out.println("result of addition " +result); */

/* Runnable r=()->{
	for(int i=0;i<5;i++)
		System.out.println(i);
	};
Thread t=new Thread(r);
t.start(); */

new Thread(()->{
	for(int i=0;i<5;i++)
		System.out.println(i);
	}).start();
}
}
