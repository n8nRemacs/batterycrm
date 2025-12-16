package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import com.yandex.mobile.ads.impl.fj0;
import com.yandex.mobile.ads.impl.ju0;
import com.yandex.mobile.ads.impl.ku0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes8.dex */
public final class m0 {

    public static class a<E> extends i<E> implements Set<E> {
        public a(Set<E> set, ju0<? super E> ju0Var) {
            super(set, ju0Var);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            return m0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return m0.a(this);
        }
    }

    public static class b<E> extends a<E> implements SortedSet<E> {
        public b(SortedSet<E> sortedSet, ju0<? super E> ju0Var) {
            super(sortedSet, ju0Var);
        }

        @Override // java.util.SortedSet
        @I41.a
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f382773a).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f382773a.iterator();
            ju0<? super E> ju0Var = this.f382774b;
            it.getClass();
            ju0Var.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (ju0Var.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e12) {
            return new b(((SortedSet) this.f382773a).headSet(e12), this.f382774b);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f382773a;
            while (true) {
                E e12 = (Object) sortedSetHeadSet.last();
                if (this.f382774b.apply(e12)) {
                    return e12;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e12);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e12, E e13) {
            return new b(((SortedSet) this.f382773a).subSet(e12, e13), this.f382774b);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e12) {
            return new b(((SortedSet) this.f382773a).tailSet(e12), this.f382774b);
        }
    }

    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof fj0) {
                collection = ((fj0) collection).a();
            }
            return (!(collection instanceof Set) || collection.size() <= size()) ? m0.a((Set<?>) this, collection.iterator()) : u.a(collection, iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        public /* synthetic */ d(int i12) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        @aZ0.e
        @Deprecated
        public final boolean add(E e12) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        @aZ0.e
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

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

        private d() {
        }
    }

    public static <E> Set<E> a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static d a(r rVar, r rVar2) {
        if (rVar == null) {
            throw new NullPointerException("set1");
        }
        if (rVar2 != null) {
            return new l0(rVar, rVar2);
        }
        throw new NullPointerException("set2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Set<E> a(Set<E> set, ju0<? super E> ju0Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof a) {
                a aVar = (a) sortedSet;
                return new b((SortedSet) aVar.f382773a, ku0.a(aVar.f382774b, ju0Var));
            }
            sortedSet.getClass();
            ju0Var.getClass();
            return new b(sortedSet, ju0Var);
        }
        if (set instanceof a) {
            a aVar2 = (a) set;
            return new a((Set) aVar2.f382773a, ku0.a(aVar2.f382774b, ju0Var));
        }
        set.getClass();
        ju0Var.getClass();
        return new a(set, ju0Var);
    }

    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i12 = ~(~(i12 + (next != null ? next.hashCode() : 0)));
        }
        return i12;
    }

    public static boolean a(Set<?> set, @I41.a Object obj) {
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

    public static boolean a(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
