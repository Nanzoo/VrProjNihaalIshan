import java.lang.Math;

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
