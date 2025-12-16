package com.yandex.div.internal.viewpool;

import Y61.k;
import Y61.l;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BatchBlockingQueue.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/viewpool/b;", "E", "Ljava/util/AbstractQueue;", "Ljava/util/concurrent/BlockingQueue;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b<E> extends AbstractQueue<E> implements BlockingQueue<E> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PriorityQueue f370200b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ReentrantLock f370201c;

    /* renamed from: d, reason: collision with root package name */
    public final Condition f370202d;

    public b(@k PriorityQueue priorityQueue) {
        this.f370200b = priorityQueue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f370201c = reentrantLock;
        this.f370202d = reentrantLock.newCondition();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean add(E e12) {
        offer(e12);
        return true;
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(@l Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @k
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(E e12) {
        ReentrantLock reentrantLock = this.f370201c;
        reentrantLock.lock();
        try {
            this.f370200b.offer(e12);
            this.f370202d.signal();
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final E peek() {
        ReentrantLock reentrantLock = this.f370201c;
        reentrantLock.lock();
        try {
            return (E) this.f370200b.peek();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue
    @l
    public final E poll() {
        ReentrantLock reentrantLock = this.f370201c;
        reentrantLock.lock();
        try {
            return (E) this.f370200b.poll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(E e12) {
        offer(e12);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final boolean remove(Object obj) {
        ReentrantLock reentrantLock = this.f370201c;
        reentrantLock.lock();
        try {
            return this.f370200b.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        ReentrantLock reentrantLock = this.f370201c;
        reentrantLock.lock();
        try {
            return this.f370200b.size();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    @k
    public final Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final E take() throws InterruptedException {
        PriorityQueue priorityQueue = this.f370200b;
        ReentrantLock reentrantLock = this.f370201c;
        reentrantLock.lockInterruptibly();
        while (priorityQueue.isEmpty()) {
            try {
                this.f370202d.await();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        E e12 = (E) priorityQueue.poll();
        reentrantLock.unlock();
        return e12;
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(@l Collection<? super E> collection, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    @l
    public final E poll(long j12, @k TimeUnit timeUnit) throws InterruptedException {
        PriorityQueue priorityQueue = this.f370200b;
        ReentrantLock reentrantLock = this.f370201c;
        reentrantLock.lockInterruptibly();
        try {
            long nanos = timeUnit.toNanos(j12);
            while (priorityQueue.isEmpty() && nanos > 0) {
                nanos = this.f370202d.awaitNanos(nanos);
            }
            E e12 = (E) priorityQueue.poll();
            reentrantLock.unlock();
            return e12;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(E e12, long j12, @k TimeUnit timeUnit) {
        offer(e12);
        return true;
    }
}
