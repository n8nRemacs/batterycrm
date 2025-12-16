package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.G;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: Sets.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class W3 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    public class a<E> extends i<E> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f359592b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set f359593c;

        /* compiled from: Sets.java */
        /* renamed from: com.google.common.collect.W3$a$a, reason: collision with other inner class name */
        public class C10665a extends AbstractC37316d<E> {

            /* renamed from: d, reason: collision with root package name */
            public final Iterator<E> f359594d;

            public C10665a() {
                this.f359594d = a.this.f359592b.iterator();
            }

            @Override // com.google.common.collect.AbstractC37316d
            @I41.a
            public final E a() {
                E next;
                do {
                    Iterator<E> it = this.f359594d;
                    if (!it.hasNext()) {
                        this.f359661b = AbstractC37316d.b.f359666d;
                        return null;
                    }
                    next = it.next();
                } while (((C37309b4) a.this.f359593c).f359654e.equals(next));
                return next;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f359592b = set;
            this.f359593c = set2;
        }

        @Override // com.google.common.collect.W3.i
        /* renamed from: b */
        public final N4<E> iterator() {
            return new C10665a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            return this.f359592b.contains(obj) && !this.f359593c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f359593c.containsAll(this.f359592b);
        }

        @Override // com.google.common.collect.W3.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new C10665a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            Iterator<E> it = this.f359592b.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (!this.f359593c.contains(it.next())) {
                    i12++;
                }
            }
            return i12;
        }
    }

    /* compiled from: Sets.java */
    public static final class b<E> extends B0<List<E>> implements Set<List<E>> {
        @Override // com.google.common.collect.B0, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection<List<E>> X() {
            return null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            ((List) obj).size();
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            ((b) obj).getClass();
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            size();
            throw null;
        }
    }

    /* compiled from: Sets.java */
    @XY0.c
    public static class c<E> extends R0<E> {
        @Override // com.google.common.collect.R0, com.google.common.collect.Y0, com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.collect.R0, com.google.common.collect.Y0, com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: Y */
        public final /* bridge */ /* synthetic */ Collection X() {
            return null;
        }

        @Override // com.google.common.collect.R0, com.google.common.collect.Y0, com.google.common.collect.U0
        /* renamed from: b0 */
        public final /* bridge */ /* synthetic */ Set X() {
            return null;
        }

        @Override // com.google.common.collect.R0, com.google.common.collect.Y0
        /* renamed from: c0 */
        public final /* bridge */ /* synthetic */ SortedSet X() {
            return null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        @I41.a
        public final E ceiling(@InterfaceC37434x3 E e12) {
            throw null;
        }

        @Override // com.google.common.collect.Y0, java.util.SortedSet
        public final Comparator<? super E> comparator() {
            throw null;
        }

        @Override // com.google.common.collect.R0
        /* renamed from: d0 */
        public final NavigableSet<E> X() {
            return null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            return null;
        }

        @Override // com.google.common.collect.Y0, java.util.SortedSet
        @InterfaceC37434x3
        public final E first() {
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        @I41.a
        public final E floor(@InterfaceC37434x3 E e12) {
            throw null;
        }

        @Override // com.google.common.collect.Y0, java.util.SortedSet
        public final SortedSet<E> headSet(@InterfaceC37434x3 E e12) {
            headSet(e12, false);
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        @I41.a
        public final E higher(@InterfaceC37434x3 E e12) {
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.Y0, java.util.SortedSet
        @InterfaceC37434x3
        public final E last() {
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        @I41.a
        public final E lower(@InterfaceC37434x3 E e12) {
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        @I41.a
        public final E pollFirst() {
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        @I41.a
        public final E pollLast() {
            throw null;
        }

        @Override // com.google.common.collect.Y0, java.util.SortedSet
        public final SortedSet<E> subSet(@InterfaceC37434x3 E e12, @InterfaceC37434x3 E e13) {
            subSet(e12, true, e13, false);
            throw null;
        }

        @Override // com.google.common.collect.Y0, java.util.SortedSet
        public final SortedSet<E> tailSet(@InterfaceC37434x3 E e12) {
            tailSet(e12, true);
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C37414t3.c(this, tArr);
        }

        @Override // com.google.common.collect.S0
        public final String toString() {
            return a0();
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        public final NavigableSet<E> headSet(@InterfaceC37434x3 E e12, boolean z12) {
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        public final NavigableSet<E> subSet(@InterfaceC37434x3 E e12, boolean z12, @InterfaceC37434x3 E e13, boolean z13) {
            throw null;
        }

        @Override // com.google.common.collect.R0, java.util.NavigableSet
        public final NavigableSet<E> tailSet(@InterfaceC37434x3 E e12, boolean z12) {
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final Object[] toArray() {
            return Z();
        }
    }

    /* compiled from: Sets.java */
    @XY0.c
    public static class d<E> extends f<E> implements NavigableSet<E> {
        public d() {
            throw null;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E ceiling(@InterfaceC37434x3 E e12) {
            return (E) C37325e2.f(((NavigableSet) this.f359325b).tailSet(e12, true).iterator(), this.f359326c);
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            return C37325e2.e(((NavigableSet) this.f359325b).descendingIterator(), this.f359326c);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            return W3.c(((NavigableSet) this.f359325b).descendingSet(), this.f359326c);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E floor(@InterfaceC37434x3 E e12) {
            return (E) C37325e2.f(((NavigableSet) this.f359325b).headSet(e12, true).descendingIterator(), this.f359326c);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(@InterfaceC37434x3 E e12, boolean z12) {
            return W3.c(((NavigableSet) this.f359325b).headSet(e12, z12), this.f359326c);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E higher(@InterfaceC37434x3 E e12) {
            return (E) C37325e2.f(((NavigableSet) this.f359325b).tailSet(e12, false).iterator(), this.f359326c);
        }

        @Override // com.google.common.collect.W3.f, java.util.SortedSet
        @InterfaceC37434x3
        public final E last() {
            Iterator<E> itDescendingIterator = ((NavigableSet) this.f359325b).descendingIterator();
            itDescendingIterator.getClass();
            com.google.common.base.N<? super E> n12 = this.f359326c;
            n12.getClass();
            while (itDescendingIterator.hasNext()) {
                E next = itDescendingIterator.next();
                if (n12.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E lower(@InterfaceC37434x3 E e12) {
            return (E) C37325e2.f(((NavigableSet) this.f359325b).headSet(e12, false).descendingIterator(), this.f359326c);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollFirst() {
            return (E) W1.e((NavigableSet) this.f359325b, this.f359326c);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollLast() {
            return (E) W1.e(((NavigableSet) this.f359325b).descendingSet(), this.f359326c);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(@InterfaceC37434x3 E e12, boolean z12, @InterfaceC37434x3 E e13, boolean z13) {
            return W3.c(((NavigableSet) this.f359325b).subSet(e12, z12, e13, z13), this.f359326c);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(@InterfaceC37434x3 E e12, boolean z12) {
            return W3.c(((NavigableSet) this.f359325b).tailSet(e12, z12), this.f359326c);
        }
    }

    /* compiled from: Sets.java */
    public static class e<E> extends G.a<E> implements Set<E> {
        public e() {
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            return W3.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return W3.e(this);
        }
    }

    /* compiled from: Sets.java */
    public static class f<E> extends e<E> implements SortedSet<E> {
        public f() {
            throw null;
        }

        @Override // java.util.SortedSet
        @I41.a
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f359325b).comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final E first() {
            Iterator<E> it = this.f359325b.iterator();
            it.getClass();
            com.google.common.base.N<? super E> n12 = this.f359326c;
            n12.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (n12.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(@InterfaceC37434x3 E e12) {
            return new f(((SortedSet) this.f359325b).headSet(e12), this.f359326c);
        }

        @InterfaceC37434x3
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f359325b;
            while (true) {
                E e12 = (Object) sortedSetHeadSet.last();
                if (this.f359326c.apply(e12)) {
                    return e12;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e12);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(@InterfaceC37434x3 E e12, @InterfaceC37434x3 E e13) {
            return new f(((SortedSet) this.f359325b).subSet(e12, e13), this.f359326c);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(@InterfaceC37434x3 E e12) {
            return new f(((SortedSet) this.f359325b).tailSet(e12), this.f359326c);
        }
    }

    /* compiled from: Sets.java */
    public static abstract class g<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return W3.h(collection, this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* compiled from: Sets.java */
    public static final class h<E> extends AbstractSet<Set<E>> {

        /* compiled from: Sets.java */
        public class a extends AbstractC37310c<Set<E>> {
            @Override // com.google.common.collect.AbstractC37310c
            public final Object a(int i12) {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            if (obj instanceof Set) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof h) {
                throw null;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Set<E>> iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "powerSet(null)";
        }
    }

    /* compiled from: Sets.java */
    public static abstract class i<E> extends AbstractSet<E> {
        public /* synthetic */ i(U3 u32) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        @aZ0.e
        @Deprecated
        public final boolean add(@InterfaceC37434x3 E e12) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        @aZ0.e
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public abstract N4<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @aZ0.e
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        @aZ0.e
        @Deprecated
        public final boolean remove(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        @aZ0.e
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        @aZ0.e
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public i() {
        }
    }

    /* compiled from: Sets.java */
    public static final class j<E> extends AbstractSet<E> {

        /* compiled from: Sets.java */
        public class a extends N4<E> {

            /* renamed from: b, reason: collision with root package name */
            public int f359596b;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f359596b != 0;
            }

            @Override // java.util.Iterator
            public final E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f359596b);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f359596b = (~(1 << iNumberOfTrailingZeros)) & this.f359596b;
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            new a();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Integer.bitCount(0);
        }
    }

    /* compiled from: Sets.java */
    public static final class k<E> extends Y0<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final NavigableSet<E> f359597b;

        /* renamed from: c, reason: collision with root package name */
        public final SortedSet<E> f359598c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient k<E> f359599d;

        public k(NavigableSet<E> navigableSet) {
            navigableSet.getClass();
            this.f359597b = navigableSet;
            this.f359598c = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.Y0, com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            return this.f359598c;
        }

        @Override // com.google.common.collect.Y0, com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection X() {
            return this.f359598c;
        }

        @Override // com.google.common.collect.Y0, com.google.common.collect.U0
        /* renamed from: b0 */
        public final Set X() {
            return this.f359598c;
        }

        @Override // com.google.common.collect.Y0
        /* renamed from: c0 */
        public final SortedSet<E> X() {
            return this.f359598c;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E ceiling(@InterfaceC37434x3 E e12) {
            return this.f359597b.ceiling(e12);
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            return C37325e2.n(this.f359597b.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            k<E> kVar = this.f359599d;
            if (kVar != null) {
                return kVar;
            }
            k<E> kVar2 = new k<>(this.f359597b.descendingSet());
            this.f359599d = kVar2;
            kVar2.f359599d = this;
            return kVar2;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E floor(@InterfaceC37434x3 E e12) {
            return this.f359597b.floor(e12);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(@InterfaceC37434x3 E e12, boolean z12) {
            return W3.j(this.f359597b.headSet(e12, z12));
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E higher(@InterfaceC37434x3 E e12) {
            return this.f359597b.higher(e12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E lower(@InterfaceC37434x3 E e12) {
            return this.f359597b.lower(e12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(@InterfaceC37434x3 E e12, boolean z12, @InterfaceC37434x3 E e13, boolean z13) {
            return W3.j(this.f359597b.subSet(e12, z12, e13, z13));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(@InterfaceC37434x3 E e12, boolean z12) {
            return W3.j(this.f359597b.tailSet(e12, z12));
        }
    }

    public static <E> i<E> a(Set<E> set, Set<?> set2) {
        com.google.common.base.M.j(set, "set1");
        return new a(set, set2);
    }

    public static boolean b(Set<?> set, @I41.a Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XY0.c
    public static <E> NavigableSet<E> c(NavigableSet<E> navigableSet, com.google.common.base.N<? super E> n12) {
        if (navigableSet instanceof e) {
            e eVar = (e) navigableSet;
            return new d((NavigableSet) eVar.f359325b, com.google.common.base.O.c(eVar.f359326c, n12));
        }
        navigableSet.getClass();
        n12.getClass();
        return new d(navigableSet, n12);
    }

    public static <E> Set<E> d(Set<E> set, com.google.common.base.N<? super E> n12) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof e) {
                e eVar = (e) set;
                return new e((Set) eVar.f359325b, com.google.common.base.O.c(eVar.f359326c, n12));
            }
            set.getClass();
            n12.getClass();
            return new e(set, n12);
        }
        Collection collection = (SortedSet) set;
        if (collection instanceof e) {
            e eVar2 = (e) collection;
            return new f((SortedSet) eVar2.f359325b, com.google.common.base.O.c(eVar2.f359326c, n12));
        }
        collection.getClass();
        n12.getClass();
        return new f(collection, n12);
    }

    public static int e(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i12 = ~(~(i12 + (next != null ? next.hashCode() : 0)));
        }
        return i12;
    }

    public static i f(H1 h12, H1 h13) {
        com.google.common.base.M.j(h12, "set1");
        com.google.common.base.M.j(h13, "set2");
        return new V3(h12, h13);
    }

    public static <E> Set<E> g() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean h(Collection collection, Set set) {
        collection.getClass();
        if (collection instanceof InterfaceC37338g3) {
            collection = ((InterfaceC37338g3) collection).k();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? i(set, collection.iterator()) : C37325e2.k(collection, set.iterator());
    }

    public static boolean i(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> NavigableSet<E> j(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof AbstractC37378n1) || (navigableSet instanceof k)) ? navigableSet : new k(navigableSet);
    }
}
