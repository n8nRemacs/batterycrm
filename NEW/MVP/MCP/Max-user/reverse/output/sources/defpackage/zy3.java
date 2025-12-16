package defpackage;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class zy3 extends xfh {
    public static final /* synthetic */ yy7[] J0;
    public static final vi5 K0;
    public final k18 A0;
    public final k18 B0;
    public final hbd C0;
    public final t9f D0;
    public final q24 E0;
    public final ci5 F0;
    public final ci5 G0;
    public final tcf H0;
    public final tcf I0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final hz3 b;
    public final lzf c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    static {
        z8a z8aVar = new z8a(zy3.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        J0 = new yy7[]{z8aVar};
        K0 = new vi5(ve3.j(lu3.c, lu3.Z, lu3.s0, lu3.a, lu3.b, lu3.d, lu3.t0, lu3.X, lu3.o, lu3.Y));
    }

    public zy3(hz3 hz3Var, k18 k18Var, ay3 ay3Var, k18 k18Var2, lzf lzfVar, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12, k18 k18Var13, k18 k18Var14, k18 k18Var15, k18 k18Var16, k18 k18Var17) {
        this.b = hz3Var;
        this.c = lzfVar;
        this.d = k18Var4;
        this.o = k18Var5;
        this.X = k18Var6;
        this.Y = k18Var7;
        this.Z = k18Var8;
        this.s0 = k18Var9;
        this.t0 = k18Var10;
        this.u0 = k18Var11;
        this.v0 = k18Var12;
        this.w0 = k18Var13;
        this.x0 = k18Var;
        this.y0 = k18Var15;
        this.z0 = k18Var14;
        this.A0 = k18Var16;
        this.B0 = k18Var17;
        tcf tcfVarA = ucf.a(nx3.d);
        hbd hbdVar = new hbd(tcfVarA);
        this.C0 = hbdVar;
        this.D0 = c7j.c();
        this.E0 = new q24(this.a, hbdVar, hz3Var == hz3.b ? new te8(k18Var2, k18Var14, (Context) k18Var.getValue()) : null, new sl7(lzfVar), k18Var3);
        this.F0 = new ci5(0);
        this.G0 = new ci5(0);
        tcf tcfVarA2 = ucf.a(new n5g(v1b.m));
        this.H0 = tcfVarA2;
        this.I0 = tcfVarA2;
        x26 x26VarB = ay3Var.b();
        int iOrdinal = hz3Var.ordinal();
        if (iOrdinal == 0) {
            x26VarB = new d53(x26VarB, 4);
        } else if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        gw0.w(new g56(x26VarB, new rw(2, tcfVarA, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 18), 1), this.a);
        ay3Var.a();
        xfh.o(this, ((q2b) lzfVar).b().plus(t()), new py3(this, null), 2);
    }

    public final a84 t() {
        return (a84) this.B0.getValue();
    }

    public final void u(int i, long j) {
        xfh.o(this, ((q2b) this.c).a().plus(t()), new vy3(i, this, j, null), 2);
    }

    public final void v() {
        yy7[] yy7VarArr = J0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.D0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var == null || !qt7Var.isActive()) {
            t9fVar.O(this, yy7VarArr[0], xfh.o(this, ((q2b) this.c).c().plus(t()), new xy3(this, null), 2));
        }
    }
}
