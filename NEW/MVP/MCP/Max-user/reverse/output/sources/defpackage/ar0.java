package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ar0 {
    public static final ar0 d = new ar0();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final i30 c;

    public ar0() {
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains("android")) {
            od odVar = od.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(od.c, od.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        } else {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.a = executorServiceNewCachedThreadPool;
        this.b = Executors.newSingleThreadScheduledExecutor();
        i30 i30Var = new i30(2);
        i30Var.b = new ThreadLocal();
        this.c = i30Var;
    }
}
