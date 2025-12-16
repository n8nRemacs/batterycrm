package androidx.media3.common.util;

/* compiled from: TimestampAdjuster.java */
@J
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @j.B
    public long f47882a;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public long f47883b;

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public long f47884c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f47885d = new ThreadLocal<>();

    public G(long j12) {
        d(j12);
    }

    public final synchronized long a(long j12) {
        long j13;
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f47883b != -9223372036854775807L)) {
                    long jLongValue = this.f47882a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l12 = this.f47885d.get();
                        l12.getClass();
                        jLongValue = l12.longValue();
                    }
                    this.f47883b = jLongValue - j12;
                    notifyAll();
                }
                this.f47884c = j12;
                j13 = j12 + this.f47883b;
            }
            return j13;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j12) {
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j13 = this.f47884c;
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
        j12 = this.f47882a;
        if (j12 == Long.MAX_VALUE || j12 == 9223372036854775806L) {
            j12 = -9223372036854775807L;
        }
        return j12;
    }

    public final synchronized void d(long j12) {
        this.f47882a = j12;
        this.f47883b = j12 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f47884c = -9223372036854775807L;
    }
}
