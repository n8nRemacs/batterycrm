package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class Jm implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Looper f378652a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Handler f378653b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Km f378654c;

    public Jm(@j.N String str) {
        this(a(str));
    }

    private static Km a(@j.N String str) {
        Km kmB = new Mm(str).b();
        kmB.start();
        return kmB;
    }

    @Override // com.yandex.metrica.core.api.executors.ICommonExecutor, java.util.concurrent.Executor
    public void execute(@j.N Runnable runnable) {
        this.f378653b.post(runnable);
    }

    @Override // com.yandex.metrica.core.api.executors.ICommonExecutor
    public void executeDelayed(@j.N Runnable runnable, long j12) {
        this.f378653b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j12));
    }

    @Override // com.yandex.metrica.core.api.executors.IHandlerExecutor
    @j.N
    public Handler getHandler() {
        return this.f378653b;
    }

    @Override // com.yandex.metrica.core.api.executors.IHandlerExecutor
    @j.N
    public Looper getLooper() {
        return this.f378652a;
    }

    public boolean isRunning() {
        return this.f378654c.isRunning();
    }

    @Override // com.yandex.metrica.core.api.executors.ICommonExecutor
    public void remove(@j.N Runnable runnable) {
        this.f378653b.removeCallbacks(runnable);
    }

    @Override // com.yandex.metrica.core.api.executors.ICommonExecutor
    public void removeAll() {
        this.f378653b.removeCallbacksAndMessages(null);
    }

    public void stopRunning() {
        this.f378654c.stopRunning();
    }

    @Override // com.yandex.metrica.core.api.executors.ICommonExecutor
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f378653b.post(futureTask);
        return futureTask;
    }

    @j.k0
    public Jm(@j.N Km km2) {
        this(km2, km2.getLooper(), new Handler(km2.getLooper()));
    }

    @j.k0
    public Jm(@j.N Km km2, @j.N Looper looper, @j.N Handler handler) {
        this.f378654c = km2;
        this.f378652a = looper;
        this.f378653b = handler;
    }

    @Override // com.yandex.metrica.core.api.executors.ICommonExecutor
    public void executeDelayed(@j.N Runnable runnable, long j12, @j.N TimeUnit timeUnit) {
        this.f378653b.postDelayed(runnable, timeUnit.toMillis(j12));
    }
}
