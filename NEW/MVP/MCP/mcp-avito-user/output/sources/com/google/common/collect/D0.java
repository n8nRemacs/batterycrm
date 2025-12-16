package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: ForwardingDeque.java */
@XY0.c
@InterfaceC37329f0
@XY0.d
/* loaded from: classes6.dex */
public abstract class D0<E> extends T0<E> implements Deque<E> {
    @Override // java.util.Deque
    public final void addFirst(@InterfaceC37434x3 E e12) {
        X().addFirst(e12);
    }

    @Override // java.util.Deque
    public final void addLast(@InterfaceC37434x3 E e12) {
        X().addLast(e12);
    }

    @Override // com.google.common.collect.T0
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public abstract Deque<E> X();

    @Override // java.util.Deque
    public final Iterator<E> descendingIterator() {
        return X().descendingIterator();
    }

    @Override // java.util.Deque
    @InterfaceC37434x3
    public final E getFirst() {
        return X().getFirst();
    }

    @Override // java.util.Deque
    @InterfaceC37434x3
    public final E getLast() {
        return X().getLast();
    }

    @Override // java.util.Deque
    @InterfaceC19845a
    public final boolean offerFirst(@InterfaceC37434x3 E e12) {
        return X().offerFirst(e12);
    }

    @Override // java.util.Deque
    @InterfaceC19845a
    public final boolean offerLast(@InterfaceC37434x3 E e12) {
        return X().offerLast(e12);
    }

    @Override // java.util.Deque
    @I41.a
    public final E peekFirst() {
        return X().peekFirst();
    }

    @Override // java.util.Deque
    @I41.a
    public final E peekLast() {
        return X().peekLast();
    }

    @Override // java.util.Deque
    @I41.a
    @InterfaceC19845a
    public final E pollFirst() {
        return X().pollFirst();
    }

    @Override // java.util.Deque
    @I41.a
    @InterfaceC19845a
    public final E pollLast() {
        return X().pollLast();
    }

    @Override // java.util.Deque
    @InterfaceC19845a
    @InterfaceC37434x3
    public final E pop() {
        return X().pop();
    }

    @Override // java.util.Deque
    public final void push(@InterfaceC37434x3 E e12) {
        X().push(e12);
    }

    @Override // java.util.Deque
    @InterfaceC19845a
    @InterfaceC37434x3
    public final E removeFirst() {
        return X().removeFirst();
    }

    @Override // java.util.Deque
    @InterfaceC19845a
    public final boolean removeFirstOccurrence(@I41.a Object obj) {
        return X().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @InterfaceC19845a
    @InterfaceC37434x3
    public final E removeLast() {
        return X().removeLast();
    }

    @Override // java.util.Deque
    @InterfaceC19845a
    public final boolean removeLastOccurrence(@I41.a Object obj) {
        return X().removeLastOccurrence(obj);
    }
}
