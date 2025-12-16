package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: AbstractBiMap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37304b<K, V> extends M0<K, V> implements A<K, V>, Serializable {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient Map<K, V> f359634b;

    /* renamed from: c, reason: collision with root package name */
    @RetainedWith
    public transient AbstractC37304b<V, K> f359635c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<K> f359636d;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<V> f359637e;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<Map.Entry<K, V>> f359638f;

    /* compiled from: AbstractBiMap.java */
    /* renamed from: com.google.common.collect.b$a */
    public class a extends N0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final Map.Entry<K, V> f359639b;

        public a(Map.Entry<K, V> entry) {
            this.f359639b = entry;
        }

        @Override // com.google.common.collect.N0, com.google.common.collect.S0
        public final Object X() {
            return this.f359639b;
        }

        @Override // com.google.common.collect.N0
        /* renamed from: Y */
        public final Map.Entry<K, V> X() {
            return this.f359639b;
        }

        @Override // com.google.common.collect.N0, java.util.Map.Entry
        public final V setValue(V v12) {
            AbstractC37304b abstractC37304b = AbstractC37304b.this;
            abstractC37304b.b0(v12);
            com.google.common.base.M.n("entry no longer in map", abstractC37304b.entrySet().contains(this));
            if (com.google.common.base.F.a(v12, getValue())) {
                return v12;
            }
            com.google.common.base.M.f("value already present: %s", !abstractC37304b.containsValue(v12), v12);
            V value = this.f359639b.setValue(v12);
            com.google.common.base.M.n("entry no longer in map", com.google.common.base.F.a(v12, abstractC37304b.get(getKey())));
            K key = getKey();
            abstractC37304b.f359635c.f359634b.remove(value);
            abstractC37304b.f359635c.f359634b.put(v12, key);
            return value;
        }
    }

    /* compiled from: AbstractBiMap.java */
    /* renamed from: com.google.common.collect.b$b, reason: collision with other inner class name */
    public class C10666b extends U0<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f359641b;

        public C10666b(C37298a c37298a) {
            this.f359641b = AbstractC37304b.this.f359634b.entrySet();
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            return this.f359641b;
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection X() {
            return this.f359641b;
        }

        @Override // com.google.common.collect.U0
        /* renamed from: b0 */
        public final Set<Map.Entry<K, V>> X() {
            return this.f359641b;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final void clear() {
            AbstractC37304b.this.clear();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            return this.f359641b.contains(new J2(entry));
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return G.a(this, collection);
        }

        @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            AbstractC37304b abstractC37304b = AbstractC37304b.this;
            return new C37298a(abstractC37304b, abstractC37304b.f359634b.entrySet().iterator());
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            Set<Map.Entry<K, V>> set = this.f359641b;
            if (!set.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractC37304b.this.f359635c.f359634b.remove(entry.getValue());
            set.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            return W3.h(collection, this);
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = iterator();
            collection.getClass();
            boolean z12 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
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

    /* compiled from: AbstractBiMap.java */
    /* renamed from: com.google.common.collect.b$c */
    public static class c<K, V> extends AbstractC37304b<K, V> {

        @XY0.c
        @XY0.d
        private static final long serialVersionUID = 0;

        public c() {
            throw null;
        }

        @XY0.c
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f359635c = (AbstractC37304b) object;
        }

        @XY0.c
        @XY0.d
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f359635c);
        }

        @Override // com.google.common.collect.AbstractC37304b, com.google.common.collect.M0, com.google.common.collect.S0
        public final Object X() {
            return this.f359634b;
        }

        @Override // com.google.common.collect.AbstractC37304b
        @InterfaceC37434x3
        public final K a0(@InterfaceC37434x3 K k12) {
            return this.f359635c.b0(k12);
        }

        @Override // com.google.common.collect.AbstractC37304b
        @InterfaceC37434x3
        public final V b0(@InterfaceC37434x3 V v12) {
            return this.f359635c.a0(v12);
        }

        @XY0.c
        @XY0.d
        public Object readResolve() {
            return this.f359635c.O();
        }

        @Override // com.google.common.collect.AbstractC37304b, com.google.common.collect.M0, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    /* compiled from: AbstractBiMap.java */
    /* renamed from: com.google.common.collect.b$d */
    public class d extends U0<K> {
        public d(C37298a c37298a) {
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: b0 */
        public final Set<K> X() {
            return AbstractC37304b.this.f359634b.keySet();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final void clear() {
            AbstractC37304b.this.clear();
        }

        @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new D2(AbstractC37304b.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean remove(@I41.a Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractC37304b abstractC37304b = AbstractC37304b.this;
            abstractC37304b.f359635c.f359634b.remove(abstractC37304b.f359634b.remove(obj));
            return true;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            return W3.h(collection, this);
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<K> it = iterator();
            collection.getClass();
            boolean z12 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z12 = true;
                }
            }
            return z12;
        }
    }

    /* compiled from: AbstractBiMap.java */
    /* renamed from: com.google.common.collect.b$e */
    public class e extends U0<V> {

        /* renamed from: b, reason: collision with root package name */
        public final Set<V> f359644b;

        public e(C37298a c37298a) {
            this.f359644b = AbstractC37304b.this.f359635c.keySet();
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            return this.f359644b;
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection X() {
            return this.f359644b;
        }

        @Override // com.google.common.collect.U0
        /* renamed from: b0 */
        public final Set<V> X() {
            return this.f359644b;
        }

        @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new E2(AbstractC37304b.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C37414t3.c(this, tArr);
        }

        @Override // com.google.common.collect.S0
        public final String toString() {
            return a0();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final Object[] toArray() {
            return Z();
        }
    }

    public AbstractC37304b() {
        throw null;
    }

    public AbstractC37304b(Map map, AbstractC37304b abstractC37304b, C37298a c37298a) {
        this.f359634b = map;
        this.f359635c = abstractC37304b;
    }

    @Override // com.google.common.collect.A
    public A<V, K> O() {
        return this.f359635c;
    }

    @Override // com.google.common.collect.M0, com.google.common.collect.S0
    public Object X() {
        return this.f359634b;
    }

    @Override // com.google.common.collect.M0
    /* renamed from: Y */
    public final Map<K, V> X() {
        return this.f359634b;
    }

    public final void c0(EnumMap enumMap, AbstractMap abstractMap) {
        com.google.common.base.M.q(this.f359634b == null);
        com.google.common.base.M.q(this.f359635c == null);
        com.google.common.base.M.g(enumMap.isEmpty());
        com.google.common.base.M.g(abstractMap.isEmpty());
        com.google.common.base.M.g(enumMap != abstractMap);
        this.f359634b = enumMap;
        this.f359635c = new c(abstractMap, this, null);
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public void clear() {
        this.f359634b.clear();
        this.f359635c.f359634b.clear();
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public boolean containsValue(@I41.a Object obj) {
        return this.f359635c.containsKey(obj);
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f359638f;
        if (set != null) {
            return set;
        }
        C10666b c10666b = new C10666b(null);
        this.f359638f = c10666b;
        return c10666b;
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f359636d;
        if (set != null) {
            return set;
        }
        d dVar = new d(null);
        this.f359636d = dVar;
        return dVar;
    }

    @Override // com.google.common.collect.M0, java.util.Map
    @I41.a
    @InterfaceC19845a
    public V put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        a0(k12);
        b0(v12);
        boolean zContainsKey = containsKey(k12);
        if (zContainsKey && com.google.common.base.F.a(v12, get(k12))) {
            return v12;
        }
        com.google.common.base.M.f("value already present: %s", !containsValue(v12), v12);
        V vPut = this.f359634b.put(k12, v12);
        if (zContainsKey) {
            this.f359635c.f359634b.remove(vPut);
        }
        this.f359635c.f359634b.put(v12, k12);
        return vPut;
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.M0, java.util.Map
    @I41.a
    @InterfaceC19845a
    public V remove(@I41.a Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        V vRemove = this.f359634b.remove(obj);
        this.f359635c.f359634b.remove(vRemove);
        return vRemove;
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public Set<V> values() {
        Set<V> set = this.f359637e;
        if (set != null) {
            return set;
        }
        e eVar = new e(null);
        this.f359637e = eVar;
        return eVar;
    }

    @InterfaceC19845a
    @InterfaceC37434x3
    public K a0(@InterfaceC37434x3 K k12) {
        return k12;
    }

    @InterfaceC19845a
    @InterfaceC37434x3
    public V b0(@InterfaceC37434x3 V v12) {
        return v12;
    }
}
