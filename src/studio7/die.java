public class die {
    private int sides;
    public die(int sides) {
        this.sides = sides;
    }
    public int randomNumber() {
        int randomNumber = (int)(Math.random()*sides+1);
        return randomNumber;
    } 
public static void main(String[] args) {
    die D1 = new die(6);
    System.out.println(D1.randomNumber());
}
    }

