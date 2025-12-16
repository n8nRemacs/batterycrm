package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: BoltsExecutors.java */
/* loaded from: classes10.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f57455d = new b();

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f57456a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f57457b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f57458c;

    /* compiled from: BoltsExecutors.java */
    /* renamed from: bolts.b$b, reason: collision with other inner class name */
    public static class ExecutorC2017b implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final ThreadLocal<Integer> f57459b;

        public ExecutorC2017b() {
            this.f57459b = new ThreadLocal<>();
        }

        public final void a() {
            ThreadLocal<Integer> threadLocal = this.f57459b;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ThreadLocal<Integer> threadLocal = this.f57459b;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            threadLocal.set(Integer.valueOf(iIntValue));
            try {
                if (iIntValue <= 15) {
                    runnable.run();
                } else {
                    b.f57455d.f57456a.execute(runnable);
                }
                a();
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.ExecutorService] */
    public b() {
        ThreadPoolExecutor threadPoolExecutorNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains("android")) {
            bolts.a aVar = bolts.a.f57451b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(bolts.a.f57452c, bolts.a.f57453d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutorNewCachedThreadPool = threadPoolExecutor;
        } else {
            threadPoolExecutorNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.f57456a = threadPoolExecutorNewCachedThreadPool;
        this.f57457b = Executors.newSingleThreadScheduledExecutor();
        this.f57458c = new ExecutorC2017b();
    }
}
