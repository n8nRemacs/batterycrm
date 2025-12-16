package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.j2objc.annotations.Weak;
import com.yandex.mobile.ads.embedded.guava.collect.e;
import com.yandex.mobile.ads.embedded.guava.collect.e.a.C10965a;
import com.yandex.mobile.ads.embedded.guava.collect.m0;
import com.yandex.mobile.ads.impl.iu0;
import com.yandex.mobile.ads.impl.vp0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class x {

    public static abstract class a<K, V> extends m0.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            e.a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(@I41.a Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return e.a.this.isEmpty();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.m0.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                return m0.a((Set<?>) this, collection.iterator());
            }
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.m0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            int i12;
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    h.a(size, "expectedSize");
                    i12 = size + 1;
                } else {
                    i12 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i12);
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return e.a.this.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return e.a.this.f382715c.size();
        }
    }

    public static class b<K, V> extends m0.c<K> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        final Map<K, V> f382812a;

        public b(Map<K, V> map) {
            this.f382812a = (Map) iu0.a(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            return this.f382812a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f382812a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f382812a.size();
        }
    }

    public static class c<K, V> extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        final Map<K, V> f382813a;

        public c(Map<K, V> map) {
            this.f382813a = (Map) iu0.a(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f382813a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return this.f382813a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f382813a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new w(this.f382813a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f382813a.entrySet()) {
                    if (vp0.a(obj, entry.getValue())) {
                        this.f382813a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f382813a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f382813a.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f382813a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f382813a.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f382813a.size();
        }
    }

    public static abstract class d<K, V> extends AbstractMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @I41.a
        private transient Set<Map.Entry<K, V>> f382814a;

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        private transient Collection<V> f382815b;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f382814a;
            if (set != null) {
                return set;
            }
            e.a.C10965a c10965a = ((e.a) this).new C10965a();
            this.f382814a = c10965a;
            return c10965a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            Collection<V> collection = this.f382815b;
            if (collection != null) {
                return collection;
            }
            c cVar = new c(this);
            this.f382815b = cVar;
            return cVar;
        }
    }

    public static boolean a(Map<?, ?> map, @I41.a Object obj) {
        Iterator it = (Iterator) iu0.a(map.entrySet().iterator());
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }
}
