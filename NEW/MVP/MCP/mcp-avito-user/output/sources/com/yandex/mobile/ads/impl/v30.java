package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
public final class v30 implements x21 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f390784a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f390785b;

    /* renamed from: c, reason: collision with root package name */
    private final long f390786c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f390787d;

    public v30(long j12, long[] jArr, long[] jArr2) {
        db.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z12 = length > 0;
        this.f390787d = z12;
        if (!z12 || jArr2[0] <= 0) {
            this.f390784a = jArr;
            this.f390785b = jArr2;
        } else {
            int i12 = length + 1;
            long[] jArr3 = new long[i12];
            this.f390784a = jArr3;
            long[] jArr4 = new long[i12];
            this.f390785b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f390786c = j12;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return this.f390787d;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f390786c;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        if (!this.f390787d) {
            z21 z21Var = z21.f392158c;
            return new x21.a(z21Var, z21Var);
        }
        int iB2 = pc1.b(this.f390785b, j12, true);
        long[] jArr = this.f390785b;
        long j13 = jArr[iB2];
        long[] jArr2 = this.f390784a;
        z21 z21Var2 = new z21(j13, jArr2[iB2]);
        if (j13 == j12 || iB2 == jArr.length - 1) {
            return new x21.a(z21Var2, z21Var2);
        }
        int i12 = iB2 + 1;
        return new x21.a(z21Var2, new z21(jArr[i12], jArr2[i12]));
    }
}
