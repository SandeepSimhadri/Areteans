package Calculator;

 class Operations extends calculator {
     /*Operations(int n1,int n2){
         num1=n1;
         num2=n2;
     }*/

    @Override
    public void addition(int num1, int num2) {
        System.out.println(num1+num2);
        }

     public void addition(int num1,int num2, int num3) {
         System.out.println(num1+num2+num3);
     }

    @Override
    public void substract(int num1,int num2) {
        System.out.println(num1-num2);
    }

    @Override
    public void divide(int num1,int num2) {
        if (num2 == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
        }
        else
            System.out.println(num1/num2);
    }

    @Override
    public void multiplication(int num1,int num2) {
         System.out.println(num1*num2);
    }
}
