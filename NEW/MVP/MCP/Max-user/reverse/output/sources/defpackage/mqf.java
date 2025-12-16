package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class mqf extends xfh {
    public static final /* synthetic */ yy7[] S0 = {new z8a(mqf.class, "loadingJob", "getLoadingJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, mqf.class, "processTextJob", "getProcessTextJob()Lkotlinx/coroutines/Job;")};
    public zqf A0 = zqf.g;
    public final tcf B0;
    public final hbd C0;
    public final jve D0;
    public final jve E0;
    public final tcf F0;
    public final tcf G0;
    public final tcf H0;
    public final hbd I0;
    public final tcf J0;
    public final tcf K0;
    public final t9f L0;
    public final t9f M0;
    public xqf N0;
    public a93 O0;
    public pf2 P0;
    public sa9 Q0;
    public ox3 R0;
    public final h79 X;
    public final k18 Y;
    public final k18 Z;
    public final mcf b;
    public final k18 c;
    public final k18 d;
    public final cm6 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    public mqf(mcf mcfVar, k18 k18Var, k18 k18Var2, eu2 eu2Var, h79 h79Var, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12) {
        this.b = mcfVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.o = eu2Var;
        this.X = h79Var;
        this.Y = k18Var6;
        this.Z = k18Var12;
        this.s0 = k18Var7;
        this.t0 = k18Var3;
        this.u0 = k18Var4;
        this.v0 = k18Var5;
        this.w0 = k18Var8;
        this.x0 = k18Var9;
        this.y0 = k18Var10;
        this.z0 = k18Var11;
        tcf tcfVarA = ucf.a(null);
        this.B0 = tcfVarA;
        this.C0 = new hbd(tcfVarA);
        jve jveVarB = kve.b(0, 0, 7);
        this.D0 = jveVarB;
        this.E0 = jveVarB;
        tcf tcfVarA2 = ucf.a(null);
        this.F0 = tcfVarA2;
        this.G0 = ucf.a(0);
        tcf tcfVarA3 = ucf.a(null);
        this.H0 = tcfVarA3;
        this.I0 = new hbd(tcfVarA3);
        tcf tcfVarA4 = ucf.a(null);
        this.J0 = tcfVarA4;
        this.K0 = tcfVarA4;
        this.L0 = c7j.c();
        this.M0 = c7j.c();
        gw0.w(new g56(tcfVarA2, new iqf(this, null), 1), this.a);
    }

    @Override // defpackage.xfh
    public final void s() {
        xqf xqfVar = this.N0;
        if (xqfVar != null) {
            String str = xqfVar.n;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, xqfVar + " clear", null);
                }
            }
            x9f x9fVar = xqfVar.q;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            xqfVar.q = null;
            x9f x9fVar2 = xqfVar.r;
            if (x9fVar2 != null) {
                x9fVar2.cancel((CancellationException) null);
            }
            xqfVar.r = null;
            xqfVar.o = hd5.a;
        }
    }

    public final lzf t() {
        return (lzf) this.s0.getValue();
    }

    public final void u(int i, String str) {
        a93 a93Var;
        sa9 sa9Var;
        tcf tcfVar;
        Object value;
        pf2 pf2Var = this.P0;
        if (pf2Var == null || (a93Var = this.O0) == null || (sa9Var = this.Q0) == null) {
            return;
        }
        if (str != null && !vmf.F(str)) {
            this.L0.O(this, S0[0], svi.e(this.a, ((q2b) t()).b(), null, new kqf(this, str, i, pf2Var, a93Var, sa9Var, null), 2));
            return;
        }
        this.A0 = zqf.g;
        do {
            tcfVar = this.B0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, null));
    }

    public final void v(CharSequence charSequence) {
        if (charSequence == null || vmf.F(charSequence)) {
            return;
        }
        x9f x9fVarE = svi.e(this.a, null, null, new lqf(this, charSequence, null), 3);
        this.M0.O(this, S0[1], x9fVarE);
    }
}
