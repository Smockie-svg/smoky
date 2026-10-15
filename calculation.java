public class calculation {
    int width;
    int length;
    calculation (int width, int length){
        this.width = width;
        this.length=length;

    }
    int showresult(){
        int area = width*length;
        return area;
    }
    public static void main(String[] args){
        calculation K= new calculation(10,5);
        int result=K.showresult();
        System.out.println("AREA:" + " " + result);
    }
}
