public class VectorHelperRosa {

    public static int[] MaxMinVecteur(int[] v  )/** Fonction qui renvoie dans un tableau [2] le
     et le maximum d'un vecteur v
     **/
    {
        int MaxMin[] =new int[2];
        MaxMin[0]=MaxMin[1]=v[0];/**
     MaxMin[0] contient le max
     MaxMin[1] contient le min
     **/
        for (int i=1; i<v.length; i++)
        {
            if (v[i]>MaxMin[0]) MaxMin[0]=v[i];
            if (v[i]<MaxMin[1]) MaxMin[1]=v[i];
        }
        return MaxMin ;
    }


    public static int [] Tri(int [] v) {
        
        int k1=0;
       int m;
       while(k1<v.length){
        for (int i = k1+1; i <v.length ; i++) {

        
          if (v[k1] > v[i ]) {
                 m = v[i];
                v[i] = v[k1];
                v[k1] = m;
               }
        
        }k1++;}

    return v;
}

  

}
