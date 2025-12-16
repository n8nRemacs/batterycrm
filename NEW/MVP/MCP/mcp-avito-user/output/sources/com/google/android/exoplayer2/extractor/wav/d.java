package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.U;

/* compiled from: WavSeekMap.java */
/* loaded from: classes6.dex */
final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final b f345384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345385b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345386c;

    /* renamed from: d, reason: collision with root package name */
    public final long f345387d;

    /* renamed from: e, reason: collision with root package name */
    public final long f345388e;

    public d(b bVar, int i12, long j12, long j13) {
        this.f345384a = bVar;
        this.f345385b = i12;
        this.f345386c = j12;
        long j14 = (j13 - j12) / bVar.f345379c;
        this.f345387d = j14;
        this.f345388e = U.M(j14 * i12, 1000000L, bVar.f345378b);
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f345388e;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        b bVar = this.f345384a;
        int i12 = this.f345385b;
        long j13 = (bVar.f345378b * j12) / (i12 * 1000000);
        long j14 = this.f345387d - 1;
        long jL2 = U.l(j13, 0L, j14);
        int i13 = bVar.f345379c;
        long j15 = this.f345386c;
        long jM2 = U.M(jL2 * i12, 1000000L, bVar.f345378b);
        z zVar = new z(jM2, (i13 * jL2) + j15);
        if (jM2 >= j12 || jL2 == j14) {
            return new y.a(zVar, zVar);
        }
        long j16 = jL2 + 1;
        return new y.a(zVar, new z(U.M(j16 * i12, 1000000L, bVar.f345378b), (i13 * j16) + j15));
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return true;
    }
}
