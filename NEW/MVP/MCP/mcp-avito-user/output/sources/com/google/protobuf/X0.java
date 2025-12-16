package com.google.protobuf;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes7.dex */
class X0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f362827i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f362828b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362831e;

    /* renamed from: f, reason: collision with root package name */
    public volatile X0<K, V>.f f362832f;

    /* renamed from: h, reason: collision with root package name */
    public volatile X0<K, V>.b f362834h;

    /* renamed from: c, reason: collision with root package name */
    public List<X0<K, V>.d> f362829c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map<K, V> f362830d = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public Map<K, V> f362833g = Collections.emptyMap();

    /* compiled from: SmallSortedMap.java */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f362835b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f362836c;

        public a(W0 w02) {
            this.f362835b = X0.this.f362829c.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f362836c == null) {
                this.f362836c = X0.this.f362833g.entrySet().iterator();
            }
            return this.f362836c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i12 = this.f362835b;
            return (i12 > 0 && i12 <= X0.this.f362829c.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<X0<K, V>.d> list = X0.this.f362829c;
            int i12 = this.f362835b - 1;
            this.f362835b = i12;
            return list.get(i12);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class b extends X0<K, V>.f {
        public b(W0 w02) {
            super(null);
        }

        @Override // com.google.protobuf.X0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(null);
        }
    }

    /* compiled from: SmallSortedMap.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f362839a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f362840b = new b();

        /* compiled from: SmallSortedMap.java */
        public class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.f362839a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class d implements Map.Entry<K, V>, Comparable<X0<K, V>.d> {

        /* renamed from: b, reason: collision with root package name */
        public final K f362841b;

        /* renamed from: c, reason: collision with root package name */
        public V f362842c;

        public d() {
            throw null;
        }

        public d(K k12, V v12) {
            this.f362841b = k12;
            this.f362842c = v12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f362841b.compareTo(((d) obj).f362841b);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k12 = this.f362841b;
            if (k12 == null ? key == null : k12.equals(key)) {
                V v12 = this.f362842c;
                Object value = entry.getValue();
                if (v12 == null ? value == null : v12.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f362841b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f362842c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k12 = this.f362841b;
            int iHashCode = k12 == null ? 0 : k12.hashCode();
            V v12 = this.f362842c;
            return (v12 != null ? v12.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            int i12 = X0.f362827i;
            X0.this.b();
            V v13 = this.f362842c;
            this.f362842c = v12;
            return v13;
        }

        public final String toString() {
            return this.f362841b + ContainerUtils.KEY_VALUE_DELIMITER + this.f362842c;
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f362844b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f362845c;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f362846d;

        public e(W0 w02) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f362846d == null) {
                this.f362846d = X0.this.f362830d.entrySet().iterator();
            }
            return this.f362846d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i12 = this.f362844b + 1;
            X0 x02 = X0.this;
            if (i12 >= x02.f362829c.size()) {
                return !x02.f362830d.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f362845c = true;
            int i12 = this.f362844b + 1;
            this.f362844b = i12;
            X0 x02 = X0.this;
            return i12 < x02.f362829c.size() ? x02.f362829c.get(this.f362844b) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f362845c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f362845c = false;
            int i12 = X0.f362827i;
            X0 x02 = X0.this;
            x02.b();
            if (this.f362844b >= x02.f362829c.size()) {
                a().remove();
                return;
            }
            int i13 = this.f362844b;
            this.f362844b = i13 - 1;
            x02.h(i13);
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f(W0 w02) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            X0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            X0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = X0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            X0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return X0.this.size();
        }
    }

    public X0(int i12, W0 w02) {
        this.f362828b = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.protobuf.X0<K, V>$d> r0 = r4.f362829c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List<com.google.protobuf.X0<K, V>$d> r2 = r4.f362829c
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.X0$d r2 = (com.google.protobuf.X0.d) r2
            K extends java.lang.Comparable<K> r2 = r2.f362841b
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.protobuf.X0<K, V>$d> r3 = r4.f362829c
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.X0$d r3 = (com.google.protobuf.X0.d) r3
            K extends java.lang.Comparable<K> r3 = r3.f362841b
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f362831e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i12) {
        return this.f362829c.get(i12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f362829c.isEmpty()) {
            this.f362829c.clear();
        }
        if (this.f362830d.isEmpty()) {
            return;
        }
        this.f362830d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f362830d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f362830d.isEmpty() ? (Iterable<Map.Entry<K, V>>) c.f362840b : this.f362830d.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.f362830d.isEmpty() && !(this.f362830d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f362830d = treeMap;
            this.f362833g = treeMap.descendingMap();
        }
        return (SortedMap) this.f362830d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f362832f == null) {
            this.f362832f = new f(null);
        }
        return this.f362832f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return super.equals(obj);
        }
        X0 x02 = (X0) obj;
        int size = size();
        if (size != x02.size()) {
            return false;
        }
        int size2 = this.f362829c.size();
        if (size2 != x02.f362829c.size()) {
            return entrySet().equals(x02.entrySet());
        }
        for (int i12 = 0; i12 < size2; i12++) {
            if (!c(i12).equals(x02.c(i12))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f362830d.equals(x02.f362830d);
        }
        return true;
    }

    public void f() {
        if (this.f362831e) {
            return;
        }
        this.f362830d = this.f362830d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f362830d);
        this.f362833g = this.f362833g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f362833g);
        this.f362831e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k12, V v12) {
        b();
        int iA2 = a(k12);
        if (iA2 >= 0) {
            return this.f362829c.get(iA2).setValue(v12);
        }
        b();
        boolean zIsEmpty = this.f362829c.isEmpty();
        int i12 = this.f362828b;
        if (zIsEmpty && !(this.f362829c instanceof ArrayList)) {
            this.f362829c = new ArrayList(i12);
        }
        int i13 = -(iA2 + 1);
        if (i13 >= i12) {
            return e().put(k12, v12);
        }
        if (this.f362829c.size() == i12) {
            X0<K, V>.d dVarRemove = this.f362829c.remove(i12 - 1);
            e().put(dVarRemove.f362841b, dVarRemove.f362842c);
        }
        this.f362829c.add(i13, new d(k12, v12));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        return iA2 >= 0 ? this.f362829c.get(iA2).f362842c : this.f362830d.get(comparable);
    }

    public final V h(int i12) {
        b();
        V v12 = this.f362829c.remove(i12).f362842c;
        if (!this.f362830d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<X0<K, V>.d> list = this.f362829c;
            Map.Entry<K, V> next = it.next();
            list.add(new d(next.getKey(), next.getValue()));
            it.remove();
        }
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f362829c.size();
        int iHashCode = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iHashCode += this.f362829c.get(i12).hashCode();
        }
        return this.f362830d.size() > 0 ? iHashCode + this.f362830d.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return h(iA2);
        }
        if (this.f362830d.isEmpty()) {
            return null;
        }
        return this.f362830d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f362830d.size() + this.f362829c.size();
    }
}
