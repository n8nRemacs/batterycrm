package defpackage;

/* loaded from: classes.dex */
public final class ryg implements p9e {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public ryg(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.p9e
    public final long a() {
        return this.d;
    }

    @Override // defpackage.p9e
    public final long b(long j) {
        return this.a[xxg.e(this.b, j, true)];
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        long[] jArr = this.a;
        int iE = xxg.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.b;
        l9e l9eVar = new l9e(j2, jArr2[iE]);
        if (j2 >= j || iE == jArr.length - 1) {
            return new f9e(l9eVar, l9eVar);
        }
        int i = iE + 1;
        return new f9e(l9eVar, new l9e(jArr[i], jArr2[i]));
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.c;
    }
}
