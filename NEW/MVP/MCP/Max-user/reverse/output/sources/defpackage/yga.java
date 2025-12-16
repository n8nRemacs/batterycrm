package defpackage;

import java.time.Instant;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class yga {
    public final bh8 a;
    public volatile long b;
    public final rde d;
    public volatile long c = 12000;
    public long e = BuildConfig.MAX_TIME_TO_UPLOAD;
    public Instant f = Instant.MIN;

    public yga(bh8 bh8Var, rde rdeVar) {
        this.a = bh8Var;
        this.d = rdeVar;
    }

    public final void a() {
        if (this.b < 0) {
            this.a.error("Inconsistency error in congestion controller; attempt to set bytes in-flight below 0");
            this.b = 0L;
            this.d.k();
        }
    }

    public final synchronized void b(List list) {
        long jSum = list.stream().map(new m0(0)).mapToInt(new n0(0)).sum();
        this.b -= jSum;
        this.d.k();
        if (jSum > 0) {
            a();
            this.a.debug("Bytes in flight decreased with " + jSum + " to " + this.b + " (" + list.size() + " packets RESET)");
        }
    }

    public final synchronized void c(List list) {
        int iSum = list.stream().map(new m0(1)).mapToInt(new n0(1)).sum();
        if (iSum > 0) {
            this.b -= iSum;
            this.d.k();
            a();
            this.a.debug("Bytes in flight decreased to " + this.b + " (" + list.size() + " packets acked)");
        }
    }

    public final synchronized void d(btc btcVar) {
        if (!btcVar.q()) {
            this.b += btcVar.o();
            this.a.debug("Bytes in flight increased to " + this.b);
            if (this.b > this.c) {
                this.a.cc("Bytes in flight exceeds congestion window: " + this.b + " > " + this.c);
            }
        }
    }
}
