package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractDirectTask.java */
/* loaded from: classes8.dex */
abstract class a extends AtomicReference<Future<?>> implements io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.schedulers.a {

    /* renamed from: e, reason: collision with root package name */
    public static final FutureTask<Void> f404663e;

    /* renamed from: f, reason: collision with root package name */
    public static final FutureTask<Void> f404664f;
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f404665b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f404666c;

    /* renamed from: d, reason: collision with root package name */
    public Thread f404667d;

    static {
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        f404663e = new FutureTask<>(runnable, null);
        f404664f = new FutureTask<>(runnable, null);
    }

    public a(Runnable runnable, boolean z12) {
        this.f404665b = runnable;
        this.f404666c = z12;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f404663e) {
                return;
            }
            if (future2 == f404664f) {
                if (this.f404667d == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.f404666c);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f404663e || future == (futureTask = f404664f) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.f404667d == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f404666c);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        Future<?> future = get();
        return future == f404663e || future == f404664f;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        String str;
        Future<?> future = get();
        if (future == f404663e) {
            str = "Finished";
        } else if (future == f404664f) {
            str = "Disposed";
        } else if (this.f404667d != null) {
            str = "Running on " + this.f404667d;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
