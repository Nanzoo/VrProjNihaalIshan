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

/*
//Comments Partner A
- Learned how to work collaboratively using GitKraken
- I learned how to create branches and maintain changes while Nihaal was simultaneously working on his work
- I learned how to resolve conflicts while merging branches with Nihaal

//Comments Partner B
- I learned that two people could be working together on different parts of a project and certain parts can be merged when they are ready
- I learned how to go line by line when there is an issue with merging and resolve the issue
- I learned the logistics of Git, Github, and GitKraken and how to use it to publish work






*/




