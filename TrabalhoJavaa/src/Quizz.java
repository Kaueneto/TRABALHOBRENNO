import java.util.Scanner;

import Cabecalho.Cabecalho;

public class Quizz {

	public String Universidade;
	public String Nomealuno;
	public String Prof;
	public String Diciplina;
	public void escrevacabecalho() {
	
		
	}

	    public static void main(String[] args) throws java.lang.Exception {

	        Cabecalho head = new Cabecalho();
	        head.Universidade = "Centro Universitário ALFREDO NASSER";
	        head.Nomealuno = "Kauê Felipe Neto";
	        head.Prof = "Brenno";
	        head.Diciplina = "Algoritmo e programação";
	        head.Periodo = "2° Periodo";
	        head.escrevacabecalho();

	        int numeroAcertos = 0;
	        System.out.println("Primeira Pergunta!! Você responderá diversas questões sobre variados asssuntos.");

	        numeroAcertos += grupo2();
	        numeroAcertos += grupo3();
	        numeroAcertos += grupo4();
	        numeroAcertos += grupo5();
	        numeroAcertos += grupo6();
	        numeroAcertos += grupo7();
	        numeroAcertos += grupo8();
	        numeroAcertos += grupo9();
	        numeroAcertos += grupo10();
	        numeroAcertos += grupo11();
	        numeroAcertos += grupo12();	        
	        numeroAcertos += grupo13();	        
	        
	        numeroAcertos += grupo14();	     
	        numeroAcertos += grupo15();
	        numeroAcertos += grupo16();
	        
	        
	        System.out.println("mensagem fim da pergunta");
	        System.out.println("Fim do Quiz! Parabéns... De 15 perguntas você acertou: " + numeroAcertos);
	    }

