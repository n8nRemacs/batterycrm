package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.collect.InterfaceC37338g3;
import com.google.common.collect.W3;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: Multisets.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.m3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37374m3 {

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$a */
    public static abstract class a<E> implements InterfaceC37338g3.a<E> {
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof InterfaceC37338g3.a)) {
                return false;
            }
            InterfaceC37338g3.a aVar = (InterfaceC37338g3.a) obj;
            return getCount() == aVar.getCount() && com.google.common.base.F.a(a(), aVar.a());
        }

        public final int hashCode() {
            E eA2 = a();
            return (eA2 == null ? 0 : eA2.hashCode()) ^ getCount();
        }

        public final String toString() {
            String strValueOf = String.valueOf(a());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$b */
    public static final class b implements Comparator<InterfaceC37338g3.a<?>> {
        static {
            new b();
        }

        @Override // java.util.Comparator
        public final int compare(InterfaceC37338g3.a<?> aVar, InterfaceC37338g3.a<?> aVar2) {
            return aVar2.getCount() - aVar.getCount();
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$c */
    public static abstract class c<E> extends W3.g<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            return e().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return e().containsAll(collection);
        }

        public abstract InterfaceC37338g3<E> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            return e().O3(Integer.MAX_VALUE, obj) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return e().entrySet().size();
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$d */
    public static abstract class d<E> extends W3.g<InterfaceC37338g3.a<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof InterfaceC37338g3.a)) {
                return false;
            }
            InterfaceC37338g3.a aVar = (InterfaceC37338g3.a) obj;
            return aVar.getCount() > 0 && e().S5(aVar.a()) == aVar.getCount();
        }

        public abstract InterfaceC37338g3<E> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            if (!(obj instanceof InterfaceC37338g3.a)) {
                return false;
            }
            InterfaceC37338g3.a aVar = (InterfaceC37338g3.a) obj;
            Object objA = aVar.a();
            int count = aVar.getCount();
            if (count != 0) {
                return e().P2(count, objA);
            }
            return false;
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$e */
    public static final class e<E> extends i<E> {

        /* compiled from: Multisets.java */
        /* renamed from: com.google.common.collect.m3$e$a */
        public class a implements com.google.common.base.N<InterfaceC37338g3.a<E>> {
            @Override // com.google.common.base.N
            public final boolean apply(Object obj) {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
        public final int O3(int i12, @I41.a Object obj) {
            F.b(i12, "occurrences");
            if (i12 == 0 || contains(obj)) {
                throw null;
            }
            return 0;
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final int S5(@I41.a Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
        public final int add(int i12, @InterfaceC37434x3 Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37352j
        public final Set<E> b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37352j
        public final Set<InterfaceC37338g3.a<E>> d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37352j
        public final Iterator<E> g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC37352j
        public final Iterator<InterfaceC37338g3.a<E>> h() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.C37374m3.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$f */
    public static class f<E> extends a<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final E f359853b;

        /* renamed from: c, reason: collision with root package name */
        public final int f359854c;

        public f(@InterfaceC37434x3 E e12, int i12) {
            this.f359853b = e12;
            this.f359854c = i12;
            F.b(i12, "count");
        }

        @Override // com.google.common.collect.InterfaceC37338g3.a
        @InterfaceC37434x3
        public final E a() {
            return this.f359853b;
        }

        @Override // com.google.common.collect.InterfaceC37338g3.a
        public final int getCount() {
            return this.f359854c;
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$g */
    public static final class g<E> implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC37338g3<E> f359855b;

        /* renamed from: c, reason: collision with root package name */
        public final Iterator<InterfaceC37338g3.a<E>> f359856c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public InterfaceC37338g3.a<E> f359857d;

        /* renamed from: e, reason: collision with root package name */
        public int f359858e;

        /* renamed from: f, reason: collision with root package name */
        public int f359859f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f359860g;

        public g(InterfaceC37338g3<E> interfaceC37338g3, Iterator<InterfaceC37338g3.a<E>> it) {
            this.f359855b = interfaceC37338g3;
            this.f359856c = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359858e > 0 || this.f359856c.hasNext();
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f359858e == 0) {
                InterfaceC37338g3.a<E> next = this.f359856c.next();
                this.f359857d = next;
                int count = next.getCount();
                this.f359858e = count;
                this.f359859f = count;
            }
            this.f359858e--;
            this.f359860g = true;
            InterfaceC37338g3.a<E> aVar = this.f359857d;
            Objects.requireNonNull(aVar);
            return aVar.a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            F.e(this.f359860g);
            if (this.f359859f == 1) {
                this.f359856c.remove();
            } else {
                InterfaceC37338g3.a<E> aVar = this.f359857d;
                Objects.requireNonNull(aVar);
                this.f359855b.remove(aVar.a());
            }
            this.f359859f--;
            this.f359860g = false;
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$h */
    public static class h<E> extends P0<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC37345h4 f359861b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Set<E> f359862c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Set<InterfaceC37338g3.a<E>> f359863d;

        public h(InterfaceC37345h4 interfaceC37345h4) {
            this.f359861b = interfaceC37345h4;
        }

        @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
        public final int O3(int i12, @I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
        public final boolean P2(int i12, @InterfaceC37434x3 Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean add(@InterfaceC37434x3 E e12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.P0, com.google.common.collect.B0
        /* renamed from: b0 */
        public InterfaceC37338g3<E> X() {
            return this.f359861b;
        }

        public Set<E> c0() {
            return Collections.unmodifiableSet(this.f359861b.k());
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
        public final Set<InterfaceC37338g3.a<E>> entrySet() {
            Set<InterfaceC37338g3.a<E>> set = this.f359863d;
            if (set != null) {
                return set;
            }
            Set<InterfaceC37338g3.a<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.f359861b.entrySet());
            this.f359863d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return C37325e2.n(this.f359861b.iterator());
        }

        @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
        public Set<E> k() {
            Set<E> set = this.f359862c;
            if (set != null) {
                return set;
            }
            Set<E> setC0 = c0();
            this.f359862c = setC0;
            return setC0;
        }

        @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
        public final int p6(@InterfaceC37434x3 Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.P0, com.google.common.collect.InterfaceC37338g3
        public final int add(int i12, @InterfaceC37434x3 Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: Multisets.java */
    /* renamed from: com.google.common.collect.m3$i */
    public static abstract class i<E> extends AbstractC37352j<E> {
        public i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            k().clear();
        }

        @Override // com.google.common.collect.AbstractC37352j
        public int e() {
            return k().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return C37374m3.c(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            long count = 0;
            while (entrySet().iterator().hasNext()) {
                count += r0.next().getCount();
            }
            return com.google.common.primitives.l.f(count);
        }

        public /* synthetic */ i(C37344h3 c37344h3) {
            this();
        }
    }

    public static boolean a(InterfaceC37338g3<?> interfaceC37338g3, @I41.a Object obj) {
        if (obj == interfaceC37338g3) {
            return true;
        }
        if (obj instanceof InterfaceC37338g3) {
            InterfaceC37338g3 interfaceC37338g32 = (InterfaceC37338g3) obj;
            if (interfaceC37338g3.size() == interfaceC37338g32.size() && interfaceC37338g3.entrySet().size() == interfaceC37338g32.entrySet().size()) {
                for (InterfaceC37338g3.a aVar : interfaceC37338g32.entrySet()) {
                    if (interfaceC37338g3.S5(aVar.a()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static InterfaceC37338g3.a b(int i12, @InterfaceC37434x3 Object obj) {
        return new f(obj, i12);
    }

    public static <E> Iterator<E> c(InterfaceC37338g3<E> interfaceC37338g3) {
        return new g(interfaceC37338g3, interfaceC37338g3.entrySet().iterator());
    }
}
