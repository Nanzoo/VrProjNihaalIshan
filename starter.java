import java.lang.Math;


interface QInterface 
{ 
    public void qTime(float numOne, float numTwo); 
} 
 
public class QRun
  {
    public QRun()
    {
      QInterface qI = (float numOne, float numTwo)->
        {
          float div = numOne/numTwo;
          System.out.printf(" %.3f",div); 
        };
        qI.qTime(8,3);
    }
    public static void main(String[]args)
    {
      QRun app = new QRun();
    }


    
  }
//{ 
    //public void qTime(float numOne, float numTwo) 
   // { 
    //    float quo = numOne/numTwo; 
         
     //   System.out.printf(" %.3f",quo); 
 
   // } 
//} 
 


public interface Square{

	public boolean checker(int x);


}

public class squareRunner{

	public squareRunner()
		{
			Square s = (x)->{


				double sqrt = Math.sqrt(x);

				return ((sqrt - Math.floor(sqrt)) == 0);


			};

			System.out.println(s.checker(6));
			System.out.println(s.checker(9));
			System.out.println(s.checker(49));

		}


	public static void main(String[]args)
		{
			squareRunner apps = new squareRunner();

		}

}
