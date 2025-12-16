package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;

/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes6.dex */
public final class q implements y {

    /* renamed from: a, reason: collision with root package name */
    public final r f344973a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344974b;

    public q(r rVar, long j12) {
        this.f344973a = rVar;
        this.f344974b = j12;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f344973a.b();
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        r rVar = this.f344973a;
        C36585a.e(rVar.f344985k);
        r.a aVar = rVar.f344985k;
        long[] jArr = aVar.f344987a;
        int iF2 = U.f(jArr, U.l((rVar.f344979e * j12) / 1000000, 0L, rVar.f344984j - 1), false);
        long j13 = iF2 == -1 ? 0L : jArr[iF2];
        long[] jArr2 = aVar.f344988b;
        long j14 = iF2 != -1 ? jArr2[iF2] : 0L;
        int i12 = rVar.f344979e;
        long j15 = (j13 * 1000000) / i12;
        long j16 = this.f344974b;
        z zVar = new z(j15, j14 + j16);
        if (j15 == j12 || iF2 == jArr.length - 1) {
            return new y.a(zVar, zVar);
        }
        int i13 = iF2 + 1;
        return new y.a(zVar, new z((jArr[i13] * 1000000) / i12, j16 + jArr2[i13]));
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return true;
    }
}
