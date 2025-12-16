package com.huawei.hmf.tasks;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f363210c = new m();

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f363211a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f363212b;

    public static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public m() {
        com.huawei.hmf.tasks.a.a aVar = com.huawei.hmf.tasks.a.a.f363184b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(com.huawei.hmf.tasks.a.a.f363185c, com.huawei.hmf.tasks.a.a.f363186d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f363211a = threadPoolExecutor;
        new a();
        this.f363212b = com.huawei.hmf.tasks.a.a.f363184b.f363187a;
    }
}
