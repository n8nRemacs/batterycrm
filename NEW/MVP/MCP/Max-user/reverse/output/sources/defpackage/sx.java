package defpackage;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sx implements Runnable {
    public static final ThreadPoolExecutor Z;
    public static y1a s0;
    public static volatile ThreadPoolExecutor t0;
    public final CountDownLatch X;
    public final /* synthetic */ lii Y;
    public final bm4 a;
    public final w1a b;
    public volatile int c = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean();

    static {
        h30 h30Var = new h30(4);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), h30Var);
        Z = threadPoolExecutor;
        t0 = threadPoolExecutor;
    }

    public sx(lii liiVar) {
        this.Y = liiVar;
        bm4 bm4Var = new bm4(8, this);
        this.a = bm4Var;
        this.b = new w1a(this, bm4Var);
        this.X = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        y1a y1aVar;
        synchronized (sx.class) {
            try {
                if (s0 == null) {
                    s0 = new y1a(Looper.getMainLooper(), 0, false);
                }
                y1aVar = s0;
            } catch (Throwable th) {
                throw th;
            }
        }
        y1aVar.obtainMessage(1, new x1a(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.b();
    }
}
