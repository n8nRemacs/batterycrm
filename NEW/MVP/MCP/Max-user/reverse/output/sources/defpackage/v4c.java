package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class v4c {
    public final t4c a;
    public final rm5 b;
    public final kwf c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public v4c(rm5 rm5Var, t4c t4cVar, r9g r9gVar, int i, kwf kwfVar, Looper looper) {
        this.b = rm5Var;
        this.a = t4cVar;
        this.f = looper;
        this.c = kwfVar;
    }

    public final synchronized void a(long j) {
        boolean z;
        fsi.d(this.g);
        fsi.d(this.f.getThread() != Thread.currentThread());
        this.c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.i;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            this.c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        fsi.d(!this.g);
        this.g = true;
        rm5 rm5Var = this.b;
        synchronized (rm5Var) {
            if (!rm5Var.H0 && rm5Var.s0.isAlive()) {
                rm5Var.Z.a(14, this).b();
                return;
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
