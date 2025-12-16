package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Iterator;

/* compiled from: ForwardingIterator.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class I0<T> extends S0 implements Iterator<T> {
    @Override // com.google.common.collect.S0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> X();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return X().hasNext();
    }

    @Override // java.util.Iterator
    @InterfaceC19845a
    @InterfaceC37434x3
    public T next() {
        return X().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        X().remove();
    }
}