	    public static int grupo2() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Qual e o metodo main do Java?");
	        questao1.setOpcaoA("A - O nome do método main em Java é simplesmente \"main\".");
	        questao1.setOpcaoB("B - O método main do Java é chamado de \"ponto de entrada\" do programa Java.");
	        questao1.setOpcaoC("C - Em Java, o método main é conhecido como o \"método de inicialização\".");
	        questao1.setOpcaoD("D - O método main em Java é frequentemente referido como o \"método de início\".");
	        questao1.setOpcaoE("E - No contexto Java, o método main é chamado de \"método de início da execução\"");
	        questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }

	    
	    public static int grupo3() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Qual é a palavra passe utilizada para declarar uma classe em java ?");
	        questao1.setOpcaoA("A - Main");
	        questao1.setOpcaoB("B - void");
	        questao1.setOpcaoC("C - int");
	        questao1.setOpcaoD("D - class");
	        questao1.setOpcaoE("E - loop");
	        questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }
	    
	    
	    
	    
	    public static int grupo4() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Qual maior oceano do mundo ?");
	        questao1.setOpcaoA("A - Oceano Pacífico");
	        questao1.setOpcaoB("B - Oceano Ártico");
	        questao1.setOpcaoC("C - Oceano Antártico");
	        questao1.setOpcaoD("D - Oceano Atlântico");
	        questao1.setOpcaoE("E - Oceano indico");
	        questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }
	    
	    
	    public static int grupo5() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Qual é a função do operador \"&&\" em Java?");
	        questao1.setOpcaoA("A - ou");
	        questao1.setOpcaoB("B - e.");
	        questao1.setOpcaoC("C - concatenação");
	        questao1.setOpcaoD("D - multiplicação");
	        questao1.setOpcaoE("E - negação");
	        questao1.setCorreta("D"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }
	    	    
	    
	    public static int grupo6() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Quem foi o primeiro presidente dos Estados Unidos?");
	        questao1.setOpcaoA("A - Franklin D. Roosevelt");
	        questao1.setOpcaoB("B - John F. Kennedy");
	        questao1.setOpcaoC("C - Abraham Lincoln");
	        questao1.setOpcaoD("D - George Washington");
	        questao1.setOpcaoE("E - Thomas Jefferson");
	        questao1.setCorreta("D"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }
	    
	    public static int grupo7() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Em Java, qual é a classe base para todas as exceções?");
	        questao1.setOpcaoA("A - Exception");
	        questao1.setOpcaoB("B - ERROR.");
	        questao1.setOpcaoC("C - RuntimeException");
	        questao1.setOpcaoD("D - Throwable");
	        questao1.setOpcaoE("E - RuntimeExceptionBase");
	        questao1.setCorreta("D"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }
	    
	    public static int grupo8() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Qual maior planeta do sistema solar ?");
	        questao1.setOpcaoA("A - Saturno");
	        questao1.setOpcaoB("B - Urano");
	        questao1.setOpcaoC("C - Marte");
	        questao1.setOpcaoD("D - Júpter");
	        questao1.setOpcaoE("E - Vênus");
	        questao1.setCorreta("D"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }
	    
	    
	    
	    
	    public static int grupo9() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Qual é a declaração correta para um método em Java que não retorna nenhum valor?");
	        questao1.setOpcaoA("A - void myMethod");
	        questao1.setOpcaoB("B - int myMethod");
	        questao1.setOpcaoC("C - String myMethod");
	        questao1.setOpcaoD("D - double myMethod");
	        questao1.setOpcaoE("E - boolean myMethod");
	        questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }
	    
	    
	    public static int grupo10() {
	        int cont = 0; // contador de respostas corretas
	        String respostaUsuario = "";
	        System.out.println("=========================================================================");
	        Questao questao1 = new Questao();
	        questao1.setPergunta("Qual é o animal mais rápido do mundo?");
	        questao1.setOpcaoA("A - Guepardo");
	        questao1.setOpcaoB("B - águi");
	        questao1.setOpcaoC("C - lebre");
	        questao1.setOpcaoD("D - baleia");
	        questao1.setOpcaoE("E - tartaruga");
	        questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	        questao1.escrevaQuestao();
	        respostaUsuario = leiaResposta();
	        if (questao1.isCorreta(respostaUsuario)) {
	            cont++;
	        }
	        System.out.println("=========================================================================");



	        return cont;
	    }


	public static int grupo11() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.setPergunta("Qual é o maior órgão do corpo humano?");
	    questao1.setOpcaoA("A - coração	");
	    questao1.setOpcaoB("B - pele");
	    questao1.setOpcaoC("C - figado");
	    questao1.setOpcaoD("D - pulmao");
	    questao1.setOpcaoE("E - intestino");
	    questao1.setCorreta("b"); // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)) {
	        cont++;
	    }
	    System.out.println("=========================================================================");
	
	
	
	    return cont;
	}

	public static int grupo12() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.setPergunta("Qual é o metal mais abundante na crosta terrestre?");
	    questao1.setOpcaoA("A - ouro");
	    questao1.setOpcaoB("B - aluminio");
	    questao1.setOpcaoC("C - ferro");
	    questao1.setOpcaoD("D - cobre");
	    questao1.setOpcaoE("E - prata");
	    questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)) {
	        cont++;
	    }
	    System.out.println("=========================================================================");
	
	
	
	    return cont;
	}
	    
	
	public static int grupo13() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.setPergunta("Qual é a capital do Japão?");
	    questao1.setOpcaoA("A - Pequim");
	    questao1.setOpcaoB("B - seul");
	    questao1.setOpcaoC("C - moscou");
	    questao1.setOpcaoD("D - manila");
	    questao1.setOpcaoE("E - tóquio");
	    questao1.setCorreta("E"); // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)) {
	        cont++;
	    }
	    System.out.println("=========================================================================");
	
	
	
	    return cont;
	}
	
	
	
	public static int grupo14() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.setPergunta("Qual é o maior deserto do mundo em área não polar?");
	    questao1.setOpcaoA("A - gobi");
	    questao1.setOpcaoB("B - saara");
	    questao1.setOpcaoC("C - atacama");
	    questao1.setOpcaoD("D - kalahari");
	    questao1.setOpcaoE("E - australia");
	    questao1.setCorreta("b"); // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)) {
	        cont++;
	    }
	    System.out.println("=========================================================================");
	
	
	
	    return cont;
	}
	
	
	
	
	public static int grupo15() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.setPergunta("Quem é conhecido como \"o criador da Microsoft?");
	    questao1.setOpcaoA("A - Bill gates");
	    questao1.setOpcaoB("B - Steve Jobs");
	    questao1.setOpcaoC("C - Larry Page");
	    questao1.setOpcaoD("D - Mark Zuckerberg");
	    questao1.setOpcaoE("E - Jeff Bezos");
	    questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)) {
	        cont++;
	    }
	    System.out.println("=========================================================================");
	
	
	
	    return cont;
	}
	
	public static int grupo16() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.setPergunta("Qual é o rio mais longo do mundo?");
	    questao1.setOpcaoA("A - amazonas");
	    questao1.setOpcaoB("B - nilo");
	    questao1.setOpcaoC("C - mississipi");	
	    questao1.setOpcaoD("D - danúbio");
	    questao1.setOpcaoE("E - Yangtzé");
	    questao1.setCorreta("A"); // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)) {
	        cont++;
	    }
	    System.out.println("=========================================================================");
	
	
	
	    return cont;
	}

	
	public static int grupo17() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.setPergunta("Qual é o maior mamífero do planeta?");
	    questao1.setOpcaoA("A - Elefante");
	    questao1.setOpcaoB("B - baleia azul ");
	    questao1.setOpcaoC("C - Rinoceronte");
	    questao1.setOpcaoD("D - Hipopótamo");
	    questao1.setOpcaoE("E - Girafa");
	    questao1.setCorreta("b"); // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)) {
	        cont++;
	    }
	    System.out.println("=========================================================================");
	
	
	
	    return cont;
	}
	    public static String leiaResposta() {
	        Scanner ler = new Scanner(System.in);
	        String resp;
	        do {
	            System.out.println("Digite a resposta: ");
	            resp = ler.next();
	        } while (!respostaValida(resp));
	        return resp;
	    }

	    public static boolean respostaValida(String resp) {
	        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
	                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
	            return true;
	        }
	        System.out.println("Resposta inválida ... ");
	        return false;
	    }

	    public static class Questao {
	        private String pergunta = "";
	        private String opcaoA = "";
	        private String opcaoB = "";
	        private String opcaoC = "";
	        private String opcaoD = "";
	        private String opcaoE = "";
	        private String correta = "";

	        public boolean isCorreta(String resposta) {
	            if (resposta.equalsIgnoreCase(this.correta)) {
	                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
	                return true;
	            } else {
	                System.out.println("Resposta Errada!");
	                System.out.println("A opção correta é a letra: " + this.correta);
	                return false;
	            }
	        }

	        public void escrevaQuestao() {
	            System.out.println(this.pergunta);
	            System.out.println();
	            System.out.println(this.opcaoA);
	            System.out.println(this.opcaoB);
	            System.out.println(this.opcaoC);
	            System.out.println(this.opcaoD);
	            System.out.println(this.opcaoE);
	            System.out.println();
	        }

	        public void setPergunta(String pergunta) {
	            this.pergunta = pergunta;
	        }

	        public void setOpcaoA(String opcaoA) {
	            this.opcaoA = opcaoA;
	        }

	        public void setOpcaoB(String opcaoB) {
	            this.opcaoB = opcaoB;
	        }

	        public void setOpcaoC(String opcaoC) {
	            this.opcaoC = opcaoC;
	        }

	        public void setOpcaoD(String opcaoD) {
	            this.opcaoD = opcaoD;
	        }

	        public void setOpcaoE(String opcaoE) {
	            this.opcaoE = opcaoE;
		        }
	        
	        public void setCorreta(String correta) {
	            this.correta = correta;
	        }
	    }
	}