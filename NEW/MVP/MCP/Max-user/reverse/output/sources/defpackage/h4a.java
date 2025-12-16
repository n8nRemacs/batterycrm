package defpackage;

/* loaded from: classes.dex */
public final class h4a implements ba5 {
    public String e;
    public sfg f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final umb a = new umb(2, new byte[15]);
    public final u62 b = new u62(3);
    public final umb c = new umb();
    public final i4a p = new i4a();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override // defpackage.ba5
    public final void a() {
        this.d = 0;
        this.l = 0;
        this.a.G(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.ba5
    public final void e(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0422  */
    @Override // defpackage.ba5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.umb r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4a.f(umb):void");
    }

    @Override // defpackage.ba5
    public final void h(boolean z) {
    }

    @Override // defpackage.ba5
    public final void i(kp5 kp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.e = mjgVar.f;
        mjgVar.b();
        this.f = kp5Var.mo163B(mjgVar.e, 1);
    }
}
