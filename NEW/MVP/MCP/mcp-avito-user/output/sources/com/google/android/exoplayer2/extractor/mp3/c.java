package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.util.U;

/* compiled from: MlltSeeker.java */
/* loaded from: classes6.dex */
final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f344704a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f344705b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344706c;

    public c(long j12, long[] jArr, long[] jArr2) {
        this.f344704a = jArr;
        this.f344705b = jArr2;
        this.f344706c = j12 == -9223372036854775807L ? U.H(jArr2[jArr2.length - 1]) : j12;
    }

    public static Pair<Long, Long> a(long j12, long[] jArr, long[] jArr2) {
        int iF2 = U.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long j14 = jArr2[iF2];
        int i12 = iF2 + 1;
        if (i12 == jArr.length) {
            return Pair.create(Long.valueOf(j13), Long.valueOf(j14));
        }
        return Pair.create(Long.valueOf(j12), Long.valueOf(((long) ((jArr[i12] == j13 ? 0.0d : (j12 - j13) / (r6 - j13)) * (jArr2[i12] - j14))) + j14));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long c() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f344706c;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.e
    public final long e(long j12) {
        return U.H(((Long) a(j12, this.f344704a, this.f344705b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        Pair<Long, Long> pairA = a(U.R(U.l(j12, 0L, this.f344706c)), this.f344705b, this.f344704a);
        z zVar = new z(U.H(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new y.a(zVar, zVar);
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return true;
    }
}
