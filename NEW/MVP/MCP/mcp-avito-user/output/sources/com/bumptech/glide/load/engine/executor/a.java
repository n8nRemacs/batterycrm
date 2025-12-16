package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import j.N;
import j.k0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: GlideExecutor.java */
/* loaded from: classes5.dex */
public final class a implements ExecutorService {

    /* renamed from: c, reason: collision with root package name */
    public static final long f338993c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f338994d;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f338995b;

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.executor.a$a, reason: collision with other inner class name */
    public static final class C10503a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f338996a;

        /* renamed from: b, reason: collision with root package name */
        public int f338997b;

        /* renamed from: c, reason: collision with root package name */
        public int f338998c;

        /* renamed from: d, reason: collision with root package name */
        @N
        public final c f338999d = c.f339007b;

        /* renamed from: e, reason: collision with root package name */
        public String f339000e;

        public C10503a(boolean z12) {
            this.f338996a = z12;
        }

        public final a a() {
            if (!TextUtils.isEmpty(this.f339000e)) {
                return new a(new ThreadPoolExecutor(this.f338997b, this.f338998c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f339000e, this.f338999d, this.f338996a)));
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f339000e);
        }
    }

    /* compiled from: GlideExecutor.java */
    public static final class b implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        public final String f339001b;

        /* renamed from: c, reason: collision with root package name */
        public final c f339002c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f339003d;

        /* renamed from: e, reason: collision with root package name */
        public int f339004e;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$b$a, reason: collision with other inner class name */
        public class C10504a extends Thread {
            public C10504a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                b bVar = b.this;
                if (bVar.f339003d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable unused) {
                    ((c.b) bVar.f339002c).getClass();
                    Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        public b(String str, c cVar, boolean z12) {
            this.f339001b = str;
            this.f339002c = cVar;
            this.f339003d = z12;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(@N Runnable runnable) {
            C10504a c10504a;
            c10504a = new C10504a(runnable, "glide-" + this.f339001b + "-thread-" + this.f339004e);
            this.f339004e = this.f339004e + 1;
            return c10504a;
        }
    }

    /* compiled from: GlideExecutor.java */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f339006a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final c f339007b;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        public class C10505a implements c {
        }

        /* compiled from: GlideExecutor.java */
        public class b implements c {
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$c, reason: collision with other inner class name */
        public class C10506c implements c {
        }

        static {
            new C10505a();
            b bVar = new b();
            new C10506c();
            f339007b = bVar;
        }
    }

    @k0
    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f338995b = threadPoolExecutor;
    }

    public static a a() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f338993c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f339007b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j12, @N TimeUnit timeUnit) {
        return this.f338995b.awaitTermination(j12, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@N Runnable runnable) {
        this.f338995b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public final <T> List<Future<T>> invokeAll(@N Collection<? extends Callable<T>> collection) {
        return this.f338995b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public final <T> T invokeAny(@N Collection<? extends Callable<T>> collection) {
        return (T) this.f338995b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f338995b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f338995b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f338995b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public final List<Runnable> shutdownNow() {
        return this.f338995b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public final Future<?> submit(@N Runnable runnable) {
        return this.f338995b.submit(runnable);
    }

    public final String toString() {
        return this.f338995b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public final <T> List<Future<T>> invokeAll(@N Collection<? extends Callable<T>> collection, long j12, @N TimeUnit timeUnit) {
        return this.f338995b.invokeAll(collection, j12, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@N Collection<? extends Callable<T>> collection, long j12, @N TimeUnit timeUnit) {
        return (T) this.f338995b.invokeAny(collection, j12, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @N
    public final <T> Future<T> submit(@N Runnable runnable, T t12) {
        return this.f338995b.submit(runnable, t12);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@N Callable<T> callable) {
        return this.f338995b.submit(callable);
    }
}
