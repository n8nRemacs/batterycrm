package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class o91 {

    /* renamed from: a, reason: collision with root package name */
    @j.B
    private long f388468a;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    private long f388469b;

    /* renamed from: c, reason: collision with root package name */
    @j.B
    private long f388470c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f388471d = new ThreadLocal<>();

    public o91(long j12) {
        c(j12);
    }

    public final synchronized long a() {
        long j12;
        j12 = this.f388468a;
        if (j12 == Long.MAX_VALUE || j12 == 9223372036854775806L) {
            j12 = -9223372036854775807L;
        }
        return j12;
    }

    public final synchronized long b() {
        long j12;
        try {
            j12 = this.f388470c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j12 != -9223372036854775807L ? j12 + this.f388469b : a();
    }

    public final synchronized long c() {
        return this.f388469b;
    }

    public final synchronized long a(long j12) {
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f388469b == -9223372036854775807L) {
                long jLongValue = this.f388468a;
                if (jLongValue == 9223372036854775806L) {
                    Long l12 = this.f388471d.get();
                    l12.getClass();
                    jLongValue = l12.longValue();
                }
                this.f388469b = jLongValue - j12;
                notifyAll();
            }
            this.f388470c = j12;
            return j12 + this.f388469b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(long j12) {
        this.f388468a = j12;
        this.f388469b = j12 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f388470c = -9223372036854775807L;
    }

    public final synchronized long b(long j12) {
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j13 = this.f388470c;
            if (j13 != -9223372036854775807L) {
                long j14 = (j13 * 90000) / 1000000;
                long j15 = (4294967296L + j14) / 8589934592L;
                long j16 = ((j15 - 1) * 8589934592L) + j12;
                j12 += j15 * 8589934592L;
                if (Math.abs(j16 - j14) < Math.abs(j12 - j14)) {
                    j12 = j16;
                }
            }
            return a((j12 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
