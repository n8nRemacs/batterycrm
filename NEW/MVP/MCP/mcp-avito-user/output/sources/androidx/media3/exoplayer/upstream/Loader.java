package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.L;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import j.P;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@J
/* loaded from: classes.dex */
public final class Loader implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final c f50045d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f50046e;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f50047a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public d<? extends e> f50048b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public IOException f50049c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface b<T extends e> {
        void g(T t12, long j12, long j13);

        c h(T t12, long j12, long j13, IOException iOException, int i12);

        void j(T t12, long j12, long j13, boolean z12);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f50050a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50051b;

        public c(int i12, long j12, a aVar) {
            this.f50050a = i12;
            this.f50051b = j12;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f50052b;

        /* renamed from: c, reason: collision with root package name */
        public final T f50053c;

        /* renamed from: d, reason: collision with root package name */
        public final long f50054d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public Object f50055e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public IOException f50056f;

        /* renamed from: g, reason: collision with root package name */
        public int f50057g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public Thread f50058h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f50059i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f50060j;

        public d(Looper looper, T t12, b<T> bVar, int i12, long j12) {
            super(looper);
            this.f50053c = t12;
            this.f50055e = bVar;
            this.f50052b = i12;
            this.f50054d = j12;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.exoplayer.upstream.Loader$b, java.lang.Object] */
        public final void a(boolean z12) {
            this.f50060j = z12;
            this.f50056f = null;
            if (hasMessages(0)) {
                this.f50059i = true;
                removeMessages(0);
                if (!z12) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f50059i = true;
                        this.f50053c.a();
                        Thread thread = this.f50058h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z12) {
                Loader.this.f50048b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ?? r12 = this.f50055e;
                r12.getClass();
                r12.j(this.f50053c, jElapsedRealtime, jElapsedRealtime - this.f50054d, true);
                this.f50055e = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.media3.exoplayer.upstream.Loader$b, java.lang.Object] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f50060j) {
                return;
            }
            int i12 = message.what;
            if (i12 == 0) {
                this.f50056f = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f50047a;
                d<? extends e> dVar = loader.f50048b;
                dVar.getClass();
                executorService.execute(dVar);
                return;
            }
            if (i12 == 3) {
                throw ((Error) message.obj);
            }
            Loader.this.f50048b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = jElapsedRealtime - this.f50054d;
            ?? r32 = this.f50055e;
            r32.getClass();
            if (this.f50059i) {
                r32.j(this.f50053c, jElapsedRealtime, j12, false);
                return;
            }
            int i13 = message.what;
            if (i13 == 1) {
                try {
                    r32.g(this.f50053c, jElapsedRealtime, j12);
                    return;
                } catch (RuntimeException e12) {
                    s.d("Unexpected exception handling load completed", e12);
                    Loader.this.f50049c = new UnexpectedLoaderException(e12);
                    return;
                }
            }
            if (i13 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f50056f = iOException;
            int i14 = this.f50057g + 1;
            this.f50057g = i14;
            c cVarH = r32.h(this.f50053c, jElapsedRealtime, j12, iOException, i14);
            int i15 = cVarH.f50050a;
            if (i15 == 3) {
                Loader.this.f50049c = this.f50056f;
                return;
            }
            if (i15 != 2) {
                if (i15 == 1) {
                    this.f50057g = 1;
                }
                long jMin = cVarH.f50051b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f50057g - 1) * 1000, 5000);
                }
                Loader loader2 = Loader.this;
                C23110a.g(loader2.f50048b == null);
                loader2.f50048b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(0, jMin);
                } else {
                    this.f50056f = null;
                    loader2.f50047a.execute(this);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z12;
            try {
                synchronized (this) {
                    z12 = this.f50059i;
                    this.f50058h = Thread.currentThread();
                }
                if (!z12) {
                    H.a("load:".concat(this.f50053c.getClass().getSimpleName()));
                    try {
                        this.f50053c.load();
                        H.b();
                    } catch (Throwable th2) {
                        H.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f50058h = null;
                    Thread.interrupted();
                }
                if (this.f50060j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e12) {
                if (this.f50060j) {
                    return;
                }
                obtainMessage(2, e12).sendToTarget();
            } catch (Exception e13) {
                if (this.f50060j) {
                    return;
                }
                s.d("Unexpected exception loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            } catch (OutOfMemoryError e14) {
                if (this.f50060j) {
                    return;
                }
                s.d("OutOfMemory error loading stream", e14);
                obtainMessage(2, new UnexpectedLoaderException(e14)).sendToTarget();
            } catch (Error e15) {
                if (!this.f50060j) {
                    s.d("Unexpected error loading stream", e15);
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
        public final f f50062b;

        public g(f fVar) {
            this.f50062b = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f50062b.a();
        }
    }

    static {
        new c(0, -9223372036854775807L, null);
        new c(1, -9223372036854775807L, null);
        f50045d = new c(2, -9223372036854775807L, null);
        f50046e = new c(3, -9223372036854775807L, null);
    }

    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i12 = M.f47887a;
        this.f50047a = Executors.newSingleThreadExecutor(new L(strConcat));
    }

    public final void a() {
        d<? extends e> dVar = this.f50048b;
        C23110a.h(dVar);
        dVar.a(false);
    }

    public final boolean b() {
        return this.f50048b != null;
    }

    public final void c(int i12) throws IOException {
        IOException iOException = this.f50049c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f50048b;
        if (dVar != null) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = dVar.f50052b;
            }
            IOException iOException2 = dVar.f50056f;
            if (iOException2 != null && dVar.f50057g > i12) {
                throw iOException2;
            }
        }
    }

    public final void d(@P f fVar) {
        d<? extends e> dVar = this.f50048b;
        if (dVar != null) {
            dVar.a(true);
        }
        ExecutorService executorService = this.f50047a;
        if (fVar != null) {
            executorService.execute(new g(fVar));
        }
        executorService.shutdown();
    }

    public final <T extends e> long e(T t12, b<T> bVar, int i12) {
        Looper looperMyLooper = Looper.myLooper();
        C23110a.h(looperMyLooper);
        this.f50049c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d<? extends e> dVar = new d<>(looperMyLooper, t12, bVar, i12, jElapsedRealtime);
        C23110a.g(this.f50048b == null);
        this.f50048b = dVar;
        dVar.f50056f = null;
        this.f50047a.execute(dVar);
        return jElapsedRealtime;
    }
}
