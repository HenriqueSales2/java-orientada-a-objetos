package lanchonete.area;

import lanchonete.area.cliente.*;
import lanchonete.atendimento.*;
import lanchonete.atendimento.cozinha.*;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		// ações que não precisam estarem disponíveis para toda a aplicação
		
		// ações que estabelecimento precisar ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		// ação que somente o seu pacote cozinha precisa conhecer (default)
	
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();	
	}
}

