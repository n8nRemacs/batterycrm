package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.AbstractC37412t1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: ImmutableSortedMap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class J1<K, V> extends K1<K, V> implements NavigableMap<K, V> {

    /* renamed from: h, reason: collision with root package name */
    public static final J1<Comparable, Object> f359394h;
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient N3<K> f359395e;

    /* renamed from: f, reason: collision with root package name */
    public final transient AbstractC37401r1<V> f359396f;

    /* renamed from: g, reason: collision with root package name */
    @I41.a
    public final transient J1<K, V> f359397g;

    /* compiled from: ImmutableSortedMap.java */
    public class a extends AbstractC37422v1<K, V> {

        /* compiled from: ImmutableSortedMap.java */
        /* renamed from: com.google.common.collect.J1$a$a, reason: collision with other inner class name */
        public class C10661a extends AbstractC37401r1<Map.Entry<K, V>> {
            public C10661a() {
            }

            @Override // java.util.List
            public final Object get(int i12) {
                a aVar = a.this;
                return new AbstractMap.SimpleImmutableEntry(J1.this.f359395e.b().get(i12), J1.this.f359396f.get(i12));
            }

            @Override // com.google.common.collect.AbstractC37378n1
            public final boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return J1.this.f359396f.size();
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.AbstractC37422v1
        public final AbstractC37412t1<K, V> Q() {
            return J1.this;
        }

        @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public final N4<Map.Entry<K, V>> iterator() {
            return b().listIterator(0);
        }

        @Override // com.google.common.collect.H1
        public final AbstractC37401r1<Map.Entry<K, V>> y() {
            return new C10661a();
        }
    }

    /* compiled from: ImmutableSortedMap.java */
    public static class b<K, V> extends AbstractC37412t1.b<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public transient Object[] f359400d;

        /* renamed from: e, reason: collision with root package name */
        public transient Object[] f359401e;

        /* renamed from: f, reason: collision with root package name */
        public final Comparator<? super K> f359402f;

        public b() {
            throw null;
        }

        public b(Comparator<? super K> comparator) {
            comparator.getClass();
            this.f359402f = comparator;
            this.f359400d = new Object[4];
            this.f359401e = new Object[4];
        }

        @Override // com.google.common.collect.AbstractC37412t1.b
        public final AbstractC37412t1 b() {
            int i12 = this.f360001b;
            Comparator<? super K> comparator = this.f359402f;
            if (i12 == 0) {
                return J1.t(comparator);
            }
            if (i12 == 1) {
                Object obj = this.f359400d[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f359401e[0];
                Objects.requireNonNull(obj2);
                AbstractC37401r1 abstractC37401r1E = AbstractC37401r1.E(obj);
                comparator.getClass();
                return new J1(new N3(abstractC37401r1E, comparator), AbstractC37401r1.E(obj2), null);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f359400d, i12);
            Arrays.sort(objArrCopyOf, comparator);
            int i13 = this.f360001b;
            Object[] objArr = new Object[i13];
            for (int i14 = 0; i14 < this.f360001b; i14++) {
                if (i14 > 0) {
                    int i15 = i14 - 1;
                    if (comparator.compare(objArrCopyOf[i15], objArrCopyOf[i14]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i15] + " and " + objArrCopyOf[i14]);
                    }
                }
                Object obj3 = this.f359400d[i14];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
                Object obj4 = this.f359401e[i14];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new J1(new N3(AbstractC37401r1.r(objArrCopyOf.length, objArrCopyOf), comparator), AbstractC37401r1.r(i13, objArr), null);
        }

        @Override // com.google.common.collect.AbstractC37412t1.b
        @InterfaceC19845a
        public final AbstractC37412t1.b c(Object obj, Object obj2) {
            int i12 = this.f360001b + 1;
            Object[] objArr = this.f359400d;
            if (i12 > objArr.length) {
                int iA2 = AbstractC37378n1.b.a(objArr.length, i12);
                this.f359400d = Arrays.copyOf(this.f359400d, iA2);
                this.f359401e = Arrays.copyOf(this.f359401e, iA2);
            }
            F.a(obj, obj2);
            Object[] objArr2 = this.f359400d;
            int i13 = this.f360001b;
            objArr2[i13] = obj;
            this.f359401e[i13] = obj2;
            this.f360001b = i13 + 1;
            return this;
        }

        @Override // com.google.common.collect.AbstractC37412t1.b
        @InterfaceC19845a
        public final AbstractC37412t1.b d(Set set) {
            super.d(set);
            return this;
        }
    }

    /* compiled from: ImmutableSortedMap.java */
    @XY0.d
    public static class c<K, V> extends AbstractC37412t1.e<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: d, reason: collision with root package name */
        public final Comparator<? super K> f359403d;

        public c(J1<K, V> j12) {
            super(j12);
            this.f359403d = j12.f359395e.f359521e;
        }

        @Override // com.google.common.collect.AbstractC37412t1.e
        public final AbstractC37412t1.b a(int i12) {
            return new b(this.f359403d);
        }
    }

    static {
        N3 n3U = N1.U(C37392p3.f359948d);
        O4<Object> o42 = AbstractC37401r1.f359977c;
        f359394h = new J1<>(n3U, I3.f359390f, null);
    }

    public J1() {
        throw null;
    }

    public J1(N3<K> n32, AbstractC37401r1<V> abstractC37401r1, @I41.a J1<K, V> j12) {
        this.f359395e = n32;
        this.f359396f = abstractC37401r1;
        this.f359397g = j12;
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K, V> J1<K, V> t(Comparator<? super K> comparator) {
        return C37392p3.f359948d.equals(comparator) ? (J1<K, V>) f359394h : new J1<>(N1.U(comparator), I3.f359390f, null);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> ceilingEntry(K k12) {
        return tailMap(k12, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K ceilingKey(K k12) {
        return (K) M2.g(ceilingEntry(k12));
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return this.f359395e.f359521e;
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final H1<Map.Entry<K, V>> d() {
        if (!isEmpty()) {
            return new a();
        }
        int i12 = H1.f359346d;
        return L3.f359468k;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.f359395e.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        J1<K, V> j12 = this.f359397g;
        if (j12 != null) {
            return j12;
        }
        boolean zIsEmpty = isEmpty();
        N3<K> n32 = this.f359395e;
        return zIsEmpty ? t(AbstractC37429w3.b(n32.f359521e).h()) : new J1((N3) n32.descendingSet(), this.f359396f.N(), this);
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final H1<K> e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final AbstractC37378n1<V> f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().b().get(0);
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return this.f359395e.first();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> floorEntry(K k12) {
        return headMap(k12, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K floorKey(K k12) {
        return (K) M2.g(floorEntry(k12));
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
    @I41.a
    public final V get(@I41.a Object obj) {
        int iIndexOf = this.f359395e.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f359396f.get(iIndexOf);
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> higherEntry(K k12) {
        return tailMap(k12, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K higherKey(K k12) {
        return (K) M2.g(higherEntry(k12));
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final boolean k() {
        return this.f359395e.f359528g.i() || this.f359396f.i();
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return this.f359395e;
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().b().get(this.f359396f.size() - 1);
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return this.f359395e.last();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final Map.Entry<K, V> lowerEntry(K k12) {
        return headMap(k12, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @I41.a
    public final K lowerKey(K k12) {
        return (K) M2.g(lowerEntry(k12));
    }

    @Override // com.google.common.collect.AbstractC37412t1
    /* renamed from: m */
    public final H1 keySet() {
        return this.f359395e;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f359395e;
    }

    @Override // java.util.NavigableMap
    @I41.a
    @aZ0.e
    @Deprecated
    @InterfaceC19845a
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @I41.a
    @aZ0.e
    @Deprecated
    @InterfaceC19845a
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37412t1
    /* renamed from: r */
    public final AbstractC37378n1<V> values() {
        return this.f359396f;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f359396f.size();
    }

    public final J1<K, V> u(int i12, int i13) {
        AbstractC37401r1<V> abstractC37401r1 = this.f359396f;
        if (i12 == 0 && i13 == abstractC37401r1.size()) {
            return this;
        }
        N3<K> n32 = this.f359395e;
        return i12 == i13 ? t(n32.f359521e) : new J1<>(n32.f0(i12, i13), abstractC37401r1.subList(i12, i13), null);
    }

    @Override // java.util.NavigableMap
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final J1<K, V> headMap(K k12, boolean z12) {
        k12.getClass();
        return u(0, this.f359395e.i0(k12, z12));
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
    public final Collection values() {
        return this.f359396f;
    }

    @Override // java.util.NavigableMap
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final J1<K, V> subMap(K k12, boolean z12, K k13, boolean z13) {
        k12.getClass();
        k13.getClass();
        com.google.common.base.M.h(this.f359395e.f359521e.compare(k12, k13) <= 0, "expected fromKey <= toKey but %s > %s", k12, k13);
        return headMap(k13, z13).tailMap(k12, z12);
    }

    @Override // com.google.common.collect.AbstractC37412t1
    @XY0.d
    public Object writeReplace() {
        return new c(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final J1<K, V> tailMap(K k12, boolean z12) {
        k12.getClass();
        return u(this.f359395e.k0(k12, z12), this.f359396f.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
