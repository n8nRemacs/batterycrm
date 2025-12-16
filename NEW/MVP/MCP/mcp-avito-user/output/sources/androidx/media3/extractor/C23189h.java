package androidx.media3.extractor;

import androidx.media3.extractor.H;
import java.util.Arrays;

/* compiled from: ChunkIndex.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23189h implements H {

    /* renamed from: a, reason: collision with root package name */
    public final int f50567a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f50568b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f50569c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f50570d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f50571e;

    /* renamed from: f, reason: collision with root package name */
    public final long f50572f;

    public C23189h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f50568b = iArr;
        this.f50569c = jArr;
        this.f50570d = jArr2;
        this.f50571e = jArr3;
        int length = iArr.length;
        this.f50567a = length;
        if (length > 0) {
            this.f50572f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f50572f = 0L;
        }
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f50572f;
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        long[] jArr = this.f50571e;
        int iF2 = androidx.media3.common.util.M.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long[] jArr2 = this.f50569c;
        I i12 = new I(j13, jArr2[iF2]);
        if (j13 >= j12 || iF2 == this.f50567a - 1) {
            return new H.a(i12, i12);
        }
        int i13 = iF2 + 1;
        return new H.a(i12, new I(jArr[i13], jArr2[i13]));
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f50567a + ", sizes=" + Arrays.toString(this.f50568b) + ", offsets=" + Arrays.toString(this.f50569c) + ", timeUs=" + Arrays.toString(this.f50571e) + ", durationsUs=" + Arrays.toString(this.f50570d) + ")";
    }
}
