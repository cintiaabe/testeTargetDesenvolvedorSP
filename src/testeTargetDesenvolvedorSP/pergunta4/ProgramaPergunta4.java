package testeTargetDesenvolvedorSP.pergunta4;

import java.util.HashMap;
import java.util.Map;

public class ProgramaPergunta4 {

	public static void main(String[] args) {
		
		Map<String, Double> faturamento = new HashMap<>();
		faturamento.put("SP", 67836.43);
		faturamento.put("RJ", 36678.66);
		faturamento.put("MG", 29229.88);
		faturamento.put("ES", 27165.48);
		faturamento.put("OU", 19849.53);
		Double total=0.0;
		
		for (Double v: faturamento.values()) {
			total += v;
		};
		System.out.println("Total:" + total);
		
		for (String k: faturamento.keySet()) {
			 System.out.println(("Estado:" + k + " | Faturamento:" + Math.round(faturamento.get(k)*100/total)));
		}
	}

}
