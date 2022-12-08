package ProjetoBanco;

public class criarConta {
	public static void main(String[] args) {
		Conta contaRhuan = new Conta(32646, 904);
		Conta contaYasmin = new Conta(12312, 123);
		Cliente rhuan = new Cliente("Rhuan Guilherme", "057.962.951-10");
		Cliente yasmin = new Cliente("Yasmin Ferreira", "062.978.541-11");
		
		
		contaRhuan.deposita(4000);
		contaYasmin.deposita(3210);
		
		contaRhuan.saca(300);
		contaRhuan.transfere(400, contaYasmin);
		System.out.println(contaRhuan.getSaldo());
		System.out.println(contaYasmin.getSaldo());
		
		contaRhuan.setTitular(rhuan);
		contaYasmin.setTitular(yasmin);
		
		contaRhuan.getTitular().setProfissao("Developer java Senior");
		contaYasmin.getTitular().setProfissao("Professional Designer");
		
		System.out.println(contaRhuan.getTitular().getCpf());
		System.out.println(contaRhuan.getTitular().getProfissao());
		System.out.println(contaYasmin.getTitular().getProfissao());
		
		
	}
}
