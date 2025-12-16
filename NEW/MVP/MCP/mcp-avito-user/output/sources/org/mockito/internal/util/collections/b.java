package org.mockito.internal.util.collections;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: HashCodeAndEqualsSafeSet.java */
/* loaded from: classes7.dex */
public class b implements Set<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<org.mockito.internal.util.collections.a> f421734b = new HashSet<>();

    /* compiled from: HashCodeAndEqualsSafeSet.java */
    public class a implements Iterator<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<org.mockito.internal.util.collections.a> f421735b;

        public a(b bVar) {
            this.f421735b = bVar.f421734b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f421735b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.f421735b.next().f421733a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f421735b.remove();
        }
    }

    public static HashSet a(Collection collection) {
        Y71.a.a(collection, "Passed collection should notify() be null");
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new org.mockito.internal.util.collections.a(it.next()));
        }
        return hashSet;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f421734b.add(new org.mockito.internal.util.collections.a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<?> collection) {
        return this.f421734b.addAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f421734b.clear();
    }

    public final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f421734b.contains(new org.mockito.internal.util.collections.a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f421734b.containsAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f421734b.equals(((b) obj).f421734b);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f421734b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f421734b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f421734b.remove(new org.mockito.internal.util.collections.a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f421734b.removeAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f421734b.retainAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f421734b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        int size = this.f421734b.size();
        Object[] objArr = new Object[size];
        a aVar = new a(this);
        for (int i12 = 0; i12 < size; i12++) {
            if (aVar.f421735b.hasNext()) {
                objArr[i12] = aVar.next();
            }
        }
        return objArr;
    }

    public final String toString() {
        return this.f421734b.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        HashSet<org.mockito.internal.util.collections.a> hashSet = this.f421734b;
        if (length < hashSet.size()) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), hashSet.size()));
        }
        a aVar = new a(this);
        int length2 = tArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (aVar.f421735b.hasNext()) {
                tArr[i12] = aVar.next();
            }
        }
        return tArr;
    }
}
