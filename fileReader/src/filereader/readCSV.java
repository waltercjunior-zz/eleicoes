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
               /* System.out.println(                
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
+ " , COD_SIT_TOT_TURNO = " + dado[40] + " , DESC_SIT_TOT_TURNO = " + dado[41]);*/
                System.out.println("DATA_GERACAO, HORA_GERACAO, ANO_ELEICAO, NUM_TURNO, DESCRICAO_ELEICAO, SIGLA_UF, SIGLA_UE, DESCRICAO_UE,"
+ "CODIGO_CARGO, DESCRICAO_CARGO, NOME_CANDIDATO, SEQUENCIAL_CANDIDATO, NUMERO_CANDIDATO, NOME_URNA_CANDIDATO, COD_SITUACAO_CANDIDATURA, DES_SITUACAO_CANDIDATURA, "
+ "NUMERO_PARTIDO, SIGLA_PARTIDO, NOME_PARTIDO, CODIGO_LEGENDA, SIGLA_LEGENDA, COMPOSICAO_LEGENDA, NOME_LEGENDA, CODIGO_OCUPACAO, "
+ "DESCRICAO_OCUPACAO, DATA_NASCIMENTO, NUM_TITULO_ELEITORAL_CANDIDATO, IDADE_DATA_ELEICAO, CODIGO_SEXO, DESCRICAO_SEXO, COD_GRAU_INSTRUCAO, DESCRICAO_GRAU_INSTRUCAO, "
+ "CODIGO_ESTADO_CIVIL, DESCRICAO_ESTADO_CIVIL, CODIGO_NACIONALIDADE, DESCRICAO_NACIONALIDADE, SIGLA_UF_NASCIMENTO, CODIGO_MUNICIPIO_NASCIMENTO, NOME_MUNICIPIO_NASCIMENTO,"
+ "DESPESA_MAX_CAMPANHA, COD_SIT_TOT_TURNO, DESC_SIT_TOT_TURNO) values ('"
+ "', '" + dado[0] 
+ "', '" + dado[1]
+ "', '" + dado[2] 
+ "', '" + dado[3]
+ "', '" + dado[4] 
+ "', '" + dado[5]
+ "', '" + dado[6] 
+ "', '" + dado[7]
+ "', '" + dado[8] 
+ "', '" + dado[9]
+ "', '" + dado[10]
+ "', '" + dado[11]
+ "', '" + dado[12]
+ "', '" + dado[13]
+ "', '" + dado[14]
+ "', '" + dado[15]
+ "', '" + dado[16]
+ "', '" + dado[17]
+ "', '" + dado[18]
+ "', '" + dado[19]
+ "', '" + dado[20]
+ "', '" + dado[21]
+ "', '" + dado[22]
+ "', '" + dado[23]
+ "', '" + dado[24]
+ "', '" + dado[25]
+ "', '" + dado[26]
+ "', '" + dado[27]
+ "', '" + dado[28]
+ "', '" + dado[29]
+ "', '" + dado[30]
+ "', '" + dado[31]
+ "', '" + dado[32]
+ "', '" + dado[33]
+ "', '" + dado[34]
+ "', '" + dado[35]
+ "', '" + dado[36]
+ "', '" + dado[37]
+ "', '" + dado[38]
+ "', '" + dado[39]
+ "', '" + dado[40]
+ "', '" + dado[41] +"'");
               
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
