package com.facebook.common.executors;

import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ConstrainedExecutorService.java */
@Nullsafe
/* loaded from: classes5.dex */
public class b extends AbstractExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f339812b = 0;

    /* compiled from: ConstrainedExecutorService.java */
    /* renamed from: com.facebook.common.executors.b$b, reason: collision with other inner class name */
    public class RunnableC10525b implements Runnable {
        public RunnableC10525b(a aVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            int i12 = b.f339812b;
            bVar.getClass();
            throw null;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j12, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            throw null;
        }
        throw new NullPointerException("runnable parameter is null");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
