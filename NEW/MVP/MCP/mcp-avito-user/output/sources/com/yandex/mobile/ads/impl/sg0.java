package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
final class sg0 implements a31 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f389927a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f389928b;

    /* renamed from: c, reason: collision with root package name */
    private final long f389929c;

    private sg0(long j12, long[] jArr, long[] jArr2) {
        this.f389927a = jArr;
        this.f389928b = jArr2;
        this.f389929c = j12 == -9223372036854775807L ? pc1.a(jArr2[jArr2.length - 1]) : j12;
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a() {
        return -1L;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final long c() {
        return this.f389929c;
    }

    public static sg0 a(long j12, MlltFrame mlltFrame, long j13) {
        int length = mlltFrame.f383009e.length;
        int i12 = length + 1;
        long[] jArr = new long[i12];
        long[] jArr2 = new long[i12];
        jArr[0] = j12;
        long j14 = 0;
        jArr2[0] = 0;
        for (int i13 = 1; i13 <= length; i13++) {
            int i14 = i13 - 1;
            j12 += mlltFrame.f383007c + mlltFrame.f383009e[i14];
            j14 += mlltFrame.f383008d + mlltFrame.f383010f[i14];
            jArr[i13] = j12;
            jArr2[i13] = j14;
        }
        return new sg0(j13, jArr, jArr2);
    }

    @Override // com.yandex.mobile.ads.impl.x21
    public final x21.a b(long j12) {
        long j13 = this.f389929c;
        int i12 = pc1.f388768a;
        Pair<Long, Long> pairA = a(pc1.b(Math.max(0L, Math.min(j12, j13))), this.f389928b, this.f389927a);
        z21 z21Var = new z21(pc1.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new x21.a(z21Var, z21Var);
    }

    @Override // com.yandex.mobile.ads.impl.a31
    public final long a(long j12) {
        return pc1.a(((Long) a(j12, this.f389927a, this.f389928b).second).longValue());
    }

    private static Pair<Long, Long> a(long j12, long[] jArr, long[] jArr2) {
        int iB2 = pc1.b(jArr, j12, true);
        long j13 = jArr[iB2];
        long j14 = jArr2[iB2];
        int i12 = iB2 + 1;
        if (i12 == jArr.length) {
            return Pair.create(Long.valueOf(j13), Long.valueOf(j14));
        }
        return Pair.create(Long.valueOf(j12), Long.valueOf(((long) ((jArr[i12] == j13 ? 0.0d : (j12 - j13) / (r6 - j13)) * (jArr2[i12] - j14))) + j14));
    }
}
