package com.google.common.collect;

import com.google.common.collect.C37326e3;
import com.google.common.collect.C37374m3;
import com.google.common.collect.InterfaceC37338g3;
import com.google.common.collect.M2;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: FilteredEntryMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37389p0<K, V> extends AbstractC37346i<K, V> implements InterfaceC37416u0<K, V> {

    /* compiled from: FilteredEntryMultimap.java */
    /* renamed from: com.google.common.collect.p0$a */
    public class a extends M2.E<K, Collection<V>> {

        /* compiled from: FilteredEntryMultimap.java */
        /* renamed from: com.google.common.collect.p0$a$a, reason: collision with other inner class name */
        public class C10676a extends M2.f<K, Collection<V>> {

            /* compiled from: FilteredEntryMultimap.java */
            /* renamed from: com.google.common.collect.p0$a$a$a, reason: collision with other inner class name */
            public class C10677a extends AbstractC37316d<Map.Entry<K, Collection<V>>> {
                @Override // com.google.common.collect.AbstractC37316d
                @I41.a
                public final Object a() {
                    throw null;
                }
            }

            public C10676a() {
            }

            @Override // com.google.common.collect.M2.f
            public final Map<K, Collection<V>> e() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                new C10677a();
                C37389p0.this.getClass();
                throw null;
            }

            @Override // com.google.common.collect.M2.f, com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                C37389p0 c37389p0 = C37389p0.this;
                com.google.common.base.O.f(collection);
                c37389p0.getClass();
                throw null;
            }

            @Override // com.google.common.collect.M2.f, com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                C37389p0 c37389p0 = C37389p0.this;
                com.google.common.base.O.f(collection);
                c37389p0.getClass();
                throw null;
            }

            @Override // com.google.common.collect.M2.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                iterator();
                throw null;
            }
        }

        /* compiled from: FilteredEntryMultimap.java */
        /* renamed from: com.google.common.collect.p0$a$b */
        public class b extends M2.o<K, Collection<V>> {
            public b() {
                super(a.this);
            }

            @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                C37389p0.this.getClass();
                throw null;
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                C37389p0 c37389p0 = C37389p0.this;
                com.google.common.base.O.d(com.google.common.base.O.f(collection), M2.EnumC37297e.f359488b);
                c37389p0.getClass();
                throw null;
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                C37389p0 c37389p0 = C37389p0.this;
                com.google.common.base.O.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)), M2.EnumC37297e.f359488b);
                c37389p0.getClass();
                throw null;
            }
        }

        /* compiled from: FilteredEntryMultimap.java */
        /* renamed from: com.google.common.collect.p0$a$c */
        public class c extends M2.D<K, Collection<V>> {
            public c() {
                super(a.this);
            }

            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean remove(@I41.a Object obj) {
                if (!(obj instanceof Collection)) {
                    return false;
                }
                C37389p0.this.getClass();
                throw null;
            }

            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean removeAll(Collection<?> collection) {
                C37389p0 c37389p0 = C37389p0.this;
                com.google.common.base.O.d(com.google.common.base.O.f(collection), M2.EnumC37297e.f359489c);
                c37389p0.getClass();
                throw null;
            }

            @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
            public final boolean retainAll(Collection<?> collection) {
                C37389p0 c37389p0 = C37389p0.this;
                com.google.common.base.O.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)), M2.EnumC37297e.f359489c);
                c37389p0.getClass();
                throw null;
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<K, Collection<V>>> a() {
            return new C10676a();
        }

        @Override // com.google.common.collect.M2.E
        public final Set<K> b() {
            return new b();
        }

        @Override // com.google.common.collect.M2.E
        public final Collection<Collection<V>> c() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            C37389p0.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            C37389p0.this.getClass();
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            C37389p0.this.getClass();
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object remove(@I41.a Object obj) {
            C37389p0.this.getClass();
            throw null;
        }
    }

    /* compiled from: FilteredEntryMultimap.java */
    /* renamed from: com.google.common.collect.p0$b */
    public class b extends C37326e3.g<K, V> {

        /* compiled from: FilteredEntryMultimap.java */
        /* renamed from: com.google.common.collect.p0$b$a */
        public class a extends C37374m3.d<K> {
            public a() {
            }

            @Override // com.google.common.collect.C37374m3.d
            public final InterfaceC37338g3<K> e() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<InterfaceC37338g3.a<K>> iterator() {
                return b.this.h();
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                com.google.common.base.O.f(collection);
                C37389p0.this.getClass();
                throw null;
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                com.google.common.base.O.f(collection);
                C37389p0.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return C37389p0.this.keySet().size();
            }
        }

        public b() {
            super(C37389p0.this);
        }

        @Override // com.google.common.collect.C37326e3.g, com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
        public final int O3(int i12, @I41.a Object obj) {
            F.b(i12, "occurrences");
            if (i12 == 0) {
                return S5(obj);
            }
            C37389p0.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
        public final Set<InterfaceC37338g3.a<K>> entrySet() {
            return new a();
        }
    }

    /* compiled from: FilteredEntryMultimap.java */
    /* renamed from: com.google.common.collect.p0$c */
    public final class c implements com.google.common.base.N<V> {
        public c() {
            throw null;
        }

        @Override // com.google.common.base.N
        public final boolean apply(@InterfaceC37434x3 V v12) {
            throw null;
        }
    }

    @Override // com.google.common.collect.InterfaceC37416u0
    public final com.google.common.base.N<? super Map.Entry<K, V>> T() {
        return null;
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    public Collection<V> a(@I41.a Object obj) {
        return (Collection) com.google.common.base.D.a(V().remove(obj), Collections.emptyList());
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Map<K, Collection<V>> c() {
        return new a();
    }

    @Override // com.google.common.collect.R2
    public final void clear() {
        b().clear();
    }

    @Override // com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        return V().get(obj) != null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public Collection<Map.Entry<K, V>> d() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Set<K> e() {
        return V().keySet();
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final InterfaceC37338g3<K> f() {
        return new b();
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection<V> g() {
        return new C37421v0(this);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public Collection<V> get(@InterfaceC37434x3 K k12) {
        throw null;
    }

    @Override // com.google.common.collect.InterfaceC37416u0
    public R2<K, V> h() {
        return null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Iterator<Map.Entry<K, V>> i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.R2
    public final int size() {
        return b().size();
    }
}
