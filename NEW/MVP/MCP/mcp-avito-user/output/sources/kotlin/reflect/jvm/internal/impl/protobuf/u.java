package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.camera.camera2.internal.G;
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
/* loaded from: classes8.dex */
class u<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f409404g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f409405b;

    /* renamed from: c, reason: collision with root package name */
    public List<u<K, V>.b> f409406c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Map<K, V> f409407d = Collections.emptyMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f409408e;

    /* renamed from: f, reason: collision with root package name */
    public volatile u<K, V>.d f409409f;

    /* compiled from: SmallSortedMap.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f409410a = new C11680a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f409411b = new b();

        /* compiled from: SmallSortedMap.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$a$a, reason: collision with other inner class name */
        public static class C11680a implements Iterator<Object> {
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
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f409410a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class b implements Comparable<u<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f409412b;

        /* renamed from: c, reason: collision with root package name */
        public V f409413c;

        public b() {
            throw null;
        }

        public b(K k12, V v12) {
            this.f409412b = k12;
            this.f409413c = v12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f409412b.compareTo(((b) obj).f409412b);
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
            K k12 = this.f409412b;
            if (k12 == null ? key == null : k12.equals(key)) {
                V v12 = this.f409413c;
                Object value = entry.getValue();
                if (v12 == null ? value == null : v12.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f409412b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f409413c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k12 = this.f409412b;
            int iHashCode = k12 == null ? 0 : k12.hashCode();
            V v12 = this.f409413c;
            return (v12 != null ? v12.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            int i12 = u.f409404g;
            u.this.b();
            V v13 = this.f409413c;
            this.f409413c = v12;
            return v13;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.f409412b);
            String strValueOf2 = String.valueOf(this.f409413c);
            return G.g(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f409415b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f409416c;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f409417d;

        public c(t tVar) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f409417d == null) {
                this.f409417d = u.this.f409407d.entrySet().iterator();
            }
            return this.f409417d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f409415b + 1 < u.this.f409406c.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f409416c = true;
            int i12 = this.f409415b + 1;
            this.f409415b = i12;
            u uVar = u.this;
            return i12 < uVar.f409406c.size() ? uVar.f409406c.get(this.f409415b) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f409416c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f409416c = false;
            int i12 = u.f409404g;
            u uVar = u.this;
            uVar.b();
            if (this.f409415b >= uVar.f409406c.size()) {
                a().remove();
                return;
            }
            int i13 = this.f409415b;
            this.f409415b = i13 - 1;
            uVar.g(i13);
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d(t tVar) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            u.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return u.this.size();
        }
    }

    public u(int i12, t tVar) {
        this.f409405b = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(K r5) {
        /*
            r4 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.u<K, V>$b> r0 = r4.f409406c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.u<K, V>$b> r2 = r4.f409406c
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.u$b r2 = (kotlin.reflect.jvm.internal.impl.protobuf.u.b) r2
            K extends java.lang.Comparable<K> r2 = r2.f409412b
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
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.u<K, V>$b> r3 = r4.f409406c
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.u$b r3 = (kotlin.reflect.jvm.internal.impl.protobuf.u.b) r3
            K extends java.lang.Comparable<K> r3 = r3.f409412b
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.u.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f409408e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable<Map.Entry<K, V>> c() {
        return this.f409407d.isEmpty() ? (Iterable<Map.Entry<K, V>>) a.f409411b : this.f409407d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f409406c.isEmpty()) {
            this.f409406c.clear();
        }
        if (this.f409407d.isEmpty()) {
            return;
        }
        this.f409407d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f409407d.containsKey(comparable);
    }

    public final SortedMap<K, V> d() {
        b();
        if (this.f409407d.isEmpty() && !(this.f409407d instanceof TreeMap)) {
            this.f409407d = new TreeMap();
        }
        return (SortedMap) this.f409407d;
    }

    public void e() {
        if (this.f409408e) {
            return;
        }
        this.f409407d = this.f409407d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f409407d);
        this.f409408e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f409409f == null) {
            this.f409409f = new d(null);
        }
        return this.f409409f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final V put(K k12, V v12) {
        b();
        int iA2 = a(k12);
        if (iA2 >= 0) {
            return this.f409406c.get(iA2).setValue(v12);
        }
        b();
        boolean zIsEmpty = this.f409406c.isEmpty();
        int i12 = this.f409405b;
        if (zIsEmpty && !(this.f409406c instanceof ArrayList)) {
            this.f409406c = new ArrayList(i12);
        }
        int i13 = -(iA2 + 1);
        if (i13 >= i12) {
            return d().put(k12, v12);
        }
        if (this.f409406c.size() == i12) {
            u<K, V>.b bVarRemove = this.f409406c.remove(i12 - 1);
            d().put(bVarRemove.f409412b, bVarRemove.f409413c);
        }
        this.f409406c.add(i13, new b(k12, v12));
        return null;
    }

    public final V g(int i12) {
        b();
        V v12 = this.f409406c.remove(i12).f409413c;
        if (!this.f409407d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = d().entrySet().iterator();
            List<u<K, V>.b> list = this.f409406c;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        return iA2 >= 0 ? this.f409406c.get(iA2).f409413c : this.f409407d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA2 = a(comparable);
        if (iA2 >= 0) {
            return g(iA2);
        }
        if (this.f409407d.isEmpty()) {
            return null;
        }
        return this.f409407d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f409407d.size() + this.f409406c.size();
    }
}
