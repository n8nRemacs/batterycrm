package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.M;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;

/* compiled from: MlltSeeker.java */
/* loaded from: classes.dex */
final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f50876a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f50877b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50878c;

    public c(long j12, long[] jArr, long[] jArr2) {
        this.f50876a = jArr;
        this.f50877b = jArr2;
        this.f50878c = j12 == -9223372036854775807L ? M.F(jArr2[jArr2.length - 1]) : j12;
    }

    public static Pair<Long, Long> a(long j12, long[] jArr, long[] jArr2) {
        int iF2 = M.f(jArr, j12, true);
        long j13 = jArr[iF2];
        long j14 = jArr2[iF2];
        int i12 = iF2 + 1;
        if (i12 == jArr.length) {
            return Pair.create(Long.valueOf(j13), Long.valueOf(j14));
        }
        return Pair.create(Long.valueOf(j12), Long.valueOf(((long) ((jArr[i12] == j13 ? 0.0d : (j12 - j13) / (r6 - j13)) * (jArr2[i12] - j14))) + j14));
    }

    @Override // androidx.media3.extractor.mp3.e
    public final long c() {
        return -1L;
    }

    @Override // androidx.media3.extractor.H
    public final long d() {
        return this.f50878c;
    }

    @Override // androidx.media3.extractor.mp3.e
    public final long e(long j12) {
        return M.F(((Long) a(j12, this.f50876a, this.f50877b).second).longValue());
    }

    @Override // androidx.media3.extractor.H
    public final H.a f(long j12) {
        Pair<Long, Long> pairA = a(M.Q(M.l(j12, 0L, this.f50878c)), this.f50877b, this.f50876a);
        I i12 = new I(M.F(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new H.a(i12, i12);
    }

    @Override // androidx.media3.extractor.H
    public final boolean g() {
        return true;
    }
}
