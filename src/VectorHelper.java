import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class VectorHelper {
    public static int [] Somme (int [] Tab1, int []Tab2){/**Fonction qui fait la somme des valeurs de deux tableaux en entrée et retourne le tableau resultatant**/
    	int[] Tab=null;/** Declarer un tableau vide **/
    try{	
    	if (Tab1.length==Tab2.length){   /** Le cas d'egalité de longeur des tables **/
    		Tab=new int [Tab1.length];   /** Donner la taille commune des deux tableaux au tableau  deja Declarer **/
    		for (int i=0;i<Tab1.length;i++){ /**Parcourir tous les elements des deux tableaux **/
    			Tab[i]=Tab1[i]+Tab2[i]; /**Affecter le resultat de la somme  des  deux cases des 2 tableaux dans le nouveau tableau**/ 			
    		}}
    	else {/**Le cas de difference de taille des deux tableaux **/
    			throw new DiffrentlengthException();/** Jeter une exception **/
    		}
    	
       }
       catch(DiffrentlengthException e){ /**Traiter le cas de l'exception **/
         System.out.println("Les tailles des deux tableaux sont differentes");/**Afficher le message d'exception **/
    	
       }
    return Tab; /**Retourner le nouveau tableau en sortie **/
		
		}
    
    public static int[] inverse(int Tab[]){/**une fonction qui donne en sortie un tableau inverser de celui en entrée**/
    	int k2=Tab.length-1; /**Affecter l'indice du dernier element du tableau en entrée a une variable**/
    	int kmid=k2/2; /**Affecter l'indice du millieu : l'indice d'arret d'inversement  **/
    	int val; /** Une variable qui permet de permuter entre deux elements **/
    	for (int k1=0;k1<=kmid;k1++){/**Une boucle qui varie entre le debut et le millieu du tableau en entrée**/
    		val=Tab[k1];/**affecter la valeur a permuter dans une variable **/
    		Tab[k1]=Tab[k2];/**Affecter un element a permuter dans la case de celui qui est enregistrer dans la variable val**/
    		Tab[k2]=val;/**affecter la valeur de val dans la case deja permutée**/
    		k2--;/**décrementer pour passer au prochain element a permuter avec l'element de la case Tab[k1] avec k1 qui va etre incrementé a l'aide de la boucle for **/
    		
    	}
    	
    	return Tab;
    }
    
    public static int [] formule(int Tab[],char c,int k){/**une fonction qui donne en sortie un tableau dont la formule c ,par la valeur k ,est realisé
    	if ((c!='+')&&(c!='*')&&(c!='/')&&(c!='-'))/**le cas ou le caractere ne represente aucune formule**/
    	{System.out.println("Vous ne pouvez que faire la division /,la somme + ,soustraction -, produit *" );/**Afficher un message**/}
    	if (c=='+'){/**Le cas de la somme**/
    		for (int i=0;i<Tab.length;i++){/**Parcourir tout le Tableau**/
        		Tab[i]=Tab[i]+k;/**Realisation de l'addition avec k**/
        		}
    	}
    	if (c=='/'){/**Le cas de la division**/
    		if (k!=0){/**Le cas de division possible**/
    		for (int i=0;i<Tab.length;i++){/**Parcourir tout le Tableau**/
        		Tab[i]=Tab[i]/k;/**Realisation de la division par k**/
        		}
    		}
    		else{System.out.println("La division par zero est impossible");/**Le cas de division impossible (division par zero),Afficher un message d'erreur**/
    		}
    		
    	}
    	if (c=='*'){/**Le cas du produit**/
    		for (int i=0;i<Tab.length;i++){/**Parcourir tout le Tableau**/
        		Tab[i]=Tab[i]*k;/**Realisation du produit par k**/
        		}
  	
    	}
    	if (c=='-'){/**Le cas de soustraction**/
    		for (int i=0;i<Tab.length;i++){/**Parcourir tout le Tableau**/
        		Tab[i]=Tab[i]-k;}/**Realisation de la soustraction de k **/
  	
    	}
    	
    	return Tab;
    	
    }
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] V1={1,5,8,7,2,6,4,7,8,2,7};
		int[] V2={4,7,8,3,6,4,1,5,2,8,9,3};
	
		
 
	}

}
