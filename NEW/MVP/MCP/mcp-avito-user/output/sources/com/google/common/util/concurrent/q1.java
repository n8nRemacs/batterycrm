package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: WrappingExecutorService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
abstract class q1 implements ExecutorService {
    public abstract <T> Callable<T> a(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j12, TimeUnit timeUnit) {
        throw null;
    }

    public void b(Runnable runnable) {
        a(Executors.callable(runnable, null));
        throw null;
    }

    public final void c(Collection collection) {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            a((Callable) it.next());
            throw null;
        }
        aVar.i();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    @InterfaceC19845a
    public final List<Runnable> shutdownNow() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j12, TimeUnit timeUnit) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j12, TimeUnit timeUnit) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, @T0 T t12) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        callable.getClass();
        a(callable);
        throw null;
    }
}
