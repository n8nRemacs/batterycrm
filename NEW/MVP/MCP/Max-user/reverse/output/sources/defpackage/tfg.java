package defpackage;

/* loaded from: classes.dex */
public final class tfg {
    public final dfg a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public tfg(dfg dfgVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        fsi.b(iArr.length == jArr2.length);
        fsi.b(jArr.length == jArr2.length);
        fsi.b(iArr2.length == jArr2.length);
        this.a = dfgVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iB = xxg.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
