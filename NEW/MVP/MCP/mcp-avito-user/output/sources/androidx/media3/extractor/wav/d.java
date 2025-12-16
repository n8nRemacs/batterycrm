package androidx.media3.extractor.wav;

import androidx.media3.common.util.M;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;

/* compiled from: WavSeekMap.java */
/* loaded from: classes.dex */
final class d implements H {

    /* renamed from: a, reason: collision with root package name */
    public final b f51886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51887b;

    /* renamed from: c, reason: collision with root package name */
    public final long f51888c;

    /* renamed from: d, reason: collision with root package name */
    public final long f51889d;

    /* renamed from: e, reason: collision with root package name */
    public final long f51890e;

    public d(b bVar, int i12, long j12, long j13) {
        this.f51886a = bVar;
        this.f51887b = i12;
        this.f51888c = j12;
        long j14 = (j13 - j12) / bVar.f51881c;
        this.f51889d = j14;
        this.f51890e = M.K(j14 * i12, 1000000L, bVar.f51880b);
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f51890e;
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        b bVar = this.f51886a;
        int i12 = this.f51887b;
        long j13 = (bVar.f51880b * j12) / (i12 * 1000000);
        long j14 = this.f51889d - 1;
        long jL2 = M.l(j13, 0L, j14);
        int i13 = bVar.f51881c;
        long j15 = this.f51888c;
        long jK2 = M.K(jL2 * i12, 1000000L, bVar.f51880b);
        I i14 = new I(jK2, (i13 * jL2) + j15);
        if (jK2 >= j12 || jL2 == j14) {
            return new H.a(i14, i14);
        }
        long j16 = jL2 + 1;
        return new H.a(i14, new I(M.K(j16 * i12, 1000000L, bVar.f51880b), (i13 * j16) + j15));
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return true;
    }
}
