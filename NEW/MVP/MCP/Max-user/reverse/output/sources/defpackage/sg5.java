package defpackage;

/* loaded from: classes2.dex */
public final class sg5 extends xfh implements iq3 {
    public static final /* synthetic */ yy7[] t0;
    public final ci5 X;
    public final ci5 Y;
    public final t9f Z;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final ci5 o;
    public boolean s0;

    static {
        z8a z8aVar = new z8a(sg5.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        t0 = new yy7[]{z8aVar};
    }

    public sg5() {
        bqe bqeVar = bqe.a;
        bwf bwfVarD = bqeVar.getAccessor().d(46);
        k18 k18VarA = bqeVar.a();
        bwf bwfVarD2 = bqeVar.getAccessor().d(84);
        this.b = bwfVarD;
        this.c = k18VarA;
        this.d = bwfVarD2;
        this.o = new ci5(0);
        this.X = new ci5(0);
        this.Y = new ci5(0);
        this.Z = c7j.c();
    }

    @Override // defpackage.iq3
    public final void a(String str) {
        x9f x9fVarD = svi.d(this.a, ((q2b) ((lzf) this.c.getValue())).a().plus((a84) this.d.getValue()), i84.b, new rg5(this, str, null));
        this.Z.O(this, t0[0], x9fVarD);
    }
}
