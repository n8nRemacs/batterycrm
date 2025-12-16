package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: VolatileSizeArrayList.java */
/* loaded from: classes8.dex */
public final class s<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<T> f404840b = new ArrayList<>();

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t12) {
        ArrayList<T> arrayList = this.f404840b;
        boolean zAdd = arrayList.add(t12);
        lazySet(arrayList.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@j41.e Collection<? extends T> collection) {
        ArrayList<T> arrayList = this.f404840b;
        boolean zAddAll = arrayList.addAll(collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f404840b.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f404840b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@j41.e Collection<?> collection) {
        return this.f404840b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        boolean z12 = obj instanceof s;
        ArrayList<T> arrayList = this.f404840b;
        return z12 ? arrayList.equals(((s) obj).f404840b) : arrayList.equals(obj);
    }

    @Override // java.util.List
    public final T get(int i12) {
        return this.f404840b.get(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f404840b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f404840b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.f404840b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f404840b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return this.f404840b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        ArrayList<T> arrayList = this.f404840b;
        boolean zRemove = arrayList.remove(obj);
        lazySet(arrayList.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@j41.e Collection<?> collection) {
        ArrayList<T> arrayList = this.f404840b;
        boolean zRemoveAll = arrayList.removeAll(collection);
        lazySet(arrayList.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@j41.e Collection<?> collection) {
        ArrayList<T> arrayList = this.f404840b;
        boolean zRetainAll = arrayList.retainAll(collection);
        lazySet(arrayList.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public final T set(int i12, T t12) {
        return this.f404840b.set(i12, t12);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return get();
    }

    @Override // java.util.List
    public final List<T> subList(int i12, int i13) {
        return this.f404840b.subList(i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f404840b.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.f404840b.toString();
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i12) {
        return this.f404840b.listIterator(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final <E> E[] toArray(@j41.e E[] eArr) {
        return (E[]) this.f404840b.toArray(eArr);
    }

    @Override // java.util.List
    public final void add(int i12, T t12) {
        ArrayList<T> arrayList = this.f404840b;
        arrayList.add(i12, t12);
        lazySet(arrayList.size());
    }

    @Override // java.util.List
    public final boolean addAll(int i12, @j41.e Collection<? extends T> collection) {
        ArrayList<T> arrayList = this.f404840b;
        boolean zAddAll = arrayList.addAll(i12, collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i12) {
        ArrayList<T> arrayList = this.f404840b;
        T tRemove = arrayList.remove(i12);
        lazySet(arrayList.size());
        return tRemove;
    }
}
