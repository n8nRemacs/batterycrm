package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final class zx4 extends Thread {
    public static int X;
    public volatile Handler a = null;
    public final CountDownLatch b = new CountDownLatch(1);
    public long c;
    public final int d;
    public final int o;

    public zx4(String str) {
        int i = X;
        X = i + 1;
        this.d = i;
        this.o = -1000;
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        try {
            this.b.await();
            this.a.removeCallbacks(runnable);
        } catch (Exception e) {
            RLottie.getLogger().d(e);
        }
    }

    public final void b(Runnable runnable) {
        this.c = SystemClock.elapsedRealtime();
        c(runnable, 0L);
    }

    public final boolean c(Runnable runnable, long j) throws InterruptedException {
        try {
            this.b.await();
        } catch (Exception e) {
            RLottie.getLogger().d(e);
        }
        return j <= 0 ? this.a.post(runnable) : this.a.postDelayed(runnable, j);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Looper.prepare();
        this.a = new Handler(Looper.myLooper(), new dn3(2, this));
        this.b.countDown();
        int i = this.o;
        if (i != -1000) {
            Process.setThreadPriority(i);
        }
        Looper.loop();
    }
}
