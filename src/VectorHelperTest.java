import static org.junit.Assert.*;

import org.junit.Test;

public class VectorHelperTest {

	int []V1={1,8,9, 2, 6, 7, 21,5, 9, 88,64,3,2};
	int []V2={2,3,42,63,32,52,85,62,12,41,2, 1,5};
	int []Vinverse={2,3,64,88,9,5,21,7,6,2,9,8,1};
	int [] VSomme={3,11,51,65,38,59,106,67,21,129,66,4,7};
	int [] Vresultat={2,16,18,4,12,14,42,10,18,176,128,6,4};
	
	VectorHelper h1 =new VectorHelper();;
	@Test
	public void Somme() {
	
		int []result=h1.Somme(V1,V2);
		assertArrayEquals(VSomme,result);
		
	}
	@Test
	public void inverse() {
		
		
		int [] result =h1.inverse(V1);
		assertArrayEquals(Vinverse,result);
		
	}
	@Test
	public void formule() {
		
		
		int [] result =h1.formule(V1,'*',2);
		assertArrayEquals(Vresultat,result);
		
	}
	  
}
