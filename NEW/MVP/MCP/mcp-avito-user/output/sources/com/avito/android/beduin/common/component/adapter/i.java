package com.avito.android.beduin.common.component.adapter;

import Y61.k;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42821v;

/* compiled from: BeduinSliderInfiniteAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/i;", "T", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class i<T> implements List<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public List<? extends T> f100621b;

    public i(@k C42784z0 c42784z0) {
        this.f100621b = c42784z0;
    }

    @Override // java.util.List
    public final void add(int i12, T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f100621b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        return this.f100621b.containsAll(collection);
    }

    @Override // java.util.List
    public final T get(int i12) {
        List<? extends T> list = this.f100621b;
        return list.get(i12 % list.size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f100621b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f100621b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public final Iterator<T> iterator() {
        return this.f100621b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f100621b.lastIndexOf(obj);
    }

    @Override // java.util.List
    @k
    public final ListIterator<T> listIterator() {
        return this.f100621b.listIterator();
    }

    @Override // java.util.List
    public final T remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final T set(int i12, T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return !this.f100621b.isEmpty() ? Integer.MAX_VALUE : 0;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @k
    public final List<T> subList(int i12, int i13) {
        return this.f100621b.subList(i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @k
    public final ListIterator<T> listIterator(int i12) {
        return this.f100621b.listIterator(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
