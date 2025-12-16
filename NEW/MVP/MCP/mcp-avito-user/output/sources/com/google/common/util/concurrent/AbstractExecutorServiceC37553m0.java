package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import aZ0.InterfaceC19846b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingExecutorService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractExecutorServiceC37553m0 extends com.google.common.collect.S0 implements ExecutorService {
    @Override // com.google.common.collect.S0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract H0 X();

    @Override // java.util.concurrent.ExecutorService
    @InterfaceC19846b
    public final boolean awaitTermination(long j12, TimeUnit timeUnit) {
        return X().awaitTermination(j12, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X().execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return X().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) X().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return X().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return X().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        X().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @InterfaceC19845a
    public final List<Runnable> shutdownNow() {
        return X().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return X().submit((Callable) callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j12, TimeUnit timeUnit) {
        return X().invokeAll(collection, j12, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j12, TimeUnit timeUnit) {
        return (T) X().invokeAny(collection, j12, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return X().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, @T0 T t12) {
        return X().submit(runnable, (Runnable) t12);
    }
}
