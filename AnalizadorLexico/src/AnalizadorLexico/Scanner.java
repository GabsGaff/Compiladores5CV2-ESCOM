/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorLexico;

/**
 *
 * @author ezequ
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    

public class Scanner {

    private final String source;

    private final List<Token> tokens = new ArrayList<>();

    private int linea = 1;

    private static final Map<String, TipoToken> palabrasReservadas;
    static {
        palabrasReservadas = new HashMap<>();
        palabrasReservadas.put("y", TipoToken.Y);
        palabrasReservadas.put("clase", TipoToken.CLASS);
        palabrasReservadas.put("ademas", tipoToken.ADEMAS)
        palabrasReservadas.put("falso", TipoToken.FALSE);
        palabrasReservadas.put("para", TipoToken.FOR);
        palabrasReservadas.put("fun", TipoToken.FUN);
        palabrasReservadas.put("si", TipoToken.SI);
        palabrasReservadas.put("nulo", TipoToken.NULL);
        palabrasReservadas.put("o", TipoToken.O);
        palabrasReservadas.put("imprimir", TipoToken.PRINT);
        palabrasReservadas.put("retornar", TipoToken.RETURN);
        palabrasReservadas.put("super", TipoToken.SUPER);
        palabrasReservadas.put("este", TipoToken.THIS);
        palabrasReservadas.put("verdadero", TipoToken.TRUE);
        palabrasReservadas.put("var", TipoToken.VAR);
        palabrasReservadas.put("mientras", TipoToken.WHILE);
        palabrasReservadas.put("entonces", TipoToken.IF);
        palabrasReservadas.put("entero", TipoToken.INT);
        palabrasReservadas.put("cadena", TipoToken.STRING);


        /*palabrasReservadas.put("ademas", );
        palabrasReservadas.put("falso", );
        palabrasReservadas.put("para", );
        palabrasReservadas.put("fun", ); //definir funciones
        palabrasReservadas.put("si", );
        palabrasReservadas.put("nulo", );
        palabrasReservadas.put("o", );
        palabrasReservadas.put("imprimir", );
        palabrasReservadas.put("retornar", );
        palabrasReservadas.put("super", );
        palabrasReservadas.put("este", );
        palabrasReservadas.put("verdadero", );
        palabrasReservadas.put("var", ); //definir variables
        palabrasReservadas.put("mientras", );*/
    }

    Scanner(String source){
        this.source = source;
    }

    List<Token> scanTokens(){
        //Aquí va el corazón del scanner.

        /*
        Analizar el texto de entrada para extraer todos los tokens
        y al final agregar el token de fin de archivo
         */
        tokens.add(new Token(TipoToken.EOF, "", null, linea));

        return tokens;
    }
}

/*
Signos o símbolos del lenguaje:
(
)
{
}
,
.
;
-
+
*
/
!
!=
=
==
<
<=
>
>=
// -> comentarios (no se genera token)
/* ... * / -> comentarios (no se genera token)
Identificador,
Cadena
Numero
Cada palabra reservada tiene su nombre de token

 */
