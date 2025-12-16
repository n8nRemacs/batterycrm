package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class si1 {
    public final oi1 A;
    public final ni1 B;
    public final pi1 a;
    public final ri1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String[] o;
    public final String[] p;
    public final boolean q;
    public final boolean r;
    public final h79 s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final ng0 y;
    public final qi1 z;

    public si1(pi1 pi1Var, ri1 ri1Var, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6, int i, boolean z7, boolean z8, boolean z9, boolean z10, String[] strArr, String[] strArr2, boolean z11, boolean z12, h79 h79Var, boolean z13, qi1 qi1Var, boolean z14, boolean z15, boolean z16, boolean z17, ng0 ng0Var) {
        oi1 oi1Var;
        ni1 ni1Var;
        oi1 oi1Var2;
        this.a = pi1Var;
        this.b = ri1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        this.h = z5;
        this.i = z6;
        this.j = i;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = strArr;
        this.p = strArr2;
        this.q = z11;
        this.r = z12;
        this.s = h79Var;
        this.t = z13;
        this.u = z14;
        this.v = z15;
        this.w = z16;
        this.x = z17;
        this.y = ng0Var;
        this.z = qi1Var != null ? new qi1(qi1Var.a, qi1Var.b, qi1Var.c, qi1Var.d, qi1Var.e, qi1Var.f, qi1Var.g, qi1Var.h, qi1Var.i, qi1Var.j, qi1Var.k, qi1Var.l, qi1Var.m, qi1Var.n, qi1Var.o, qi1Var.p, qi1Var.q, qi1Var.r, qi1Var.s, qi1Var.t, qi1Var.u, qi1Var.v, qi1Var.w, qi1Var.x, qi1Var.y, qi1Var.z, qi1Var.A, qi1Var.B, qi1Var.C, qi1Var.D, qi1Var.E) : new qi1();
        if (qi1Var == null || (oi1Var2 = qi1Var.t) == null) {
            Boolean bool = Boolean.TRUE;
            oi1Var = new oi1(bool, Boolean.FALSE, bool, 16000, null);
        } else {
            oi1Var = new oi1(oi1Var2.a, oi1Var2.b, oi1Var2.c, oi1Var2.d, oi1Var2.e);
        }
        this.A = oi1Var;
        this.B = (qi1Var == null || (ni1Var = qi1Var.s) == null) ? new ni1(16, 16, null, null, null, null, null, null) : new ni1(ni1Var.a, ni1Var.b, ni1Var.c, ni1Var.d, ni1Var.e, ni1Var.f, ni1Var.g, ni1Var.h);
    }

    public final ri1 a() {
        return this.b;
    }
}
