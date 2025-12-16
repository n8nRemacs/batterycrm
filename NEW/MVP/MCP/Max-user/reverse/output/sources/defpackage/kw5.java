package defpackage;

/* loaded from: classes2.dex */
public final class kw5 extends xfh {
    public static final /* synthetic */ yy7[] y0;
    public final String X;
    public final String Y;
    public final long Z;
    public final long b;
    public final long c;
    public final String d;
    public final long o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final t9f x0;

    static {
        z8a z8aVar = new z8a(kw5.class, "downloadJob", "getDownloadJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        y0 = new yy7[]{z8aVar};
    }

    public kw5(long j, long j2, String str, long j3, String str2, String str3, long j4) {
        fw5 fw5Var = fw5.a;
        bwf bwfVarD = fw5Var.getAccessor().d(8);
        bwf bwfVarD2 = fw5Var.getAccessor().d(245);
        bwf bwfVarD3 = fw5Var.getAccessor().d(381);
        bwf bwfVarD4 = fw5Var.getAccessor().d(109);
        bwf bwfVarD5 = fw5Var.getAccessor().d(390);
        this.b = j;
        this.c = j2;
        this.d = str;
        this.o = j3;
        this.X = str2;
        this.Y = str3;
        this.Z = j4;
        this.s0 = bwfVarD;
        this.t0 = bwfVarD2;
        this.u0 = bwfVarD3;
        this.v0 = bwfVarD4;
        this.w0 = bwfVarD5;
        this.x0 = c7j.c();
    }

    @Override // defpackage.xfh
    public final void s() {
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.x0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }

    public final f7f t() {
        pb2 pb2Var = (pb2) ((w63) this.v0.getValue()).j(this.b).a.getValue();
        if (pb2Var == null) {
            return null;
        }
        return fbj.a(pb2Var);
    }
}
