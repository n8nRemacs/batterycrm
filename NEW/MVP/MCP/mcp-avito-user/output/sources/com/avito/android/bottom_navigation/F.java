package com.avito.android.bottom_navigation;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;

/* compiled from: NavigationTabSet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_navigation/F;", "", "Lcom/avito/android/bottom_navigation/NavigationTabSetItem;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F implements List<NavigationTabSetItem>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<NavigationTabSetItem> f106933b;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.k List<? extends NavigationTabSetItem> list) {
        this.f106933b = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i12, NavigationTabSetItem navigationTabSetItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends NavigationTabSetItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof NavigationTabSetItem)) {
            return false;
        }
        return this.f106933b.contains((NavigationTabSetItem) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        return this.f106933b.containsAll(collection);
    }

    @Override // java.util.List
    public final NavigationTabSetItem get(int i12) {
        return this.f106933b.get(i12);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof NavigationTabSetItem)) {
            return -1;
        }
        return this.f106933b.indexOf((NavigationTabSetItem) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f106933b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<NavigationTabSetItem> iterator() {
        return this.f106933b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof NavigationTabSetItem)) {
            return -1;
        }
        return this.f106933b.lastIndexOf((NavigationTabSetItem) obj);
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<NavigationTabSetItem> listIterator() {
        return this.f106933b.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ NavigationTabSetItem remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<NavigationTabSetItem> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ NavigationTabSetItem set(int i12, NavigationTabSetItem navigationTabSetItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f106933b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super NavigationTabSetItem> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final List<NavigationTabSetItem> subList(int i12, int i13) {
        return this.f106933b.subList(i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends NavigationTabSetItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<NavigationTabSetItem> listIterator(int i12) {
        return this.f106933b.listIterator(i12);
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
