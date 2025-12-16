package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.U;
import java.util.Arrays;

/* compiled from: ChunkIndex.java */
/* renamed from: com.google.android.exoplayer2.extractor.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36514d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f344479a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f344480b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f344481c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f344482d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f344483e;

    /* renamed from: f, reason: collision with root package name */
    public final long f344484f;

    public C36514d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f344480b = iArr;
        this.f344481c = jArr;
        this.f344482d = jArr2;
        this.f344483e = jArr3;
        int length = iArr.length;
        this.f344479a = length;
        if (length > 0) {
            this.f344484f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f344484f = 0L;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f344484f;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        long[] jArr = this.f344483e;
        int iF2 = U.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long[] jArr2 = this.f344481c;
        z zVar = new z(j13, jArr2[iF2]);
        if (j13 >= j12 || iF2 == this.f344479a - 1) {
            return new y.a(zVar, zVar);
        }
        int i12 = iF2 + 1;
        return new y.a(zVar, new z(jArr[i12], jArr2[i12]));
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f344479a + ", sizes=" + Arrays.toString(this.f344480b) + ", offsets=" + Arrays.toString(this.f344481c) + ", timeUs=" + Arrays.toString(this.f344483e) + ", durationsUs=" + Arrays.toString(this.f344482d) + ")";
    }
}
