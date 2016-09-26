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
 * "1.0.16.0","1.0.31.255","16781312","16785407","JP","Japão"
"1.0.32.0","1.0.63.255","16785408","16793599","BR","Brasil"
"1.0.64.0","1.0.127.255","16793600","16809983","JP","Japão"
"1.0.128.0","1.0.255.255","16809984","16842751","DK","Dinamarca"
 * 
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
"DATA_GERACAO = " + dado[vl]
+ " , HORA_GERACAO = " + dado[vl++]
+ " , ANO_ELEICAO = " + dado[vl++]
+ " , NUM_TURNO = " + dado[vl++]
+ " , DESCRICAO_ELEICAO = " + dado[vl++]
+ " , SIGLA_UE = " + dado[vl++]
+ " , DESCRICAO_UE = " + dado[vl++]
+ " , CODIGO_CARGO = " + dado[vl++]
+ " , DESCRICAO_CARGO = " + dado[vl++]
+ " , NOME_CANDIDATO = " + dado[vl++]
+ " , SEQUENCIAL_CANDIDATO = " + dado[vl++]
+ " , NUMERO_CANDIDATO = " + dado[vl++]
+ " , NOME_URNA_CANDIDATO = " + dado[vl++]
+ " , COD_SITUACAO_CANDIDATURA = " + dado[vl++]
+ " , DES_SITUACAO_CANDIDATURA = " + dado[vl++]
+ " , NUMERO_PARTIDO = " + dado[vl++]
+ " , SIGLA_PARTIDO = " + dado[vl++]
+ " , NOME_PARTIDO = " + dado[vl++]
+ " , CODIGO_LEGENDA = " + dado[vl++]
+ " , SIGLA_LEGENDA = " + dado[vl++]
+ " , COMPOSICAO_LEGENDA = " + dado[vl++]
+ " , NOME_LEGENDA = " + dado[vl++]
+ " , CODIGO_OCUPACAO = " + dado[vl++]
+ " , DESCRICAO_OCUPACAO = " + dado[vl++]
+ " , DATA_NASCIMENTO = " + dado[vl++]
+ " , NUM_TITULO_ELEITORAL_CANDIDATO = " + dado[vl++]
+ " , IDADE_DATA_ELEICAO = " + dado[vl++]
+ " , CODIGO_SEXO = " + dado[vl++]
+ " , DESCRICAO_SEXO = " + dado[vl++]
+ " , COD_GRAU_INSTRUCAO = " + dado[vl++]
+ " , DESCRICAO_GRAU_INSTRUCAO = " + dado[vl++]
+ " , CODIGO_ESTADO_CIVIL = " + dado[vl++]
+ " , DESCRICAO_ESTADO_CIVIL = " + dado[vl++]
+ " , CODIGO_NACIONALIDADE = " + dado[vl++]
+ " , DESCRICAO_NACIONALIDADE = " + dado[vl++]
+ " , SIGLA_UF_NASCIMENTO = " + dado[vl++]
+ " , CODIGO_MUNICIPIO_NASCIMENTO = " + dado[vl++]
+ " , NOME_MUNICIPIO_NASCIMENTO = " + dado[vl++]
+ " , DESPESA_MAX_CAMPANHA = " + dado[vl++]
+ " , COD_SIT_TOT_TURNO = " + dado[vl++]
+ " , DESC_SIT_TOT_TURNO = " + dado[vl++]);
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
