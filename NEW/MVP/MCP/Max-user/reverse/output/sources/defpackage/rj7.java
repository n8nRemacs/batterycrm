package defpackage;

/* loaded from: classes.dex */
public final class rj7 implements i9e {
    public final r55 a;
    public final r55 b;
    public long c;

    public rj7(long j, long[] jArr, long[] jArr2) {
        hsi.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new r55(length, 2);
            this.b = new r55(length, 2);
        } else {
            int i = length + 1;
            r55 r55Var = new r55(i, 2);
            this.a = r55Var;
            r55 r55Var2 = new r55(i, 2);
            this.b = r55Var2;
            r55Var.a(0L);
            r55Var2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return this.b.b > 0;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        r55 r55Var = this.b;
        if (r55Var.b == 0) {
            m9e m9eVar = m9e.c;
            return new g9e(m9eVar, m9eVar);
        }
        int iB = zxg.b(r55Var, j);
        long jC = r55Var.c(iB);
        r55 r55Var2 = this.a;
        m9e m9eVar2 = new m9e(jC, r55Var2.c(iB));
        if (jC == j || iB == r55Var.b - 1) {
            return new g9e(m9eVar2, m9eVar2);
        }
        int i = iB + 1;
        return new g9e(m9eVar2, new m9e(r55Var.c(i), r55Var2.c(i)));
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.c;
    }
}
