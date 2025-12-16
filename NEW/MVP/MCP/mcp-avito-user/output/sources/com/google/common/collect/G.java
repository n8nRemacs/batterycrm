package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37316d;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: Collections2.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class G {

    /* compiled from: Collections2.java */
    public static class a<E> extends AbstractCollection<E> {

        /* renamed from: b, reason: collision with root package name */
        public final Collection<E> f359325b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.common.base.N<? super E> f359326c;

        public a(Collection<E> collection, com.google.common.base.N<? super E> n12) {
            this.f359325b = collection;
            this.f359326c = n12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(@InterfaceC37434x3 E e12) {
            com.google.common.base.M.g(this.f359326c.apply(e12));
            return this.f359325b.add(e12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.M.g(this.f359326c.apply(it.next()));
            }
            return this.f359325b.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            W1.f(this.f359325b, this.f359326c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (G.c(obj, this.f359325b)) {
                return this.f359326c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return G.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return !W1.b(this.f359325b, this.f359326c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return C37325e2.e(this.f359325b.iterator(), this.f359326c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            return contains(obj) && this.f359325b.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f359325b.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f359326c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f359325b.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f359326c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            Iterator<E> it = this.f359325b.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (this.f359326c.apply(it.next())) {
                    i12++;
                }
            }
            return i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return C37423v2.b(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C37423v2.b(iterator()).toArray(tArr);
        }
    }

    /* compiled from: Collections2.java */
    public static final class b<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<List<E>> iterator() {
            new c();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "orderedPermutationCollection(null)";
        }
    }

    /* compiled from: Collections2.java */
    public static final class c<E> extends AbstractC37316d<List<E>> {

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public ArrayList f359327d;

        public c() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Object a() {
            ArrayList arrayList = this.f359327d;
            if (arrayList == null) {
                this.f359661b = AbstractC37316d.b.f359666d;
                return null;
            }
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(arrayList);
            Objects.requireNonNull(this.f359327d);
            int size = this.f359327d.size();
            int i12 = size - 2;
            if (i12 < 0) {
                this.f359327d = null;
                return abstractC37401r1V;
            }
            this.f359327d.get(i12);
            this.f359327d.get(size - 1);
            throw null;
        }
    }

    /* compiled from: Collections2.java */
    public static final class d<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<List<E>> iterator() {
            new e();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "permutations(null)";
        }
    }

    /* compiled from: Collections2.java */
    public static class e<E> extends AbstractC37316d<List<E>> {

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f359328d = new ArrayList((Collection) null);

        /* renamed from: e, reason: collision with root package name */
        public int f359329e;

        public e() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Object a() {
            if (this.f359329e <= 0) {
                this.f359661b = AbstractC37316d.b.f359666d;
                return null;
            }
            ArrayList arrayList = this.f359328d;
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(arrayList);
            int size = arrayList.size() - 1;
            this.f359329e = size;
            if (size == -1) {
                return abstractC37401r1V;
            }
            throw null;
        }
    }

    /* compiled from: Collections2.java */
    public static class f<F, T> extends AbstractCollection<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Collection<F> f359330b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC37276u<? super F, ? extends T> f359331c;

        public f(Collection<F> collection, InterfaceC37276u<? super F, ? extends T> interfaceC37276u) {
            collection.getClass();
            this.f359330b = collection;
            interfaceC37276u.getClass();
            this.f359331c = interfaceC37276u;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f359330b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f359330b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return C37325e2.m(this.f359330b.iterator(), this.f359331c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f359330b.size();
        }
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Collection b(com.google.common.base.N n12) {
        throw null;
    }

    public static boolean c(@I41.a Object obj, Collection collection) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
