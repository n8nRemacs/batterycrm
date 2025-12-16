package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.embedded.guava.collect.u;
import com.yandex.mobile.ads.embedded.guava.collect.x;
import com.yandex.mobile.ads.impl.iu0;
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

/* loaded from: classes8.dex */
abstract class e<K, V> extends com.yandex.mobile.ads.embedded.guava.collect.g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f382713d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f382714e;

    public class a extends x.d<K, Collection<V>> {

        /* renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f382715c;

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$a$a, reason: collision with other inner class name */
        public class C10965a extends x.a<K, Collection<V>> {
            public C10965a() {
            }

            @Override // com.yandex.mobile.ads.embedded.guava.collect.x.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@I41.a Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = a.this.f382715c.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@I41.a Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                e.a(e.this, entry.getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f382718a;

            /* renamed from: b, reason: collision with root package name */
            @I41.a
            Collection<V> f382719b;

            public b() {
                this.f382718a = a.this.f382715c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f382718a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f382718a.next();
                this.f382719b = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                iu0.a("no calls to next() since the last call to remove()", this.f382719b != null);
                this.f382718a.remove();
                e.b(e.this, this.f382719b.size());
                this.f382719b.clear();
                this.f382719b = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.f382715c = map;
        }

        public final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            e eVar = e.this;
            Collection<V> value = entry.getValue();
            com.yandex.mobile.ads.embedded.guava.collect.c cVar = (com.yandex.mobile.ads.embedded.guava.collect.c) eVar;
            cVar.getClass();
            List list = (List) value;
            return new o(key, list instanceof RandomAccess ? new f(cVar, key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            if (this.f382715c == e.this.f382713d) {
                e.this.d();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            Map<K, Collection<V>> map = this.f382715c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@I41.a Object obj) {
            return this == obj || this.f382715c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object get(@I41.a Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f382715c;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            com.yandex.mobile.ads.embedded.guava.collect.c cVar = (com.yandex.mobile.ads.embedded.guava.collect.c) e.this;
            cVar.getClass();
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(cVar, obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f382715c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return e.this.b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final Object remove(@I41.a Object obj) {
            Collection<V> collectionRemove = this.f382715c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            List<V> list = ((b0) e.this).f382711f.get();
            list.addAll(collectionRemove);
            e.b(e.this, collectionRemove.size());
            collectionRemove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f382715c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f382715c.toString();
        }
    }

    public abstract class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f382721a;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        K f382722b = null;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        Collection<V> f382723c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator<V> f382724d = u.a.f382810a;

        public b() {
            this.f382721a = e.this.f382713d.entrySet().iterator();
        }

        public abstract T a(K k12, V v12);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f382721a.hasNext() || this.f382724d.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f382724d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f382721a.next();
                this.f382722b = next.getKey();
                Collection<V> value = next.getValue();
                this.f382723c = value;
                this.f382724d = value.iterator();
            }
            return a(this.f382722b, this.f382724d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f382724d.remove();
            Collection<V> collection = this.f382723c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f382721a.remove();
            }
            e.c(e.this);
        }
    }

    public class c extends x.b<K, Collection<V>> {

        public class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            @I41.a
            Map.Entry<K, Collection<V>> f382727a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f382728b;

            public a(Iterator it) {
                this.f382728b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f382728b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f382728b.next();
                this.f382727a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                iu0.a("no calls to next() since the last call to remove()", this.f382727a != null);
                Collection<V> value = this.f382727a.getValue();
                this.f382728b.remove();
                e.b(e.this, value.size());
                value.clear();
                this.f382727a = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f382812a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            return this == obj || this.f382812a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f382812a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f382812a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            int size;
            Collection collection = (Collection) this.f382812a.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                e.b(e.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class d extends e<K, V>.g implements NavigableMap<K, Collection<V>> {
        public d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g
        public final SortedSet a() {
            return new C10966e(c());
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g
        /* renamed from: b */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k12) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = c().ceilingEntry(k12);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K ceilingKey(K k12) {
            return c().ceilingKey(k12);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> c() {
            return (NavigableMap) ((SortedMap) this.f382715c);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(c().descendingMap());
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = c().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> floorEntry(K k12) {
            Map.Entry<K, Collection<V>> entryFloorEntry = c().floorEntry(k12);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K floorKey(K k12) {
            return c().floorKey(k12);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> higherEntry(K k12) {
            Map.Entry<K, Collection<V>> entryHigherEntry = c().higherEntry(k12);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K higherKey(K k12) {
            return c().higherKey(k12);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, com.yandex.mobile.ads.embedded.guava.collect.e.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = c().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> lowerEntry(K k12) {
            Map.Entry<K, Collection<V>> entryLowerEntry = c().lowerEntry(k12);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final K lowerKey(K k12) {
            return c().lowerKey(k12);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            Iterator<Map.Entry<K, Collection<V>>> it = entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = ((b0) e.this).f382711f.get();
            list.addAll(next.getValue());
            it.remove();
            K key = next.getKey();
            ((com.yandex.mobile.ads.embedded.guava.collect.c) e.this).getClass();
            return new o(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        @I41.a
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            Iterator<Map.Entry<K, V>> it = ((x.d) descendingMap()).entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, V> next = it.next();
            List<V> list = ((b0) e.this).f382711f.get();
            list.addAll((Collection) next.getValue());
            it.remove();
            K key = next.getKey();
            ((com.yandex.mobile.ads.embedded.guava.collect.c) e.this).getClass();
            return new o(key, Collections.unmodifiableList(list));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k12, boolean z12) {
            return new d(c().headMap(k12, z12));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k12, boolean z12, K k13, boolean z13) {
            return new d(c().subMap(k12, z12, k13, z13));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k12, boolean z12) {
            return new d(c().tailMap(k12, z12));
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.e$e, reason: collision with other inner class name */
    public class C10966e extends e<K, V>.h implements NavigableSet<K> {
        public C10966e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) ((SortedMap) this.f382812a);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K ceiling(K k12) {
            return b().ceilingKey(k12);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C10966e(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K floor(K k12) {
            return b().floorKey(k12);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K higher(K k12) {
            return b().higherKey(k12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K lower(K k12) {
            return b().lowerKey(k12);
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k12 = (K) aVar.next();
            aVar.remove();
            return k12;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final K pollLast() {
            Iterator<K> itDescendingIterator = descendingIterator();
            if (!itDescendingIterator.hasNext()) {
                return null;
            }
            K next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k12, boolean z12) {
            return new C10966e(b().headMap(k12, z12));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k12, boolean z12, K k13, boolean z13) {
            return new C10966e(b().subMap(k12, z12, k13, z13));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k12, boolean z12) {
            return new C10966e(b().tailMap(k12, z12));
        }
    }

    public class f extends e<K, V>.j implements RandomAccess {
        public f(e eVar, K k12, @I41.a List<V> list, e<K, V>.i iVar) {
            super(k12, list, iVar);
        }
    }

    public class g extends e<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        SortedSet<K> f382732e;

        public g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> a() {
            return new h(c());
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.e.a, java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f382732e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetA = a();
            this.f382732e = sortedSetA;
            return sortedSetA;
        }

        public SortedMap<K, Collection<V>> c() {
            return (SortedMap) this.f382715c;
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return c().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k12) {
            return new g(c().headMap(k12));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return c().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k12, K k13) {
            return new g(c().subMap(k12, k13));
        }

        public SortedMap<K, Collection<V>> tailMap(K k12) {
            return new g(c().tailMap(k12));
        }
    }

    public class h extends e<K, V>.c implements SortedSet<K> {
        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) this.f382812a;
        }

        @Override // java.util.SortedSet
        @I41.a
        public final Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k12) {
            return new h(b().headMap(k12));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k12, K k13) {
            return new h(b().subMap(k12, k13));
        }

        public SortedSet<K> tailSet(K k12) {
            return new h(b().tailMap(k12));
        }
    }

    public e(Map<K, Collection<V>> map) {
        iu0.a(map.isEmpty());
        this.f382713d = map;
    }

    public static /* synthetic */ void b(e eVar) {
        eVar.f382714e++;
    }

    public static /* synthetic */ void c(e eVar) {
        eVar.f382714e--;
    }

    public final void d() {
        Iterator<Collection<V>> it = this.f382713d.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f382713d.clear();
        this.f382714e = 0;
    }

    public final Map<K, Collection<V>> e() {
        Map<K, Collection<V>> map = this.f382713d;
        return map instanceof NavigableMap ? new d((NavigableMap) this.f382713d) : map instanceof SortedMap ? new g((SortedMap) this.f382713d) : new a(this.f382713d);
    }

    public final Set<K> f() {
        Map<K, Collection<V>> map = this.f382713d;
        return map instanceof NavigableMap ? new C10966e((NavigableMap) this.f382713d) : map instanceof SortedMap ? new h((SortedMap) this.f382713d) : new c(this.f382713d);
    }

    public final int g() {
        return this.f382714e;
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public boolean put(K k12, V v12) {
        Collection<V> collection = this.f382713d.get(k12);
        if (collection != null) {
            if (!collection.add(v12)) {
                return false;
            }
            this.f382714e++;
            return true;
        }
        List<V> list = ((b0) this).f382711f.get();
        if (!list.add(v12)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f382714e++;
        this.f382713d.put(k12, list);
        return true;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.g, com.yandex.mobile.ads.impl.ej0
    public final Collection<V> values() {
        return super.values();
    }

    public class i extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final K f382735a;

        /* renamed from: b, reason: collision with root package name */
        Collection<V> f382736b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        final e<K, V>.i f382737c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        final Collection<V> f382738d;

        public i(K k12, Collection<V> collection, @I41.a e<K, V>.i iVar) {
            this.f382735a = k12;
            this.f382736b = collection;
            this.f382737c = iVar;
            this.f382738d = iVar == null ? null : iVar.c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v12) {
            d();
            boolean zIsEmpty = this.f382736b.isEmpty();
            boolean zAdd = this.f382736b.add(v12);
            if (zAdd) {
                e.b(e.this);
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
            boolean zAddAll = this.f382736b.addAll(collection);
            if (zAddAll) {
                e.a(e.this, this.f382736b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        public final void b() {
            e<K, V>.i iVar = this.f382737c;
            if (iVar != null) {
                iVar.b();
            } else {
                e.this.f382713d.put(this.f382735a, this.f382736b);
            }
        }

        public final Collection<V> c() {
            return this.f382736b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f382736b.clear();
            e.b(e.this, size);
            e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            d();
            return this.f382736b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            d();
            return this.f382736b.containsAll(collection);
        }

        public final void d() {
            Collection<V> collection;
            e<K, V>.i iVar = this.f382737c;
            if (iVar != null) {
                iVar.d();
                if (this.f382737c.f382736b != this.f382738d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f382736b.isEmpty() || (collection = (Collection) e.this.f382713d.get(this.f382735a)) == null) {
                    return;
                }
                this.f382736b = collection;
            }
        }

        public final void e() {
            e<K, V>.i iVar = this.f382737c;
            if (iVar != null) {
                iVar.e();
            } else if (this.f382736b.isEmpty()) {
                e.this.f382713d.remove(this.f382735a);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.f382736b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.f382736b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            d();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            d();
            boolean zRemove = this.f382736b.remove(obj);
            if (zRemove) {
                e.c(e.this);
                e();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f382736b.removeAll(collection);
            if (zRemoveAll) {
                e.a(e.this, this.f382736b.size() - size);
                e();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.f382736b.retainAll(collection);
            if (zRetainAll) {
                e.a(e.this, this.f382736b.size() - size);
                e();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.f382736b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.f382736b.toString();
        }

        public class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<V> f382740a;

            /* renamed from: b, reason: collision with root package name */
            final Collection<V> f382741b;

            public a() {
                Collection<V> collection = i.this.f382736b;
                this.f382741b = collection;
                this.f382740a = e.a(collection);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                i.this.d();
                if (i.this.f382736b == this.f382741b) {
                    return this.f382740a.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                i.this.d();
                if (i.this.f382736b == this.f382741b) {
                    return this.f382740a.next();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f382740a.remove();
                e.c(e.this);
                i.this.e();
            }

            public a(ListIterator listIterator) {
                this.f382741b = i.this.f382736b;
                this.f382740a = listIterator;
            }
        }
    }

    public class j extends e<K, V>.i implements List<V> {

        public class a extends e<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            private ListIterator<V> a() {
                i.this.d();
                if (i.this.f382736b == this.f382741b) {
                    return (ListIterator) this.f382740a;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final void add(V v12) {
                boolean zIsEmpty = j.this.isEmpty();
                a().add(v12);
                e.b(e.this);
                if (zIsEmpty) {
                    j.this.b();
                }
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return a().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return a().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return a().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return a().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v12) {
                a().set(v12);
            }

            public a(int i12) {
                super(j.this.f().listIterator(i12));
            }
        }

        public j(K k12, List<V> list, @I41.a e<K, V>.i iVar) {
            super(k12, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i12, V v12) {
            d();
            boolean zIsEmpty = this.f382736b.isEmpty();
            ((List) this.f382736b).add(i12, v12);
            e.b(e.this);
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
            boolean zAddAll = ((List) this.f382736b).addAll(i12, collection);
            if (zAddAll) {
                e.a(e.this, this.f382736b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        public final List<V> f() {
            return (List) this.f382736b;
        }

        @Override // java.util.List
        public final V get(int i12) {
            d();
            return (V) ((List) this.f382736b).get(i12);
        }

        @Override // java.util.List
        public final int indexOf(@I41.a Object obj) {
            d();
            return ((List) this.f382736b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            d();
            return ((List) this.f382736b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            d();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i12) {
            d();
            V v12 = (V) ((List) this.f382736b).remove(i12);
            e.c(e.this);
            e();
            return v12;
        }

        @Override // java.util.List
        public final V set(int i12, V v12) {
            d();
            return (V) ((List) this.f382736b).set(i12, v12);
        }

        @Override // java.util.List
        public final List<V> subList(int i12, int i13) {
            d();
            e eVar = e.this;
            K k12 = this.f382735a;
            List listSubList = ((List) this.f382736b).subList(i12, i13);
            e<K, V>.i iVar = this.f382737c;
            if (iVar == null) {
                iVar = this;
            }
            eVar.getClass();
            return listSubList instanceof RandomAccess ? new f(eVar, k12, listSubList, iVar) : new j(k12, listSubList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i12) {
            d();
            return new a(i12);
        }
    }

    public static /* synthetic */ void a(e eVar, int i12) {
        eVar.f382714e += i12;
    }

    public static /* synthetic */ void b(e eVar, int i12) {
        eVar.f382714e -= i12;
    }

    public final Map<K, Collection<V>> c() {
        return this.f382713d;
    }

    public final void a(Map<K, Collection<V>> map) {
        this.f382713d = map;
        this.f382714e = 0;
        for (Collection<V> collection : map.values()) {
            iu0.a(!collection.isEmpty());
            this.f382714e = collection.size() + this.f382714e;
        }
    }

    public static Iterator a(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    public static void a(e eVar, Object obj) {
        Collection<V> collectionRemove;
        Map<K, Collection<V>> map = eVar.f382713d;
        map.getClass();
        try {
            collectionRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collectionRemove = null;
        }
        Collection<V> collection = collectionRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            eVar.f382714e -= size;
        }
    }
}
