import java.util.Random;
public class MyRandom
{
	public static void main(String[] args) 
	{
		for(int i=0;i<3;i++)
		{
			MyRandom randomNum = new MyRandom();
			System.out.println(randomNum.getRandomBetweenNumbers(0,100));
		}
	}
	public int getRandomBetweenNumbers(int min, int max) 
	{
		Random random = new Random();
		return random.nextInt(min,max);
	}
}