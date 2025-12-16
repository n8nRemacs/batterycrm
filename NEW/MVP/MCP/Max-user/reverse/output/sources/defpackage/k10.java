package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class k10 implements Serializable {
    public static final k10 v0 = new k10(new j10());
    public final byte[] X;
    public final String Y;
    public final long Z;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean o;
    public final String s0;
    public final String t0;
    public final String u0;

    public k10(j10 j10Var) {
        this.a = j10Var.a;
        this.b = j10Var.b;
        this.c = j10Var.c;
        this.d = j10Var.d;
        this.o = j10Var.e;
        this.X = j10Var.f;
        this.Y = j10Var.g;
        this.Z = j10Var.h;
        this.s0 = j10Var.i;
        this.t0 = j10Var.j;
        this.u0 = j10Var.k;
    }

    public final String a() {
        String str = this.b;
        if (!l8g.c(str)) {
            return str;
        }
        String str2 = this.a;
        if (l8g.c(str2)) {
            return null;
        }
        return xui.a(str2, il0.o, hl0.b);
    }

    public final j10 b() {
        j10 j10Var = new j10();
        j10Var.a = this.a;
        j10Var.b = this.b;
        j10Var.c = this.c;
        j10Var.d = this.d;
        j10Var.e = this.o;
        j10Var.f = this.X;
        j10Var.g = this.Y;
        j10Var.h = this.Z;
        j10Var.i = this.s0;
        j10Var.j = this.t0;
        j10Var.k = this.u0;
        return j10Var;
    }
}
