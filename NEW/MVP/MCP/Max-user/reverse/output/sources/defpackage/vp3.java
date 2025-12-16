package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class vp3 extends xfh implements mr3 {
    public static final /* synthetic */ yy7[] E0;
    public static final String F0;
    public final tcf A0;
    public volatile String B0;
    public x9f C0;
    public final t9f D0;
    public final k18 X;
    public final bwf Y;
    public final bwf Z;
    public final /* synthetic */ agh b;
    public final int c;
    public String d;
    public final String o;
    public final k18 s0;
    public final k18 t0;
    public final jve u0;
    public final u92 v0;
    public final ci5 w0;
    public final tcf x0;
    public final hbd y0;
    public final gbd z0;

    static {
        z8a z8aVar = new z8a(vp3.class, "loginJob", "getLoginJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        E0 = new yy7[]{z8aVar};
        F0 = vp3.class.getName();
    }

    public vp3(int i, String str, String str2, k18 k18Var, bwf bwfVar, bwf bwfVar2, k18 k18Var2, k18 k18Var3) {
        hh8 hh8Var = hh8.a;
        bwf bwfVarD = hh8Var.getAccessor().d(83);
        bwf bwfVarD2 = hh8Var.getAccessor().d(106);
        int i2 = 5;
        agh aghVar = new agh(k18Var3, new d73(5));
        this.b = aghVar;
        this.c = i;
        this.d = str;
        this.o = str2;
        this.X = k18Var;
        this.Y = bwfVar;
        this.Z = bwfVar2;
        this.s0 = k18Var2;
        this.t0 = bwfVarD2;
        jve jveVarB = kve.b(0, 1, 1);
        this.u0 = jveVarB;
        u92 u92VarY = gw0.y(jveVarB, new bc2(new d53(aghVar.d, 12), i2));
        this.v0 = u92VarY;
        this.w0 = new ci5(0);
        tcf tcfVarA = ucf.a(60L);
        this.x0 = tcfVarA;
        this.y0 = gw0.C(new yh0(tcfVarA, i2), this.a, yve.a, null);
        this.z0 = ((tw6) bwfVarD2.getValue()).c;
        this.A0 = ucf.a(Boolean.FALSE);
        this.D0 = c7j.c();
        gw0.w(gw0.u(new g56(u92VarY, new op3(this, bwfVarD, null), 1), ((q2b) ((lzf) k18Var2.getValue())).a()), this.a);
    }

    @Override // defpackage.mr3
    public final gbd i() {
        return this.b.d;
    }

    @Override // defpackage.xfh
    public final void s() {
        x9f x9fVar = this.C0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.C0 = null;
        yy7[] yy7VarArr = E0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.D0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }
}
