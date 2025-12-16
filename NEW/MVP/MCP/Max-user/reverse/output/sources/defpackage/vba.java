package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class vba extends Handler {
    public final y6d a;
    public final String b;
    public final jx0 c;
    public double d;
    public double e;
    public double f;
    public long g;
    public long h;
    public double i;

    public vba(Looper looper, y6d y6dVar, String str, jx0 jx0Var) {
        super(looper);
        this.a = y6dVar;
        this.b = str;
        this.c = jx0Var;
    }

    public final void a(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        double d = this.e + 1.0d;
        this.e = d;
        double d2 = this.d + (jElapsedRealtime - j);
        this.d = d2;
        double d3 = d2 / d;
        double d4 = this.i;
        Object objValueOf = d4 > 0.0d ? Double.valueOf(this.f / d4) : 0;
        if (jElapsedRealtime - this.g > WorkRequest.MIN_BACKOFF_MILLIS) {
            this.a.log(this.b, "Total calls: " + this.d + ", average call time: " + d3 + ", average idle time " + objValueOf);
            this.g = jElapsedRealtime;
            this.e = 0.0d;
            this.d = 0.0d;
            this.i = 0.0d;
            this.f = 0.0d;
            this.h = 0L;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (this.h > 0) {
                this.f = jElapsedRealtime - r2;
                this.i += 1.0d;
            }
            super.dispatchMessage(message);
            this.h = SystemClock.elapsedRealtime();
            message.getCallback();
            a(jElapsedRealtime);
        } catch (Throwable th) {
            message.getCallback();
            a(jElapsedRealtime);
            this.c.invoke(th);
        }
    }
}
