package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class u82 extends xfh {
    public static final /* synthetic */ yy7[] t0;
    public final hbd X;
    public final ci5 Y;
    public final ci5 Z;
    public final i82 b;
    public final tcf c;
    public final hbd d;
    public final tcf o;
    public final t9f s0;

    static {
        z8a z8aVar = new z8a(u82.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        t0 = new yy7[]{z8aVar};
    }

    public u82(long j, dfc dfcVar, cfc cfcVar) {
        i82 sd2Var;
        int iOrdinal = dfcVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            sd2Var = new sd2(j, this.a, cfcVar);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sd2Var = new iv3(j, this.a);
        }
        this.b = sd2Var;
        k18 k18VarC = yec.a.c();
        tcf tcfVarA = ucf.a(hd5.a);
        this.c = tcfVarA;
        this.d = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.o = tcfVarA2;
        this.X = new hbd(tcfVarA2);
        this.Y = new ci5(0);
        this.Z = new ci5(0);
        this.s0 = c7j.c();
        gw0.w(gw0.u(new g56(new d53(sd2Var.f(), 12), new p82(this, null), 1), ((q2b) ((lzf) k18VarC.getValue())).a()), this.a);
        gw0.w(gw0.u(new g56(sd2Var.e, new q82(this, null), 1), ((q2b) ((lzf) k18VarC.getValue())).a()), this.a);
        gw0.w(gw0.u(new g56(sd2Var.f, new r82(this, null), 1), ((q2b) ((lzf) k18VarC.getValue())).c()), this.a);
    }

    @Override // defpackage.xfh
    public final void s() {
        this.b.b();
    }
}
