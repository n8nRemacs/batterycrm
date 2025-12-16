package defpackage;

/* loaded from: classes2.dex */
public final class vea {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final String f = vea.class.getName();
    public final k18 g;
    public final jve h;
    public final gbd i;
    public final tcf j;
    public final hbd k;
    public volatile String l;

    public vea(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = k18Var;
        this.b = k18Var3;
        this.c = k18Var4;
        this.d = k18Var5;
        this.e = k18Var6;
        this.g = k18Var2;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 4);
        this.h = jveVarB;
        this.i = new gbd(jveVarB);
        tcf tcfVarA = ucf.a(null);
        this.j = tcfVarA;
        this.k = new hbd(tcfVarA);
    }

    public final iz5 a() {
        return (iz5) this.b.getValue();
    }

    public final void b() {
        this.l = null;
        ccb ccbVar = (ccb) this.e.getValue();
        ccbVar.g(new n5g(mvd.r));
        ccbVar.e(new qcb(yud.J));
        ccbVar.i();
    }
}
