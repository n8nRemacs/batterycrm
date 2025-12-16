package com.google.common.collect;

import java.util.Set;

/* compiled from: ForwardingSet.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class U0<E> extends B0<E> implements Set<E> {
    @Override // com.google.common.collect.B0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public abstract Set<E> X();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@I41.a Object obj) {
        return obj == this || X().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return X().hashCode();
    }
}
