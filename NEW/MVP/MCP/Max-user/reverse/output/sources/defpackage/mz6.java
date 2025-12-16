package defpackage;

/* loaded from: classes.dex */
public final class mz6 implements ba5 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public sfg b;
    public final qae c;
    public final String d;
    public final umb e;
    public final wba f;
    public final boolean[] g = new boolean[4];
    public final kz6 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public mz6(qae qaeVar, String str) {
        this.c = qaeVar;
        this.d = str;
        kz6 kz6Var = new kz6(1);
        kz6Var.e = new byte[128];
        this.h = kz6Var;
        if (qaeVar != null) {
            this.f = new wba(178, 1);
            this.e = new umb();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.ba5
    public final void a() {
        hfi.b(this.g);
        kz6 kz6Var = this.h;
        kz6Var.b = false;
        kz6Var.c = 0;
        kz6Var.d = 0;
        wba wbaVar = this.f;
        if (wbaVar != null) {
            wbaVar.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.ba5
    public final void e(int i, long j) {
        this.m = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
    @Override // defpackage.ba5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.umb r29) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz6.f(umb):void");
    }

    @Override // defpackage.ba5
    public final void h(boolean z) {
        hsi.h(this.b);
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.ba5
    public final void i(kp5 kp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.a = mjgVar.f;
        mjgVar.b();
        this.b = kp5Var.mo163B(mjgVar.e, 2);
        qae qaeVar = this.c;
        if (qaeVar != null) {
            qaeVar.b(kp5Var, mjgVar);
        }
    }
}
