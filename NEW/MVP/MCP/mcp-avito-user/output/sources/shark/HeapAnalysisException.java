package shark;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HeapAnalysisException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lshark/HeapAnalysisException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class HeapAnalysisException extends RuntimeException {
    private static final long serialVersionUID = -2522323377375290608L;

    /* compiled from: HeapAnalysisException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/HeapAnalysisException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        Throwable cause = getCause();
        if (cause != null) {
            cause.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
