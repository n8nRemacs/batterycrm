package defpackage;

/* loaded from: classes2.dex */
public final class rse extends xfh implements iq3 {
    public static final /* synthetic */ yy7[] X;
    public final k18 b;
    public final k18 c;
    public final t9f d;
    public final ci5 o;

    static {
        z8a z8aVar = new z8a(rse.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        X = new yy7[]{z8aVar};
    }

    public rse() {
        bqe bqeVar = bqe.a;
        k18 k18VarA = bqeVar.a();
        bwf bwfVarD = bqeVar.getAccessor().d(84);
        this.b = k18VarA;
        this.c = bwfVarD;
        this.d = c7j.c();
        this.o = new ci5(0);
    }

    @Override // defpackage.iq3
    public final void a(String str) {
        x9f x9fVarD = svi.d(this.a, ((q2b) ((lzf) this.b.getValue())).a().plus((a84) this.c.getValue()), i84.b, new qse(str, this, null));
        this.d.O(this, X[0], x9fVarD);
    }
}
