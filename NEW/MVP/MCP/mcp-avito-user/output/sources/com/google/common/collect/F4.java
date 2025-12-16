package com.google.common.collect;

import com.google.common.collect.M2;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TreeRangeMap.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class F4<K extends Comparable, V> implements D3<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f359318b = new TreeMap();

    /* compiled from: TreeRangeMap.java */
    public class a implements D3<Comparable<?>, Object> {
        @Override // com.google.common.collect.D3
        public final Map<B3<Comparable<?>>, Object> a() {
            return Collections.emptyMap();
        }
    }

    /* compiled from: TreeRangeMap.java */
    public final class b extends M2.n<B3<K>, V> {

        /* renamed from: b, reason: collision with root package name */
        public final Collection f359319b;

        public b(Collection collection) {
            this.f359319b = collection;
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<B3<K>, V>> a() {
            return this.f359319b.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            get(obj);
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            if (!(obj instanceof B3) || ((c) F4.this.f359318b.get(((B3) obj).f359265b)) == null) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return F4.this.f359318b.size();
        }
    }

    /* compiled from: TreeRangeMap.java */
    public static final class c<K extends Comparable, V> extends AbstractC37340h<B3<K>, V> {
        public c() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return null;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return null;
        }
    }

    /* compiled from: TreeRangeMap.java */
    public class d implements D3<K, V> {

        /* compiled from: TreeRangeMap.java */
        public class a extends AbstractMap<B3<K>, V> {

            /* compiled from: TreeRangeMap.java */
            /* renamed from: com.google.common.collect.F4$d$a$a, reason: collision with other inner class name */
            public class C10658a extends M2.o<B3<K>, V> {
                public C10658a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(@I41.a Object obj) {
                    a.this.get(obj);
                    return false;
                }

                @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection<?> collection) {
                    a.a(a.this, com.google.common.base.O.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)), M2.EnumC37297e.f359488b));
                    throw null;
                }
            }

            /* compiled from: TreeRangeMap.java */
            public class b extends M2.f<B3<K>, V> {
                public b() {
                }

                @Override // com.google.common.collect.M2.f
                public final Map<B3<K>, V> e() {
                    return a.this;
                }

                @Override // com.google.common.collect.M2.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean isEmpty() {
                    a.this.b();
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator<Map.Entry<B3<K>, V>> iterator() {
                    a.this.b();
                    throw null;
                }

                @Override // com.google.common.collect.M2.f, com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection<?> collection) {
                    a.a(a.this, com.google.common.base.O.h(com.google.common.base.O.f(collection)));
                    throw null;
                }

                @Override // com.google.common.collect.M2.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    a.this.b();
                    throw null;
                }
            }

            /* compiled from: TreeRangeMap.java */
            public class c extends AbstractC37316d<Map.Entry<B3<K>, V>> {
                @Override // com.google.common.collect.AbstractC37316d
                @I41.a
                public final Object a() {
                    throw null;
                }
            }

            /* compiled from: TreeRangeMap.java */
            /* renamed from: com.google.common.collect.F4$d$a$d, reason: collision with other inner class name */
            public class C10659d extends M2.D<B3<K>, V> {
                public C10659d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    a.a(a.this, com.google.common.base.O.d(com.google.common.base.O.f(collection), M2.EnumC37297e.f359489c));
                    throw null;
                }

                @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    a.a(a.this, com.google.common.base.O.d(com.google.common.base.O.h(com.google.common.base.O.f(collection)), M2.EnumC37297e.f359489c));
                    throw null;
                }
            }

            public a() {
            }

            public static boolean a(a aVar, com.google.common.base.N n12) {
                new ArrayList();
                aVar.new b();
                aVar.b();
                throw null;
            }

            public Iterator<Map.Entry<B3<K>, V>> b() {
                d.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final void clear() {
                d.this.getClass();
                throw null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final boolean containsKey(@I41.a Object obj) {
                get(obj);
                return false;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final Set<Map.Entry<B3<K>, V>> entrySet() {
                return new b();
            }

            @Override // java.util.AbstractMap, java.util.Map
            @I41.a
            public final V get(@I41.a Object obj) {
                try {
                    if (!(obj instanceof B3)) {
                        return null;
                    }
                    d.this.getClass();
                    throw null;
                } catch (ClassCastException unused) {
                    return null;
                }
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final Set<B3<K>> keySet() {
                return new C10658a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            @I41.a
            public final V remove(@I41.a Object obj) {
                get(obj);
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final Collection<V> values() {
                return new C10659d(this);
            }
        }

        @Override // com.google.common.collect.D3
        public final Map<B3<K>, V> a() {
            return new a();
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof D3) {
                return new a().equals(((D3) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return new a().hashCode();
        }

        public final String toString() {
            return new a().toString();
        }
    }

    static {
        new a();
    }

    @Override // com.google.common.collect.D3
    public final Map<B3<K>, V> a() {
        return new b(this.f359318b.values());
    }

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof D3)) {
            return false;
        }
        return ((AbstractMap) a()).equals(((D3) obj).a());
    }

    public final int hashCode() {
        return ((AbstractMap) a()).hashCode();
    }

    public final String toString() {
        return this.f359318b.values().toString();
    }
}
