package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes7.dex */
public class LimitQueue<E> extends ConcurrentLinkedQueue<E> {
    private static final long serialVersionUID = -4636313759149307798L;

    /* renamed from: b, reason: collision with root package name */
    public final int f363460b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f363461c;

    public LimitQueue(int i12) {
        this.f363461c = false;
        this.f363460b = i12;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e12) {
        if (this.f363461c) {
            super.remove(e12);
        }
        if (super.size() >= this.f363460b) {
            super.poll();
        }
        return super.add(e12);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        int i12 = this.f363460b;
        if (size > i12) {
            return false;
        }
        if (this.f363461c) {
            super.removeAll(collection);
        }
        for (int size2 = (collection.size() + super.size()) - i12; size2 > 0; size2--) {
            super.poll();
        }
        return super.addAll(collection);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    public E get(int i12) {
        Iterator<E> it = iterator();
        E next = null;
        for (int i13 = 0; i13 <= i12 && it.hasNext(); i13++) {
            next = it.next();
        }
        return next;
    }

    public int getLimit() {
        return this.f363460b;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E e12) {
        if (this.f363461c) {
            super.remove(e12);
        }
        if (super.size() >= this.f363460b) {
            super.poll();
        }
        return super.offer(e12);
    }

    public E peekLast() {
        Iterator<E> it = iterator();
        E next = null;
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return (E) super.poll();
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
        try {
            return (E) super.remove();
        } catch (NoSuchElementException unused) {
            Logger.w("LimitQueue", "remove failed, limitQueue is empty");
            return null;
        }
    }

    public LimitQueue(int i12, boolean z12) {
        this.f363460b = i12;
        this.f363461c = z12;
    }

    public LimitQueue(Collection<? extends E> collection, boolean z12) {
        this(collection.size(), z12);
        addAll(collection);
    }
}
