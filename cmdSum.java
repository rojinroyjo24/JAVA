//Program to find the sum of command line arguments and count the invalid integers entered
//through the command line.

class cmdSum{
public static void main(String arg[]){
int sum=0;
int invalid=0;
int num=0;
for(int i=0;i<arg.length;i++){
try {
num=Integer.parseInt(arg[i]);
sum=num+sum;
}
catch(NumberFormatException e){
invalid=invalid+1;
}
}
System.out.println("sum = " + sum);
System.out.println("invalid integers = " + invalid);
}
}
/*
mlm@mlm-desktop:~/Desktop/Rojin/java$ javac cmdSum.java
mlm@mlm-desktop:~/Desktop/Rojin/java$ java cmdSum
sum = 0
invalid integers = 0
*/
