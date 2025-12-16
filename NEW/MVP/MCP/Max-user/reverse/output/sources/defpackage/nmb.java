package defpackage;

/* loaded from: classes.dex */
public abstract class nmb {
    public static final n01 a = new n01(new n5g(m0b.M), k0b.e, null, Integer.valueOf(ivd.A0), 0, false, 880);
    public static final n01 b;
    public static final n01 c;
    public static final n01 d;
    public static final n01 e;
    public static final n01 f;
    public static final n01 g;
    public static final n01 h;
    public static final n01 i;
    public static final n01 j;
    public static final n01 k;
    public static final n01 l;
    public static final n01 m;
    public static final n01 n;
    public static final n01 o;
    public static final n01 p;
    public static final n01 q;

    static {
        long j2 = k0b.n;
        n5g n5gVar = new n5g(m0b.L);
        int i2 = ivd.n0;
        int i3 = j0b.n0;
        b = new n01(n5gVar, j2, null, Integer.valueOf(i2), i3, false, 624);
        c = new n01(new n5g(m0b.K), k0b.o, null, Integer.valueOf(ivd.x), 0, false, 880);
        long j3 = k0b.k;
        int i4 = m0b.R;
        n5g n5gVar2 = new n5g(i4);
        int i5 = ivd.L0;
        d = new n01(n5gVar2, j3, null, Integer.valueOf(i5), 0, false, 880);
        e = new n01(new n5g(m0b.V), k0b.m, null, Integer.valueOf(i5), 0, false, 880);
        f = new n01(new n5g(i4), k0b.l, new n5g(m0b.S), Integer.valueOf(i0b.n), 0, false, 320);
        long j4 = k0b.f;
        int i6 = m0b.N;
        n5g n5gVar3 = new n5g(i6);
        int i7 = ivd.B0;
        int i8 = j0b.o0;
        g = new n01(n5gVar3, j4, null, Integer.valueOf(i7), i8, false, 624);
        h = new n01(new n5g(m0b.U), k0b.h, null, Integer.valueOf(i0b.m0), i8, false, 624);
        i = new n01(new n5g(m0b.O), k0b.i, null, Integer.valueOf(i0b.b0), i8, true, 112);
        j = new n01(new n5g(i6), k0b.g, new n5g(m0b.P), Integer.valueOf(i7), i8, false, 64);
        long j5 = k0b.s;
        int i9 = m0b.s1;
        n5g n5gVar4 = new n5g(i9);
        int i10 = ivd.E;
        k = new n01(n5gVar4, j5, null, Integer.valueOf(i10), 0, false, 880);
        l = new n01(new n5g(i9), j5, null, Integer.valueOf(i10), 0, false, 352);
        long j6 = k0b.t;
        int i11 = m0b.u1;
        n5g n5gVar5 = new n5g(i11);
        int i12 = m0b.t1;
        n5g n5gVar6 = new n5g(i12);
        int i13 = ivd.F;
        m = new n01(n5gVar5, j6, n5gVar6, Integer.valueOf(i13), 0, false, 848);
        n = new n01(new n5g(i11), j6, new n5g(i12), Integer.valueOf(i13), 0, false, 320);
        long j7 = k0b.d;
        n5g n5gVar7 = new n5g(m0b.J);
        int i14 = ivd.J0;
        o = new n01(n5gVar7, j7, null, Integer.valueOf(i14), 0, false, 816);
        p = new n01(new n5g(m0b.Q), k0b.j, null, Integer.valueOf(i14), 0, false, 816);
        q = new n01(new n5g(m0b.I), k0b.c, null, Integer.valueOf(i2), i3, false, 624);
    }

    public static void a(o98 o98Var, in1 in1Var) {
        if (!in1Var.f && in1Var.d) {
            o98Var.add(f);
        } else if (in1Var.a()) {
            o98Var.add(e);
        } else {
            o98Var.add(d);
        }
    }

    public static o98 b(gn1 gn1Var) {
        boolean z = gn1Var.a;
        boolean z2 = gn1Var.b;
        o98 o98VarD = ve3.d();
        boolean z3 = gn1Var.c;
        if (z3 && ((!z || !z3) && !z2)) {
            o98VarD.add(i);
        } else if (z3 && (z2 || z)) {
            o98VarD.add(h);
        } else if (!gn1Var.e || z2) {
            o98VarD.add(g);
        } else {
            o98VarD.add(j);
        }
        return ve3.a(o98VarD);
    }
}
