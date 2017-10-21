/**
 Classe contenant des methodes de traitement sur les vecteurs
 */


public class VectorHelperRosa {
    /**
     Fonction qui renvoie dans un tableau [2] le minimum
     et le maximum d'un vecteur v
     */

    public static int[] MaxMinVecteur(int[] v  )
    {
        int MaxMin[] =new int[2];
        MaxMin[0]=MaxMin[1]=v[0];


        for (int i=1; i<v.length; i++)
        {
            if (v[i]>MaxMin[0]) MaxMin[0]=v[i];
            if (v[i]<MaxMin[1]) MaxMin[1]=v[i];
        }
        return MaxMin ;
    }

    /**
      fonction qui permet de trier un tableau selon un ordre croissant
     */
    public int [] Tri(int [] v) {

        int cpt = 0; /** varible qui permet de reparcourir de vecteur pour chaque "i" jusqu'a
         ce que le vecteur soit trier
         */
        while (cpt<v.length)
        {


            for (int i = cpt+1; i < v.length; i++) {
                if (v[cpt] > v[i]) {
                    int m = v[i];
                    v[i] = v[cpt];
                    v[cpt] = m;}

                }
            cpt++;
            }



        return v;
    }

}
