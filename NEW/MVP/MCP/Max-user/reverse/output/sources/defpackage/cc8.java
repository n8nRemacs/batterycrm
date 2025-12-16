package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class cc8 extends Handler implements Runnable {
    public Thread X;
    public boolean Y;
    public volatile boolean Z;
    public final /* synthetic */ int a;
    public final int b;
    public final long c;
    public IOException d;
    public int o;
    public final Object s0;
    public Object t0;
    public final /* synthetic */ Object u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc8(Object obj, Looper looper, Object obj2, Object obj3, int i, long j, int i2) {
        super(looper);
        this.a = i2;
        this.u0 = obj;
        this.s0 = obj2;
        this.t0 = obj3;
        this.b = i;
        this.c = j;
    }

    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                this.Z = z;
                this.d = null;
                if (hasMessages(0)) {
                    this.Y = true;
                    removeMessages(0);
                    if (!z) {
                        sendEmptyMessage(1);
                    }
                } else {
                    synchronized (this) {
                        try {
                            this.Y = true;
                            ((dc8) this.s0).c();
                            Thread thread = this.X;
                            if (thread != null) {
                                thread.interrupt();
                            }
                        } finally {
                        }
                    }
                }
                if (z) {
                    ((hc8) this.u0).c = null;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    ac8 ac8Var = (ac8) this.t0;
                    ac8Var.getClass();
                    ac8Var.r((dc8) this.s0, jElapsedRealtime, jElapsedRealtime - this.c, true);
                    this.t0 = null;
                    return;
                }
                return;
            default:
                this.Z = z;
                this.d = null;
                if (hasMessages(1)) {
                    this.Y = true;
                    removeMessages(1);
                    if (!z) {
                        sendEmptyMessage(2);
                    }
                } else {
                    synchronized (this) {
                        try {
                            this.Y = true;
                            ((ec8) this.s0).c();
                            Thread thread2 = this.X;
                            if (thread2 != null) {
                                thread2.interrupt();
                            }
                        } finally {
                        }
                    }
                }
                if (z) {
                    ((te8) this.u0).b = null;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    bc8 bc8Var = (bc8) this.t0;
                    bc8Var.getClass();
                    bc8Var.q((ec8) this.s0, jElapsedRealtime2, jElapsedRealtime2 - this.c, true);
                    this.t0 = null;
                    return;
                }
                return;
        }
    }

    public void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        bc8 bc8Var = (bc8) this.t0;
        bc8Var.getClass();
        bc8Var.G((ec8) this.s0, jElapsedRealtime, j, this.o);
        this.d = null;
        te8 te8Var = (te8) this.u0;
        hkd hkdVar = (hkd) te8Var.a;
        cc8 cc8Var = (cc8) te8Var.b;
        cc8Var.getClass();
        hkdVar.execute(cc8Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (this.Z) {
                    return;
                }
                int i = message.what;
                if (i == 0) {
                    this.d = null;
                    hc8 hc8Var = (hc8) this.u0;
                    ExecutorService executorService = (ExecutorService) hc8Var.b;
                    cc8 cc8Var = (cc8) hc8Var.c;
                    cc8Var.getClass();
                    executorService.execute(cc8Var);
                    return;
                }
                if (i == 3) {
                    throw ((Error) message.obj);
                }
                ((hc8) this.u0).c = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.c;
                ac8 ac8Var = (ac8) this.t0;
                ac8Var.getClass();
                if (this.Y) {
                    ac8Var.r((dc8) this.s0, jElapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        ac8Var.A((dc8) this.s0, jElapsedRealtime, j);
                        return;
                    } catch (RuntimeException e) {
                        pai.c("LoadTask", "Unexpected exception handling load completed", e);
                        ((hc8) this.u0).d = new Loader$UnexpectedLoaderException(e);
                        return;
                    }
                }
                if (i2 != 2) {
                    return;
                }
                IOException iOException = (IOException) message.obj;
                this.d = iOException;
                int i3 = this.o + 1;
                this.o = i3;
                y21 y21VarD = ac8Var.D((dc8) this.s0, jElapsedRealtime, j, iOException, i3);
                int i4 = y21VarD.b;
                if (i4 == 3) {
                    ((hc8) this.u0).d = this.d;
                    return;
                }
                if (i4 != 2) {
                    if (i4 == 1) {
                        this.o = 1;
                    }
                    long jMin = y21VarD.c;
                    if (jMin == -9223372036854775807L) {
                        jMin = Math.min((this.o - 1) * 1000, 5000);
                    }
                    hc8 hc8Var2 = (hc8) this.u0;
                    fsi.d(((cc8) hc8Var2.c) == null);
                    hc8Var2.c = this;
                    if (jMin > 0) {
                        sendEmptyMessageDelayed(0, jMin);
                        return;
                    } else {
                        this.d = null;
                        ((ExecutorService) hc8Var2.b).execute(this);
                        return;
                    }
                }
                return;
            default:
                if (this.Z) {
                    return;
                }
                int i5 = message.what;
                if (i5 == 1) {
                    b();
                    return;
                }
                if (i5 == 4) {
                    throw ((Error) message.obj);
                }
                ((te8) this.u0).b = null;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = jElapsedRealtime2 - this.c;
                bc8 bc8Var = (bc8) this.t0;
                bc8Var.getClass();
                if (this.Y) {
                    bc8Var.q((ec8) this.s0, jElapsedRealtime2, j2, false);
                    return;
                }
                int i6 = message.what;
                if (i6 == 2) {
                    try {
                        bc8Var.x((ec8) this.s0, jElapsedRealtime2, j2);
                        return;
                    } catch (RuntimeException e2) {
                        a8i.h("LoadTask", "Unexpected exception handling load completed", e2);
                        ((te8) this.u0).c = new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e2);
                        return;
                    }
                }
                if (i6 != 3) {
                    return;
                }
                IOException iOException2 = (IOException) message.obj;
                this.d = iOException2;
                int i7 = this.o + 1;
                this.o = i7;
                y21 y21VarK = bc8Var.K((ec8) this.s0, jElapsedRealtime2, j2, iOException2, i7);
                int i8 = y21VarK.b;
                if (i8 == 3) {
                    ((te8) this.u0).c = this.d;
                    return;
                }
                if (i8 != 2) {
                    if (i8 == 1) {
                        this.o = 1;
                    }
                    long jMin2 = y21VarK.c;
                    if (jMin2 == -9223372036854775807L) {
                        jMin2 = Math.min((this.o - 1) * 1000, 5000);
                    }
                    te8 te8Var = (te8) this.u0;
                    hsi.g(((cc8) te8Var.b) == null);
                    te8Var.b = this;
                    if (jMin2 > 0) {
                        sendEmptyMessageDelayed(1, jMin2);
                        return;
                    } else {
                        b();
                        return;
                    }
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                try {
                    synchronized (this) {
                        z = this.Y;
                        this.X = Thread.currentThread();
                    }
                    if (!z) {
                        String simpleName = ((dc8) this.s0).getClass().getSimpleName();
                        lfi.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                        try {
                            ((dc8) this.s0).load();
                            lfi.c();
                        } catch (Throwable th) {
                            lfi.c();
                            throw th;
                        }
                    }
                    synchronized (this) {
                        this.X = null;
                        Thread.interrupted();
                    }
                    if (this.Z) {
                        return;
                    }
                    sendEmptyMessage(1);
                    return;
                } catch (IOException e) {
                    if (this.Z) {
                        return;
                    }
                    obtainMessage(2, e).sendToTarget();
                    return;
                } catch (OutOfMemoryError e2) {
                    if (this.Z) {
                        return;
                    }
                    pai.c("LoadTask", "OutOfMemory error loading stream", e2);
                    obtainMessage(2, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
                    return;
                } catch (Error e3) {
                    if (!this.Z) {
                        pai.c("LoadTask", "Unexpected error loading stream", e3);
                        obtainMessage(3, e3).sendToTarget();
                    }
                    throw e3;
                } catch (Exception e4) {
                    if (this.Z) {
                        return;
                    }
                    pai.c("LoadTask", "Unexpected exception loading stream", e4);
                    obtainMessage(2, new Loader$UnexpectedLoaderException(e4)).sendToTarget();
                    return;
                }
            default:
                try {
                    synchronized (this) {
                        z2 = this.Y;
                        this.X = Thread.currentThread();
                    }
                    if (!z2) {
                        Trace.beginSection("load:".concat(((ec8) this.s0).getClass().getSimpleName()));
                        try {
                            ((ec8) this.s0).load();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    synchronized (this) {
                        this.X = null;
                        Thread.interrupted();
                    }
                    if (this.Z) {
                        return;
                    }
                    sendEmptyMessage(2);
                    return;
                } catch (IOException e5) {
                    if (this.Z) {
                        return;
                    }
                    obtainMessage(3, e5).sendToTarget();
                    return;
                } catch (Exception e6) {
                    if (this.Z) {
                        return;
                    }
                    a8i.h("LoadTask", "Unexpected exception loading stream", e6);
                    obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e6)).sendToTarget();
                    return;
                } catch (OutOfMemoryError e7) {
                    if (this.Z) {
                        return;
                    }
                    a8i.h("LoadTask", "OutOfMemory error loading stream", e7);
                    obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e7)).sendToTarget();
                    return;
                } catch (Error e8) {
                    if (!this.Z) {
                        a8i.h("LoadTask", "Unexpected error loading stream", e8);
                        obtainMessage(4, e8).sendToTarget();
                    }
                    throw e8;
                }
        }
    }
}
