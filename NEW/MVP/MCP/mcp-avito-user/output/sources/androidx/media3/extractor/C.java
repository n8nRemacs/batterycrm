package androidx.media3.extractor;

import androidx.media3.common.util.C23110a;
import androidx.media3.extractor.H;

/* compiled from: IndexSeekMap.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class C implements H {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f50354a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f50355b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50356c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50357d;

    public C(long j12, long[] jArr, long[] jArr2) {
        C23110a.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z12 = length > 0;
        this.f50357d = z12;
        if (!z12 || jArr2[0] <= 0) {
            this.f50354a = jArr;
            this.f50355b = jArr2;
        } else {
            int i12 = length + 1;
            long[] jArr3 = new long[i12];
            this.f50354a = jArr3;
            long[] jArr4 = new long[i12];
            this.f50355b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f50356c = j12;
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f50356c;
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        if (!this.f50357d) {
            I i12 = I.f50377c;
            return new H.a(i12, i12);
        }
        long[] jArr = this.f50355b;
        int iF2 = androidx.media3.common.util.M.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long[] jArr2 = this.f50354a;
        I i13 = new I(j13, jArr2[iF2]);
        if (j13 == j12 || iF2 == jArr.length - 1) {
            return new H.a(i13, i13);
        }
        int i14 = iF2 + 1;
        return new H.a(i13, new I(jArr[i14], jArr2[i14]));
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return this.f50357d;
    }
}
