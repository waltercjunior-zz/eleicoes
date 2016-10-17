/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author wgjunior
 */
public class FileReader {

    //private String diretorio = "C:\\Users\\wgjunior\\Desktop\\Eleições\\votacao_candidato_munzona";
    private String diretorio = "C:\\Users\\wgjunior\\Desktop\\Eleições\\Dados\\Resultados";
    //private String diretorio = "C:\\Users\\wgjunior\\Desktop\\Eleições\\Universo";
    
    public FileReader() throws IOException{
        File file = new File(diretorio);
        File afile[] = file.listFiles();
        int i = 0;
        for (int j = afile.length; i<j; i++){
            File arquivos = afile[i];
            System.out.println("Lendo arquivo: "+ arquivos.getName());
            
            Unzip zp = new Unzip(arquivos.getAbsoluteFile().toString());
            //readCSV rscv = new readCSV(arquivos.getAbsolutePath());
            i = j;
            
        }
        
        System.out.println("Foram listados " +i+ " arquivos." );
    
    }  
    
    
    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileReader v =  new FileReader();
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
}
