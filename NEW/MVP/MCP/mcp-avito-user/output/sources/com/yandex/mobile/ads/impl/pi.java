package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class pi implements x21 {

    /* renamed from: a, reason: collision with root package name */
    public final int f388843a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f388844b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f388845c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f388846d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f388847e;

    /* renamed from: f, reason: collision with root package name */
    private final long f388848f;

    public pi(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f388844b = iArr;
        this.f388845c = jArr;
        this.f388846d = jArr2;
        this.f388847e = jArr3;
        int length = iArr.length;
        this.f388843a = length;
        if (length <= 0) {
            this.f388848f = 0L;
        } else {
            int i12 = length - 1;
            this.f388848f = jArr2[i12] + jArr3[i12];
        }
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f388848f;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("ChunkIndex(length=");
        sbA.append(this.f388843a);
        sbA.append(", sizes=");
        sbA.append(Arrays.toString(this.f388844b));
        sbA.append(", offsets=");
        sbA.append(Arrays.toString(this.f388845c));
        sbA.append(", timeUs=");
        sbA.append(Arrays.toString(this.f388847e));
        sbA.append(", durationsUs=");
        sbA.append(Arrays.toString(this.f388846d));
        sbA.append(")");
        return sbA.toString();
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        int iB2 = pc1.b(this.f388847e, j12, true);
        long[] jArr = this.f388847e;
        long j13 = jArr[iB2];
        long[] jArr2 = this.f388845c;
        z21 z21Var = new z21(j13, jArr2[iB2]);
        if (j13 >= j12 || iB2 == this.f388843a - 1) {
            return new x21.a(z21Var, z21Var);
        }
        int i12 = iB2 + 1;
        return new x21.a(z21Var, new z21(jArr[i12], jArr2[i12]));
    }
}
