package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fc implements ba5 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public sfg h;
    public sfg i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public sfg v;
    public long w;
    public final u62 b = new u62(new byte[7], 7, 3, (byte) 0);
    public final umb c = new umb(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public fc(String str, int i, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // defpackage.ba5
    public final void a() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.ba5
    public final void e(int i, long j) {
        this.u = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0201  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // defpackage.ba5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.umb r20) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc.f(umb):void");
    }

    @Override // defpackage.ba5
    public final void h(boolean z) {
    }

    @Override // defpackage.ba5
    public final void i(kp5 kp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.g = mjgVar.f;
        mjgVar.b();
        sfg sfgVarMo163B = kp5Var.mo163B(mjgVar.e, 1);
        this.h = sfgVarMo163B;
        this.v = sfgVarMo163B;
        if (!this.a) {
            this.i = new jx4();
            return;
        }
        mjgVar.a();
        mjgVar.b();
        sfg sfgVarMo163B2 = kp5Var.mo163B(mjgVar.e, 5);
        this.i = sfgVarMo163B2;
        ff6 ff6Var = new ff6();
        mjgVar.b();
        ff6Var.a = mjgVar.f;
        ff6Var.l = xz9.n(this.f);
        ff6Var.m = xz9.n("application/id3");
        a9h.m(ff6Var, sfgVarMo163B2);
    }
}
