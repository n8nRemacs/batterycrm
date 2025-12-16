package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;

/* compiled from: IndexSeekMap.java */
/* loaded from: classes6.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f345343a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f345344b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345345c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f345346d;

    public v(long j12, long[] jArr, long[] jArr2) {
        C36585a.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z12 = length > 0;
        this.f345346d = z12;
        if (!z12 || jArr2[0] <= 0) {
            this.f345343a = jArr;
            this.f345344b = jArr2;
        } else {
            int i12 = length + 1;
            long[] jArr3 = new long[i12];
            this.f345343a = jArr3;
            long[] jArr4 = new long[i12];
            this.f345344b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f345345c = j12;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f345345c;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        if (!this.f345346d) {
            z zVar = z.f345393c;
            return new y.a(zVar, zVar);
        }
        long[] jArr = this.f345344b;
        int iF2 = U.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long[] jArr2 = this.f345343a;
        z zVar2 = new z(j13, jArr2[iF2]);
        if (j13 == j12 || iF2 == jArr.length - 1) {
            return new y.a(zVar2, zVar2);
        }
        int i12 = iF2 + 1;
        return new y.a(zVar2, new z(jArr[i12], jArr2[i12]));
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return this.f345346d;
    }
}
