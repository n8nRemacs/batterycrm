package defpackage;

/* loaded from: classes2.dex */
public final class ac extends xfh {
    public static final /* synthetic */ yy7[] s0;
    public final jve X;
    public final tcf Y;
    public final x3 Z;
    public final long b;
    public final qb c;
    public final k18 d;
    public final t9f o = c7j.c();

    static {
        z8a z8aVar = new z8a(ac.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        s0 = new yy7[]{z8aVar};
    }

    public ac(long j, qb qbVar, k18 k18Var, k18 k18Var2) {
        this.b = j;
        this.c = qbVar;
        this.d = k18Var;
        jve jveVarB = kve.b(0, 0, 7);
        this.X = jveVarB;
        tcf tcfVarA = ucf.a(null);
        this.Y = tcfVarA;
        this.Z = new x3(new z41(qbVar.k, jveVarB, new s3(this, null, 1), 3), this, 1);
        if (qbVar.h.compareAndSet(false, true)) {
            svi.e(qbVar.g, null, null, new pb(qbVar, null), 3);
        }
        gw0.w(new g56(qbVar.m, new wb(this, null), 1), this.a);
        gw0.w(new g56(gw0.m(gw0.k(tcfVarA, 200L)), new yb(this, k18Var2, null), 1), this.a);
    }

    public final boolean t() {
        CharSequence charSequence = (CharSequence) this.Y.getValue();
        return !(charSequence == null || charSequence.length() == 0);
    }
}
