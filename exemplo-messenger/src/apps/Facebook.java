package apps;
public class Facebook extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem");
    }
}
