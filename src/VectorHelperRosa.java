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


    public int [] Tri(int [] v) {
        /**
         * fonction qui permet de trier un tableau selon un ordre croissant
         */
        int cpt = 0; /** varible qui permet de reparcourir de vecteur pour chaque "i" jusqu'a
         ce que le vecteur soit trier 
         **/
        do {


            for (int i = 1; i < v.length; i++) {
                if (v[i] > v[i + 1]) {
                    int m = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = m;
                cpt++;
                }

            }

        }while (cpt!=0);

        return v;
    }

}
