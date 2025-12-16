package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes8.dex */
public class v extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: b, reason: collision with root package name */
    public final l f409420b;

    /* compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* renamed from: b, reason: collision with root package name */
        public ListIterator<String> f409421b;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f409421b.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f409421b.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f409421b.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f409421b.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f409421b.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f409421b.previousIndex();
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
        public Iterator<String> f409422b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f409422b.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f409422b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public v(l lVar) {
        this.f409420b = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final void B2(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        return this.f409420b.get(i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final d getByteString(int i12) {
        return this.f409420b.getByteString(i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f409420b.f409379b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.f409422b = this.f409420b.iterator();
        return bVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i12) {
        a aVar = new a();
        aVar.f409421b = this.f409420b.listIterator(i12);
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f409420b.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final v getUnmodifiableView() {
        return this;
    }
}
