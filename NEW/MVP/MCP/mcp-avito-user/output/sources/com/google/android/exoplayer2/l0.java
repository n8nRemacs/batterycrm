package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C36585a;

/* compiled from: SeekParameters.java */
/* loaded from: classes6.dex */
public final class l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f345461c;

    /* renamed from: a, reason: collision with root package name */
    public final long f345462a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345463b;

    static {
        l0 l0Var = new l0(0L, 0L);
        new l0(Long.MAX_VALUE, Long.MAX_VALUE);
        new l0(Long.MAX_VALUE, 0L);
        new l0(0L, Long.MAX_VALUE);
        f345461c = l0Var;
    }

    public l0(long j12, long j13) {
        C36585a.b(j12 >= 0);
        C36585a.b(j13 >= 0);
        this.f345462a = j12;
        this.f345463b = j13;
    }

    public final long a(long j12, long j13, long j14) {
        long j15 = this.f345462a;
        long j16 = this.f345463b;
        if (j15 == 0 && j16 == 0) {
            return j12;
        }
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        long j17 = j12 - j15;
        if (((j15 ^ j12) & (j12 ^ j17)) < 0) {
            j17 = Long.MIN_VALUE;
        }
        long j18 = j12 + j16;
        if (((j16 ^ j18) & (j12 ^ j18)) < 0) {
            j18 = Long.MAX_VALUE;
        }
        boolean z12 = false;
        boolean z13 = j17 <= j13 && j13 <= j18;
        if (j17 <= j14 && j14 <= j18) {
            z12 = true;
        }
        return (z13 && z12) ? Math.abs(j13 - j12) <= Math.abs(j14 - j12) ? j13 : j14 : z13 ? j13 : z12 ? j14 : j17;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f345462a == l0Var.f345462a && this.f345463b == l0Var.f345463b;
    }

    public final int hashCode() {
        return (((int) this.f345462a) * 31) + ((int) this.f345463b);
    }
}
