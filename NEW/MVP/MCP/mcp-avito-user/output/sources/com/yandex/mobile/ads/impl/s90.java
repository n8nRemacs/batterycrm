package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class s90 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f389815d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f389816e;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f389817a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private c<? extends d> f389818b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private IOException f389819c;

    public interface a<T extends d> {
        b a(T t12, long j12, long j13, IOException iOException, int i12);

        void a(T t12, long j12, long j13);

        void a(T t12, long j12, long j13, boolean z12);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f389820a;

        /* renamed from: b, reason: collision with root package name */
        private final long f389821b;

        public /* synthetic */ b(int i12, long j12, int i13) {
            this(i12, j12);
        }

        private b(int i12, long j12) {
            this.f389820a = i12;
            this.f389821b = j12;
        }

        public final boolean a() {
            int i12 = this.f389820a;
            return i12 == 0 || i12 == 1;
        }
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void b();
    }

    public static final class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final e f389832b;

        public f(e eVar) {
            this.f389832b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f389832b.b();
        }
    }

    public static final class g extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        public g(Throwable th2) {
            StringBuilder sbA = Cif.a("Unexpected ");
            sbA.append(th2.getClass().getSimpleName());
            sbA.append(": ");
            sbA.append(th2.getMessage());
            super(sbA.toString(), th2);
        }
    }

    static {
        long j12 = -9223372036854775807L;
        int i12 = 0;
        f389815d = new b(2, j12, i12);
        f389816e = new b(3, j12, i12);
    }

    public s90(String str) {
        this.f389817a = pc1.c("ExoPlayer:Loader:" + str);
    }

    public final boolean c() {
        return this.f389819c != null;
    }

    public final boolean d() {
        return this.f389818b != null;
    }

    @SuppressLint({"HandlerLeak"})
    public final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f389822b;

        /* renamed from: c, reason: collision with root package name */
        private final T f389823c;

        /* renamed from: d, reason: collision with root package name */
        private final long f389824d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private a<T> f389825e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private IOException f389826f;

        /* renamed from: g, reason: collision with root package name */
        private int f389827g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private Thread f389828h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f389829i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f389830j;

        public c(Looper looper, T t12, a<T> aVar, int i12, long j12) {
            super(looper);
            this.f389823c = t12;
            this.f389825e = aVar;
            this.f389822b = i12;
            this.f389824d = j12;
        }

        public final void a(int i12) throws IOException {
            IOException iOException = this.f389826f;
            if (iOException != null && this.f389827g > i12) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f389830j) {
                return;
            }
            int i12 = message.what;
            if (i12 == 0) {
                this.f389826f = null;
                ExecutorService executorService = s90.this.f389817a;
                c cVar = s90.this.f389818b;
                cVar.getClass();
                executorService.execute(cVar);
                return;
            }
            if (i12 == 3) {
                throw ((Error) message.obj);
            }
            s90.this.f389818b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = jElapsedRealtime - this.f389824d;
            a<T> aVar = this.f389825e;
            aVar.getClass();
            if (this.f389829i) {
                aVar.a(this.f389823c, jElapsedRealtime, j12, false);
                return;
            }
            int i13 = message.what;
            if (i13 == 1) {
                try {
                    aVar.a(this.f389823c, jElapsedRealtime, j12);
                    return;
                } catch (RuntimeException e12) {
                    ka0.a("LoadTask", "Unexpected exception handling load completed", e12);
                    s90.this.f389819c = new g(e12);
                    return;
                }
            }
            if (i13 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f389826f = iOException;
            int i14 = this.f389827g + 1;
            this.f389827g = i14;
            b bVarA = aVar.a(this.f389823c, jElapsedRealtime, j12, iOException, i14);
            if (bVarA.f389820a == 3) {
                s90.this.f389819c = this.f389826f;
            } else if (bVarA.f389820a != 2) {
                if (bVarA.f389820a == 1) {
                    this.f389827g = 1;
                }
                a(bVarA.f389821b != -9223372036854775807L ? bVarA.f389821b : Math.min((this.f389827g - 1) * 1000, 5000));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z12;
            try {
                synchronized (this) {
                    z12 = this.f389829i;
                    this.f389828h = Thread.currentThread();
                }
                if (!z12) {
                    r91.a("load:".concat(this.f389823c.getClass().getSimpleName()));
                    try {
                        this.f389823c.a();
                        r91.a();
                    } catch (Throwable th2) {
                        r91.a();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f389828h = null;
                    Thread.interrupted();
                }
                if (this.f389830j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e12) {
                if (this.f389830j) {
                    return;
                }
                obtainMessage(2, e12).sendToTarget();
            } catch (Exception e13) {
                if (this.f389830j) {
                    return;
                }
                ka0.a("LoadTask", "Unexpected exception loading stream", e13);
                obtainMessage(2, new g(e13)).sendToTarget();
            } catch (OutOfMemoryError e14) {
                if (this.f389830j) {
                    return;
                }
                ka0.a("LoadTask", "OutOfMemory error loading stream", e14);
                obtainMessage(2, new g(e14)).sendToTarget();
            } catch (Error e15) {
                if (!this.f389830j) {
                    ka0.a("LoadTask", "Unexpected error loading stream", e15);
                    obtainMessage(3, e15).sendToTarget();
                }
                throw e15;
            }
        }

        public final void a(long j12) {
            db.b(s90.this.f389818b == null);
            s90.this.f389818b = this;
            if (j12 > 0) {
                sendEmptyMessageDelayed(0, j12);
                return;
            }
            this.f389826f = null;
            ExecutorService executorService = s90.this.f389817a;
            c cVar = s90.this.f389818b;
            cVar.getClass();
            executorService.execute(cVar);
        }

        public final void a(boolean z12) {
            this.f389830j = z12;
            this.f389826f = null;
            if (hasMessages(0)) {
                this.f389829i = true;
                removeMessages(0);
                if (!z12) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f389829i = true;
                        this.f389823c.b();
                        Thread thread = this.f389828h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z12) {
                s90.this.f389818b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f389825e;
                aVar.getClass();
                aVar.a(this.f389823c, jElapsedRealtime, jElapsedRealtime - this.f389824d, true);
                this.f389825e = null;
            }
        }
    }

    public final void b() {
        this.f389819c = null;
    }

    public static b a(long j12, boolean z12) {
        return new b(z12 ? 1 : 0, j12, 0);
    }

    public final <T extends d> long a(T t12, a<T> aVar, int i12) {
        Looper looper = (Looper) db.b(Looper.myLooper());
        this.f389819c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new c(looper, t12, aVar, i12, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }

    public final void a() {
        ((c) db.b(this.f389818b)).a(false);
    }

    public final void a(@j.P e eVar) {
        c<? extends d> cVar = this.f389818b;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f389817a.execute(new f(eVar));
        }
        this.f389817a.shutdown();
    }

    public final void a(int i12) {
        IOException iOException = this.f389819c;
        if (iOException == null) {
            c<? extends d> cVar = this.f389818b;
            if (cVar != null) {
                if (i12 == Integer.MIN_VALUE) {
                    i12 = cVar.f389822b;
                }
                cVar.a(i12);
                return;
            }
            return;
        }
        throw iOException;
    }
}
