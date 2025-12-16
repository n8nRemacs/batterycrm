package com.google.common.collect;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingBlockingDeque.java */
@InterfaceC37329f0
@XY0.d
@Deprecated
@XY0.c
/* loaded from: classes6.dex */
public abstract class A0<E> extends D0<E> implements BlockingDeque<E> {
    @Override // com.google.common.collect.D0
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> X();

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection<? super E> collection) {
        return X().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final boolean offer(E e12, long j12, TimeUnit timeUnit) {
        return X().offer(e12, j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final boolean offerFirst(E e12, long j12, TimeUnit timeUnit) {
        return X().offerFirst(e12, j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final boolean offerLast(E e12, long j12, TimeUnit timeUnit) {
        return X().offerLast(e12, j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @I41.a
    public final E poll(long j12, TimeUnit timeUnit) {
        return X().poll(j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @I41.a
    public final E pollFirst(long j12, TimeUnit timeUnit) {
        return X().pollFirst(j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @I41.a
    public final E pollLast(long j12, TimeUnit timeUnit) {
        return X().pollLast(j12, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final void put(E e12) throws InterruptedException {
        X().put(e12);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final void putFirst(E e12) throws InterruptedException {
        X().putFirst(e12);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final void putLast(E e12) throws InterruptedException {
        X().putLast(e12);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return X().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final E take() {
        return X().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public final E takeFirst() {
        return X().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public final E takeLast() {
        return X().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection<? super E> collection, int i12) {
        return X().drainTo(collection, i12);
    }
}
