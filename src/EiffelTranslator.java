import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by andrew on 5/11/2014.
 */
public class EiffelTranslator {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        InputStream is = System.in;
        if (args.length > 0)
            inputFile = args[0];
        if (inputFile != null)
            is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        EiffelLexer lexer = new EiffelLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EiffelParser parser = new EiffelParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new EiffelErrorListener());
        ParseTree tree = parser.class_declaration();

        EiffelToJSONVisitor eiffelToJSONVisitor = new EiffelToJSONVisitor();
        eiffelToJSONVisitor.visit(tree);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(eiffelToJSONVisitor.classDeclaration));
    }
}
