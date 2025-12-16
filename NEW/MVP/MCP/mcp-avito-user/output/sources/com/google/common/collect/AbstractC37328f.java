package com.google.common.collect;

import com.google.common.collect.AbstractC37346i;
import com.google.common.collect.C37325e2;
import com.google.common.collect.C37326e3;
import com.google.common.collect.M2;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: AbstractMapBasedMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37328f<K, V> extends AbstractC37346i<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: g, reason: collision with root package name */
    public transient Map<K, Collection<V>> f359734g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f359735h;

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$b */
    public class b extends AbstractC37328f<K, V>.d<Map.Entry<K, V>> {
        @Override // com.google.common.collect.AbstractC37328f.d
        public final Object a(@InterfaceC37434x3 Object obj, @InterfaceC37434x3 Object obj2) {
            return new C37384o1(obj, obj2);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$c */
    public class c extends M2.E<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f359736e;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.f$c$a */
        public class a extends M2.f<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.M2.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@I41.a Object obj) {
                return G.c(obj, c.this.f359736e.entrySet());
            }

            @Override // com.google.common.collect.M2.f
            public final Map<K, Collection<V>> e() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.M2.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC37328f abstractC37328f = AbstractC37328f.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = abstractC37328f.f359734g;
                map.getClass();
                try {
                    collectionRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collectionRemove = null;
                }
                Collection<V> collection = collectionRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                abstractC37328f.f359735h -= size;
                return true;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.f$c$b */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f359739b;

            /* renamed from: c, reason: collision with root package name */
            @I41.a
            public Collection<V> f359740c;

            public b() {
                this.f359739b = c.this.f359736e.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f359739b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f359739b.next();
                this.f359740c = next.getValue();
                return c.this.d(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359740c != null);
                this.f359739b.remove();
                AbstractC37328f.this.f359735h -= this.f359740c.size();
                this.f359740c.clear();
                this.f359740c = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.f359736e = map;
        }

        @Override // com.google.common.collect.M2.E
        public final Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            AbstractC37328f abstractC37328f = AbstractC37328f.this;
            if (this.f359736e == abstractC37328f.f359734g) {
                abstractC37328f.clear();
            } else {
                C37325e2.b(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            return M2.i(this.f359736e, obj);
        }

        public final Map.Entry<K, Collection<V>> d(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return new C37384o1(key, AbstractC37328f.this.s(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@I41.a Object obj) {
            return this == obj || this.f359736e.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            Collection<V> collection = (Collection) M2.j(this.f359736e, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC37328f.this.s(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f359736e.hashCode();
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC37328f.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object remove(@I41.a Object obj) {
            Collection<V> collectionRemove = this.f359736e.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            AbstractC37328f abstractC37328f = AbstractC37328f.this;
            Collection<V> collectionK = abstractC37328f.k();
            collectionK.addAll(collectionRemove);
            abstractC37328f.f359735h -= collectionRemove.size();
            collectionRemove.clear();
            return collectionK;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f359736e.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f359736e.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$d */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f359742b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public K f359743c = null;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public Collection<V> f359744d = null;

        /* renamed from: e, reason: collision with root package name */
        public Iterator<V> f359745e = C37325e2.f.f359715b;

        public d() {
            this.f359742b = AbstractC37328f.this.f359734g.entrySet().iterator();
        }

        public abstract T a(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359742b.hasNext() || this.f359745e.hasNext();
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final T next() {
            if (!this.f359745e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f359742b.next();
                this.f359743c = next.getKey();
                Collection<V> value = next.getValue();
                this.f359744d = value;
                this.f359745e = value.iterator();
            }
            return a(this.f359743c, this.f359745e.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f359745e.remove();
            Collection<V> collection = this.f359744d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f359742b.remove();
            }
            AbstractC37328f abstractC37328f = AbstractC37328f.this;
            abstractC37328f.f359735h--;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$e */
    public class e extends M2.o<K, Collection<V>> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.f$e$a */
        public class a implements Iterator<K> {

            /* renamed from: b, reason: collision with root package name */
            @I41.a
            public Map.Entry<K, Collection<V>> f359748b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f359749c;

            public a(Iterator it) {
                this.f359749c = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f359749c.hasNext();
            }

            @Override // java.util.Iterator
            @InterfaceC37434x3
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f359749c.next();
                this.f359748b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.google.common.base.M.n("no calls to next() since the last call to remove()", this.f359748b != null);
                Collection<V> value = this.f359748b.getValue();
                this.f359749c.remove();
                e eVar = e.this;
                AbstractC37328f.this.f359735h -= value.size();
                value.clear();
                this.f359748b = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C37325e2.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f359503b.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            return this == obj || this.f359503b.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f359503b.keySet().hashCode();
        }

        @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f359503b.entrySet().iterator());
        }

        @Override // com.google.common.collect.M2.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            int size;
            Collection collection = (Collection) this.f359503b.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractC37328f.this.f359735h -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$f, reason: collision with other inner class name */
    public class C10669f extends AbstractC37328f<K, V>.i implements NavigableMap<K, Collection<V>> {
        public C10669f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractC37328f.i, com.google.common.collect.M2.E
        public final Set b() {
            return new g(g());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> ceilingEntry(@InterfaceC37434x3 K k12) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = g().ceilingEntry(k12);
            if (entryCeilingEntry == null) {
                return null;
            }
            return d(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K ceilingKey(@InterfaceC37434x3 K k12) {
            return g().ceilingKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C10669f(g().descendingMap());
        }

        @Override // com.google.common.collect.AbstractC37328f.i
        /* renamed from: e */
        public final SortedSet b() {
            return new g(g());
        }

        @Override // com.google.common.collect.AbstractC37328f.i
        /* renamed from: f */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = g().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return d(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> floorEntry(@InterfaceC37434x3 K k12) {
            Map.Entry<K, Collection<V>> entryFloorEntry = g().floorEntry(k12);
            if (entryFloorEntry == null) {
                return null;
            }
            return d(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K floorKey(@InterfaceC37434x3 K k12) {
            return g().floorKey(k12);
        }

        @I41.a
        public final Map.Entry<K, Collection<V>> h(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            AbstractC37328f abstractC37328f = AbstractC37328f.this;
            Collection<V> collectionK = abstractC37328f.k();
            collectionK.addAll(next.getValue());
            it.remove();
            return new C37384o1(next.getKey(), abstractC37328f.q(collectionK));
        }

        @Override // com.google.common.collect.AbstractC37328f.i, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(@InterfaceC37434x3 Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> higherEntry(@InterfaceC37434x3 K k12) {
            Map.Entry<K, Collection<V>> entryHigherEntry = g().higherEntry(k12);
            if (entryHigherEntry == null) {
                return null;
            }
            return d(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K higherKey(@InterfaceC37434x3 K k12) {
            return g().higherKey(k12);
        }

        @Override // com.google.common.collect.AbstractC37328f.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) ((SortedMap) this.f359736e);
        }

        @Override // com.google.common.collect.AbstractC37328f.i, com.google.common.collect.AbstractC37328f.c, com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = g().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return d(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> lowerEntry(@InterfaceC37434x3 K k12) {
            Map.Entry<K, Collection<V>> entryLowerEntry = g().lowerEntry(k12);
            if (entryLowerEntry == null) {
                return null;
            }
            return d(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K lowerKey(@InterfaceC37434x3 K k12) {
            return g().lowerKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return h(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return h(((M2.E) descendingMap()).entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC37328f.i, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(@InterfaceC37434x3 Object obj, @InterfaceC37434x3 Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractC37328f.i, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(@InterfaceC37434x3 Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(@InterfaceC37434x3 K k12, boolean z12) {
            return new C10669f(g().headMap(k12, z12));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            return new C10669f(g().subMap(k12, z12, k13, z13));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(@InterfaceC37434x3 K k12, boolean z12) {
            return new C10669f(g().tailMap(k12, z12));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$g */
    public class g extends AbstractC37328f<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K ceiling(@InterfaceC37434x3 K k12) {
            return g().ceilingKey(k12);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((e) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new g(g().descendingMap());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K floor(@InterfaceC37434x3 K k12) {
            return g().floorKey(k12);
        }

        @Override // com.google.common.collect.AbstractC37328f.j
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) ((SortedMap) this.f359503b);
        }

        @Override // com.google.common.collect.AbstractC37328f.j, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(@InterfaceC37434x3 Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K higher(@InterfaceC37434x3 K k12) {
            return g().higherKey(k12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K lower(@InterfaceC37434x3 K k12) {
            return g().lowerKey(k12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K pollFirst() {
            return (K) C37325e2.j(iterator());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K pollLast() {
            return (K) C37325e2.j(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractC37328f.j, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(@InterfaceC37434x3 Object obj, @InterfaceC37434x3 Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractC37328f.j, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(@InterfaceC37434x3 Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(@InterfaceC37434x3 K k12, boolean z12) {
            return new g(g().headMap(k12, z12));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(@InterfaceC37434x3 K k12, boolean z12, @InterfaceC37434x3 K k13, boolean z13) {
            return new g(g().subMap(k12, z12, k13, z13));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(@InterfaceC37434x3 K k12, boolean z12) {
            return new g(g().tailMap(k12, z12));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$h */
    public class h extends AbstractC37328f<K, V>.l implements RandomAccess {
        public h() {
            throw null;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$i */
    public class i extends AbstractC37328f<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public SortedSet<K> f359753g;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // com.google.common.collect.M2.E
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> b() {
            return new j(g());
        }

        @Override // com.google.common.collect.AbstractC37328f.c, com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f359753g;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetB = b();
            this.f359753g = sortedSetB;
            return sortedSetB;
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K firstKey() {
            return g().firstKey();
        }

        public SortedMap<K, Collection<V>> g() {
            return (SortedMap) this.f359736e;
        }

        public SortedMap<K, Collection<V>> headMap(@InterfaceC37434x3 K k12) {
            return new i(g().headMap(k12));
        }

        @Override // java.util.SortedMap
        @InterfaceC37434x3
        public final K lastKey() {
            return g().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return new i(g().subMap(k12, k13));
        }

        public SortedMap<K, Collection<V>> tailMap(@InterfaceC37434x3 K k12) {
            return new i(g().tailMap(k12));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$j */
    public class j extends AbstractC37328f<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        @I41.a
        public final Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final K first() {
            return g().firstKey();
        }

        public SortedMap<K, Collection<V>> g() {
            return (SortedMap) this.f359503b;
        }

        public SortedSet<K> headSet(@InterfaceC37434x3 K k12) {
            return new j(g().headMap(k12));
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final K last() {
            return g().lastKey();
        }

        public SortedSet<K> subSet(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
            return new j(g().subMap(k12, k13));
        }

        public SortedSet<K> tailSet(@InterfaceC37434x3 K k12) {
            return new j(g().tailMap(k12));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$m */
    public class m extends AbstractC37328f<K, V>.o implements NavigableSet<V> {
        public m(@InterfaceC37434x3 K k12, NavigableSet<V> navigableSet, @I41.a AbstractC37328f<K, V>.k kVar) {
            super(k12, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final V ceiling(@InterfaceC37434x3 V v12) {
            return g().ceiling(v12);
        }

        @Override // java.util.NavigableSet
        public final Iterator<V> descendingIterator() {
            return new k.a(g().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> descendingSet() {
            return i(g().descendingSet());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final V floor(@InterfaceC37434x3 V v12) {
            return g().floor(v12);
        }

        @Override // com.google.common.collect.AbstractC37328f.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final NavigableSet<V> g() {
            return (NavigableSet) ((SortedSet) this.f359757c);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> headSet(@InterfaceC37434x3 V v12, boolean z12) {
            return i(g().headSet(v12, z12));
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final V higher(@InterfaceC37434x3 V v12) {
            return g().higher(v12);
        }

        public final NavigableSet<V> i(NavigableSet<V> navigableSet) {
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar == null) {
                kVar = this;
            }
            return new m(this.f359756b, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final V lower(@InterfaceC37434x3 V v12) {
            return g().lower(v12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final V pollFirst() {
            return (V) C37325e2.j(iterator());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final V pollLast() {
            return (V) C37325e2.j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> subSet(@InterfaceC37434x3 V v12, boolean z12, @InterfaceC37434x3 V v13, boolean z13) {
            return i(g().subSet(v12, z12, v13, z13));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<V> tailSet(@InterfaceC37434x3 V v12, boolean z12) {
            return i(g().tailSet(v12, z12));
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$n */
    public class n extends AbstractC37328f<K, V>.k implements Set<V> {
        public n(@InterfaceC37434x3 K k12, Set<V> set) {
            super(k12, set, null);
        }

        @Override // com.google.common.collect.AbstractC37328f.k, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zH2 = W3.h(collection, (Set) this.f359757c);
            if (zH2) {
                int size2 = this.f359757c.size();
                AbstractC37328f.this.f359735h += size2 - size;
                e();
            }
            return zH2;
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$o */
    public class o extends AbstractC37328f<K, V>.k implements SortedSet<V> {
        public o(@InterfaceC37434x3 K k12, SortedSet<V> sortedSet, @I41.a AbstractC37328f<K, V>.k kVar) {
            super(k12, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        @I41.a
        public final Comparator<? super V> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final V first() {
            d();
            return g().first();
        }

        public SortedSet<V> g() {
            return (SortedSet) this.f359757c;
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> headSet(@InterfaceC37434x3 V v12) {
            d();
            SortedSet<V> sortedSetHeadSet = g().headSet(v12);
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar == null) {
                kVar = this;
            }
            return new o(this.f359756b, sortedSetHeadSet, kVar);
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final V last() {
            d();
            return g().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> subSet(@InterfaceC37434x3 V v12, @InterfaceC37434x3 V v13) {
            d();
            SortedSet<V> sortedSetSubSet = g().subSet(v12, v13);
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar == null) {
                kVar = this;
            }
            return new o(this.f359756b, sortedSetSubSet, kVar);
        }

        @Override // java.util.SortedSet
        public final SortedSet<V> tailSet(@InterfaceC37434x3 V v12) {
            d();
            SortedSet<V> sortedSetTailSet = g().tailSet(v12);
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar == null) {
                kVar = this;
            }
            return new o(this.f359756b, sortedSetTailSet, kVar);
        }
    }

    public AbstractC37328f(Map<K, Collection<V>> map) {
        com.google.common.base.M.g(map.isEmpty());
        this.f359734g = map;
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    public Collection<V> a(@I41.a Object obj) {
        Collection<V> collectionRemove = this.f359734g.remove(obj);
        if (collectionRemove == null) {
            return o();
        }
        Collection collectionK = k();
        collectionK.addAll(collectionRemove);
        this.f359735h -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) q(collectionK);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public Map<K, Collection<V>> c() {
        return new c(this.f359734g);
    }

    @Override // com.google.common.collect.R2
    public void clear() {
        Iterator<Collection<V>> it = this.f359734g.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f359734g.clear();
        this.f359735h = 0;
    }

    @Override // com.google.common.collect.R2
    public boolean containsKey(@I41.a Object obj) {
        return this.f359734g.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection<Map.Entry<K, V>> d() {
        return this instanceof T3 ? new AbstractC37346i.b() : new AbstractC37346i.a();
    }

    @Override // com.google.common.collect.AbstractC37346i
    public Set<K> e() {
        return new e(this.f359734g);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final InterfaceC37338g3<K> f() {
        return new C37326e3.g(this);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection<V> g() {
        return new AbstractC37346i.c(this);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public Collection<V> get(@InterfaceC37434x3 K k12) {
        Collection<V> collectionL = this.f359734g.get(k12);
        if (collectionL == null) {
            collectionL = l(k12);
        }
        return s(k12, collectionL);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    public abstract Collection<V> k();

    public Collection<V> l(@InterfaceC37434x3 K k12) {
        return k();
    }

    public final Map<K, Collection<V>> m() {
        Map<K, Collection<V>> map = this.f359734g;
        return map instanceof NavigableMap ? new C10669f((NavigableMap) this.f359734g) : map instanceof SortedMap ? new i((SortedMap) this.f359734g) : new c(this.f359734g);
    }

    public final Set<K> n() {
        Map<K, Collection<V>> map = this.f359734g;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f359734g) : map instanceof SortedMap ? new j((SortedMap) this.f359734g) : new e(this.f359734g);
    }

    public Collection<V> o() {
        return (Collection<V>) q(k());
    }

    public final void p(Map<K, Collection<V>> map) {
        this.f359734g = map;
        this.f359735h = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.M.g(!collection.isEmpty());
            this.f359735h = collection.size() + this.f359735h;
        }
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        Collection<V> collection = this.f359734g.get(k12);
        if (collection != null) {
            if (!collection.add(v12)) {
                return false;
            }
            this.f359735h++;
            return true;
        }
        Collection<V> collectionL = l(k12);
        if (!collectionL.add(v12)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f359735h++;
        this.f359734g.put(k12, collectionL);
        return true;
    }

    public <E> Collection<E> q(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Iterator<V> r() {
        return new a();
    }

    public Collection<V> s(@InterfaceC37434x3 K k12, Collection<V> collection) {
        return new k(k12, collection, null);
    }

    @Override // com.google.common.collect.R2
    public int size() {
        return this.f359735h;
    }

    public final List<V> t(@InterfaceC37434x3 K k12, List<V> list, @I41.a AbstractC37328f<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k12, list, kVar) : new l(k12, list, kVar);
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$l */
    public class l extends AbstractC37328f<K, V>.k implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.f$l$a */
        public class a extends AbstractC37328f<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(@InterfaceC37434x3 V v12) {
                l lVar = l.this;
                boolean zIsEmpty = lVar.isEmpty();
                b().add(v12);
                AbstractC37328f.this.f359735h++;
                if (zIsEmpty) {
                    lVar.b();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.f359761b;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            @InterfaceC37434x3
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(@InterfaceC37434x3 V v12) {
                b().set(v12);
            }

            public a(int i12) {
                super(((List) l.this.f359757c).listIterator(i12));
            }
        }

        public l(@InterfaceC37434x3 K k12, List<V> list, @I41.a AbstractC37328f<K, V>.k kVar) {
            super(k12, list, kVar);
        }

        @Override // java.util.List
        public final void add(int i12, @InterfaceC37434x3 V v12) {
            d();
            boolean zIsEmpty = this.f359757c.isEmpty();
            ((List) this.f359757c).add(i12, v12);
            AbstractC37328f.this.f359735h++;
            if (zIsEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i12, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f359757c).addAll(i12, collection);
            if (zAddAll) {
                AbstractC37328f.this.f359735h += this.f359757c.size() - size;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        @InterfaceC37434x3
        public final V get(int i12) {
            d();
            return (V) ((List) this.f359757c).get(i12);
        }

        @Override // java.util.List
        public final int indexOf(@I41.a Object obj) {
            d();
            return ((List) this.f359757c).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            d();
            return ((List) this.f359757c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            d();
            return new a();
        }

        @Override // java.util.List
        @InterfaceC37434x3
        public final V remove(int i12) {
            d();
            V v12 = (V) ((List) this.f359757c).remove(i12);
            AbstractC37328f abstractC37328f = AbstractC37328f.this;
            abstractC37328f.f359735h--;
            e();
            return v12;
        }

        @Override // java.util.List
        @InterfaceC37434x3
        public final V set(int i12, @InterfaceC37434x3 V v12) {
            d();
            return (V) ((List) this.f359757c).set(i12, v12);
        }

        @Override // java.util.List
        public final List<V> subList(int i12, int i13) {
            d();
            List<V> listSubList = ((List) this.f359757c).subList(i12, i13);
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar == null) {
                kVar = this;
            }
            return AbstractC37328f.this.t(this.f359756b, listSubList, kVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i12) {
            d();
            return new a(i12);
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$k */
    public class k extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final K f359756b;

        /* renamed from: c, reason: collision with root package name */
        public Collection<V> f359757c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public final AbstractC37328f<K, V>.k f359758d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public final Collection<V> f359759e;

        public k(@InterfaceC37434x3 K k12, Collection<V> collection, @I41.a AbstractC37328f<K, V>.k kVar) {
            this.f359756b = k12;
            this.f359757c = collection;
            this.f359758d = kVar;
            this.f359759e = kVar == null ? null : kVar.f359757c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(@InterfaceC37434x3 V v12) {
            d();
            boolean zIsEmpty = this.f359757c.isEmpty();
            boolean zAdd = this.f359757c.add(v12);
            if (zAdd) {
                AbstractC37328f.this.f359735h++;
                if (zIsEmpty) {
                    b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f359757c.addAll(collection);
            if (zAddAll) {
                AbstractC37328f.this.f359735h += this.f359757c.size() - size;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        public final void b() {
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar != null) {
                kVar.b();
            } else {
                AbstractC37328f.this.f359734g.put(this.f359756b, this.f359757c);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f359757c.clear();
            AbstractC37328f.this.f359735h -= size;
            e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            d();
            return this.f359757c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            d();
            return this.f359757c.containsAll(collection);
        }

        public final void d() {
            Collection<V> collection;
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar != null) {
                kVar.d();
                if (kVar.f359757c != this.f359759e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f359757c.isEmpty() || (collection = AbstractC37328f.this.f359734g.get(this.f359756b)) == null) {
                    return;
                }
                this.f359757c = collection;
            }
        }

        public final void e() {
            AbstractC37328f<K, V>.k kVar = this.f359758d;
            if (kVar != null) {
                kVar.e();
            } else if (this.f359757c.isEmpty()) {
                AbstractC37328f.this.f359734g.remove(this.f359756b);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.f359757c.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.f359757c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            d();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            d();
            boolean zRemove = this.f359757c.remove(obj);
            if (zRemove) {
                AbstractC37328f abstractC37328f = AbstractC37328f.this;
                abstractC37328f.f359735h--;
                e();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f359757c.removeAll(collection);
            if (zRemoveAll) {
                AbstractC37328f.this.f359735h += this.f359757c.size() - size;
                e();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.f359757c.retainAll(collection);
            if (zRetainAll) {
                AbstractC37328f.this.f359735h += this.f359757c.size() - size;
                e();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.f359757c.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.f359757c.toString();
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: com.google.common.collect.f$k$a */
        public class a implements Iterator<V> {

            /* renamed from: b, reason: collision with root package name */
            public final Iterator<V> f359761b;

            /* renamed from: c, reason: collision with root package name */
            public final Collection<V> f359762c;

            public a() {
                Collection<V> collection = k.this.f359757c;
                this.f359762c = collection;
                this.f359761b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                k kVar = k.this;
                kVar.d();
                if (kVar.f359757c != this.f359762c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.f359761b.hasNext();
            }

            @Override // java.util.Iterator
            @InterfaceC37434x3
            public final V next() {
                a();
                return this.f359761b.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f359761b.remove();
                k kVar = k.this;
                AbstractC37328f abstractC37328f = AbstractC37328f.this;
                abstractC37328f.f359735h--;
                kVar.e();
            }

            public a(Iterator<V> it) {
                this.f359762c = k.this.f359757c;
                this.f359761b = it;
            }
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: com.google.common.collect.f$a */
    public class a extends AbstractC37328f<K, V>.d<V> {
        @Override // com.google.common.collect.AbstractC37328f.d
        @InterfaceC37434x3
        public final V a(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
            return v12;
        }
    }
}
