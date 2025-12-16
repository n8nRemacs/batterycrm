package defpackage;

/* loaded from: classes2.dex */
public final class dq3 extends xfh implements iq3 {
    public static final /* synthetic */ yy7[] v0;
    public final k18 X;
    public final tcf Y;
    public final d53 Z;
    public final String b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final t9f s0;
    public final ci5 t0;
    public final ci5 u0;

    static {
        z8a z8aVar = new z8a(dq3.class, "codeInputJob", "getCodeInputJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        v0 = new yy7[]{z8aVar};
    }

    public dq3(String str) {
        bqe bqeVar = bqe.a;
        bwf bwfVarD = bqeVar.getAccessor().d(46);
        bwf bwfVarD2 = bqeVar.getAccessor().d(392);
        k18 k18VarA = bqeVar.a();
        bwf bwfVarD3 = bqeVar.getAccessor().d(84);
        this.b = str;
        this.c = bwfVarD;
        this.d = bwfVarD2;
        this.o = k18VarA;
        this.X = bwfVarD3;
        tcf tcfVarA = ucf.a(aq3.a);
        this.Y = tcfVarA;
        this.Z = new d53(tcfVarA, 12);
        this.s0 = c7j.c();
        this.t0 = new ci5(0);
        this.u0 = new ci5(0);
    }

    @Override // defpackage.iq3
    public final void a(String str) {
        x9f x9fVarO = xfh.o(this, ((q2b) ((lzf) this.o.getValue())).a().plus((a84) this.X.getValue()), new cq3(str, this, null), 2);
        this.s0.O(this, v0[0], x9fVarO);
    }
}
