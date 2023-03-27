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
public enum TipoToken {
    
    // Crear un tipoToken por palabra reservada
    // Crear un tipoToken: identificador, una cadena y numero
    // Crear un tipoToken por cada "Signo del lenguaje" (ver clase Scanner)


    // Palabras clave:
    ABSTRACT, ASSERT, BOOLEAN, BREAK, BYTE, CASE, CATCH, CHAR, CLASS, CONST, CONTINUE, DEFAULT, DO, DOUBLE,
    ELSE, ENUM, EXTENDS, FINAL, FINALLY, FLOAT, FOR, GOTO, IF, IMPLEMENTS, IMPORT, INSTANCEOF, INT, INTERFACE, 
    LONG, NATIVE, NEW, PACKAGE, PRIVATE, PROTECTED, PUBLIC, RETURN, SHORT, STATIC, STRICTFP, SUPER, SWITCH, SYNCHRONIZED, 
    THIS, THROW, THROWS, TRANSIENT, TRY, VOID, VOLATILE, WHILE, WITH, YIELD, VAR, 

    //Identificador: 
    IDENTIFIER, CADENA, NUMBER,
    
    // Signo del lenguaje:
    SUMA, RESTA, MULTIPLICACION, DIVISION, ASIGNACION, IGUALDAD, MENOR_QUE, MAYOR_QUE, MENOR_IGUAL_QUE, MAYOR_IGUAL_QUE,
    PARENTESIS_IZQ, PARENTESIS_DER, LLAVE_IZQ, LLAVE_DER, CORCHETE_IZQ, CORCHETE_DER, PUNTO_Y_COMA, COMA, PUNTO, DOS_PUNTOS,
    MODULO, TERNARIO, INCREMENTO, DECREMENTO, DESPLAZAMIENTO_IZQ, DESPLAZAMIENTO_DER, AND, OR, COMPARACION, DIAGONAL, DIAGONAL_INV,
    ARROBA, INTERROGACION, DIFERENCIA, 

    
    
 
    // Final de cadena
    EOF
}

