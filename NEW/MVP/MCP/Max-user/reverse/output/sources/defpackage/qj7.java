package defpackage;

/* loaded from: classes.dex */
public final class qj7 implements h9e {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public qj7(long j, long[] jArr, long[] jArr2) {
        fsi.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        if (!this.d) {
            l9e l9eVar = l9e.c;
            return new f9e(l9eVar, l9eVar);
        }
        long[] jArr = this.b;
        int iE = xxg.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.a;
        l9e l9eVar2 = new l9e(j2, jArr2[iE]);
        if (j2 == j || iE == jArr.length - 1) {
            return new f9e(l9eVar2, l9eVar2);
        }
        int i = iE + 1;
        return new f9e(l9eVar2, new l9e(jArr[i], jArr2[i]));
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.c;
    }
}
