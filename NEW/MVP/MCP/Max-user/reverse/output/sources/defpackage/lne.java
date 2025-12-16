package defpackage;

/* loaded from: classes2.dex */
public final class lne extends xfh implements sf5 {
    public static final /* synthetic */ yy7[] y0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final mq0 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final tcf s0;
    public final hbd t0;
    public Long u0;
    public int v0;
    public final t9f w0;
    public final ci5 x0;

    static {
        z8a z8aVar = new z8a(lne.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        y0 = new yy7[]{z8aVar};
    }

    public lne(mq0 mq0Var) {
        bqe bqeVar = bqe.a;
        bwf bwfVarD = bqeVar.getAccessor().d(79);
        bwf bwfVarD2 = bqeVar.getAccessor().d(123);
        bwf bwfVarD3 = bqeVar.getAccessor().d(109);
        bwf bwfVarD4 = bqeVar.getAccessor().d(100);
        bwf bwfVarD5 = bqeVar.getAccessor().d(331);
        k18 k18VarA = bqeVar.a();
        this.b = mq0Var;
        this.c = bwfVarD;
        this.d = bwfVarD2;
        this.o = bwfVarD3;
        this.X = bwfVarD4;
        this.Y = bwfVarD5;
        this.Z = k18VarA;
        tcf tcfVarA = ucf.a(id5.a);
        this.s0 = tcfVarA;
        this.t0 = new hbd(tcfVarA);
        this.w0 = c7j.c();
        this.x0 = new ci5(0);
        gw0.w(new g56(new gbd(mq0Var.b), new gne(this, bwfVarD2, null), 1), this.a);
        xfh.o(this, null, new hne(this, null), 3);
    }

    @Override // defpackage.sf5
    public final boolean g() {
        return false;
    }

    @Override // defpackage.sf5
    public final void p() {
        t(this.v0);
    }

    @Override // defpackage.sf5
    public final boolean q() {
        return this.v0 < Integer.MAX_VALUE;
    }

    @Override // defpackage.xfh
    public final void s() {
        mq0 mq0Var = this.b;
        ((tw0) mq0Var.a.getValue()).f(mq0Var);
    }

    public final void t(int i) {
        if (this.u0 == null) {
            hwa hwaVar = (hwa) this.c.getValue();
            this.u0 = Long.valueOf(hwa.q(hwaVar, new qx3(hwaVar.t().a.k(), i)));
        }
    }
}
