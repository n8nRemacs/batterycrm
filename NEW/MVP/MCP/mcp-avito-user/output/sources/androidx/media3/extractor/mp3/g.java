package androidx.media3.extractor.mp3;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;
import j.P;

/* compiled from: XingSeeker.java */
/* loaded from: classes.dex */
final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f50904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50905b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50906c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50907d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50908e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final long[] f50909f;

    public g(long j12, int i12, long j13, long j14, @P long[] jArr) {
        this.f50904a = j12;
        this.f50905b = i12;
        this.f50906c = j13;
        this.f50909f = jArr;
        this.f50907d = j14;
        this.f50908e = j14 != -1 ? j12 + j14 : -1L;
    }

    @Override // androidx.media3.extractor.mp3.e
    public final long c() {
        return this.f50908e;
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f50906c;
    }

    @Override // androidx.media3.extractor.mp3.e
    public final long e(long j12) {
        long j13 = j12 - this.f50904a;
        if (!g() || j13 <= this.f50905b) {
            return 0L;
        }
        long[] jArr = this.f50909f;
        C23110a.h(jArr);
        double d12 = (j13 * 256.0d) / this.f50907d;
        int iF2 = M.f(jArr, (long) d12, true);
        long j14 = this.f50906c;
        long j15 = (iF2 * j14) / 100;
        long j16 = jArr[iF2];
        int i12 = iF2 + 1;
        long j17 = (j14 * i12) / 100;
        return Math.round((j16 == (iF2 == 99 ? 256L : jArr[i12]) ? 0.0d : (d12 - j16) / (r0 - j16)) * (j17 - j15)) + j15;
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        double d12;
        boolean zG2 = g();
        int i12 = this.f50905b;
        long j13 = this.f50904a;
        if (!zG2) {
            I i13 = new I(0L, j13 + i12);
            return new H.a(i13, i13);
        }
        long jL2 = M.l(j12, 0L, this.f50906c);
        double d13 = (jL2 * 100.0d) / this.f50906c;
        double d14 = 0.0d;
        if (d13 <= 0.0d) {
            d12 = 256.0d;
        } else if (d13 >= 100.0d) {
            d12 = 256.0d;
            d14 = 256.0d;
        } else {
            int i14 = (int) d13;
            long[] jArr = this.f50909f;
            C23110a.h(jArr);
            double d15 = jArr[i14];
            d14 = (((i14 == 99 ? 256.0d : jArr[i14 + 1]) - d15) * (d13 - i14)) + d15;
            d12 = 256.0d;
        }
        double d16 = d14 / d12;
        long j14 = this.f50907d;
        I i15 = new I(jL2, j13 + M.l(Math.round(d16 * j14), i12, j14 - 1));
        return new H.a(i15, i15);
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return this.f50909f != null;
    }
}
