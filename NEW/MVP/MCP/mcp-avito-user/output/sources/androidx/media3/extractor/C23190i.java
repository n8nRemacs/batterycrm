package androidx.media3.extractor;

import androidx.media3.extractor.H;

/* compiled from: ConstantBitrateSeekMap.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23190i implements H {

    /* renamed from: a, reason: collision with root package name */
    public final long f50573a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50575c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50577e;

    /* renamed from: f, reason: collision with root package name */
    public final long f50578f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f50579g;

    public C23190i(int i12, int i13, long j12, long j13, boolean z12) {
        this.f50573a = j12;
        this.f50574b = j13;
        this.f50575c = i13 == -1 ? 1 : i13;
        this.f50577e = i12;
        this.f50579g = z12;
        if (j12 == -1) {
            this.f50576d = -1L;
            this.f50578f = -9223372036854775807L;
        } else {
            long j14 = j12 - j13;
            this.f50576d = j14;
            this.f50578f = (Math.max(0L, j14) * 8000000) / i12;
        }
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f50578f;
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        long j13 = this.f50576d;
        long j14 = this.f50574b;
        if (j13 == -1 && !this.f50579g) {
            I i12 = new I(0L, j14);
            return new H.a(i12, i12);
        }
        int i13 = this.f50577e;
        long j15 = this.f50575c;
        long jMin = (((i13 * j12) / 8000000) / j15) * j15;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - j15);
        }
        long jMax = Math.max(jMin, 0L) + j14;
        long jMax2 = (Math.max(0L, jMax - j14) * 8000000) / i13;
        I i14 = new I(jMax2, jMax);
        if (j13 != -1 && jMax2 < j12) {
            long j16 = jMax + j15;
            if (j16 < this.f50573a) {
                return new H.a(i14, new I((Math.max(0L, j16 - j14) * 8000000) / i13, j16));
            }
        }
        return new H.a(i14, i14);
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return this.f50576d != -1 || this.f50579g;
    }
}
