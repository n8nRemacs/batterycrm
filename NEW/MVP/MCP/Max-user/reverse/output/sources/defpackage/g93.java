package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g93 implements h9e {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public g93(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        long[] jArr = this.e;
        int iE = xxg.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.c;
        l9e l9eVar = new l9e(j2, jArr2[iE]);
        if (j2 >= j || iE == this.a - 1) {
            return new f9e(l9eVar, l9eVar);
        }
        int i = iE + 1;
        return new f9e(l9eVar, new l9e(jArr[i], jArr2[i]));
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.f;
    }

    public final String toString() {
        String string = Arrays.toString(this.b);
        String string2 = Arrays.toString(this.c);
        String string3 = Arrays.toString(this.e);
        String string4 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder(u45.f(u45.f(u45.f(u45.f(71, string), string2), string3), string4));
        sb.append("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        sb.append(string);
        ho7.r(sb, ", offsets=", string2, ", timeUs=", string3);
        return ctd.j(sb, ", durationsUs=", string4, ")");
    }
}
