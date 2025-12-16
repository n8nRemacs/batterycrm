package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: XingSeeker.java */
/* loaded from: classes6.dex */
final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f344731a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344732b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344733c;

    /* renamed from: d, reason: collision with root package name */
    public final long f344734d;

    /* renamed from: e, reason: collision with root package name */
    public final long f344735e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final long[] f344736f;

    public g(long j12, int i12, long j13, long j14, @P long[] jArr) {
        this.f344731a = j12;
        this.f344732b = i12;
        this.f344733c = j13;
        this.f344736f = jArr;
        this.f344734d = j14;
        this.f344735e = j14 != -1 ? j12 + j14 : -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long c() {
        return this.f344735e;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f344733c;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long e(long j12) {
        long j13 = j12 - this.f344731a;
        if (!g() || j13 <= this.f344732b) {
            return 0L;
        }
        long[] jArr = this.f344736f;
        C36585a.e(jArr);
        double d12 = (j13 * 256.0d) / this.f344734d;
        int iF2 = U.f(jArr, (long) d12, true);
        long j14 = this.f344733c;
        long j15 = (iF2 * j14) / 100;
        long j16 = jArr[iF2];
        int i12 = iF2 + 1;
        long j17 = (j14 * i12) / 100;
        return Math.round((j16 == (iF2 == 99 ? 256L : jArr[i12]) ? 0.0d : (d12 - j16) / (r0 - j16)) * (j17 - j15)) + j15;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        double d12;
        boolean zG2 = g();
        int i12 = this.f344732b;
        long j13 = this.f344731a;
        if (!zG2) {
            z zVar = new z(0L, j13 + i12);
            return new y.a(zVar, zVar);
        }
        long jL2 = U.l(j12, 0L, this.f344733c);
        double d13 = (jL2 * 100.0d) / this.f344733c;
        double d14 = 0.0d;
        if (d13 <= 0.0d) {
            d12 = 256.0d;
        } else if (d13 >= 100.0d) {
            d12 = 256.0d;
            d14 = 256.0d;
        } else {
            int i13 = (int) d13;
            long[] jArr = this.f344736f;
            C36585a.e(jArr);
            double d15 = jArr[i13];
            d14 = (((i13 == 99 ? 256.0d : jArr[i13 + 1]) - d15) * (d13 - i13)) + d15;
            d12 = 256.0d;
        }
        double d16 = d14 / d12;
        long j14 = this.f344734d;
        z zVar2 = new z(jL2, j13 + U.l(Math.round(d16 * j14), i12, j14 - 1));
        return new y.a(zVar2, zVar2);
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return this.f344736f != null;
    }
}
