package defpackage;

/* loaded from: classes.dex */
public final class nrg extends xfh {
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final String b;
    public final long c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final x9f v0;
    public final tcf w0;
    public final tcf x0;
    public final hbd y0;
    public final ci5 z0;

    public nrg(String str, long j) {
        k18 k18Var = fm1.a;
        gm1 gm1Var = gm1.a;
        bwf bwfVarD = gm1Var.getAccessor().d(329);
        bwf bwfVarD2 = gm1Var.getAccessor().d(332);
        bwf bwfVarD3 = gm1Var.getAccessor().d(148);
        k18 k18VarD = fm1.d();
        k18 k18VarE = fm1.e();
        k18 k18VarC = fm1.c();
        bwf bwfVarD4 = gm1Var.getAccessor().d(79);
        bwf bwfVarD5 = gm1Var.getAccessor().d(197);
        bwf bwfVarD6 = gm1Var.getAccessor().d(167);
        this.b = str;
        this.c = j;
        this.d = bwfVarD;
        this.o = bwfVarD2;
        this.X = bwfVarD3;
        this.Y = k18VarE;
        this.Z = k18VarC;
        this.s0 = bwfVarD4;
        this.t0 = bwfVarD5;
        this.u0 = bwfVarD6;
        this.w0 = ucf.a(hd5.a);
        n5g n5gVar = new n5g(m0b.L2);
        gu5 gu5Var = (gu5) ((rt5) ((bwf) k18VarD).getValue());
        tcf tcfVarA = ucf.a(new irg(n5gVar, null, ve3.j(((Number) gu5Var.E.D(gu5Var, gu5.S[18])).longValue() == 1 ? new vqg(j0b.d2, new n5g(m0b.G2)) : new vqg(j0b.h2, new n5g(m0b.K2)), new vqg(j0b.e2, new n5g(m0b.H2))), 1));
        this.x0 = tcfVarA;
        this.y0 = new hbd(tcfVarA);
        this.z0 = new ci5(0);
        yx1.k(t(), str);
        this.v0 = svi.e(this.a, null, null, new hrg(this, null), 3);
    }

    public final yx1 t() {
        return (yx1) this.Z.getValue();
    }
}
