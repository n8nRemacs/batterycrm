package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class jl0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public jl0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl0)) {
            return false;
        }
        jl0 jl0Var = (jl0) obj;
        return this.c == jl0Var.c && this.d == jl0Var.d && uyi.c(this.a, jl0Var.a) && uyi.c(this.b, jl0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
