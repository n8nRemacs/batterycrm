package defpackage;

/* loaded from: classes.dex */
public final class ufg {
    public final efg a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ufg(efg efgVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        hsi.b(iArr.length == jArr2.length);
        hsi.b(jArr.length == jArr2.length);
        hsi.b(iArr2.length == jArr2.length);
        this.a = efgVar;
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
        for (int iA = zxg.a(jArr, j, true); iA < jArr.length; iA++) {
            if ((this.g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
