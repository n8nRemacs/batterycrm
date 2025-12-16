package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
@Deprecated
/* loaded from: classes7.dex */
public class p1 extends AbstractList<String> implements InterfaceC37684k0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final C37682j0 f362939b;

    /* compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* renamed from: b, reason: collision with root package name */
        public ListIterator<String> f362940b;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f362940b.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f362940b.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f362940b.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f362940b.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f362940b.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f362940b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    public class b implements Iterator<String> {

        /* renamed from: b, reason: collision with root package name */
        public Iterator<String> f362941b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f362941b.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f362941b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p1(C37682j0 c37682j0) {
        this.f362939b = c37682j0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        return this.f362939b.get(i12);
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final Object getRaw(int i12) {
        return this.f362939b.f362882c.get(i12);
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f362939b.f362882c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.f362941b = this.f362939b.iterator();
        return bVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i12) {
        a aVar = new a();
        aVar.f362940b = this.f362939b.listIterator(i12);
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362939b.size();
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final void u0(AbstractC37700t abstractC37700t) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC37684k0
    public final InterfaceC37684k0 getUnmodifiableView() {
        return this;
    }
}
