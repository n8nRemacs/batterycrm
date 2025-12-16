package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.ArrayBufferInput;

/* loaded from: classes2.dex */
public abstract class kl9 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final il9 b = new il9();
    public static final jl9 c;

    static {
        jl9 jl9Var = new jl9();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        jl9Var.a = codingErrorAction;
        jl9Var.b = codingErrorAction;
        jl9Var.c = Integer.MAX_VALUE;
        jl9Var.d = 8192;
        jl9Var.o = 8192;
        c = jl9Var;
    }

    public static tm9 a(byte[] bArr) {
        jl9 jl9Var = c;
        jl9Var.getClass();
        return new tm9(new ArrayBufferInput(bArr), jl9Var);
    }
}
