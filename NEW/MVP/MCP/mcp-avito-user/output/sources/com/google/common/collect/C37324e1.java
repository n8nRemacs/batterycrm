package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.AbstractC37378n1;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: HashBiMap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37324e1<K, V> extends AbstractMap<K, V> implements A<K, V>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient K[] f359679b;

    /* renamed from: c, reason: collision with root package name */
    public transient V[] f359680c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f359681d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f359682e;

    /* renamed from: f, reason: collision with root package name */
    public transient int[] f359683f;

    /* renamed from: g, reason: collision with root package name */
    public transient int[] f359684g;

    /* renamed from: h, reason: collision with root package name */
    public transient int[] f359685h;

    /* renamed from: i, reason: collision with root package name */
    public transient int[] f359686i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f359687j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f359688k;

    /* renamed from: l, reason: collision with root package name */
    public transient int[] f359689l;

    /* renamed from: m, reason: collision with root package name */
    public transient int[] f359690m;

    /* renamed from: n, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public transient A<V, K> f359691n;

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$a */
    public final class a extends AbstractC37340h<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final K f359692b;

        /* renamed from: c, reason: collision with root package name */
        public int f359693c;

        public a(int i12) {
            this.f359692b = C37324e1.this.f359679b[i12];
            this.f359693c = i12;
        }

        public final void c() {
            int i12 = this.f359693c;
            C37324e1 c37324e1 = C37324e1.this;
            K k12 = this.f359692b;
            if (i12 == -1 || i12 > c37324e1.f359681d || !com.google.common.base.F.a(c37324e1.f359679b[i12], k12)) {
                this.f359693c = c37324e1.f(C37348i1.c(k12), k12);
            }
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final K getKey() {
            return this.f359692b;
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final V getValue() {
            c();
            int i12 = this.f359693c;
            if (i12 == -1) {
                return null;
            }
            return C37324e1.this.f359680c[i12];
        }

        @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
        @InterfaceC37434x3
        public final V setValue(@InterfaceC37434x3 V v12) {
            c();
            int i12 = this.f359693c;
            C37324e1 c37324e1 = C37324e1.this;
            if (i12 == -1) {
                c37324e1.put(this.f359692b, v12);
                return null;
            }
            V v13 = c37324e1.f359680c[i12];
            if (com.google.common.base.F.a(v13, v12)) {
                return v12;
            }
            c37324e1.o(this.f359693c, v12);
            return v13;
        }
    }

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$b */
    public static final class b<K, V> extends AbstractC37340h<V, K> {

        /* renamed from: b, reason: collision with root package name */
        public final C37324e1<K, V> f359695b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC37434x3
        public final V f359696c;

        /* renamed from: d, reason: collision with root package name */
        public int f359697d;

        public b(C37324e1<K, V> c37324e1, int i12) {
            this.f359695b = c37324e1;
            this.f359696c = c37324e1.f359680c[i12];
            this.f359697d = i12;
        }

        public final void c() {
            int i12 = this.f359697d;
            V v12 = this.f359696c;
            C37324e1<K, V> c37324e1 = this.f359695b;
            if (i12 == -1 || i12 > c37324e1.f359681d || !com.google.common.base.F.a(v12, c37324e1.f359680c[i12])) {
                c37324e1.getClass();
                this.f359697d = c37324e1.g(C37348i1.c(v12), v12);
            }
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final V getKey() {
            return this.f359696c;
        }

        @Override // java.util.Map.Entry
        @InterfaceC37434x3
        public final K getValue() {
            c();
            int i12 = this.f359697d;
            if (i12 == -1) {
                return null;
            }
            return this.f359695b.f359679b[i12];
        }

        @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
        @InterfaceC37434x3
        public final K setValue(@InterfaceC37434x3 K k12) {
            c();
            int i12 = this.f359697d;
            C37324e1<K, V> c37324e1 = this.f359695b;
            if (i12 != -1) {
                K k13 = c37324e1.f359679b[i12];
                if (com.google.common.base.F.a(k13, k12)) {
                    return k12;
                }
                c37324e1.n(this.f359697d, k12);
                return k13;
            }
            V v12 = this.f359696c;
            c37324e1.getClass();
            int iC2 = C37348i1.c(v12);
            int iG2 = c37324e1.g(iC2, v12);
            if (iG2 != -1) {
                if (com.google.common.base.F.a(c37324e1.f359679b[iG2], k12)) {
                    return null;
                }
                c37324e1.n(iG2, k12);
                return null;
            }
            int i13 = c37324e1.f359688k;
            int iC3 = C37348i1.c(k12);
            com.google.common.base.M.f("Key already present: %s", c37324e1.f(iC3, k12) == -1, k12);
            c37324e1.e(c37324e1.f359681d + 1);
            K[] kArr = c37324e1.f359679b;
            int i14 = c37324e1.f359681d;
            kArr[i14] = k12;
            c37324e1.f359680c[i14] = v12;
            c37324e1.h(i14, iC3);
            c37324e1.k(c37324e1.f359681d, iC2);
            int i15 = i13 == -2 ? c37324e1.f359687j : c37324e1.f359690m[i13];
            c37324e1.p(i13, c37324e1.f359681d);
            c37324e1.p(c37324e1.f359681d, i15);
            c37324e1.f359681d++;
            c37324e1.f359682e++;
            return null;
        }
    }

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$c */
    public final class c extends h<K, V, Map.Entry<K, V>> {
        @Override // com.google.common.collect.C37324e1.h
        public final Object a(int i12) {
            return new a(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            C37348i1.c(key);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @InterfaceC19845a
        public final boolean remove(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            C37348i1.c(key);
            throw null;
        }
    }

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$d */
    public static class d<K, V> extends AbstractMap<V, K> implements A<V, K>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public transient Set<Map.Entry<V, K>> f359698b;

        @XY0.c
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            throw null;
        }

        @Override // com.google.common.collect.A
        public final A<K, V> O() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f359698b;
            if (set != null) {
                return set;
            }
            e eVar = new e(null);
            this.f359698b = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        public final K get(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<V> keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        @InterfaceC19845a
        public final K put(@InterfaceC37434x3 V v12, @InterfaceC37434x3 K k12) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @I41.a
        @InterfaceC19845a
        public final K remove(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection values() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.A
        public final Set<K> values() {
            throw null;
        }
    }

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$e */
    public static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        public e() {
            throw null;
        }

        @Override // com.google.common.collect.C37324e1.h
        public final Object a(int i12) {
            return new b(this.f359699b, i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            C37324e1<K, V> c37324e1 = this.f359699b;
            c37324e1.getClass();
            int iG2 = c37324e1.g(C37348i1.c(key), key);
            return iG2 != -1 && com.google.common.base.F.a(c37324e1.f359679b[iG2], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC2 = C37348i1.c(key);
            C37324e1<K, V> c37324e1 = this.f359699b;
            int iG2 = c37324e1.g(iC2, key);
            if (iG2 == -1 || !com.google.common.base.F.a(c37324e1.f359679b[iG2], value)) {
                return false;
            }
            c37324e1.l(iG2, C37348i1.c(c37324e1.f359679b[iG2]), iC2);
            return true;
        }
    }

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$f */
    public final class f extends h<K, V, K> {
        @Override // com.google.common.collect.C37324e1.h
        @InterfaceC37434x3
        public final K a(int i12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            C37348i1.c(obj);
            throw null;
        }
    }

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$g */
    public final class g extends h<K, V, V> {
        @Override // com.google.common.collect.C37324e1.h
        @InterfaceC37434x3
        public final V a(int i12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@I41.a Object obj) {
            C37348i1.c(obj);
            throw null;
        }
    }

    /* compiled from: HashBiMap.java */
    /* renamed from: com.google.common.collect.e1$h */
    public static abstract class h<K, V, T> extends AbstractSet<T> {

        /* renamed from: b, reason: collision with root package name */
        public final C37324e1<K, V> f359699b;

        /* compiled from: HashBiMap.java */
        /* renamed from: com.google.common.collect.e1$h$a */
        public class a implements Iterator<T> {

            /* renamed from: b, reason: collision with root package name */
            public int f359700b;

            /* renamed from: c, reason: collision with root package name */
            public int f359701c;

            /* renamed from: d, reason: collision with root package name */
            public int f359702d;

            /* renamed from: e, reason: collision with root package name */
            public int f359703e;

            public a() {
                C37324e1<K, V> c37324e1 = h.this.f359699b;
                this.f359700b = c37324e1.f359687j;
                this.f359701c = -1;
                this.f359702d = c37324e1.f359682e;
                this.f359703e = c37324e1.f359681d;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (h.this.f359699b.f359682e == this.f359702d) {
                    return this.f359700b != -2 && this.f359703e > 0;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            @InterfaceC37434x3
            public final T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f359700b;
                h hVar = h.this;
                T t12 = (T) hVar.a(i12);
                int i13 = this.f359700b;
                this.f359701c = i13;
                this.f359700b = hVar.f359699b.f359690m[i13];
                this.f359703e--;
                return t12;
            }

            @Override // java.util.Iterator
            public final void remove() {
                h hVar = h.this;
                if (hVar.f359699b.f359682e != this.f359702d) {
                    throw new ConcurrentModificationException();
                }
                F.e(this.f359701c != -1);
                int i12 = this.f359701c;
                C37324e1<K, V> c37324e1 = hVar.f359699b;
                c37324e1.m(i12, C37348i1.c(c37324e1.f359679b[i12]));
                if (this.f359700b == c37324e1.f359681d) {
                    this.f359700b = this.f359701c;
                }
                this.f359701c = -1;
                this.f359702d = c37324e1.f359682e;
            }
        }

        public h(C37324e1<K, V> c37324e1) {
            this.f359699b = c37324e1;
        }

        @InterfaceC37434x3
        public abstract T a(int i12);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.f359699b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f359699b.f359681d;
        }
    }

    public static int[] b(int i12) {
        int[] iArr = new int[i12];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i12 = objectInputStream.readInt();
        F.b(16, "expectedSize");
        int iA2 = C37348i1.a(1.0d, 16);
        this.f359681d = 0;
        this.f359679b = (K[]) new Object[16];
        this.f359680c = (V[]) new Object[16];
        this.f359683f = b(iA2);
        this.f359684g = b(iA2);
        this.f359685h = b(16);
        this.f359686i = b(16);
        this.f359687j = -2;
        this.f359688k = -2;
        this.f359689l = b(16);
        this.f359690m = b(16);
        S3.b(this, objectInputStream, i12);
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        S3.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.A
    public final A<V, K> O() {
        return this.f359691n;
    }

    public final int a(int i12) {
        return i12 & (this.f359683f.length - 1);
    }

    public final void c(int i12, int i13) {
        com.google.common.base.M.g(i12 != -1);
        int iA2 = a(i13);
        int[] iArr = this.f359683f;
        int i14 = iArr[iA2];
        if (i14 == i12) {
            int[] iArr2 = this.f359685h;
            iArr[iA2] = iArr2[i12];
            iArr2[i12] = -1;
            return;
        }
        int i15 = this.f359685h[i14];
        while (true) {
            int i16 = i14;
            i14 = i15;
            if (i14 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f359679b[i12]);
            }
            if (i14 == i12) {
                int[] iArr3 = this.f359685h;
                iArr3[i16] = iArr3[i12];
                iArr3[i12] = -1;
                return;
            }
            i15 = this.f359685h[i14];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f359679b, 0, this.f359681d, (Object) null);
        Arrays.fill(this.f359680c, 0, this.f359681d, (Object) null);
        Arrays.fill(this.f359683f, -1);
        Arrays.fill(this.f359684g, -1);
        Arrays.fill(this.f359685h, 0, this.f359681d, -1);
        Arrays.fill(this.f359686i, 0, this.f359681d, -1);
        Arrays.fill(this.f359689l, 0, this.f359681d, -1);
        Arrays.fill(this.f359690m, 0, this.f359681d, -1);
        this.f359681d = 0;
        this.f359687j = -2;
        this.f359688k = -2;
        this.f359682e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@I41.a Object obj) {
        return f(C37348i1.c(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@I41.a Object obj) {
        return g(C37348i1.c(obj), obj) != -1;
    }

    public final void d(int i12, int i13) {
        com.google.common.base.M.g(i12 != -1);
        int iA2 = a(i13);
        int[] iArr = this.f359684g;
        int i14 = iArr[iA2];
        if (i14 == i12) {
            int[] iArr2 = this.f359686i;
            iArr[iA2] = iArr2[i12];
            iArr2[i12] = -1;
            return;
        }
        int i15 = this.f359686i[i14];
        while (true) {
            int i16 = i14;
            i14 = i15;
            if (i14 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f359680c[i12]);
            }
            if (i14 == i12) {
                int[] iArr3 = this.f359686i;
                iArr3[i16] = iArr3[i12];
                iArr3[i12] = -1;
                return;
            }
            i15 = this.f359686i[i14];
        }
    }

    public final void e(int i12) {
        int[] iArr = this.f359685h;
        if (iArr.length < i12) {
            int iA2 = AbstractC37378n1.b.a(iArr.length, i12);
            this.f359679b = (K[]) Arrays.copyOf(this.f359679b, iA2);
            this.f359680c = (V[]) Arrays.copyOf(this.f359680c, iA2);
            int[] iArr2 = this.f359685h;
            int length = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr2, iA2);
            Arrays.fill(iArrCopyOf, length, iA2, -1);
            this.f359685h = iArrCopyOf;
            int[] iArr3 = this.f359686i;
            int length2 = iArr3.length;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, iA2);
            Arrays.fill(iArrCopyOf2, length2, iA2, -1);
            this.f359686i = iArrCopyOf2;
            int[] iArr4 = this.f359689l;
            int length3 = iArr4.length;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr4, iA2);
            Arrays.fill(iArrCopyOf3, length3, iA2, -1);
            this.f359689l = iArrCopyOf3;
            int[] iArr5 = this.f359690m;
            int length4 = iArr5.length;
            int[] iArrCopyOf4 = Arrays.copyOf(iArr5, iA2);
            Arrays.fill(iArrCopyOf4, length4, iA2, -1);
            this.f359690m = iArrCopyOf4;
        }
        if (this.f359683f.length < i12) {
            int iA3 = C37348i1.a(1.0d, i12);
            this.f359683f = b(iA3);
            this.f359684g = b(iA3);
            for (int i13 = 0; i13 < this.f359681d; i13++) {
                int iA4 = a(C37348i1.c(this.f359679b[i13]));
                int[] iArr6 = this.f359685h;
                int[] iArr7 = this.f359683f;
                iArr6[i13] = iArr7[iA4];
                iArr7[iA4] = i13;
                int iA5 = a(C37348i1.c(this.f359680c[i13]));
                int[] iArr8 = this.f359686i;
                int[] iArr9 = this.f359684g;
                iArr8[i13] = iArr9[iA5];
                iArr9[iA5] = i13;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    public final int f(int i12, @I41.a Object obj) {
        int[] iArr = this.f359683f;
        int[] iArr2 = this.f359685h;
        K[] kArr = this.f359679b;
        for (int i13 = iArr[a(i12)]; i13 != -1; i13 = iArr2[i13]) {
            if (com.google.common.base.F.a(kArr[i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    public final int g(int i12, @I41.a Object obj) {
        int[] iArr = this.f359684g;
        int[] iArr2 = this.f359686i;
        V[] vArr = this.f359680c;
        for (int i13 = iArr[a(i12)]; i13 != -1; i13 = iArr2[i13]) {
            if (com.google.common.base.F.a(vArr[i13], obj)) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    public final V get(@I41.a Object obj) {
        int iF2 = f(C37348i1.c(obj), obj);
        if (iF2 == -1) {
            return null;
        }
        return this.f359680c[iF2];
    }

    public final void h(int i12, int i13) {
        com.google.common.base.M.g(i12 != -1);
        int iA2 = a(i13);
        int[] iArr = this.f359685h;
        int[] iArr2 = this.f359683f;
        iArr[i12] = iArr2[iA2];
        iArr2[iA2] = i12;
    }

    public final void k(int i12, int i13) {
        com.google.common.base.M.g(i12 != -1);
        int iA2 = a(i13);
        int[] iArr = this.f359686i;
        int[] iArr2 = this.f359684g;
        iArr[i12] = iArr2[iA2];
        iArr2[iA2] = i12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return null;
    }

    public final void l(int i12, int i13, int i14) {
        int i15;
        int i16;
        com.google.common.base.M.g(i12 != -1);
        c(i12, i13);
        d(i12, i14);
        p(this.f359689l[i12], this.f359690m[i12]);
        int i17 = this.f359681d - 1;
        if (i17 != i12) {
            int i18 = this.f359689l[i17];
            int i19 = this.f359690m[i17];
            p(i18, i12);
            p(i12, i19);
            K[] kArr = this.f359679b;
            K k12 = kArr[i17];
            V[] vArr = this.f359680c;
            V v12 = vArr[i17];
            kArr[i12] = k12;
            vArr[i12] = v12;
            int iA2 = a(C37348i1.c(k12));
            int[] iArr = this.f359683f;
            int i22 = iArr[iA2];
            if (i22 == i17) {
                iArr[iA2] = i12;
            } else {
                int i23 = this.f359685h[i22];
                while (true) {
                    i15 = i22;
                    i22 = i23;
                    if (i22 == i17) {
                        break;
                    } else {
                        i23 = this.f359685h[i22];
                    }
                }
                this.f359685h[i15] = i12;
            }
            int[] iArr2 = this.f359685h;
            iArr2[i12] = iArr2[i17];
            iArr2[i17] = -1;
            int iA3 = a(C37348i1.c(v12));
            int[] iArr3 = this.f359684g;
            int i24 = iArr3[iA3];
            if (i24 == i17) {
                iArr3[iA3] = i12;
            } else {
                int i25 = this.f359686i[i24];
                while (true) {
                    i16 = i24;
                    i24 = i25;
                    if (i24 == i17) {
                        break;
                    } else {
                        i25 = this.f359686i[i24];
                    }
                }
                this.f359686i[i16] = i12;
            }
            int[] iArr4 = this.f359686i;
            iArr4[i12] = iArr4[i17];
            iArr4[i17] = -1;
        }
        K[] kArr2 = this.f359679b;
        int i26 = this.f359681d;
        kArr2[i26 - 1] = null;
        this.f359680c[i26 - 1] = null;
        this.f359681d = i26 - 1;
        this.f359682e++;
    }

    public final void m(int i12, int i13) {
        l(i12, i13, C37348i1.c(this.f359680c[i12]));
    }

    public final void n(int i12, @InterfaceC37434x3 Object obj) {
        com.google.common.base.M.g(i12 != -1);
        int iF2 = f(C37348i1.c(obj), obj);
        int i13 = this.f359688k;
        if (iF2 != -1) {
            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Key already present in map: "));
        }
        if (i13 == i12) {
            i13 = this.f359689l[i12];
        } else if (i13 == this.f359681d) {
            i13 = iF2;
        }
        if (-2 == i12) {
            iF2 = this.f359690m[i12];
        } else if (-2 != this.f359681d) {
            iF2 = -2;
        }
        p(this.f359689l[i12], this.f359690m[i12]);
        c(i12, C37348i1.c(this.f359679b[i12]));
        ((K[]) this.f359679b)[i12] = obj;
        h(i12, C37348i1.c(obj));
        p(i13, i12);
        p(i12, iF2);
    }

    public final void o(int i12, @InterfaceC37434x3 Object obj) {
        com.google.common.base.M.g(i12 != -1);
        int iC2 = C37348i1.c(obj);
        if (g(iC2, obj) != -1) {
            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Value already present in map: "));
        }
        d(i12, C37348i1.c(this.f359680c[i12]));
        ((V[]) this.f359680c)[i12] = obj;
        k(i12, iC2);
    }

    public final void p(int i12, int i13) {
        if (i12 == -2) {
            this.f359687j = i13;
        } else {
            this.f359690m[i12] = i13;
        }
        if (i13 == -2) {
            this.f359688k = i12;
        } else {
            this.f359689l[i13] = i12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12) {
        int iC2 = C37348i1.c(k12);
        int iF2 = f(iC2, k12);
        if (iF2 != -1) {
            V v13 = this.f359680c[iF2];
            if (com.google.common.base.F.a(v13, v12)) {
                return v12;
            }
            o(iF2, v12);
            return v13;
        }
        int iC3 = C37348i1.c(v12);
        com.google.common.base.M.f("Value already present: %s", g(iC3, v12) == -1, v12);
        e(this.f359681d + 1);
        K[] kArr = this.f359679b;
        int i12 = this.f359681d;
        kArr[i12] = k12;
        this.f359680c[i12] = v12;
        h(i12, iC2);
        k(this.f359681d, iC3);
        p(this.f359688k, this.f359681d);
        p(this.f359681d, -2);
        this.f359681d++;
        this.f359682e++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final V remove(@I41.a Object obj) {
        int iC2 = C37348i1.c(obj);
        int iF2 = f(iC2, obj);
        if (iF2 == -1) {
            return null;
        }
        V v12 = this.f359680c[iF2];
        m(iF2, iC2);
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f359681d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.A
    public final Set<V> values() {
        return null;
    }
}
