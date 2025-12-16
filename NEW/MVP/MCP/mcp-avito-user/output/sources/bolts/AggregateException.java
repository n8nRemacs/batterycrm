package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes10.dex */
public class AggregateException extends Exception {
    private static final long serialVersionUID = 1;

    public AggregateException() {
        throw null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        throw null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        throw null;
    }
}
