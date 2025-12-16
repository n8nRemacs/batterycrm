package com.google.android.exoplayer2.util;

/* compiled from: TimestampAdjuster.java */
/* loaded from: classes6.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @j.B
    public long f348099a;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public long f348100b;

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public long f348101c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f348102d = new ThreadLocal<>();

    public O(long j12) {
        d(j12);
    }

    public final synchronized long a(long j12) {
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f348100b == -9223372036854775807L) {
                long jLongValue = this.f348099a;
                if (jLongValue == 9223372036854775806L) {
                    Long l12 = this.f348102d.get();
                    l12.getClass();
                    jLongValue = l12.longValue();
                }
                this.f348100b = jLongValue - j12;
                notifyAll();
            }
            this.f348101c = j12;
            return j12 + this.f348100b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j12) {
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j13 = this.f348101c;
            if (j13 != -9223372036854775807L) {
                long j14 = (j13 * 90000) / 1000000;
                long j15 = (4294967296L + j14) / 8589934592L;
                long j16 = ((j15 - 1) * 8589934592L) + j12;
                long j17 = (j15 * 8589934592L) + j12;
                j12 = Math.abs(j16 - j14) < Math.abs(j17 - j14) ? j16 : j17;
            }
            return a((j12 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c() {
        long j12;
        j12 = this.f348099a;
        if (j12 == Long.MAX_VALUE || j12 == 9223372036854775806L) {
            j12 = -9223372036854775807L;
        }
        return j12;
    }

    public final synchronized void d(long j12) {
        this.f348099a = j12;
        this.f348100b = j12 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f348101c = -9223372036854775807L;
    }
}
