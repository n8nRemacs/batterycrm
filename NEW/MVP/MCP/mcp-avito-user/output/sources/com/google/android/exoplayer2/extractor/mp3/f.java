package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.U;

/* compiled from: VbriSeeker.java */
/* loaded from: classes6.dex */
final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f344727a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f344728b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344729c;

    /* renamed from: d, reason: collision with root package name */
    public final long f344730d;

    public f(long[] jArr, long[] jArr2, long j12, long j13) {
        this.f344727a = jArr;
        this.f344728b = jArr2;
        this.f344729c = j12;
        this.f344730d = j13;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long c() {
        return this.f344730d;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f344729c;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long e(long j12) {
        return this.f344727a[U.f(this.f344728b, j12, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        long[] jArr = this.f344727a;
        int iF2 = U.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long[] jArr2 = this.f344728b;
        z zVar = new z(j13, jArr2[iF2]);
        if (j13 >= j12 || iF2 == jArr.length - 1) {
            return new y.a(zVar, zVar);
        }
        int i12 = iF2 + 1;
        return new y.a(zVar, new z(jArr[i12], jArr2[i12]));
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return true;
    }
}
