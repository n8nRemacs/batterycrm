package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.C37374m3;
import com.google.common.collect.InterfaceC37338g3;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ForwardingMultiset.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class P0<E> extends B0<E> implements InterfaceC37338g3<E> {

    /* compiled from: ForwardingMultiset.java */
    public class a extends C37374m3.c<E> {
        @Override // com.google.common.collect.C37374m3.c
        public final InterfaceC37338g3<E> e() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            throw null;
        }
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public int O3(int i12, @I41.a Object obj) {
        return X().O3(i12, obj);
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public boolean P2(int i12, @InterfaceC37434x3 Object obj) {
        return X().P2(i12, obj);
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public final int S5(@I41.a Object obj) {
        return X().S5(obj);
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public int add(int i12, @InterfaceC37434x3 Object obj) {
        return X().add(i12, obj);
    }

    @Override // com.google.common.collect.B0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC37338g3<E> X();

    @Override // com.google.common.collect.InterfaceC37338g3
    public Set<InterfaceC37338g3.a<E>> entrySet() {
        return X().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
    public final boolean equals(@I41.a Object obj) {
        return obj == this || X().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC37338g3
    public final int hashCode() {
        return X().hashCode();
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    public Set<E> k() {
        return X().k();
    }

    @Override // com.google.common.collect.InterfaceC37338g3
    @InterfaceC19845a
    public int p6(@InterfaceC37434x3 Object obj) {
        return X().p6(obj);
    }
}
