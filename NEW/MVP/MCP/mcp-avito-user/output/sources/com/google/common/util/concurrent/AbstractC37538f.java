package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import aZ0.InterfaceC19846b;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: AbstractListeningExecutorService.java */
@InterfaceC37531b0
@XY0.d
@XY0.c
@InterfaceC19846b
/* renamed from: com.google.common.util.concurrent.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37538f extends AbstractExecutorService implements H0 {
    @Override // java.util.concurrent.AbstractExecutorService
    @InterfaceC19845a
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new n1(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.H0
    @InterfaceC19845a
    public final D0<?> submit(Runnable runnable) {
        return (D0) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    @InterfaceC19845a
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @T0 T t12) {
        return new n1(Executors.callable(runnable, t12));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @InterfaceC19845a
    public final Future submit(Runnable runnable) {
        return (D0) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.H0
    @InterfaceC19845a
    public final <T> D0<T> submit(Runnable runnable, @T0 T t12) {
        return (D0) super.submit(runnable, (Runnable) t12);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @InterfaceC19845a
    public final Future submit(Runnable runnable, @T0 Object obj) {
        return (D0) super.submit(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.H0
    @InterfaceC19845a
    public final <T> D0<T> submit(Callable<T> callable) {
        return (D0) super.submit((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @InterfaceC19845a
    public final Future submit(Callable callable) {
        return (D0) super.submit(callable);
    }
}
