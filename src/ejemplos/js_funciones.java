/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos;

import static java.lang.System.out;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author WING-8
 */

public class js_funciones {

    public static void main(String[] args) {
        // creamos el objeto script de ScriptEngineManager
        ScriptEngineManager script = new ScriptEngineManager();
        //del objeto script obtenemos la instancia del tipo
        //JavaScript y se la asignamos al objeto js del tipo ScriptEngine
        ScriptEngine js = script.getEngineByName("JavaScript");
//        try {
        // evaluamos lineas java script
//            js.eval("alert('Texto a mostrar')");
//            window.alert("Texto a mostrar");
        out.println("<script language='JavaScript'>");
        out.println("var a;var b; var c;");
        out.println("function suma(){c = a + b}");
        out.println("suma();");
        out.println("c");
        out.println("</script>");
//alert("Texto a mostrar");
//        } catch (ScriptException ex) {
//            System.out.println("Hubo un error:"+ex);
//        }
    }

}
