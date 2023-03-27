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
        palabrasReservadas.put("abstracto", TipoToken.ABSTRACT);
        palabrasReservadas.put("booleano", TipoToken.BOOLEAN);
        palabrasReservadas.put("byte", TipoToken.BYTE);
        palabrasReservadas.put("char", TipoToken.CHAR);
        palabrasReservadas.put("doble", TipoToken.DOUBLE);
        palabrasReservadas.put("flotante", TipoToken.FLOAT);
        palabrasReservadas.put("intero", TipoToken.INT);
        palabrasReservadas.put("largo", TipoToken.LONG);
        palabrasReservadas.put("corto", TipoToken.SHORT);
        palabrasReservadas.put("afirmar", TipoToken.ASSERT);
        palabrasReservadas.put("romper", TipoToken.BREAK)
        palabrasReservadas.put("caso", TipoToken.CASE);
        palabrasReservadas.put("atrapar", TipoToken.CATCH);
        palabrasReservadas.put("const", TipoToken.CONTS);
        palabrasReservadas.put("continuar", TipoToken.CONTINUE);
        palabrasReservadas.put("predeterminado", TipoToken.DEFAULT);
        palabrasReservadas.put("hacer", TipoToken.DO);
        palabrasReservadas.put("otra cosa", TipoToken.ELSE);
        palabrasReservadas.put("enumeración", TipoToken.ENUM);
        palabrasReservadas.put("extiende", TipoToken.EXTENDS);
        palabrasReservadas.put("final", TipoToken.FINAL);
        palabrasReservadas.put("finalmente", TipoToken.FINALLY);
        palabrasReservadas.put("vete a", TipoToken.GOTO);
        palabrasReservadas.put("implementa", TipoToken.IMPLENTS);
        palabrasReservadas.put("importar", TipoToken.IMPORT);
        palabrasReservadas.put("instancia de", TipoToken.INSTANCEOF);
        palabrasReservadas.put("interfaz", TipoToken.INTERFACE);
        palabrasReservadas.put("nativo", TipoToken.NATIVE);
        palabrasReservadas.put("nuevo", TipoToken.NEW);
        palabrasReservadas.put("paquete", TipoToken.PACKAGE);
        palabrasReservadas.put("privado", TipoToken.PRIVATE);
        palabrasReservadas.put("protegido", TipoToken.PROTECTED);
        palabrasReservadas.put("publico", TipoToken.PUBLIC);
        palabrasReservadas.put("regresar", TipoToken.RETURN);
        palabrasReservadas.put("estatico", TipoToken.STATIC);
        palabrasReservadas.put("strictfp", TipoToken.STRITFP);
        palabrasReservadas.put("super", TipoToken.SUPER);
        palabrasReservadas.put("interrruptor", TipoToken.SWITCH);
        palabrasReservadas.put("este", TipoToken.THIS);
        palabrasReservadas.put("tirar", TipoToken.THROW);
        palabrasReservadas.put("lanza", TipoToken.THROWS);
        PalabrasReservadas.put("probar",TipoToken.TRY);
        palabrasReservadas.put("volatil", TipoToken.VOLATILE);
        palabrasReservadas.put("con", TipoToken.WITH);
        palabrasReservadas.put("rendimiento", TipoToken.YIELD);


        /*  TRANSIENT,*/
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
