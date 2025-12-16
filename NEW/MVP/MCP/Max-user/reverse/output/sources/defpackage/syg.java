package defpackage;

/* loaded from: classes.dex */
public final class syg implements q9e {
    public final int X;
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long o;

    public syg(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.o = j3;
        this.X = i;
    }

    @Override // defpackage.q9e
    public final long a() {
        return this.o;
    }

    @Override // defpackage.q9e
    public final long b(long j) {
        return this.a[zxg.e(this.b, j, true)];
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        long[] jArr = this.a;
        int iE = zxg.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.b;
        m9e m9eVar = new m9e(j2, jArr2[iE]);
        if (j2 >= j || iE == jArr.length - 1) {
            return new g9e(m9eVar, m9eVar);
        }
        int i = iE + 1;
        return new g9e(m9eVar, new m9e(jArr[i], jArr2[i]));
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.c;
    }

    @Override // defpackage.q9e
    public final long g() {
        return this.d;
    }

    @Override // defpackage.q9e
    public final int h() {
        return this.X;
    }
}
