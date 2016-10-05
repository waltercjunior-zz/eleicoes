/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author wgjunior
 * 
 */
class readCSV {
    
    readCSV (String arquivo){
        String arquivoCSV = arquivo;
        BufferedReader br = null;
        String linha = "";
        String cvsDivisor = ";";
        try{
            br = new BufferedReader (new java.io.FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null){
                int vl = 0;
                String[] dado = linha.split(cvsDivisor);
                System.out.println(                
"DATA_GERACAO = " + dado[0] + " , HORA_GERACAO = " + dado[1]
+ " , ANO_ELEICAO = " + dado[2] + " , NUM_TURNO = " + dado[3]
+ " , DESCRICAO_ELEICAO = " + dado[4] + " , SIGLA_UF = " + dado[5]
+ " , SIGLA_UE = " + dado[6] + " , DESCRICAO_UE = " + dado[7]
+ " , CODIGO_CARGO = " + dado[8] + " , DESCRICAO_CARGO = " + dado[9]
+ " , NOME_CANDIDATO = " + dado[10] + " , SEQUENCIAL_CANDIDATO = " + dado[11]
+ " , NUMERO_CANDIDATO = " + dado[12] + " , NOME_URNA_CANDIDATO = " + dado[13]
+ " , COD_SITUACAO_CANDIDATURA = " + dado[14] + " , DES_SITUACAO_CANDIDATURA = " + dado[15]
+ " , NUMERO_PARTIDO = " + dado[16] + " , SIGLA_PARTIDO = " + dado[17]
+ " , NOME_PARTIDO = " + dado[18] + " , CODIGO_LEGENDA = " + dado[19]
+ " , SIGLA_LEGENDA = " + dado[20] + " , COMPOSICAO_LEGENDA = " + dado[21]
+ " , NOME_LEGENDA = " + dado[22] + " , CODIGO_OCUPACAO = " + dado[23]
+ " , DESCRICAO_OCUPACAO = " + dado[24] + " , DATA_NASCIMENTO = " + dado[25]
+ " , NUM_TITULO_ELEITORAL_CANDIDATO = " + dado[26] + " , IDADE_DATA_ELEICAO = " + dado[27]
+ " , CODIGO_SEXO = " + dado[28] + " , DESCRICAO_SEXO = " + dado[29]
+ " , COD_GRAU_INSTRUCAO = " + dado[30] + " , DESCRICAO_GRAU_INSTRUCAO = " + dado[31]
+ " , CODIGO_ESTADO_CIVIL = " + dado[32] + " , DESCRICAO_ESTADO_CIVIL = " + dado[33]
+ " , CODIGO_NACIONALIDADE = " + dado[34] + " , DESCRICAO_NACIONALIDADE = " + dado[35]
+ " , SIGLA_UF_NASCIMENTO = " + dado[36] + " , CODIGO_MUNICIPIO_NASCIMENTO = " + dado[37]
+ " , NOME_MUNICIPIO_NASCIMENTO = " + dado[38] + " , DESPESA_MAX_CAMPANHA = " + dado[39]
+ " , COD_SIT_TOT_TURNO = " + dado[40] + " , DESC_SIT_TOT_TURNO = " + dado[41]);
            }
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally{
            if (br != null){
                try {
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
        
}
