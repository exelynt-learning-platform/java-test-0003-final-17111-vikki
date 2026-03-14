class JavaTest3{
    public static void main(String[] args) {
        int p = 1;
        int n = 6;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                p=0;           
            }
            else{
                p=1;
            }
            for(int j=1;j<=i;j++){
               if(p==1){
                    System.out.print(p--);
               }
               else if(p==0){
                    System.out.print(p++);
               }
            }
            System.out.println();
        }
    }
}