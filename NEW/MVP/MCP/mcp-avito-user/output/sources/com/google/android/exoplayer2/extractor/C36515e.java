package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.y;

/* compiled from: ConstantBitrateSeekMap.java */
/* renamed from: com.google.android.exoplayer2.extractor.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36515e implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f344485a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344487c;

    /* renamed from: d, reason: collision with root package name */
    public final long f344488d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344489e;

    /* renamed from: f, reason: collision with root package name */
    public final long f344490f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f344491g;

    public C36515e(int i12, int i13, long j12, long j13, boolean z12) {
        this.f344485a = j12;
        this.f344486b = j13;
        this.f344487c = i13 == -1 ? 1 : i13;
        this.f344489e = i12;
        this.f344491g = z12;
        if (j12 == -1) {
            this.f344488d = -1L;
            this.f344490f = -9223372036854775807L;
        } else {
            long j14 = j12 - j13;
            this.f344488d = j14;
            this.f344490f = (Math.max(0L, j14) * 8000000) / i12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final long d() {
        return this.f344490f;
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final y.a f(long j12) {
        long j13 = this.f344488d;
        long j14 = this.f344486b;
        if (j13 == -1 && !this.f344491g) {
            z zVar = new z(0L, j14);
            return new y.a(zVar, zVar);
        }
        int i12 = this.f344489e;
        long j15 = this.f344487c;
        long jMin = (((i12 * j12) / 8000000) / j15) * j15;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - j15);
        }
        long jMax = Math.max(jMin, 0L) + j14;
        long jMax2 = (Math.max(0L, jMax - j14) * 8000000) / i12;
        z zVar2 = new z(jMax2, jMax);
        if (j13 != -1 && jMax2 < j12) {
            long j16 = jMax + j15;
            if (j16 < this.f344485a) {
                return new y.a(zVar2, new z((Math.max(0L, j16 - j14) * 8000000) / i12, j16));
            }
        }
        return new y.a(zVar2, zVar2);
    }

    @Override // com.google.android.exoplayer2.extractor.y
    public final boolean g() {
        return this.f344488d != -1 || this.f344491g;
    }
}
