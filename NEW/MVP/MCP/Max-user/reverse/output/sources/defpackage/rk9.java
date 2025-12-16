package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class rk9 implements Serializable {
    public final String X;
    public final int Y;
    public final int a;
    public final long b;
    public final fh9 c;
    public final String d;
    public final String o;

    public rk9(int i, long j, fh9 fh9Var, String str, String str2, String str3, int i2) {
        this.a = i;
        this.b = j;
        this.c = fh9Var;
        this.d = str;
        this.o = str2;
        this.X = str3;
        this.Y = i2;
    }

    public final String toString() {
        return "{type=" + vb9.j(this.a) + "}";
    }
}
