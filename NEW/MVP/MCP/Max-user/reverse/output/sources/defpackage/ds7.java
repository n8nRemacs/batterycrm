package defpackage;

/* loaded from: classes2.dex */
public final class ds7 extends xfh {
    public static final /* synthetic */ yy7[] s0;
    public final tcf X;
    public final t9f Y;
    public final hbd Z;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final String o;

    static {
        z8a z8aVar = new z8a(ds7.class, "qrCodeJob", "getQrCodeJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        s0 = new yy7[]{z8aVar};
    }

    public ds7(erc ercVar, int i, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        vq7 vq7Var = vq7.a;
        bwf bwfVarD = vq7Var.getAccessor().d(108);
        bwf bwfVarD2 = vq7Var.getAccessor().d(8);
        bwf bwfVarD3 = vq7Var.getAccessor().d(84);
        this.b = bwfVarD2;
        this.c = bwfVarD;
        this.d = bwfVarD3;
        this.o = ds7.class.getName();
        tcf tcfVarA = ucf.a(null);
        this.X = tcfVarA;
        this.Y = c7j.c();
        this.Z = new hbd(tcfVarA);
        t(ercVar, i != 0, i);
    }

    public final void t(erc ercVar, boolean z, int i) {
        yy7[] yy7VarArr = s0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.Y;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var == null || !qt7Var.isActive() || z) {
            t9fVar.O(this, yy7VarArr[0], svi.d(this.a, ((q2b) ((lzf) this.b.getValue())).b().plus((a84) this.d.getValue()), i84.b, new cs7(this, ercVar, z, i, null)));
        }
    }
}
