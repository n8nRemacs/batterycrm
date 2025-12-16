package defpackage;

/* loaded from: classes2.dex */
public final class ym7 extends xfh implements mr3 {
    public static final /* synthetic */ yy7[] t0;
    public final ci5 X;
    public final kh5 Y;
    public final ci5 Z;
    public final /* synthetic */ agh b;
    public final String c;
    public final String d;
    public final t9f o;
    public final u92 s0;

    static {
        z8a z8aVar = new z8a(ym7.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        t0 = new yy7[]{z8aVar};
    }

    public ym7(String str, String str2, k18 k18Var) {
        agh aghVar = new agh(k18Var, new wm7(0));
        this.b = aghVar;
        this.c = str;
        this.d = str2;
        this.o = c7j.c();
        this.X = new ci5(0);
        this.Y = new kh5(0, ve3.j(new x28(), new ad(), new pha()));
        ci5 ci5Var = new ci5(0);
        this.Z = ci5Var;
        this.s0 = gw0.y(ci5Var, new bc2(new d53(aghVar.d, 12), 7));
    }

    @Override // defpackage.mr3
    public final gbd i() {
        return this.b.d;
    }

    @Override // defpackage.xfh
    public final void s() {
        yy7[] yy7VarArr = t0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.o;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }

    public final void t(String str, boolean z) {
        xfh.r(this.Z, (z || str.length() != 0) ? nye.a : p27.a);
    }

    public final boolean u(int i, String str) {
        zf3 zf3VarA = this.Y.a(i, str);
        s5g s5gVar = zf3VarA != null ? (s5g) ue3.I(zf3VarA.a) : null;
        if (s5gVar == null) {
            return true;
        }
        xfh.r(this.Z, new mm7(i, s5gVar));
        return false;
    }
}
