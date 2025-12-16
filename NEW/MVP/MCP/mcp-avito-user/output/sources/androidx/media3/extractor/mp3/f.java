package androidx.media3.extractor.mp3;

import androidx.media3.common.util.M;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;

/* compiled from: VbriSeeker.java */
/* loaded from: classes.dex */
final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f50900a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f50901b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50902c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50903d;

    public f(long[] jArr, long[] jArr2, long j12, long j13) {
        this.f50900a = jArr;
        this.f50901b = jArr2;
        this.f50902c = j12;
        this.f50903d = j13;
    }

    @Override // androidx.media3.extractor.mp3.e
    public final long c() {
        return this.f50903d;
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f50902c;
    }

    @Override // androidx.media3.extractor.mp3.e
    public final long e(long j12) {
        return this.f50900a[M.f(this.f50901b, j12, true)];
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        long[] jArr = this.f50900a;
        int iF2 = M.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long[] jArr2 = this.f50901b;
        I i12 = new I(j13, jArr2[iF2]);
        if (j13 >= j12 || iF2 == jArr.length - 1) {
            return new H.a(i12, i12);
        }
        int i13 = iF2 + 1;
        return new H.a(i12, new I(jArr[i13], jArr2[i13]));
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return true;
    }
}
