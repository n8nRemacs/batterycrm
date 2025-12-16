package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class nbf extends xfh {
    public static final /* synthetic */ yy7[] B0;
    public final ci5 A0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final k18 b;
    public final age c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final t9f t0 = c7j.c();
    public final tcf u0;
    public final hbd v0;
    public final q24 w0;
    public final tcf x0;
    public final hbd y0;
    public final ci5 z0;

    static {
        z8a z8aVar = new z8a(nbf.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        B0 = new yy7[]{z8aVar};
    }

    public nbf(k18 k18Var, k18 k18Var2, k18 k18Var3, ay3 ay3Var, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, age ageVar, k18 k18Var10) {
        this.b = k18Var2;
        this.c = ageVar;
        this.d = k18Var8;
        this.o = k18Var;
        this.X = k18Var5;
        this.Y = k18Var6;
        this.Z = k18Var7;
        this.s0 = k18Var10;
        tcf tcfVarA = ucf.a(nx3.d);
        this.u0 = tcfVarA;
        hbd hbdVar = new hbd(tcfVarA);
        this.v0 = hbdVar;
        this.w0 = new q24(this.a, hbdVar, new te8(k18Var4, k18Var9, (Context) k18Var2.getValue()), k18Var, k18Var3);
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.x0 = tcfVarA2;
        this.y0 = new hbd(tcfVarA2);
        this.z0 = new ci5(0);
        this.A0 = new ci5(0);
        gw0.w(new g56(ay3Var.b(), new hbf(this, null), 1), this.a);
        ay3Var.a();
        xfh.o(this, null, new ibf(this, null), 3);
    }

    public final void t() {
        yy7[] yy7VarArr = B0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.t0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var == null || !qt7Var.isActive()) {
            t9fVar.O(this, yy7VarArr[0], xfh.o(this, ((q2b) ((lzf) this.o.getValue())).c().plus((a84) this.s0.getValue()), new mbf(this, null), 2));
        }
    }
}
