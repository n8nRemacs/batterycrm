package x01;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class Q {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f441989b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q f441990c;

    /* renamed from: d, reason: collision with root package name */
    public static final Q f441991d;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f441992a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public N f441993b;

        @Override // java.lang.Runnable
        public final void run() {
            N n12 = this.f441993b;
            if (n12 != null) {
                try {
                    n12.run();
                } catch (Exception unused) {
                    m0.d("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    public static class b implements ThreadFactory {

        /* renamed from: e, reason: collision with root package name */
        public static final AtomicInteger f441994e = new AtomicInteger(1);

        /* renamed from: b, reason: collision with root package name */
        public final ThreadGroup f441995b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f441996c = new AtomicInteger(1);

        /* renamed from: d, reason: collision with root package name */
        public final String f441997d;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f441995b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f441997d = "FormalHASDK-base-" + f441994e.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(this.f441995b, runnable, this.f441997d + this.f441996c.getAndIncrement(), 0L);
        }
    }

    static {
        new Q();
        new Q();
        f441989b = new Q();
        f441990c = new Q();
        f441991d = new Q();
    }

    public final void a(N n12) {
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f441992a;
            a aVar = new a();
            aVar.f441993b = n12;
            threadPoolExecutor.execute(aVar);
        } catch (RejectedExecutionException unused) {
            m0.d("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
