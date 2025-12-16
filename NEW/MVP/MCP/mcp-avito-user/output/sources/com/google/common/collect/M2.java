package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.base.AbstractC37266j;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.C37325e2;
import com.google.common.collect.G;
import com.google.common.collect.InterfaceC37428w2;
import com.google.common.collect.W3;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: Maps.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class M2 {

    /* compiled from: Maps.java */
    public static class A<K, V> extends z<K, V> implements Set<Map.Entry<K, V>> {
        public A() {
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

    /* compiled from: Maps.java */
    @XY0.c
    public static class B<K, V> extends W0<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final NavigableMap<K, ? extends V> f359474b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient B<K, V> f359475c;

        public B(NavigableMap<K, ? extends V> navigableMap) {
            this.f359474b = navigableMap;
        }

        @Override // com.google.common.collect.W0, com.google.common.collect.M0, com.google.common.collect.S0
        public final Object X() {
            return Collections.unmodifiableSortedMap(this.f359474b);
        }

        @Override // com.google.common.collect.W0, com.google.common.collect.M0
        /* renamed from: Y */
        public final Map X() {
            return Collections.unmodifiableSortedMap(this.f359474b);
        }

        @Override // com.google.common.collect.W0
        /* renamed from: a0 */
        public final SortedMap<K, V> X() {
            return Collections.unmodifiableSortedMap(this.f359474b);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> ceilingEntry(@InterfaceC37434x3 K k12) {
            return M2.a(this.f359474b.ceilingEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K ceilingKey(@InterfaceC37434x3 K k12) {
            return this.f359474b.ceilingKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return W3.j(this.f359474b.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> descendingMap() {
            B<K, V> b12 = this.f359475c;
            if (b12 != null) {
                return b12;
            }
            B<K, V> b13 = new B<>(this.f359474b.descendingMap(), this);
            this.f359475c = b13;
            return b13;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> firstEntry() {
            return M2.a(this.f359474b.firstEntry());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> floorEntry(@InterfaceC37434x3 K k12) {
            return M2.a(this.f359474b.floorEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K floorKey(@InterfaceC37434x3 K k12) {
            return this.f359474b.floorKey(k12);
        }

        @Override // com.google.common.collect.W0, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap<K, V> headMap(@InterfaceC37434x3 K k12) {
            return headMap(k12, false);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> higherEntry(@InterfaceC37434x3 K k12) {
            return M2.a(this.f359474b.higherEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K higherKey(@InterfaceC37434x3 K k12) {
            return this.f359474b.higherKey(k12);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> lastEntry() {
            return M2.a(this.f359474b.lastEntry());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> lowerEntry(@InterfaceC37434x3 K k12) {
            return M2.a(this.f359474b.lowerEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K lowerKey(@InterfaceC37434x3 K k12) {
            return this.f359474b.lowerKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return W3.j(this.f359474b.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.W0, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap<K, V> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return subMap(k12, true, k13, false);
        }

        @Override // com.google.common.collect.W0, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap<K, V> tailMap(@InterfaceC37434x3 K k12) {
            return tailMap(k12, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> headMap(@InterfaceC37434x3 K k12, boolean z12) {
            NavigableMap<K, ? extends V> navigableMapHeadMap = this.f359474b.headMap(k12, z12);
            navigableMapHeadMap.getClass();
            return navigableMapHeadMap instanceof B ? navigableMapHeadMap : new B(navigableMapHeadMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> subMap(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            NavigableMap<K, ? extends V> navigableMapSubMap = this.f359474b.subMap(k12, z12, k13, z13);
            navigableMapSubMap.getClass();
            return navigableMapSubMap instanceof B ? navigableMapSubMap : new B(navigableMapSubMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> tailMap(@InterfaceC37434x3 K k12, boolean z12) {
            NavigableMap<K, ? extends V> navigableMapTailMap = this.f359474b.tailMap(k12, z12);
            navigableMapTailMap.getClass();
            return navigableMapTailMap instanceof B ? navigableMapTailMap : new B(navigableMapTailMap);
        }

        public B(NavigableMap<K, ? extends V> navigableMap, B<K, V> b12) {
            this.f359474b = navigableMap;
            this.f359475c = b12;
        }
    }

    /* compiled from: Maps.java */
    public static class C<V> implements InterfaceC37428w2.a<V> {
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof InterfaceC37428w2.a)) {
                return false;
            }
            ((InterfaceC37428w2.a) obj).getClass();
            return com.google.common.base.F.a(null, null) && com.google.common.base.F.a(null, null);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "(null, null)";
        }
    }

    /* compiled from: Maps.java */
    public static class D<K, V> extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f359476b;

        public D(Map<K, V> map) {
            map.getClass();
            this.f359476b = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f359476b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return this.f359476b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f359476b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new E2(this.f359476b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@I41.a Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                Map<K, V> map = this.f359476b;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (com.google.common.base.F.a(obj, entry.getValue())) {
                        map.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map<K, V> map = this.f359476b;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map<K, V> map = this.f359476b;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f359476b.size();
        }
    }

    /* compiled from: Maps.java */
    @XY0.b
    public static abstract class E<K, V> extends AbstractMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Set<Map.Entry<K, V>> f359477b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Set<K> f359478c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Collection<V> f359479d;

        public abstract Set<Map.Entry<K, V>> a();

        public Set<K> b() {
            return new o(this);
        }

        public Collection<V> c() {
            return new D(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f359477b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f359477b = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f359478c;
            if (set != null) {
                return set;
            }
            Set<K> setB = b();
            this.f359478c = setB;
            return setB;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f359479d;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionC = c();
            this.f359479d = collectionC;
            return collectionC;
        }
    }

    /* compiled from: Maps.java */
    /* renamed from: com.google.common.collect.M2$a, reason: case insensitive filesystem */
    public static abstract class AbstractC37293a<K, V> extends E<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public final SortedMap f359480e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f359481f;

        public AbstractC37293a(SortedMap sortedMap, com.google.common.base.N n12) {
            this.f359480e = sortedMap;
            this.f359481f = n12;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.base.N, java.lang.Object] */
        @Override // com.google.common.collect.M2.E
        public final Collection<V> c() {
            return new m(this, this.f359480e, this.f359481f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@I41.a Object obj) {
            SortedMap sortedMap = this.f359480e;
            return sortedMap.containsKey(obj) && d(obj, sortedMap.get(obj));
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.base.N, java.lang.Object] */
        public final boolean d(@I41.a Object obj, @InterfaceC37434x3 V v12) {
            return this.f359481f.apply(new C37384o1(obj, v12));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            V v12 = (V) this.f359480e.get(obj);
            if (v12 == null || !d(obj, v12)) {
                return null;
            }
            return v12;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
            com.google.common.base.M.g(d(k12, v12));
            return (V) this.f359480e.put(k12, v12);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                com.google.common.base.M.g(d(entry.getKey(), entry.getValue()));
            }
            this.f359480e.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V remove(@I41.a Object obj) {
            if (containsKey(obj)) {
                return (V) this.f359480e.remove(obj);
            }
            return null;
        }
    }

    /* compiled from: Maps.java */
    /* renamed from: com.google.common.collect.M2$b, reason: case insensitive filesystem */
    public static class C37294b<K, V> extends E<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public final Set<K> f359482e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC37276u<? super K, V> f359483f;

        /* compiled from: Maps.java */
        /* renamed from: com.google.common.collect.M2$b$a */
        public class a extends f<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.M2.f
            public final Map<K, V> e() {
                return C37294b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                C37294b c37294b = C37294b.this;
                return new F2(c37294b.d().iterator(), c37294b.f359483f);
            }
        }

        public C37294b(Set<K> set, InterfaceC37276u<? super K, V> interfaceC37276u) {
            set.getClass();
            this.f359482e = set;
            interfaceC37276u.getClass();
            this.f359483f = interfaceC37276u;
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<K, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.M2.E
        public final Set<K> b() {
            return new G2(d());
        }

        @Override // com.google.common.collect.M2.E
        public final Collection<V> c() {
            return new G.f(this.f359482e, this.f359483f);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return d().contains(obj);
        }

        public Set<K> d() {
            return this.f359482e;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            if (G.c(obj, d())) {
                return this.f359483f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V remove(@I41.a Object obj) {
            if (d().remove(obj)) {
                return this.f359483f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return d().size();
        }
    }

    /* compiled from: Maps.java */
    /* renamed from: com.google.common.collect.M2$c, reason: case insensitive filesystem */
    public static final class C37295c<A, B> extends AbstractC37266j<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.AbstractC37266j
        public final B b(A a12) {
            throw null;
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof C37295c)) {
                return false;
            }
            ((C37295c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Maps.asConverter(null)";
        }
    }

    /* compiled from: Maps.java */
    @XY0.c
    /* renamed from: com.google.common.collect.M2$d, reason: case insensitive filesystem */
    public static abstract class AbstractC37296d<K, V> extends M0<K, V> implements NavigableMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient AbstractC37429w3 f359485b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Set<Map.Entry<K, V>> f359486c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient NavigableSet<K> f359487d;

        @Override // com.google.common.collect.M0, com.google.common.collect.S0
        public final Object X() {
            return b0();
        }

        @Override // com.google.common.collect.M0
        /* renamed from: Y */
        public final Map<K, V> X() {
            return b0();
        }

        public abstract Iterator<Map.Entry<K, V>> a0();

        public abstract NavigableMap<K, V> b0();

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> ceilingEntry(@InterfaceC37434x3 K k12) {
            return b0().floorEntry(k12);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K ceilingKey(@InterfaceC37434x3 K k12) {
            return b0().floorKey(k12);
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            AbstractC37429w3 abstractC37429w3 = this.f359485b;
            if (abstractC37429w3 != null) {
                return abstractC37429w3;
            }
            Comparator<? super K> comparator = b0().comparator();
            if (comparator == null) {
                comparator = C37392p3.f359948d;
            }
            AbstractC37429w3 abstractC37429w3H = AbstractC37429w3.b(comparator).h();
            this.f359485b = abstractC37429w3H;
            return abstractC37429w3H;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return b0().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> descendingMap() {
            return b0();
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f359486c;
            if (set != null) {
                return set;
            }
            N2 n22 = new N2(this);
            this.f359486c = n22;
            return n22;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> firstEntry() {
            return b0().lastEntry();
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K firstKey() {
            return b0().lastKey();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> floorEntry(@InterfaceC37434x3 K k12) {
            return b0().ceilingEntry(k12);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K floorKey(@InterfaceC37434x3 K k12) {
            return b0().ceilingKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> headMap(@InterfaceC37434x3 K k12, boolean z12) {
            return b0().tailMap(k12, z12).descendingMap();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> higherEntry(@InterfaceC37434x3 K k12) {
            return b0().lowerEntry(k12);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K higherKey(@InterfaceC37434x3 K k12) {
            return b0().lowerKey(k12);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> lastEntry() {
            return b0().firstEntry();
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K lastKey() {
            return b0().firstKey();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> lowerEntry(@InterfaceC37434x3 K k12) {
            return b0().higherEntry(k12);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K lowerKey(@InterfaceC37434x3 K k12) {
            return b0().higherKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f359487d;
            if (navigableSet != null) {
                return navigableSet;
            }
            r rVar = new r(this);
            this.f359487d = rVar;
            return rVar;
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollFirstEntry() {
            return b0().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollLastEntry() {
            return b0().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> subMap(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            return b0().subMap(k13, z13, k12, z12).descendingMap();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> tailMap(@InterfaceC37434x3 K k12, boolean z12) {
            return b0().headMap(k12, z12).descendingMap();
        }

        @Override // com.google.common.collect.S0
        public final String toString() {
            return M2.k(this);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final Collection<V> values() {
            return new D(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap<K, V> headMap(@InterfaceC37434x3 K k12) {
            return headMap(k12, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap<K, V> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return subMap(k12, true, k13, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap<K, V> tailMap(@InterfaceC37434x3 K k12) {
            return tailMap(k12, true);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    /* renamed from: com.google.common.collect.M2$e, reason: case insensitive filesystem */
    public static abstract class EnumC37297e implements InterfaceC37276u<Map.Entry<?, ?>, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f359488b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f359489c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumC37297e[] f359490d;

        /* compiled from: Maps.java */
        /* renamed from: com.google.common.collect.M2$e$a */
        public enum a extends EnumC37297e {
            @Override // com.google.common.base.InterfaceC37276u
            @I41.a
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        }

        /* compiled from: Maps.java */
        /* renamed from: com.google.common.collect.M2$e$b */
        public enum b extends EnumC37297e {
            @Override // com.google.common.base.InterfaceC37276u
            @I41.a
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        }

        static {
            a aVar = new a("KEY", 0, null);
            f359488b = aVar;
            b bVar = new b("VALUE", 1, null);
            f359489c = bVar;
            f359490d = new EnumC37297e[]{aVar, bVar};
        }

        public EnumC37297e() {
            throw null;
        }

        public EnumC37297e(String str, int i12, D2 d22) {
        }

        public static EnumC37297e valueOf(String str) {
            return (EnumC37297e) Enum.valueOf(EnumC37297e.class, str);
        }

        public static EnumC37297e[] values() {
            return (EnumC37297e[]) f359490d.clone();
        }
    }

    /* compiled from: Maps.java */
    public static abstract class f<K, V> extends W3.g<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objJ = M2.j(e(), key);
            if (com.google.common.base.F.a(objJ, entry.getValue())) {
                return objJ != null || e().containsKey(key);
            }
            return false;
        }

        public abstract Map<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@I41.a Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return e().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return W3.h(collection, this);
            } catch (UnsupportedOperationException unused) {
                return W3.i(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(M2.c(collection.size()));
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return e().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    /* compiled from: Maps.java */
    public interface g<K, V1, V2> {
        @InterfaceC37434x3
        V2 a(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V1 v12);
    }

    /* compiled from: Maps.java */
    public static final class h<K, V> extends i<K, V> implements com.google.common.collect.A<K, V> {
        @Override // com.google.common.collect.A
        public final com.google.common.collect.A<V, K> O() {
            return null;
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Collection values() {
            throw null;
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Set<V> values() {
            throw null;
        }
    }

    /* compiled from: Maps.java */
    public static class i<K, V> extends AbstractC37293a<K, V> {

        /* renamed from: g, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f359491g;

        /* compiled from: Maps.java */
        public class a extends U0<Map.Entry<K, V>> {

            /* compiled from: Maps.java */
            /* renamed from: com.google.common.collect.M2$i$a$a, reason: collision with other inner class name */
            public class C10663a extends z4<Map.Entry<K, V>, Map.Entry<K, V>> {
                public C10663a(Iterator it) {
                    super(it);
                }

                @Override // com.google.common.collect.z4
                public final Object a(Object obj) {
                    return new P2(this, (Map.Entry) obj);
                }
            }

            public a(D2 d22) {
            }

            @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
            public final Object X() {
                return i.this.f359491g;
            }

            @Override // com.google.common.collect.U0, com.google.common.collect.B0
            /* renamed from: Y */
            public final Collection X() {
                return i.this.f359491g;
            }

            @Override // com.google.common.collect.U0
            /* renamed from: b0 */
            public final Set<Map.Entry<K, V>> X() {
                return i.this.f359491g;
            }

            @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
            public final Iterator<Map.Entry<K, V>> iterator() {
                return new C10663a(i.this.f359491g.iterator());
            }
        }

        /* compiled from: Maps.java */
        public class b extends o<K, V> {
            public b() {
                super(i.this);
            }

            @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                i iVar = i.this;
                if (!iVar.containsKey(obj)) {
                    return false;
                }
                iVar.f359480e.remove(obj);
                return true;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.N, java.lang.Object] */
            @Override // com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                i iVar = i.this;
                return i.e(iVar.f359480e, iVar.f359481f, collection);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.N, java.lang.Object] */
            @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                i iVar = i.this;
                return i.f(iVar.f359480e, iVar.f359481f, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final Object[] toArray() {
                return C37423v2.b(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final <T> T[] toArray(T[] tArr) {
                return (T[]) C37423v2.b(iterator()).toArray(tArr);
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.base.N, java.lang.Object] */
        public i(SortedMap sortedMap, com.google.common.base.N n12) {
            super(sortedMap, n12);
            this.f359491g = W3.d(sortedMap.entrySet(), this.f359481f);
        }

        public static <K, V> boolean e(Map<K, V> map, com.google.common.base.N<? super Map.Entry<K, V>> n12, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (n12.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
        }

        public static <K, V> boolean f(Map<K, V> map, com.google.common.base.N<? super Map.Entry<K, V>> n12, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (n12.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<K, V>> a() {
            return new a(null);
        }

        @Override // com.google.common.collect.M2.E
        public Set<K> b() {
            return new b();
        }
    }

    /* compiled from: Maps.java */
    @XY0.c
    public static class j<K, V> extends AbstractC37358k<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final NavigableMap<K, V> f359495b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.common.base.N<? super Map.Entry<K, V>> f359496c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<K, V> f359497d;

        /* compiled from: Maps.java */
        public class a extends r<K, V> {
            public a(NavigableMap navigableMap) {
                super(navigableMap);
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection<?> collection) {
                j jVar = j.this;
                return i.e(jVar.f359495b, jVar.f359496c, collection);
            }

            @Override // com.google.common.collect.W3.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection<?> collection) {
                j jVar = j.this;
                return i.f(jVar.f359495b, jVar.f359496c, collection);
            }
        }

        public j(NavigableMap<K, V> navigableMap, com.google.common.base.N<? super Map.Entry<K, V>> n12) {
            navigableMap.getClass();
            this.f359495b = navigableMap;
            this.f359496c = n12;
            this.f359497d = new i(navigableMap, n12);
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<K, V>> a() {
            return C37325e2.e(this.f359495b.entrySet().iterator(), this.f359496c);
        }

        @Override // com.google.common.collect.AbstractC37358k
        public final Iterator<Map.Entry<K, V>> b() {
            return C37325e2.e(this.f359495b.descendingMap().entrySet().iterator(), this.f359496c);
        }

        @Override // com.google.common.collect.M2.n, java.util.AbstractMap, java.util.Map
        public final void clear() {
            ((AbstractMap) this.f359497d).clear();
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            return this.f359495b.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return ((AbstractC37293a) this.f359497d).containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC37358k, java.util.NavigableMap
        public final NavigableMap<K, V> descendingMap() {
            return M2.e(this.f359495b.descendingMap(), this.f359496c);
        }

        @Override // com.google.common.collect.M2.n, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set<Map.Entry<K, V>> entrySet() {
            return ((E) this.f359497d).entrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            return (V) ((AbstractC37293a) this.f359497d).get(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> headMap(@InterfaceC37434x3 K k12, boolean z12) {
            return M2.e(this.f359495b.headMap(k12, z12), this.f359496c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return !W1.b(this.f359495b.entrySet(), this.f359496c);
        }

        @Override // com.google.common.collect.AbstractC37358k, java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // com.google.common.collect.AbstractC37358k, java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) W1.e(this.f359495b.entrySet(), this.f359496c);
        }

        @Override // com.google.common.collect.AbstractC37358k, java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) W1.e(this.f359495b.descendingMap().entrySet(), this.f359496c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
            return (V) ((AbstractC37293a) this.f359497d).put(k12, v12);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map<? extends K, ? extends V> map) {
            ((AbstractC37293a) this.f359497d).putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V remove(@I41.a Object obj) {
            return (V) ((AbstractC37293a) this.f359497d).remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return ((AbstractMap) this.f359497d).size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> subMap(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            return M2.e(this.f359495b.subMap(k12, z12, k13, z13), this.f359496c);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> tailMap(@InterfaceC37434x3 K k12, boolean z12) {
            return M2.e(this.f359495b.tailMap(k12, z12), this.f359496c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Collection<V> values() {
            return new m(this, this.f359495b, this.f359496c);
        }
    }

    /* compiled from: Maps.java */
    public static class k<K, V> extends i<K, V> implements SortedMap<K, V> {

        /* compiled from: Maps.java */
        public class a extends i<K, V>.b implements SortedSet<K> {
            public a() {
                super();
            }

            @Override // java.util.SortedSet
            @I41.a
            public final Comparator<? super K> comparator() {
                return k.this.f359480e.comparator();
            }

            @Override // java.util.SortedSet
            @InterfaceC37434x3
            public final K first() {
                return (K) k.this.firstKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet<K> headSet(@InterfaceC37434x3 K k12) {
                return (SortedSet) ((k) k.this.headMap(k12)).keySet();
            }

            @Override // java.util.SortedSet
            @InterfaceC37434x3
            public final K last() {
                return (K) k.this.lastKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet<K> subSet(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
                return (SortedSet) ((k) k.this.subMap(k12, k13)).keySet();
            }

            @Override // java.util.SortedSet
            public final SortedSet<K> tailSet(@InterfaceC37434x3 K k12) {
                return (SortedSet) ((k) k.this.tailMap(k12)).keySet();
            }
        }

        public k() {
            throw null;
        }

        @Override // com.google.common.collect.M2.i, com.google.common.collect.M2.E
        public final Set b() {
            return new a();
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            return this.f359480e.comparator();
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K firstKey() {
            return (K) ((SortedSet) super.keySet()).iterator().next();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.google.common.base.N, java.lang.Object] */
        @Override // java.util.SortedMap
        public final SortedMap<K, V> headMap(@InterfaceC37434x3 K k12) {
            return new k(this.f359480e.headMap(k12), this.f359481f);
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K lastKey() {
            SortedMap<K, V> sortedMap = this.f359480e;
            SortedMap<K, V> sortedMapHeadMap = sortedMap;
            while (true) {
                K kLastKey = sortedMapHeadMap.lastKey();
                if (d(kLastKey, sortedMap.get(kLastKey))) {
                    return kLastKey;
                }
                sortedMapHeadMap = sortedMap.headMap(kLastKey);
            }
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.base.N, java.lang.Object] */
        @Override // java.util.SortedMap
        public final SortedMap<K, V> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return new k(this.f359480e.subMap(k12, k13), this.f359481f);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.google.common.base.N, java.lang.Object] */
        @Override // java.util.SortedMap
        public final SortedMap<K, V> tailMap(@InterfaceC37434x3 K k12) {
            return new k(this.f359480e.tailMap(k12), this.f359481f);
        }
    }

    /* compiled from: Maps.java */
    public static class l<K, V> extends AbstractC37293a<K, V> {
        public l() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.base.N, java.lang.Object] */
        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<K, V>> a() {
            return W3.d(this.f359480e.entrySet(), this.f359481f);
        }

        @Override // com.google.common.collect.M2.E
        public final Set<K> b() {
            return W3.d(this.f359480e.keySet(), null);
        }

        @Override // com.google.common.collect.M2.AbstractC37293a, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            if (this.f359480e.containsKey(obj)) {
                throw null;
            }
            return false;
        }
    }

    /* compiled from: Maps.java */
    public static final class m<K, V> extends D<K, V> {

        /* renamed from: c, reason: collision with root package name */
        public final Map<K, V> f359500c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f359501d;

        public m(AbstractMap abstractMap, Map map, com.google.common.base.N n12) {
            super(abstractMap);
            this.f359500c = map;
            this.f359501d = n12;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.base.N, java.lang.Object] */
        @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f359500c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f359501d.apply(next) && com.google.common.base.F.a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.base.N, java.lang.Object] */
        @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f359500c.entrySet().iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f359501d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.base.N, java.lang.Object] */
        @Override // com.google.common.collect.M2.D, java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f359500c.entrySet().iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f359501d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
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

    /* compiled from: Maps.java */
    public static abstract class n<K, V> extends AbstractMap<K, V> {

        /* compiled from: Maps.java */
        public class a extends f<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.M2.f
            public final Map<K, V> e() {
                return n.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return n.this.a();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C37325e2.b(a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }
    }

    /* compiled from: Maps.java */
    public static class o<K, V> extends W3.g<K> {

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f359503b;

        public o(Map<K, V> map) {
            map.getClass();
            this.f359503b = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@I41.a Object obj) {
            return e().containsKey(obj);
        }

        public Map<K, V> e() {
            return this.f359503b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new D2(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@I41.a Object obj) {
            if (!contains(obj)) {
                return false;
            }
            e().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return e().size();
        }
    }

    /* compiled from: Maps.java */
    public static class p<K, V> implements InterfaceC37428w2<K, V> {
        @Override // com.google.common.collect.InterfaceC37428w2
        public Map<K, V> a() {
            return null;
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InterfaceC37428w2)) {
                return false;
            }
            ((InterfaceC37428w2) obj).a();
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null, null, null});
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: Maps.java */
    @XY0.c
    public static final class q<K, V> extends AbstractC37358k<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final NavigableSet<K> f359504b;

        public q(NavigableSet navigableSet) {
            navigableSet.getClass();
            this.f359504b = navigableSet;
            throw null;
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<K, V>> a() {
            return new F2(this.f359504b.iterator(), null);
        }

        @Override // com.google.common.collect.AbstractC37358k
        public final Iterator<Map.Entry<K, V>> b() {
            descendingMap();
            throw null;
        }

        @Override // com.google.common.collect.M2.n, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.f359504b.clear();
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            return this.f359504b.comparator();
        }

        @Override // com.google.common.collect.AbstractC37358k, java.util.NavigableMap
        public final NavigableMap<K, V> descendingMap() {
            new q(this.f359504b.descendingSet());
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V get(@I41.a Object obj) {
            if (G.c(obj, this.f359504b)) {
                throw null;
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> headMap(@InterfaceC37434x3 K k12, boolean z12) {
            new q(this.f359504b.headSet(k12, z12));
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37358k, java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return new I2(this.f359504b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f359504b.size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> subMap(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            new q(this.f359504b.subSet(k12, z12, k13, z13));
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V> tailMap(@InterfaceC37434x3 K k12, boolean z12) {
            new q(this.f359504b.tailSet(k12, z12));
            throw null;
        }
    }

    /* compiled from: Maps.java */
    public static class s<K, V> extends C37294b<K, V> implements SortedMap<K, V> {
        public s() {
            throw null;
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            return ((SortedSet) this.f359482e).comparator();
        }

        @Override // com.google.common.collect.M2.C37294b
        public final Set d() {
            return (SortedSet) this.f359482e;
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K firstKey() {
            return (K) ((SortedSet) this.f359482e).first();
        }

        @Override // java.util.SortedMap
        public final SortedMap<K, V> headMap(@InterfaceC37434x3 K k12) {
            return new s(((SortedSet) this.f359482e).headSet(k12), this.f359483f);
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Set<K> keySet() {
            return new H2((SortedSet) this.f359482e);
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K lastKey() {
            return (K) ((SortedSet) this.f359482e).last();
        }

        @Override // java.util.SortedMap
        public final SortedMap<K, V> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return new s(((SortedSet) this.f359482e).subSet(k12, k13), this.f359483f);
        }

        @Override // java.util.SortedMap
        public final SortedMap<K, V> tailMap(@InterfaceC37434x3 K k12) {
            return new s(((SortedSet) this.f359482e).tailSet(k12), this.f359483f);
        }
    }

    /* compiled from: Maps.java */
    public static class t<K, V> extends o<K, V> implements SortedSet<K> {
        public t() {
            throw null;
        }

        @Override // java.util.SortedSet
        @I41.a
        public final Comparator<? super K> comparator() {
            return e().comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final K first() {
            return e().firstKey();
        }

        @Override // com.google.common.collect.M2.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> e() {
            return (SortedMap) this.f359503b;
        }

        public SortedSet<K> headSet(@InterfaceC37434x3 K k12) {
            return new t(e().headMap(k12));
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final K last() {
            return e().lastKey();
        }

        public SortedSet<K> subSet(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return new t(e().subMap(k12, k13));
        }

        public SortedSet<K> tailSet(@InterfaceC37434x3 K k12) {
            return new t(e().tailMap(k12));
        }
    }

    /* compiled from: Maps.java */
    public static class u<K, V> extends p<K, V> implements InterfaceC37339g4<K, V> {
        @Override // com.google.common.collect.M2.p, com.google.common.collect.InterfaceC37428w2
        public final /* bridge */ /* synthetic */ Map a() {
            return null;
        }
    }

    /* compiled from: Maps.java */
    public static class v<K, V1, V2> extends n<K, V2> {

        /* renamed from: b, reason: collision with root package name */
        public final Map<K, V1> f359505b;

        /* renamed from: c, reason: collision with root package name */
        public final g<? super K, ? super V1, V2> f359506c;

        public v(Map<K, V1> map, g<? super K, ? super V1, V2> gVar) {
            map.getClass();
            this.f359505b = map;
            gVar.getClass();
            this.f359506c = gVar;
        }

        @Override // com.google.common.collect.M2.n
        public final Iterator<Map.Entry<K, V2>> a() {
            Iterator<Map.Entry<K, V1>> it = this.f359505b.entrySet().iterator();
            g<? super K, ? super V1, V2> gVar = this.f359506c;
            gVar.getClass();
            return new C37325e2.c(it, new C2(gVar));
        }

        @Override // com.google.common.collect.M2.n, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.f359505b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return this.f359505b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V2 get(@I41.a Object obj) {
            Map<K, V1> map = this.f359505b;
            V1 v12 = map.get(obj);
            if (v12 != null || map.containsKey(obj)) {
                return this.f359506c.a(obj, v12);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<K> keySet() {
            return this.f359505b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final V2 remove(@I41.a Object obj) {
            Map<K, V1> map = this.f359505b;
            if (!map.containsKey(obj)) {
                return null;
            }
            return this.f359506c.a(obj, map.remove(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f359505b.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V2> values() {
            return new D(this);
        }
    }

    /* compiled from: Maps.java */
    @XY0.c
    public static class w<K, V1, V2> extends x<K, V1, V2> implements NavigableMap<K, V2> {
        public w() {
            throw null;
        }

        @Override // com.google.common.collect.M2.x
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, V1> b() {
            return (NavigableMap) ((SortedMap) this.f359505b);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> ceilingEntry(@InterfaceC37434x3 K k12) {
            return d(b().ceilingEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K ceilingKey(@InterfaceC37434x3 K k12) {
            return b().ceilingKey(k12);
        }

        @I41.a
        public final Map.Entry<K, V2> d(@I41.a Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            g<? super K, ? super V1, V2> gVar = this.f359506c;
            gVar.getClass();
            return new B2(entry, gVar);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V2> descendingMap() {
            return new w(b().descendingMap(), this.f359506c);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> firstEntry() {
            return d(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> floorEntry(@InterfaceC37434x3 K k12) {
            return d(b().floorEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K floorKey(@InterfaceC37434x3 K k12) {
            return b().floorKey(k12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.M2.x, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(@InterfaceC37434x3 Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> higherEntry(@InterfaceC37434x3 K k12) {
            return d(b().higherEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K higherKey(@InterfaceC37434x3 K k12) {
            return b().higherKey(k12);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> lastEntry() {
            return d(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> lowerEntry(@InterfaceC37434x3 K k12) {
            return d(b().lowerEntry(k12));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K lowerKey(@InterfaceC37434x3 K k12) {
            return b().lowerKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> pollFirstEntry() {
            return d(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, V2> pollLastEntry() {
            return d(b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V2> subMap(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            return new w(b().subMap(k12, z12, k13, z13), this.f359506c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.M2.x, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(@InterfaceC37434x3 Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V2> headMap(@InterfaceC37434x3 K k12, boolean z12) {
            return new w(b().headMap(k12, z12), this.f359506c);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, V2> tailMap(@InterfaceC37434x3 K k12, boolean z12) {
            return new w(b().tailMap(k12, z12), this.f359506c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.M2.x, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(@InterfaceC37434x3 Object obj, @InterfaceC37434x3 Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    /* compiled from: Maps.java */
    public static class x<K, V1, V2> extends v<K, V1, V2> implements SortedMap<K, V2> {
        public x() {
            throw null;
        }

        public SortedMap<K, V1> b() {
            return (SortedMap) this.f359505b;
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K firstKey() {
            return b().firstKey();
        }

        public SortedMap<K, V2> headMap(@InterfaceC37434x3 K k12) {
            return new x(b().headMap(k12), this.f359506c);
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K lastKey() {
            return b().lastKey();
        }

        public SortedMap<K, V2> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return new x(b().subMap(k12, k13), this.f359506c);
        }

        public SortedMap<K, V2> tailMap(@InterfaceC37434x3 K k12) {
            return new x(b().tailMap(k12), this.f359506c);
        }
    }

    /* compiled from: Maps.java */
    public static class y<K, V> extends M0<K, V> implements com.google.common.collect.A<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Map<K, V> f359507b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.common.collect.A<? extends K, ? extends V> f359508c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        @RetainedWith
        @InterfaceC25601b
        public com.google.common.collect.A<V, K> f359509d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        @InterfaceC25601b
        public transient Set<V> f359510e;

        public y(com.google.common.collect.A<? extends K, ? extends V> a12, @I41.a com.google.common.collect.A<V, K> a13) {
            this.f359507b = Collections.unmodifiableMap(a12);
            this.f359508c = a12;
            this.f359509d = a13;
        }

        @Override // com.google.common.collect.A
        public final com.google.common.collect.A<V, K> O() {
            com.google.common.collect.A<V, K> a12 = this.f359509d;
            if (a12 != null) {
                return a12;
            }
            y yVar = new y(this.f359508c.O(), this);
            this.f359509d = yVar;
            return yVar;
        }

        @Override // com.google.common.collect.M0, com.google.common.collect.S0
        public final Object X() {
            return this.f359507b;
        }

        @Override // com.google.common.collect.M0
        /* renamed from: Y */
        public final Map<K, V> X() {
            return this.f359507b;
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final Set<V> values() {
            Set<V> set = this.f359510e;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.f359508c.values());
            this.f359510e = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    /* compiled from: Maps.java */
    public static class z<K, V> extends B0<Map.Entry<K, V>> {
        @Override // com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            return null;
        }

        @Override // com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection<Map.Entry<K, V>> X() {
            return null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C37414t3.c(this, tArr);
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final Object[] toArray() {
            return Z();
        }
    }

    public static Map.Entry a(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return new J2(entry);
    }

    public static <K, V> Map<K, V> b(Set<K> set, InterfaceC37276u<? super K, V> interfaceC37276u) {
        return new C37294b(set, interfaceC37276u);
    }

    public static int c(int i12) {
        if (i12 < 3) {
            F.b(i12, "expectedSize");
            return i12 + 1;
        }
        if (i12 < 1073741824) {
            return (int) Math.ceil(i12 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean d(Map<?, ?> map, @I41.a Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @XY0.c
    public static <K, V> NavigableMap<K, V> e(NavigableMap<K, V> navigableMap, com.google.common.base.N<? super Map.Entry<K, V>> n12) {
        n12.getClass();
        if (!(navigableMap instanceof j)) {
            navigableMap.getClass();
            return new j(navigableMap, n12);
        }
        j jVar = (j) navigableMap;
        return new j(jVar.f359495b, com.google.common.base.O.c(jVar.f359496c, n12));
    }

    public static AbstractC37412t1 f(H1 h12) {
        AbstractC37412t1.b bVar = new AbstractC37412t1.b(h12.size());
        Iterator<E> it = h12.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            bVar.c(it.next(), Integer.valueOf(i12));
            i12++;
        }
        return bVar.a(true);
    }

    @I41.a
    public static <K> K g(@I41.a Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K, V> LinkedHashMap<K, V> h() {
        return new LinkedHashMap<>();
    }

    public static boolean i(Map<?, ?> map, @I41.a Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @I41.a
    public static <V> V j(Map<?, V> map, @I41.a Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String k(Map<?, ?> map) {
        int size = map.size();
        F.b(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z12 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z12) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z12 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public static <K, V1, V2> Map<K, V2> l(Map<K, V1> map, InterfaceC37276u<? super V1, V2> interfaceC37276u) {
        interfaceC37276u.getClass();
        return new v(map, new L2(interfaceC37276u));
    }

    /* compiled from: Maps.java */
    @XY0.c
    public static class r<K, V> extends t<K, V> implements NavigableSet<K> {
        public r() {
            throw null;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K ceiling(@InterfaceC37434x3 K k12) {
            return (K) ((NavigableMap) this.f359503b).ceilingKey(k12);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return ((NavigableMap) this.f359503b).descendingKeySet();
        }

        @Override // com.google.common.collect.M2.t, com.google.common.collect.M2.o
        public final Map e() {
            return (NavigableMap) this.f359503b;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K floor(@InterfaceC37434x3 K k12) {
            return (K) ((NavigableMap) this.f359503b).floorKey(k12);
        }

        @Override // com.google.common.collect.M2.t
        /* renamed from: g */
        public final SortedMap e() {
            return (NavigableMap) this.f359503b;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(@InterfaceC37434x3 K k12, boolean z12) {
            return ((NavigableMap) this.f359503b).headMap(k12, z12).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K higher(@InterfaceC37434x3 K k12) {
            return (K) ((NavigableMap) this.f359503b).higherKey(k12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K lower(@InterfaceC37434x3 K k12) {
            return (K) ((NavigableMap) this.f359503b).lowerKey(k12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K pollFirst() {
            return (K) M2.g(((NavigableMap) this.f359503b).pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K pollLast() {
            return (K) M2.g(((NavigableMap) this.f359503b).pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            return ((NavigableMap) this.f359503b).subMap(k12, z12, k13, z13).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(@InterfaceC37434x3 K k12, boolean z12) {
            return ((NavigableMap) this.f359503b).tailMap(k12, z12).navigableKeySet();
        }

        @Override // com.google.common.collect.M2.t, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<K> headSet(@InterfaceC37434x3 K k12) {
            return headSet(k12, false);
        }

        @Override // com.google.common.collect.M2.t, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<K> subSet(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return subSet(k12, true, k13, false);
        }

        @Override // com.google.common.collect.M2.t, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet<K> tailSet(@InterfaceC37434x3 K k12) {
            return tailSet(k12, true);
        }
    }
}
