package com.google.common.collect;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class N4<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @aZ0.e
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
