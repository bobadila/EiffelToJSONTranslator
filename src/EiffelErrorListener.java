import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * Created by andrew on 5/16/2014.
 */
public class EiffelErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
        List<String> stack = ((EiffelParser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Syntax error:");
        System.err.println("rule stack" + stack);
        System.err.println("line " + line + ":" + charPositionInLine + " at " + offendingSymbol + ": " + msg);
        System.exit(1);
    }
}
