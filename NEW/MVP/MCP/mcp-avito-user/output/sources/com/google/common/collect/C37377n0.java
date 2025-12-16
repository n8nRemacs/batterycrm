package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Queue;

/* compiled from: EvictingQueue.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.n0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37377n0<E> extends T0<E> implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.T0, com.google.common.collect.B0, com.google.common.collect.S0
    public final /* bridge */ /* synthetic */ Object X() {
        return null;
    }

    @Override // com.google.common.collect.T0, com.google.common.collect.B0
    /* renamed from: Y */
    public final /* bridge */ /* synthetic */ Collection X() {
        return null;
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    @InterfaceC19845a
    public final boolean add(E e12) {
        e12.getClass();
        return true;
    }

    @Override // com.google.common.collect.B0, java.util.Collection
    @InterfaceC19845a
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < 0) {
            return C37325e2.a(this, collection.iterator());
        }
        clear();
        com.google.common.base.M.d("number to skip cannot be negative", size >= 0);
        return W1.a(new Y1(size, collection), this);
    }

    @Override // com.google.common.collect.T0
    /* renamed from: b0 */
    public final Queue<E> X() {
        return null;
    }

    @Override // com.google.common.collect.T0, java.util.Queue
    @InterfaceC19845a
    public final boolean offer(E e12) {
        e12.getClass();
        return true;
    }
}
