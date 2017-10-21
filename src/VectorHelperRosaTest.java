import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorHelperRosaTest {

    VectorHelperRosa VTest= new VectorHelperRosa() ;
    @Test
    public void MaxMinVecteur()
    {

        int [] tab1={24,57,68,1};
        int [] tab2={68,1};
        int [] minmax =VTest.MaxMinVecteur(tab1);
        assertArrayEquals(tab2,minmax);
    }
    @Test
    public void Tri()
    {
       int []tab1={45,18,4,74,235,6,-2};
       int []tab2={-2,4,6,18,45,74,235};
       int []tabTri=VTest.Tri(tab1);
       assertArrayEquals(tab2,tabTri);
    }

}