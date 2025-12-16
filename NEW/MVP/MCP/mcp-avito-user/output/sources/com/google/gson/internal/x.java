package com.google.gson.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes6.dex */
public final class x<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator<Comparable> f362171i = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<? super K> f362172b;

    /* renamed from: c, reason: collision with root package name */
    public e<K, V> f362173c;

    /* renamed from: d, reason: collision with root package name */
    public int f362174d;

    /* renamed from: e, reason: collision with root package name */
    public int f362175e;

    /* renamed from: f, reason: collision with root package name */
    public final e<K, V> f362176f;

    /* renamed from: g, reason: collision with root package name */
    public x<K, V>.b f362177g;

    /* renamed from: h, reason: collision with root package name */
    public x<K, V>.c f362178h;

    /* compiled from: LinkedTreeMap.java */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        public class a extends x<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            x.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            e eVarA;
            V v12;
            Object value;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            x xVar = x.this;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            e eVar = null;
            if (key != null) {
                try {
                    eVarA = xVar.a(key, false);
                } catch (ClassCastException unused) {
                }
            } else {
                eVarA = null;
            }
            if (eVarA != null && ((v12 = eVarA.f362191h) == (value = entry.getValue()) || (v12 != null && v12.equals(value)))) {
                eVar = eVarA;
            }
            return eVar != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e eVarA;
            V v12;
            Object value;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            x xVar = x.this;
            Object key = entry.getKey();
            e eVar = null;
            if (key != null) {
                try {
                    eVarA = xVar.a(key, false);
                } catch (ClassCastException unused) {
                }
            } else {
                eVarA = null;
            }
            if (eVarA != null && ((v12 = eVarA.f362191h) == (value = entry.getValue()) || (v12 != null && v12.equals(value)))) {
                eVar = eVarA;
            }
            if (eVar == null) {
                return false;
            }
            xVar.c(eVar, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return x.this.f362174d;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        public class a extends x<K, V>.d<K> {
            @Override // com.google.gson.internal.x.d, java.util.Iterator
            public final K next() {
                return a().f362190g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            x.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return x.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            x xVar = x.this;
            e<K, V> eVarA = null;
            if (obj != null) {
                try {
                    eVarA = xVar.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVarA != null) {
                xVar.c(eVarA, true);
            }
            return eVarA != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return x.this.f362174d;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f362181b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f362182c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f362183d;

        public d() {
            this.f362181b = x.this.f362176f.f362188e;
            this.f362183d = x.this.f362175e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f362181b;
            x xVar = x.this;
            if (eVar == xVar.f362176f) {
                throw new NoSuchElementException();
            }
            if (xVar.f362175e != this.f362183d) {
                throw new ConcurrentModificationException();
            }
            this.f362181b = eVar.f362188e;
            this.f362182c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f362181b != x.this.f362176f;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f362182c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            x xVar = x.this;
            xVar.c(eVar, true);
            this.f362182c = null;
            this.f362183d = xVar.f362175e;
        }
    }

    public x() {
        this(f362171i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k12, boolean z12) {
        int iCompareTo;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f362173c;
        Comparator<Comparable> comparator = f362171i;
        Comparator<? super K> comparator2 = this.f362172b;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) k12 : null;
            while (true) {
                K k13 = eVar2.f362190g;
                iCompareTo = comparable != null ? comparable.compareTo(k13) : comparator2.compare(k12, k13);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f362186c : eVar2.f362187d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z12) {
            return null;
        }
        e<K, V> eVar4 = this.f362176f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k12, eVar4, eVar4.f362189f);
            if (iCompareTo < 0) {
                eVar2.f362186c = eVar;
            } else {
                eVar2.f362187d = eVar;
            }
            b(eVar2, true);
        } else {
            if (comparator2 == comparator && !(k12 instanceof Comparable)) {
                throw new ClassCastException(k12.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(eVar2, k12, eVar4, eVar4.f362189f);
            this.f362173c = eVar;
        }
        this.f362174d++;
        this.f362175e++;
        return eVar;
    }

    public final void b(e<K, V> eVar, boolean z12) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f362186c;
            e<K, V> eVar3 = eVar.f362187d;
            int i12 = eVar2 != null ? eVar2.f362192i : 0;
            int i13 = eVar3 != null ? eVar3.f362192i : 0;
            int i14 = i12 - i13;
            if (i14 == -2) {
                e<K, V> eVar4 = eVar3.f362186c;
                e<K, V> eVar5 = eVar3.f362187d;
                int i15 = (eVar4 != null ? eVar4.f362192i : 0) - (eVar5 != null ? eVar5.f362192i : 0);
                if (i15 == -1 || (i15 == 0 && !z12)) {
                    e(eVar);
                } else {
                    f(eVar3);
                    e(eVar);
                }
                if (z12) {
                    return;
                }
            } else if (i14 == 2) {
                e<K, V> eVar6 = eVar2.f362186c;
                e<K, V> eVar7 = eVar2.f362187d;
                int i16 = (eVar6 != null ? eVar6.f362192i : 0) - (eVar7 != null ? eVar7.f362192i : 0);
                if (i16 == 1 || (i16 == 0 && !z12)) {
                    f(eVar);
                } else {
                    e(eVar2);
                    f(eVar);
                }
                if (z12) {
                    return;
                }
            } else if (i14 == 0) {
                eVar.f362192i = i12 + 1;
                if (z12) {
                    return;
                }
            } else {
                eVar.f362192i = Math.max(i12, i13) + 1;
                if (!z12) {
                    return;
                }
            }
            eVar = eVar.f362185b;
        }
    }

    public final void c(e<K, V> eVar, boolean z12) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i12;
        if (z12) {
            e<K, V> eVar4 = eVar.f362189f;
            eVar4.f362188e = eVar.f362188e;
            eVar.f362188e.f362189f = eVar4;
        }
        e<K, V> eVar5 = eVar.f362186c;
        e<K, V> eVar6 = eVar.f362187d;
        e<K, V> eVar7 = eVar.f362185b;
        int i13 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                d(eVar, eVar5);
                eVar.f362186c = null;
            } else if (eVar6 != null) {
                d(eVar, eVar6);
                eVar.f362187d = null;
            } else {
                d(eVar, null);
            }
            b(eVar7, false);
            this.f362174d--;
            this.f362175e++;
            return;
        }
        if (eVar5.f362192i > eVar6.f362192i) {
            e<K, V> eVar8 = eVar5.f362187d;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.f362187d;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.f362186c;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.f362186c;
                }
            }
            eVar3 = eVar2;
        }
        c(eVar3, false);
        e<K, V> eVar11 = eVar.f362186c;
        if (eVar11 != null) {
            i12 = eVar11.f362192i;
            eVar3.f362186c = eVar11;
            eVar11.f362185b = eVar3;
            eVar.f362186c = null;
        } else {
            i12 = 0;
        }
        e<K, V> eVar12 = eVar.f362187d;
        if (eVar12 != null) {
            i13 = eVar12.f362192i;
            eVar3.f362187d = eVar12;
            eVar12.f362185b = eVar3;
            eVar.f362187d = null;
        }
        eVar3.f362192i = Math.max(i12, i13) + 1;
        d(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f362173c = null;
        this.f362174d = 0;
        this.f362175e++;
        e<K, V> eVar = this.f362176f;
        eVar.f362189f = eVar;
        eVar.f362188e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVarA = null;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVarA != null;
    }

    public final void d(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f362185b;
        eVar.f362185b = null;
        if (eVar2 != null) {
            eVar2.f362185b = eVar3;
        }
        if (eVar3 == null) {
            this.f362173c = eVar2;
        } else if (eVar3.f362186c == eVar) {
            eVar3.f362186c = eVar2;
        } else {
            eVar3.f362187d = eVar2;
        }
    }

    public final void e(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f362186c;
        e<K, V> eVar3 = eVar.f362187d;
        e<K, V> eVar4 = eVar3.f362186c;
        e<K, V> eVar5 = eVar3.f362187d;
        eVar.f362187d = eVar4;
        if (eVar4 != null) {
            eVar4.f362185b = eVar;
        }
        d(eVar, eVar3);
        eVar3.f362186c = eVar;
        eVar.f362185b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f362192i : 0, eVar4 != null ? eVar4.f362192i : 0) + 1;
        eVar.f362192i = iMax;
        eVar3.f362192i = Math.max(iMax, eVar5 != null ? eVar5.f362192i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        x<K, V>.b bVar = this.f362177g;
        if (bVar != null) {
            return bVar;
        }
        x<K, V>.b bVar2 = new b();
        this.f362177g = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f362186c;
        e<K, V> eVar3 = eVar.f362187d;
        e<K, V> eVar4 = eVar2.f362186c;
        e<K, V> eVar5 = eVar2.f362187d;
        eVar.f362186c = eVar5;
        if (eVar5 != null) {
            eVar5.f362185b = eVar;
        }
        d(eVar, eVar2);
        eVar2.f362187d = eVar;
        eVar.f362185b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f362192i : 0, eVar5 != null ? eVar5.f362192i : 0) + 1;
        eVar.f362192i = iMax;
        eVar2.f362192i = Math.max(iMax, eVar4 != null ? eVar4.f362192i : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            return eVarA.f362191h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        x<K, V>.c cVar = this.f362178h;
        if (cVar != null) {
            return cVar;
        }
        x<K, V>.c cVar2 = new c();
        this.f362178h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k12, V v12) {
        if (k12 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarA = a(k12, true);
        V v13 = eVarA.f362191h;
        eVarA.f362191h = v12;
        return v13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            c(eVarA, true);
        }
        if (eVarA != null) {
            return eVarA.f362191h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f362174d;
    }

    public x(Comparator<? super K> comparator) {
        this.f362174d = 0;
        this.f362175e = 0;
        this.f362176f = new e<>();
        this.f362172b = comparator == null ? f362171i : comparator;
    }

    /* compiled from: LinkedTreeMap.java */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f362185b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f362186c;

        /* renamed from: d, reason: collision with root package name */
        public e<K, V> f362187d;

        /* renamed from: e, reason: collision with root package name */
        public e<K, V> f362188e;

        /* renamed from: f, reason: collision with root package name */
        public e<K, V> f362189f;

        /* renamed from: g, reason: collision with root package name */
        public final K f362190g;

        /* renamed from: h, reason: collision with root package name */
        public V f362191h;

        /* renamed from: i, reason: collision with root package name */
        public int f362192i;

        public e() {
            this.f362190g = null;
            this.f362189f = this;
            this.f362188e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k12 = this.f362190g;
            if (k12 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k12.equals(entry.getKey())) {
                return false;
            }
            V v12 = this.f362191h;
            if (v12 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v12.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f362190g;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f362191h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k12 = this.f362190g;
            int iHashCode = k12 == null ? 0 : k12.hashCode();
            V v12 = this.f362191h;
            return (v12 != null ? v12.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            V v13 = this.f362191h;
            this.f362191h = v12;
            return v13;
        }

        public final String toString() {
            return this.f362190g + ContainerUtils.KEY_VALUE_DELIMITER + this.f362191h;
        }

        public e(e<K, V> eVar, K k12, e<K, V> eVar2, e<K, V> eVar3) {
            this.f362185b = eVar;
            this.f362190g = k12;
            this.f362192i = 1;
            this.f362188e = eVar2;
            this.f362189f = eVar3;
            eVar3.f362188e = this;
            eVar2.f362189f = this;
        }
    }
}
