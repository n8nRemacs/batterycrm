package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ForwardingCollection.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class B0<E> extends S0 implements Collection<E> {
    @Override // com.google.common.collect.S0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> X();

    public final Object[] Z() {
        return toArray(new Object[size()]);
    }

    public final String a0() {
        int size = size();
        F.b(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('[');
        boolean z12 = true;
        for (E e12 : this) {
            if (!z12) {
                sb2.append(", ");
            }
            if (e12 == this) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(e12);
            }
            z12 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // java.util.Collection
    @InterfaceC19845a
    public boolean add(@InterfaceC37434x3 E e12) {
        return X().add(e12);
    }

    @Override // java.util.Collection
    @InterfaceC19845a
    public boolean addAll(Collection<? extends E> collection) {
        return X().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        X().clear();
    }

    @Override // java.util.Collection
    public boolean contains(@I41.a Object obj) {
        return X().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return X().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return X().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return X().iterator();
    }

    @Override // java.util.Collection
    @InterfaceC19845a
    public boolean remove(@I41.a Object obj) {
        return X().remove(obj);
    }

    @Override // java.util.Collection
    @InterfaceC19845a
    public boolean removeAll(Collection<?> collection) {
        return X().removeAll(collection);
    }

    @Override // java.util.Collection
    @InterfaceC19845a
    public boolean retainAll(Collection<?> collection) {
        return X().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return X().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return X().toArray();
    }

    @Override // java.util.Collection
    @InterfaceC19845a
    public <T> T[] toArray(T[] tArr) {
        return (T[]) X().toArray(tArr);
    }
}
