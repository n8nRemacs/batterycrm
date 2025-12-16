package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mw;
import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
public final class lw implements x21 {

    /* renamed from: a, reason: collision with root package name */
    private final mw f387780a;

    /* renamed from: b, reason: collision with root package name */
    private final long f387781b;

    public lw(mw mwVar, long j12) {
        this.f387780a = mwVar;
        this.f387781b = j12;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f387780a.b();
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        db.b(this.f387780a.f388108k);
        mw mwVar = this.f387780a;
        mw.a aVar = mwVar.f388108k;
        long[] jArr = aVar.f388110a;
        long[] jArr2 = aVar.f388111b;
        int iB2 = pc1.b(jArr, mwVar.a(j12), false);
        long j13 = iB2 == -1 ? 0L : jArr[iB2];
        long j14 = iB2 != -1 ? jArr2[iB2] : 0L;
        long j15 = this.f387780a.f388102e;
        long j16 = (j13 * 1000000) / j15;
        long j17 = this.f387781b;
        z21 z21Var = new z21(j16, j14 + j17);
        if (j16 == j12 || iB2 == jArr.length - 1) {
            return new x21.a(z21Var, z21Var);
        }
        int i12 = iB2 + 1;
        return new x21.a(z21Var, new z21((jArr[i12] * 1000000) / j15, j17 + jArr2[i12]));
    }
}
