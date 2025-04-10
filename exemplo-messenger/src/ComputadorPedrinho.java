import apps.Facebook;
import apps.MSN;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /*
         * NÃO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */

        String appEscolhido = "fbm";

        if(appEscolhido.equals("msn"))
            smi = new MSN();
        else if(appEscolhido.equals("fbm"))
            smi = new Facebook();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

            smi.enviarMensagem();
            smi.receberMensagem();
    }
}
