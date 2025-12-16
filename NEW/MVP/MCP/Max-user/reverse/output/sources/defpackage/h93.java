package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h93 implements i9e {
    public final long X;
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] o;

    public h93(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.o = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.X = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.X = 0L;
        }
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        long[] jArr = this.o;
        int iE = zxg.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.c;
        m9e m9eVar = new m9e(j2, jArr2[iE]);
        if (j2 >= j || iE == this.a - 1) {
            return new g9e(m9eVar, m9eVar);
        }
        int i = iE + 1;
        return new g9e(m9eVar, new m9e(jArr[i], jArr2[i]));
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.X;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.o) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
