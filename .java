public class main{
public static void main(String[]args){
char ch='a';
int i=ch;
System.out.println(ch);
int count=0;
for(j=1;j<ch;j++){
if(ch%j==0){
count++;
}
}
if(count==2)
System.out.println("it is a prime number");
else
System.out.println("it is not a primt number");
}
}
