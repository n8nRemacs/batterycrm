package defpackage;

/* loaded from: classes2.dex */
public final class yz7 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public volatile boolean e;

    public yz7(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        tef tefVar = (tef) this.a.getValue();
        tefVar.getClass();
        bwd.a(new pef(tefVar, 1), new ycd(28), tefVar.h);
        ps5 ps5Var = (ps5) this.b.getValue();
        ps5Var.getClass();
        ssa ssaVarL = new vk3(3, new ns5(0, ps5Var)).p((j0e) ps5Var.d.get()).l((j0e) ps5Var.c.get());
        ms5 ms5Var = new ms5(ps5Var, 1);
        er5 er5Var = new er5(27);
        jn6 jn6Var = pdf.d;
        ssaVarL.a(new v08(ms5Var, er5Var, jn6Var));
        vr5 vr5Var = (vr5) this.c.getValue();
        vr8 vr8Var = new vr8(vr5Var.a(), new er5(5), 3);
        bwf bwfVar = vr5Var.d;
        vr8Var.p((j0e) bwfVar.getValue()).l((j0e) bwfVar.getValue()).a(new v08(new or5(vr5Var, 1), new er5(6), jn6Var));
    }
}
