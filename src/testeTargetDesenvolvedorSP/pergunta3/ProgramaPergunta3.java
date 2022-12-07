package testeTargetDesenvolvedorSP.pergunta3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import testeTargetDesenvolvedorSP.pergunta3.entities.Faturamento;

public class ProgramaPergunta3 {

	public static void main(String[] args) {

		try {
		
		List<Faturamento> diasFaturamentoSuperior = new ArrayList<Faturamento>();
		double menorFaturamento=0;
		int diaMenorFaturamento=0;
		double maiorFaturamento=0;
		int diaMaiorFaturamento=0;
		double totalDoMes=0;
		int totalDosDias=0;
		double mediaDoMes=0;
		
		ObjectMapper jsonMapper = new ObjectMapper();
		File file = new File("temp/dados.json");
		List<Faturamento> faturamentos = jsonMapper.readValue(file, new TypeReference<List<Faturamento>>(){});
		
		for (Faturamento faturamento: faturamentos ) {
			if (faturamento.getValor() != 0) {
				totalDosDias += 1;
				totalDoMes += faturamento.getValor();
			}
		}
		mediaDoMes = totalDoMes / totalDosDias;
		menorFaturamento = mediaDoMes;
		
		for (Faturamento faturamento: faturamentos) {
			if (faturamento.getValor() >= mediaDoMes) {
				diasFaturamentoSuperior.add(faturamento);
			}
			if (faturamento.getValor() > maiorFaturamento) {
				maiorFaturamento = faturamento.getValor();
				diaMaiorFaturamento = faturamento.getDia();
			}
			if (faturamento.getValor() < menorFaturamento && faturamento.getValor() != 0) {
				menorFaturamento = faturamento.getValor();
				diaMenorFaturamento = faturamento.getDia();
			}
		}
		
		System.out.println(("Média do mês:" + mediaDoMes));
		System.out.println("Menor faturamento do mês:" + menorFaturamento + " do dia:" + diaMenorFaturamento);
		System.out.println("Maior faturamento do mês:" + maiorFaturamento + " do dia:" + diaMaiorFaturamento);
		System.out.println("Total de dias com faturamento superior a média:" + diasFaturamentoSuperior.size());
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
