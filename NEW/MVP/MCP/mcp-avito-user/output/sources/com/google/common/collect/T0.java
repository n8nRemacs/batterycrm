package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Queue;

/* compiled from: ForwardingQueue.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class T0<E> extends B0<E> implements Queue<E> {
    @Override // com.google.common.collect.B0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public abstract Queue<E> X();

    @Override // java.util.Queue
    @InterfaceC37434x3
    public final E element() {
        return X().element();
    }

    @Override // java.util.Queue
    @InterfaceC19845a
    public boolean offer(@InterfaceC37434x3 E e12) {
        return X().offer(e12);
    }

    @Override // java.util.Queue
    @I41.a
    public final E peek() {
        return X().peek();
    }

    @Override // java.util.Queue
    @I41.a
    @InterfaceC19845a
    public final E poll() {
        return X().poll();
    }

    @Override // java.util.Queue
    @InterfaceC19845a
    @InterfaceC37434x3
    public final E remove() {
        return X().remove();
    }
}
