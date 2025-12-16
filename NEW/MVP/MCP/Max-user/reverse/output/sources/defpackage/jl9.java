package defpackage;

import java.nio.charset.CodingErrorAction;

/* loaded from: classes2.dex */
public final class jl9 implements Cloneable {
    public CodingErrorAction a;
    public CodingErrorAction b;
    public int c;
    public int d;
    public int o;

    public final Object clone() {
        jl9 jl9Var = new jl9();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        jl9Var.a = codingErrorAction;
        jl9Var.b = codingErrorAction;
        jl9Var.c = Integer.MAX_VALUE;
        jl9Var.d = 8192;
        jl9Var.o = 8192;
        jl9Var.a = this.a;
        jl9Var.b = this.b;
        jl9Var.c = this.c;
        jl9Var.d = this.d;
        return jl9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jl9)) {
            return false;
        }
        jl9 jl9Var = (jl9) obj;
        jl9Var.getClass();
        return this.a == jl9Var.a && this.b == jl9Var.b && this.c == jl9Var.c && this.o == jl9Var.o && this.d == jl9Var.d;
    }

    public final int hashCode() {
        CodingErrorAction codingErrorAction = this.a;
        int iHashCode = (992 + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        CodingErrorAction codingErrorAction2 = this.b;
        return ((((((iHashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.o;
    }
}
