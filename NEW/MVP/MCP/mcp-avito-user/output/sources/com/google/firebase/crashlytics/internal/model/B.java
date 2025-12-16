package com.google.firebase.crashlytics.internal.model;

import j.N;
import j.P;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: classes4.dex */
public final class B<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List<E> f361077b;

    public B(List<E> list) {
        this.f361077b = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(@N E e12) {
        return this.f361077b.add(e12);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@N Collection<? extends E> collection) {
        return this.f361077b.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f361077b.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(@P Object obj) {
        return this.f361077b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@N Collection<?> collection) {
        return this.f361077b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@P Object obj) {
        return this.f361077b.equals(obj);
    }

    @Override // java.util.List
    @N
    public final E get(int i12) {
        return this.f361077b.get(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f361077b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(@P Object obj) {
        return this.f361077b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f361077b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @N
    public final Iterator<E> iterator() {
        return this.f361077b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(@P Object obj) {
        return this.f361077b.lastIndexOf(obj);
    }

    @Override // java.util.List
    @N
    public final ListIterator<E> listIterator() {
        return this.f361077b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(@P Object obj) {
        return this.f361077b.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@N Collection<?> collection) {
        return this.f361077b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@N Collection<?> collection) {
        return this.f361077b.retainAll(collection);
    }

    @Override // java.util.List
    @N
    public final E set(int i12, @N E e12) {
        return this.f361077b.set(i12, e12);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f361077b.size();
    }

    @Override // java.util.List
    @N
    public final List<E> subList(int i12, int i13) {
        return this.f361077b.subList(i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    @P
    public final Object[] toArray() {
        return this.f361077b.toArray();
    }

    @Override // java.util.List
    public final void add(int i12, @N E e12) {
        this.f361077b.add(i12, e12);
    }

    @Override // java.util.List
    public final boolean addAll(int i12, @N Collection<? extends E> collection) {
        return this.f361077b.addAll(i12, collection);
    }

    @Override // java.util.List
    @N
    public final ListIterator<E> listIterator(int i12) {
        return this.f361077b.listIterator(i12);
    }

    @Override // java.util.List
    public final E remove(int i12) {
        return this.f361077b.remove(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(@P T[] tArr) {
        return (T[]) this.f361077b.toArray(tArr);
    }
}
