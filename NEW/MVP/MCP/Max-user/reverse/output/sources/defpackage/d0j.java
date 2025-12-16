package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class d0j implements Closeable {
    public static final HashMap X = new HashMap();
    public int a;
    public long b;
    public long c;
    public long d = 2147483647L;
    public long o = -2147483648L;

    public d0j(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.b;
        if (j == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        y(j);
    }

    public void l() {
        this.b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void w(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.c;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.o = -2147483648L;
        }
        this.c = jElapsedRealtimeNanos;
        this.a++;
        this.d = Math.min(this.d, j);
        this.o = Math.max(this.o, j);
        if (this.a % 50 == 0) {
            Locale locale = Locale.US;
            u1j.v();
        }
        if (this.a % 500 == 0) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.o = -2147483648L;
        }
    }

    public void y(long j) {
        w((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
