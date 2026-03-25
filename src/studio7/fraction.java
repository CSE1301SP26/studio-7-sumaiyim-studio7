public class fraction {
    private int denominator;
    private int numerator;

public fraction(int numerator, int denominator){
    this.denominator = denominator;
    this.numerator = numerator;
}

public int getnum(){
    return this.numerator;
}

public int getden(){
    return this.denominator;
}

public fraction add(fraction other){
    int newnum = this.numerator*other.getden() + other.getnum()*this.denominator;
    int newden = this.denominator*other.getden();
    return new fraction(newnum, newden);
}

public String tostring(){
    return numerator+"/"+denominator;
}

public static void main(String[] args){
    fraction f1 = new fraction(2,3);
    fraction f2 = new fraction (3, 4);
    System.out.println((f1.add(f2)).tostring());
}

}
