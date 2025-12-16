package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompactHashMap.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
class K<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f359419k = new Object();

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public transient Object f359420b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @XY0.e
    public transient int[] f359421c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @XY0.e
    public transient Object[] f359422d;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    @XY0.e
    public transient Object[] f359423e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f359424f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f359425g;

    /* renamed from: h, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<K> f359426h;

    /* renamed from: i, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Set<Map.Entry<K, V>> f359427i;

    /* renamed from: j, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient Collection<V> f359428j;

    /* compiled from: CompactHashMap.java */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            K.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            if (mapF != null) {
                return mapF.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iM2 = k12.m(entry.getKey());
            return iM2 != -1 && com.google.common.base.F.a(k12.u()[iM2], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            return mapF != null ? mapF.entrySet().iterator() : new I(k12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            if (mapF != null) {
                return mapF.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (k12.q()) {
                return false;
            }
            int iK2 = k12.k();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = k12.f359420b;
            Objects.requireNonNull(obj2);
            int iD2 = M.d(key, value, iK2, obj2, k12.s(), k12.t(), k12.u());
            if (iD2 == -1) {
                return false;
            }
            k12.p(iD2, iK2);
            k12.f359425g--;
            k12.l();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return K.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public int f359430b;

        /* renamed from: c, reason: collision with root package name */
        public int f359431c;

        /* renamed from: d, reason: collision with root package name */
        public int f359432d = -1;

        public b(H h12) {
            this.f359430b = K.this.f359424f;
            this.f359431c = K.this.g();
        }

        @InterfaceC37434x3
        public abstract T a(int i12);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359431c >= 0;
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final T next() {
            K k12 = K.this;
            if (k12.f359424f != this.f359430b) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i12 = this.f359431c;
            this.f359432d = i12;
            T tA2 = a(i12);
            this.f359431c = k12.h(this.f359431c);
            return tA2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            K k12 = K.this;
            if (k12.f359424f != this.f359430b) {
                throw new ConcurrentModificationException();
            }
            F.e(this.f359432d >= 0);
            this.f359430b += 32;
            k12.remove(k12.t()[this.f359432d]);
            this.f359431c = k12.b(this.f359431c, this.f359432d);
            this.f359432d = -1;
        }
    }

    /* compiled from: CompactHashMap.java */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            K.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            return K.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            return mapF != null ? mapF.keySet().iterator() : new H(k12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            return mapF != null ? mapF.keySet().remove(obj) : k12.r(obj) != K.f359419k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return K.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    public final class d extends AbstractC37340h<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final K f359435b;

        /* renamed from: c, reason: collision with root package name */
        public int f359436c;

        public d(int i12) {
            Object obj = K.f359419k;
            this.f359435b = (K) K.this.t()[i12];
            this.f359436c = i12;
        }

        public final void c() {
            int i12 = this.f359436c;
            K k12 = this.f359435b;
            K k13 = K.this;
            if (i12 != -1 && i12 < k13.size()) {
                if (com.google.common.base.F.a(k12, k13.t()[this.f359436c])) {
                    return;
                }
            }
            Object obj = K.f359419k;
            this.f359436c = k13.m(k12);
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final K getKey() {
            return this.f359435b;
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final V getValue() {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            if (mapF != null) {
                return mapF.get(this.f359435b);
            }
            c();
            int i12 = this.f359436c;
            if (i12 == -1) {
                return null;
            }
            return (V) k12.u()[i12];
        }

        @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
        @InterfaceC37434x3
        public final V setValue(@InterfaceC37434x3 V v12) {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            K k13 = this.f359435b;
            if (mapF != null) {
                return mapF.put(k13, v12);
            }
            c();
            int i12 = this.f359436c;
            if (i12 == -1) {
                k12.put(k13, v12);
                return null;
            }
            V v13 = (V) k12.u()[i12];
            k12.u()[this.f359436c] = v12;
            return v13;
        }
    }

    /* compiled from: CompactHashMap.java */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            K.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            K k12 = K.this;
            Map<K, V> mapF = k12.f();
            return mapF != null ? mapF.values().iterator() : new J(k12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return K.this.size();
        }
    }

    public K() {
        n(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i12 = objectInputStream.readInt();
        if (i12 < 0) {
            throw new InvalidObjectException(AK.c.g(i12, "Invalid size: "));
        }
        n(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> mapF = f();
        Iterator<Map.Entry<K, V>> it = mapF != null ? mapF.entrySet().iterator() : new I(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public int b(int i12, int i13) {
        return i12 - 1;
    }

    @InterfaceC19845a
    public int c() {
        com.google.common.base.M.n("Arrays already allocated", q());
        int i12 = this.f359424f;
        int iMax = Math.max(4, C37348i1.a(1.0d, i12 + 1));
        this.f359420b = M.a(iMax);
        this.f359424f = M.b(this.f359424f, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.f359421c = new int[i12];
        this.f359422d = new Object[i12];
        this.f359423e = new Object[i12];
        return i12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (q()) {
            return;
        }
        l();
        Map<K, V> mapF = f();
        if (mapF != null) {
            this.f359424f = com.google.common.primitives.l.c(size(), 3);
            mapF.clear();
            this.f359420b = null;
            this.f359425g = 0;
            return;
        }
        Arrays.fill(t(), 0, this.f359425g, (Object) null);
        Arrays.fill(u(), 0, this.f359425g, (Object) null);
        Object obj = this.f359420b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(s(), 0, this.f359425g, 0);
        this.f359425g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@I41.a Object obj) {
        Map<K, V> mapF = f();
        return mapF != null ? mapF.containsKey(obj) : m(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@I41.a Object obj) {
        Map<K, V> mapF = f();
        if (mapF != null) {
            return mapF.containsValue(obj);
        }
        for (int i12 = 0; i12 < this.f359425g; i12++) {
            if (com.google.common.base.F.a(obj, u()[i12])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC19845a
    @XY0.e
    public Map<K, V> d() {
        LinkedHashMap linkedHashMapE = e(k() + 1);
        int iG2 = g();
        while (iG2 >= 0) {
            linkedHashMapE.put(t()[iG2], u()[iG2]);
            iG2 = h(iG2);
        }
        this.f359420b = linkedHashMapE;
        this.f359421c = null;
        this.f359422d = null;
        this.f359423e = null;
        l();
        return linkedHashMapE;
    }

    public LinkedHashMap e(int i12) {
        return new LinkedHashMap(i12, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f359427i;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.f359427i = aVar;
        return aVar;
    }

    @I41.a
    @XY0.e
    public final Map<K, V> f() {
        Object obj = this.f359420b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    public final V get(@I41.a Object obj) {
        Map<K, V> mapF = f();
        if (mapF != null) {
            return mapF.get(obj);
        }
        int iM2 = m(obj);
        if (iM2 == -1) {
            return null;
        }
        a(iM2);
        return (V) u()[iM2];
    }

    public int h(int i12) {
        int i13 = i12 + 1;
        if (i13 < this.f359425g) {
            return i13;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int k() {
        return (1 << (this.f359424f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f359426h;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f359426h = cVar;
        return cVar;
    }

    public final void l() {
        this.f359424f += 32;
    }

    public final int m(@I41.a Object obj) {
        if (q()) {
            return -1;
        }
        int iC2 = C37348i1.c(obj);
        int iK2 = k();
        Object obj2 = this.f359420b;
        Objects.requireNonNull(obj2);
        int iE2 = M.e(iC2 & iK2, obj2);
        if (iE2 == 0) {
            return -1;
        }
        int i12 = ~iK2;
        int i13 = iC2 & i12;
        do {
            int i14 = iE2 - 1;
            int i15 = s()[i14];
            if ((i15 & i12) == i13 && com.google.common.base.F.a(obj, t()[i14])) {
                return i14;
            }
            iE2 = i15 & iK2;
        } while (iE2 != 0);
        return -1;
    }

    public void n(int i12) {
        com.google.common.base.M.d("Expected size must be >= 0", i12 >= 0);
        this.f359424f = com.google.common.primitives.l.c(i12, 1);
    }

    public void o(int i12, @InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12, int i13, int i14) {
        s()[i12] = M.b(i13, 0, i14);
        t()[i12] = k12;
        u()[i12] = v12;
    }

    public void p(int i12, int i13) {
        Object obj = this.f359420b;
        Objects.requireNonNull(obj);
        int[] iArrS = s();
        Object[] objArrT = t();
        Object[] objArrU = u();
        int size = size();
        int i14 = size - 1;
        if (i12 >= i14) {
            objArrT[i12] = null;
            objArrU[i12] = null;
            iArrS[i12] = 0;
            return;
        }
        Object obj2 = objArrT[i14];
        objArrT[i12] = obj2;
        objArrU[i12] = objArrU[i14];
        objArrT[i14] = null;
        objArrU[i14] = null;
        iArrS[i12] = iArrS[i14];
        iArrS[i14] = 0;
        int iC2 = C37348i1.c(obj2) & i13;
        int iE2 = M.e(iC2, obj);
        if (iE2 == size) {
            M.f(iC2, i12 + 1, obj);
            return;
        }
        while (true) {
            int i15 = iE2 - 1;
            int i16 = iArrS[i15];
            int i17 = i16 & i13;
            if (i17 == size) {
                iArrS[i15] = M.b(i16, i12 + 1, i13);
                return;
            }
            iE2 = i17;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        int iW2;
        int iMin;
        if (q()) {
            c();
        }
        Map<K, V> mapF = f();
        if (mapF != null) {
            return mapF.put(k12, v12);
        }
        int[] iArrS = s();
        Object[] objArrT = t();
        Object[] objArrU = u();
        int i12 = this.f359425g;
        int i13 = i12 + 1;
        int iC2 = C37348i1.c(k12);
        int iK2 = k();
        int i14 = iC2 & iK2;
        Object obj = this.f359420b;
        Objects.requireNonNull(obj);
        int iE2 = M.e(i14, obj);
        int i15 = 1;
        if (iE2 != 0) {
            int i16 = ~iK2;
            int i17 = iC2 & i16;
            int i18 = 0;
            while (true) {
                int i19 = iE2 - i15;
                int i22 = iArrS[i19];
                if ((i22 & i16) == i17 && com.google.common.base.F.a(k12, objArrT[i19])) {
                    V v13 = (V) objArrU[i19];
                    objArrU[i19] = v12;
                    a(i19);
                    return v13;
                }
                int i23 = i22 & iK2;
                i18++;
                if (i23 != 0) {
                    iE2 = i23;
                    i15 = 1;
                } else {
                    if (i18 >= 9) {
                        return d().put(k12, v12);
                    }
                    if (i13 > iK2) {
                        iW2 = w(iK2, M.c(iK2), iC2, i12);
                    } else {
                        iArrS[i19] = M.b(i22, i13, iK2);
                    }
                }
            }
        } else if (i13 > iK2) {
            iW2 = w(iK2, M.c(iK2), iC2, i12);
            iK2 = iW2;
        } else {
            Object obj2 = this.f359420b;
            Objects.requireNonNull(obj2);
            M.f(i14, i13, obj2);
        }
        int length = s().length;
        if (i13 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            v(iMin);
        }
        o(i12, k12, v12, iC2, iK2);
        this.f359425g = i13;
        l();
        return null;
    }

    @XY0.e
    public final boolean q() {
        return this.f359420b == null;
    }

    public final Object r(@I41.a Object obj) {
        boolean zQ2 = q();
        Object obj2 = f359419k;
        if (zQ2) {
            return obj2;
        }
        int iK2 = k();
        Object obj3 = this.f359420b;
        Objects.requireNonNull(obj3);
        int iD2 = M.d(obj, null, iK2, obj3, s(), t(), null);
        if (iD2 == -1) {
            return obj2;
        }
        Object obj4 = u()[iD2];
        p(iD2, iK2);
        this.f359425g--;
        l();
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V remove(@I41.a Object obj) {
        Map<K, V> mapF = f();
        if (mapF != null) {
            return mapF.remove(obj);
        }
        V v12 = (V) r(obj);
        if (v12 == f359419k) {
            return null;
        }
        return v12;
    }

    public final int[] s() {
        int[] iArr = this.f359421c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapF = f();
        return mapF != null ? mapF.size() : this.f359425g;
    }

    public final Object[] t() {
        Object[] objArr = this.f359422d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] u() {
        Object[] objArr = this.f359423e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void v(int i12) {
        this.f359421c = Arrays.copyOf(s(), i12);
        this.f359422d = Arrays.copyOf(t(), i12);
        this.f359423e = Arrays.copyOf(u(), i12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f359428j;
        if (collection != null) {
            return collection;
        }
        e eVar = new e();
        this.f359428j = eVar;
        return eVar;
    }

    @InterfaceC19845a
    public final int w(int i12, int i13, int i14, int i15) {
        Object objA = M.a(i13);
        int i16 = i13 - 1;
        if (i15 != 0) {
            M.f(i14 & i16, i15 + 1, objA);
        }
        Object obj = this.f359420b;
        Objects.requireNonNull(obj);
        int[] iArrS = s();
        for (int i17 = 0; i17 <= i12; i17++) {
            int iE2 = M.e(i17, obj);
            while (iE2 != 0) {
                int i18 = iE2 - 1;
                int i19 = iArrS[i18];
                int i22 = ((~i12) & i19) | i17;
                int i23 = i22 & i16;
                int iE3 = M.e(i23, objA);
                M.f(i23, iE2, objA);
                iArrS[i18] = M.b(i22, iE3, i16);
                iE2 = i19 & i12;
            }
        }
        this.f359420b = objA;
        this.f359424f = M.b(this.f359424f, 32 - Integer.numberOfLeadingZeros(i16), 31);
        return i16;
    }

    public K(int i12) {
        n(i12);
    }

    public void a(int i12) {
    }
}
