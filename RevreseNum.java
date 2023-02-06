public class
{
  public static void main(String[] args)
  {
    int Rev=0;
    int num=456;
    while(num!=0)
    {
      Rev=Rev*10+num%10;
      num=num/10;
    }
    System.out.print("Reverse number of num:"+Rev);
  }
}
      
