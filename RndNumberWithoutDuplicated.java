package Collection;

public class RndNumberWithoutDuplicated{

    public static void main(String[] args){

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for(int i = 0; i < 50; i++){
            int r = randomNumberGenerator.generate(10);
            System.out.println(r);
        }
    }
}
