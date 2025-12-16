package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingBlockingQueue.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBlockingQueueC37549k0<E> extends com.google.common.collect.T0<E> implements BlockingQueue<E> {
    @Override // com.google.common.collect.T0
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> X();

    @Override // java.util.concurrent.BlockingQueue
    @InterfaceC19845a
    public final int drainTo(Collection<? super E> collection, int i12) {
        return X().drainTo(collection, i12);
    }

    @Override // java.util.concurrent.BlockingQueue
    @InterfaceC19845a
    public final boolean offer(E e12, long j12, TimeUnit timeUnit) {
        return X().offer(e12, j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @I41.a
    @InterfaceC19845a
    public final E poll(long j12, TimeUnit timeUnit) {
        return X().poll(j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(E e12) throws InterruptedException {
        X().put(e12);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return X().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    @InterfaceC19845a
    public final E take() {
        return X().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    @InterfaceC19845a
    public final int drainTo(Collection<? super E> collection) {
        return X().drainTo(collection);
    }
}
