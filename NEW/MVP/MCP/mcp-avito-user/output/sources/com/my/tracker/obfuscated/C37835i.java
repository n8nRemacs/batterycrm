package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.obfuscated.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37835i {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f365658a;

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f365659b;

    /* renamed from: c, reason: collision with root package name */
    public static final Executor f365660c;

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f365661d;

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f365662e;

    /* renamed from: f, reason: collision with root package name */
    public static final Executor f365663f;

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f365664g;

    /* renamed from: h, reason: collision with root package name */
    private static final a f365665h;

    /* renamed from: com.my.tracker.obfuscated.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque<RunnableC10795a> f365666a = new ArrayDeque<>();

        /* renamed from: com.my.tracker.obfuscated.i$a$a, reason: collision with other inner class name */
        public static final class RunnableC10795a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final a f365667a;

            /* renamed from: b, reason: collision with root package name */
            volatile Runnable f365668b;

            public RunnableC10795a(a aVar) {
                this.f365667a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.f365668b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    a aVar = this.f365667a;
                    if (aVar == null) {
                    }
                } catch (Throwable th2) {
                    try {
                        e2.b("RunnableThrowableDecorator: exception has been caught", th2);
                    } finally {
                        a aVar2 = this.f365667a;
                        if (aVar2 != null) {
                            aVar2.a(this);
                        }
                    }
                }
            }
        }

        public a() {
            for (int i12 = 0; i12 < 64; i12++) {
                this.f365666a.add(new RunnableC10795a(this));
            }
        }

        public Runnable a(Runnable runnable) {
            RunnableC10795a runnableC10795aPollFirst;
            synchronized (this) {
                runnableC10795aPollFirst = this.f365666a.pollFirst();
            }
            if (runnableC10795aPollFirst == null) {
                runnableC10795aPollFirst = new RunnableC10795a(null);
            }
            runnableC10795aPollFirst.f365668b = runnable;
            return runnableC10795aPollFirst;
        }

        public void a(RunnableC10795a runnableC10795a) {
            synchronized (this) {
                runnableC10795a.f365668b = null;
                this.f365666a.add(runnableC10795a);
            }
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f365658a = handler;
        f365659b = Executors.newSingleThreadExecutor();
        f365660c = Executors.newSingleThreadExecutor();
        f365661d = Executors.newSingleThreadExecutor();
        f365662e = Executors.newSingleThreadExecutor();
        f365663f = Executors.newSingleThreadExecutor();
        f365664g = new androidx.media3.exoplayer.audio.o(handler, 0);
        f365665h = new a();
    }

    public static void a(Runnable runnable) {
        f365659b.execute(f365665h.a(runnable));
    }

    public static void b(Runnable runnable) {
        f365660c.execute(f365665h.a(runnable));
    }

    public static void c(Runnable runnable) {
        f365661d.execute(f365665h.a(runnable));
    }

    public static void d(Runnable runnable) {
        f365662e.execute(f365665h.a(runnable));
    }

    public static void e(Runnable runnable) {
        f365663f.execute(f365665h.a(runnable));
    }

    public static void f(Runnable runnable) {
        Runnable runnableA = f365665h.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnableA.run();
        } else {
            f365664g.execute(runnableA);
        }
    }
}
