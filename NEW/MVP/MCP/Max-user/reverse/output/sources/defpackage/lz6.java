package defpackage;

/* loaded from: classes.dex */
public final class lz6 implements aa5 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public rfg b;
    public final aqc c;
    public final qyg d;
    public final wba e;
    public final boolean[] f = new boolean[4];
    public final kz6 g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    /* JADX WARN: Type inference failed for: r1v2, types: [byte[], java.io.Serializable] */
    public lz6(aqc aqcVar) {
        this.c = aqcVar;
        kz6 kz6Var = new kz6(0);
        kz6Var.e = new byte[128];
        this.g = kz6Var;
        if (aqcVar != null) {
            this.e = new wba(178, 0);
            this.d = new qyg(2, false);
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.aa5
    public final void a() {
        gfi.d(this.f);
        kz6 kz6Var = this.g;
        kz6Var.b = false;
        kz6Var.c = 0;
        kz6Var.d = 0;
        wba wbaVar = this.e;
        if (wbaVar != null) {
            wbaVar.c();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7  */
    @Override // defpackage.aa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.qyg r23) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz6.d(qyg):void");
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.aa5
    public final void g() {
    }

    @Override // defpackage.aa5
    public final void j(jp5 jp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.a = mjgVar.f;
        mjgVar.b();
        this.b = jp5Var.B(mjgVar.e, 2);
        aqc aqcVar = this.c;
        if (aqcVar != null) {
            aqcVar.h(jp5Var, mjgVar);
        }
    }
}
