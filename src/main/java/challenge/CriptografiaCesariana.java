package challenge;

public class CriptografiaCesariana implements Criptografia {

    public void textExists(String texto) {
        if (texto == null) throw new NullPointerException();
        if (texto.isEmpty()) throw new IllegalArgumentException();
    }

    @Override
    public String criptografar(String texto) {
        textExists(texto);
        String textoEmLowerCase = texto.toLowerCase();
        String textoCodificado = "";
        for (int i = 0; i < textoEmLowerCase.length(); i++) {
            char character = textoEmLowerCase.charAt(i);
            if (character >= 'a' && character <= 'z') {
                textoCodificado += (char)(character + 3);
            } else {
                textoCodificado += character;
            }
        }
        return textoCodificado;
    }

    @Override
    public String descriptografar(String texto) {
        textExists(texto);
        String textoEmLowerCase = texto.toLowerCase();
        String textoDescodificado = "";
        for (int i = 0; i < textoEmLowerCase.length(); i++) {
            char character = textoEmLowerCase.charAt(i);
            if (character >= 'a' && character <= 'z') {
                textoDescodificado += (char)(character - 3);
            } else {
                textoDescodificado += character;
            }
        }
        return textoDescodificado;
    }
}
