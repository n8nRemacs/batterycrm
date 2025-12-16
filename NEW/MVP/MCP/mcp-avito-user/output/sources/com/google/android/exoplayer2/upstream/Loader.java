package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes6.dex */
public final class Loader implements A {

    /* renamed from: d, reason: collision with root package name */
    public static final c f347759d = b(-9223372036854775807L, false);

    /* renamed from: e, reason: collision with root package name */
    public static final c f347760e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f347761f;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f347762a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public d<? extends e> f347763b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public IOException f347764c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface b<T extends e> {
        void h(T t12, long j12, long j13, boolean z12);

        void j(T t12, long j12, long j13);

        c l(T t12, long j12, long j13, IOException iOException, int i12);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f347765a;

        /* renamed from: b, reason: collision with root package name */
        public final long f347766b;

        public c(int i12, long j12, a aVar) {
            this.f347765a = i12;
            this.f347766b = j12;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f347767b;

        /* renamed from: c, reason: collision with root package name */
        public final T f347768c;

        /* renamed from: d, reason: collision with root package name */
        public final long f347769d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public b<T> f347770e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public IOException f347771f;

        /* renamed from: g, reason: collision with root package name */
        public int f347772g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public Thread f347773h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f347774i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f347775j;

        public d(Looper looper, T t12, b<T> bVar, int i12, long j12) {
            super(looper);
            this.f347768c = t12;
            this.f347770e = bVar;
            this.f347767b = i12;
            this.f347769d = j12;
        }

        public final void a(boolean z12) {
            this.f347775j = z12;
            this.f347771f = null;
            if (hasMessages(0)) {
                this.f347774i = true;
                removeMessages(0);
                if (!z12) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f347774i = true;
                        this.f347768c.a();
                        Thread thread = this.f347773h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z12) {
                Loader.this.f347763b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.f347770e;
                bVar.getClass();
                bVar.h(this.f347768c, jElapsedRealtime, jElapsedRealtime - this.f347769d, true);
                this.f347770e = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f347775j) {
                return;
            }
            int i12 = message.what;
            if (i12 == 0) {
                this.f347771f = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f347762a;
                d<? extends e> dVar = loader.f347763b;
                dVar.getClass();
                executorService.execute(dVar);
                return;
            }
            if (i12 == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f347763b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = jElapsedRealtime - this.f347769d;
            b<T> bVar = this.f347770e;
            bVar.getClass();
            if (this.f347774i) {
                bVar.h(this.f347768c, jElapsedRealtime, j12, false);
                return;
            }
            int i13 = message.what;
            if (i13 == 1) {
                try {
                    bVar.j(this.f347768c, jElapsedRealtime, j12);
                    return;
                } catch (RuntimeException e12) {
                    C36605v.a("Unexpected exception handling load completed", e12);
                    Loader.this.f347764c = new UnexpectedLoaderException(e12);
                    return;
                }
            }
            if (i13 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f347771f = iOException;
            int i14 = this.f347772g + 1;
            this.f347772g = i14;
            c cVarL = bVar.l(this.f347768c, jElapsedRealtime, j12, iOException, i14);
            int i15 = cVarL.f347765a;
            if (i15 == 3) {
                Loader.this.f347764c = this.f347771f;
                return;
            }
            if (i15 != 2) {
                if (i15 == 1) {
                    this.f347772g = 1;
                }
                long jMin = cVarL.f347766b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f347772g - 1) * 1000, 5000);
                }
                Loader loader2 = Loader.this;
                C36585a.d(loader2.f347763b == null);
                loader2.f347763b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(0, jMin);
                } else {
                    this.f347771f = null;
                    loader2.f347762a.execute(this);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z12;
            try {
                synchronized (this) {
                    z12 = this.f347774i;
                    this.f347773h = Thread.currentThread();
                }
                if (!z12) {
                    com.google.android.exoplayer2.util.P.a("load:".concat(this.f347768c.getClass().getSimpleName()));
                    try {
                        this.f347768c.load();
                        com.google.android.exoplayer2.util.P.b();
                    } catch (Throwable th2) {
                        com.google.android.exoplayer2.util.P.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f347773h = null;
                    Thread.interrupted();
                }
                if (this.f347775j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e12) {
                if (this.f347775j) {
                    return;
                }
                obtainMessage(2, e12).sendToTarget();
            } catch (Exception e13) {
                if (this.f347775j) {
                    return;
                }
                C36605v.a("Unexpected exception loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            } catch (OutOfMemoryError e14) {
                if (this.f347775j) {
                    return;
                }
                C36605v.a("OutOfMemory error loading stream", e14);
                obtainMessage(2, new UnexpectedLoaderException(e14)).sendToTarget();
            } catch (Error e15) {
                if (!this.f347775j) {
                    C36605v.a("Unexpected error loading stream", e15);
                    obtainMessage(3, e15).sendToTarget();
                }
                throw e15;
            }
        }
    }

    public interface e {
        void a();

        void load();
    }

    public interface f {
        void a();
    }

    public static final class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Object f347777b;

        public g(f fVar) {
            this.f347777b = fVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.upstream.Loader$f, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            this.f347777b.a();
        }
    }

    static {
        b(-9223372036854775807L, true);
        f347760e = new c(2, -9223372036854775807L, null);
        f347761f = new c(3, -9223372036854775807L, null);
    }

    public Loader(String str) {
        final String strConcat = "ExoPlayer:Loader:".concat(str);
        int i12 = U.f348106a;
        this.f347762a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.exoplayer2.util.T
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i13 = U.f348106a;
                return new Thread(runnable, strConcat);
            }
        });
    }

    public static c b(long j12, boolean z12) {
        return new c(z12 ? 1 : 0, j12, null);
    }

    public final void a() {
        d<? extends e> dVar = this.f347763b;
        C36585a.e(dVar);
        dVar.a(false);
    }

    public final boolean c() {
        return this.f347763b != null;
    }

    public final void d(int i12) throws IOException {
        IOException iOException = this.f347764c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f347763b;
        if (dVar != null) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = dVar.f347767b;
            }
            IOException iOException2 = dVar.f347771f;
            if (iOException2 != null && dVar.f347772g > i12) {
                throw iOException2;
            }
        }
    }

    public final void e(@P f fVar) {
        d<? extends e> dVar = this.f347763b;
        if (dVar != null) {
            dVar.a(true);
        }
        ExecutorService executorService = this.f347762a;
        if (fVar != null) {
            executorService.execute(new g(fVar));
        }
        executorService.shutdown();
    }

    public final <T extends e> long f(T t12, b<T> bVar, int i12) {
        Looper looperMyLooper = Looper.myLooper();
        C36585a.e(looperMyLooper);
        this.f347764c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d<? extends e> dVar = new d<>(looperMyLooper, t12, bVar, i12, jElapsedRealtime);
        C36585a.d(this.f347763b == null);
        this.f347763b = dVar;
        dVar.f347771f = null;
        this.f347762a.execute(dVar);
        return jElapsedRealtime;
    }
}
