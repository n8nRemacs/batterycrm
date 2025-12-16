package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C22909k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45849i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f45850b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45853e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C22909k1<K, V>.f f45854f;

    /* renamed from: h, reason: collision with root package name */
    public volatile C22909k1<K, V>.b f45856h;

    /* renamed from: c, reason: collision with root package name */
    public List<C22909k1<K, V>.d> f45851c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map<K, V> f45852d = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public Map<K, V> f45855g = Collections.emptyMap();

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$a */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f45857b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f45858c;

        public a(C22906j1 c22906j1) {
            this.f45857b = C22909k1.this.f45851c.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f45858c == null) {
                this.f45858c = C22909k1.this.f45855g.entrySet().iterator();
            }
            return this.f45858c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i12 = this.f45857b;
            return (i12 > 0 && i12 <= C22909k1.this.f45851c.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<C22909k1<K, V>.d> list = C22909k1.this.f45851c;
            int i12 = this.f45857b - 1;
            this.f45857b = i12;
            return list.get(i12);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$b */
    public class b extends C22909k1<K, V>.f {
        public b(C22906j1 c22906j1) {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.C22909k1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(null);
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f45861a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f45862b = new b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: androidx.datastore.preferences.protobuf.k1$c$a */
        public static class a implements Iterator<Object> {
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
        /* renamed from: androidx.datastore.preferences.protobuf.k1$c$b */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.f45861a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$d */
    public class d implements Map.Entry<K, V>, Comparable<C22909k1<K, V>.d> {

        /* renamed from: b, reason: collision with root package name */
        public final K f45863b;

        /* renamed from: c, reason: collision with root package name */
        public V f45864c;

        public d() {
            throw null;
        }

        public d(K k12, V v12) {
            this.f45863b = k12;
            this.f45864c = v12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f45863b.compareTo(((d) obj).f45863b);
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
            K k12 = this.f45863b;
            if (k12 == null ? key == null : k12.equals(key)) {
                V v12 = this.f45864c;
                Object value = entry.getValue();
                if (v12 == null ? value == null : v12.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f45863b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f45864c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k12 = this.f45863b;
            int iHashCode = k12 == null ? 0 : k12.hashCode();
            V v12 = this.f45864c;
            return (v12 != null ? v12.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            int i12 = C22909k1.f45849i;
            C22909k1.this.b();
            V v13 = this.f45864c;
            this.f45864c = v12;
            return v13;
        }

        public final String toString() {
            return this.f45863b + ContainerUtils.KEY_VALUE_DELIMITER + this.f45864c;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$e */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f45866b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f45867c;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f45868d;

        public e(C22906j1 c22906j1) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f45868d == null) {
                this.f45868d = C22909k1.this.f45852d.entrySet().iterator();
            }
            return this.f45868d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i12 = this.f45866b + 1;
            C22909k1 c22909k1 = C22909k1.this;
            if (i12 >= c22909k1.f45851c.size()) {
                return !c22909k1.f45852d.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f45867c = true;
            int i12 = this.f45866b + 1;
            this.f45866b = i12;
            C22909k1 c22909k1 = C22909k1.this;
            return i12 < c22909k1.f45851c.size() ? c22909k1.f45851c.get(this.f45866b) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f45867c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f45867c = false;
            int i12 = C22909k1.f45849i;
            C22909k1 c22909k1 = C22909k1.this;
            c22909k1.b();
            if (this.f45866b >= c22909k1.f45851c.size()) {
                a().remove();
                return;
            }
            int i13 = this.f45866b;
            this.f45866b = i13 - 1;
            c22909k1.h(i13);
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$f */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f(C22906j1 c22906j1) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C22909k1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C22909k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C22909k1.this.get(entry.getKey());
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
            C22909k1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C22909k1.this.size();
        }
    }

    public C22909k1(int i12, C22906j1 c22906j1) {
        this.f45850b = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(K r5) {
        /*
            r4 = this;
            java.util.List<androidx.datastore.preferences.protobuf.k1<K, V>$d> r0 = r4.f45851c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List<androidx.datastore.preferences.protobuf.k1<K, V>$d> r2 = r4.f45851c
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.k1$d r2 = (androidx.datastore.preferences.protobuf.C22909k1.d) r2
            K extends java.lang.Comparable<K> r2 = r2.f45863b
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
            java.util.List<androidx.datastore.preferences.protobuf.k1<K, V>$d> r3 = r4.f45851c
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.k1$d r3 = (androidx.datastore.preferences.protobuf.C22909k1.d) r3
            K extends java.lang.Comparable<K> r3 = r3.f45863b
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C22909k1.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f45853e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i12) {
        return this.f45851c.get(i12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f45851c.isEmpty()) {
            this.f45851c.clear();
        }
        if (this.f45852d.isEmpty()) {
            return;
        }
        this.f45852d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f45852d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f45852d.isEmpty() ? (Iterable<Map.Entry<K, V>>) c.f45862b : this.f45852d.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.f45852d.isEmpty() && !(this.f45852d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f45852d = treeMap;
            this.f45855g = treeMap.descendingMap();
        }
        return (SortedMap) this.f45852d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f45854f == null) {
            this.f45854f = new f(null);
        }
        return this.f45854f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22909k1)) {
            return super.equals(obj);
        }
        C22909k1 c22909k1 = (C22909k1) obj;
        int size = size();
        if (size != c22909k1.size()) {
            return false;
        }
        int size2 = this.f45851c.size();
        if (size2 != c22909k1.f45851c.size()) {
            return entrySet().equals(c22909k1.entrySet());
        }
        for (int i12 = 0; i12 < size2; i12++) {
            if (!c(i12).equals(c22909k1.c(i12))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f45852d.equals(c22909k1.f45852d);
        }
        return true;
    }

    public void f() {
        if (this.f45853e) {
            return;
        }
        this.f45852d = this.f45852d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f45852d);
        this.f45855g = this.f45855g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f45855g);
        this.f45853e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k12, V v12) {
        b();
        int iA2 = a(k12);
        if (iA2 >= 0) {
            return this.f45851c.get(iA2).setValue(v12);
        }
        b();
        boolean zIsEmpty = this.f45851c.isEmpty();
        int i12 = this.f45850b;
        if (zIsEmpty && !(this.f45851c instanceof ArrayList)) {
            this.f45851c = new ArrayList(i12);
        }
        int i13 = -(iA2 + 1);
        if (i13 >= i12) {
            return e().put(k12, v12);
        }
        if (this.f45851c.size() == i12) {
            C22909k1<K, V>.d dVarRemove = this.f45851c.remove(i12 - 1);
            e().put(dVarRemove.f45863b, dVarRemove.f45864c);
        }
        this.f45851c.add(i13, new d(k12, v12));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        return iA2 >= 0 ? this.f45851c.get(iA2).f45864c : this.f45852d.get(comparable);
    }

    public final V h(int i12) {
        b();
        V v12 = this.f45851c.remove(i12).f45864c;
        if (!this.f45852d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<C22909k1<K, V>.d> list = this.f45851c;
            Map.Entry<K, V> next = it.next();
            list.add(new d(next.getKey(), next.getValue()));
            it.remove();
        }
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f45851c.size();
        int iHashCode = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iHashCode += this.f45851c.get(i12).hashCode();
        }
        return this.f45852d.size() > 0 ? iHashCode + this.f45852d.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return h(iA2);
        }
        if (this.f45852d.isEmpty()) {
            return null;
        }
        return this.f45852d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f45852d.size() + this.f45851c.size();
    }
}
