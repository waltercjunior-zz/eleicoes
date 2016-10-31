/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 *
 * @author wgjunior
 */
public class Unzip {
    public static final void copyInputStream (InputStream in, OutputStream  out) throws  IOException{
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer))>=0)
            out.write(buffer, 0, len);
        in.close();
        out.close();       
    }
    
    public Unzip (String arquivo){
        Enumeration entries;
        ZipFile zipFile;
        
        if(arquivo.isEmpty()){
            System.out.println("Sintaxe do programa: Unzip arquivo");
            return;
        }
        try{
            zipFile = new ZipFile(arquivo);
            entries = zipFile.entries();
            while(entries.hasMoreElements()){
                ZipEntry entry = (ZipEntry)entries.nextElement();
                if(entry.isDirectory()){
                    System.err.println("Descompactando diretório: " + entry.getName());
                    (new File(entry.getName())).mkdir();
                    continue;
                }
                System.out.println("Descompactando arquivo: " + entry.getName());
                copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(entry.getName())));
                
                File fl1 = new File(entry.getName());
                System.out.println("Caminho absoluto em: " + fl1.getAbsolutePath());
                
                readCSV rCSV = new readCSV(fl1.getAbsoluteFile().toString());
                
            }   
            zipFile.close();
        } catch(IOException ioe){
            System.err.println("Erro ao descompactar: "+ ioe.getMessage());
            return;
        }
    }
}
