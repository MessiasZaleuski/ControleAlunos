package controlealunos;

import java.util.ArrayList;

public class ControleAlunos {

   
    public static void main(String[] args) {
        ArrayList<Alunos>ListaAlunos = new ArrayList();
        
        Alunos a1 = new Alunos();
        a1.setNome("Messias");
        a1.setMatricula("001");
        a1.setTelelfone("555555");
        
        ListaAlunos.add(a1);
        
        Alunos a2 = new Alunos();
        a2.setNome("João");
        a2.setMatricula("002");
        a2.setTelelfone("666666");
        
        ListaAlunos.add(a2);
        
        Alunos a3 = new Alunos();
        a3.setNome("Sofia");
        a3.setMatricula("003");
        a3.setTelelfone("777777");
        
        ListaAlunos.add(a3);
        
        for(int i=0;i<ListaAlunos.size();i++){
            System.out.println(ListaAlunos.get(i).getDados());
    }
    
    }
}
