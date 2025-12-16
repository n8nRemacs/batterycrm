package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes.dex */
public class J1 extends AbstractList<String> implements InterfaceC22927s0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final C22925r0 f45701b;

    /* compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* renamed from: b, reason: collision with root package name */
        public ListIterator<String> f45702b;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f45702b.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f45702b.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f45702b.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f45702b.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f45702b.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f45702b.previousIndex();
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
        public Iterator<String> f45703b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45703b.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f45703b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public J1(C22925r0 c22925r0) {
        this.f45701b = c22925r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        return this.f45701b.get(i12);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final Object getRaw(int i12) {
        return this.f45701b.f45917c.get(i12);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f45701b.f45917c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.f45703b = this.f45701b.iterator();
        return bVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i12) {
        a aVar = new a();
        aVar.f45702b = this.f45701b.listIterator(i12);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final void n4(AbstractC22934w abstractC22934w) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45701b.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22927s0
    public final InterfaceC22927s0 getUnmodifiableView() {
        return this;
    }
}
