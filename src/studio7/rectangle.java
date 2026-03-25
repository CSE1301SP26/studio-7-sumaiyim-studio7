public class rectangle {
        private int length;
        private int width;
        public rectangle(int length, int width){
            this.length = length;
            this.width = width;
        }
        public int area(){
            return length*width;
        }
        public boolean isSmaller(int length1, int width1, int length2, int width2){
            if(length1*width1 < length2*width2){
                return true;
            }else{
                return false;
            }
        }
        public boolean isSquare(){
            if(length == width){
                return true;
            }else{
                return false;
            }
        }
        public static void main(String[] args){
            rectangle R1 = new rectangle(4,5);
            System.out.println(R1.isSmaller(4,5,3,4));
        }
}
