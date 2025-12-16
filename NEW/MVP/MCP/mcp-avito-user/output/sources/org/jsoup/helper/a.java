package org.jsoup.helper;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: ChangeNotifyingArrayList.java */
/* loaded from: classes7.dex */
public abstract class a<E> extends ArrayList<E> {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        e();
        return super.add(e12);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        e();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        super.clear();
    }

    public abstract void e();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E remove(int i12) {
        e();
        return (E) super.remove(i12);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        e();
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        e();
        super.removeRange(i12, i13);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        e();
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        e();
        return (E) super.set(i12, e12);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        e();
        super.add(i12, e12);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection<? extends E> collection) {
        e();
        return super.addAll(i12, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        return super.remove(obj);
    }
}
