package com.google.common.collect;

import com.google.common.collect.AbstractC37412t1;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: RegularImmutableMap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class J3<K, V> extends AbstractC37412t1<K, V> {

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC37412t1<Object, Object> f359405h = new J3(null, new Object[0], 0);

    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    public final transient Object f359406e;

    /* renamed from: f, reason: collision with root package name */
    @XY0.e
    public final transient Object[] f359407f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f359408g;

    /* compiled from: RegularImmutableMap.java */
    public static class a<K, V> extends H1<Map.Entry<K, V>> {

        /* renamed from: e, reason: collision with root package name */
        public final transient AbstractC37412t1<K, V> f359409e;

        /* renamed from: f, reason: collision with root package name */
        public final transient Object[] f359410f;

        /* renamed from: g, reason: collision with root package name */
        public final transient int f359411g;

        /* renamed from: h, reason: collision with root package name */
        public final transient int f359412h;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: com.google.common.collect.J3$a$a, reason: collision with other inner class name */
        public class C10662a extends AbstractC37401r1<Map.Entry<K, V>> {
            public C10662a() {
            }

            @Override // java.util.List
            public final Object get(int i12) {
                a aVar = a.this;
                com.google.common.base.M.i(i12, aVar.f359412h);
                int i13 = i12 * 2;
                int i14 = aVar.f359411g;
                Object[] objArr = aVar.f359410f;
                Object obj = objArr[i13 + i14];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i13 + (i14 ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.AbstractC37378n1
            public final boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f359412h;
            }
        }

        public a(AbstractC37412t1<K, V> abstractC37412t1, Object[] objArr, int i12, int i13) {
            this.f359409e = abstractC37412t1;
            this.f359410f = objArr;
            this.f359411g = i12;
            this.f359412h = i13;
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f359409e.get(key));
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final int d(int i12, Object[] objArr) {
            return b().d(i12, objArr);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public final N4<Map.Entry<K, V>> iterator() {
            return b().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f359412h;
        }

        @Override // com.google.common.collect.H1
        public final AbstractC37401r1<Map.Entry<K, V>> y() {
            return new C10662a();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    public static final class b<K> extends H1<K> {

        /* renamed from: e, reason: collision with root package name */
        public final transient AbstractC37412t1<K, ?> f359414e;

        /* renamed from: f, reason: collision with root package name */
        public final transient AbstractC37401r1<K> f359415f;

        public b(AbstractC37412t1<K, ?> abstractC37412t1, AbstractC37401r1<K> abstractC37401r1) {
            this.f359414e = abstractC37412t1;
            this.f359415f = abstractC37401r1;
        }

        @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
        public final AbstractC37401r1<K> b() {
            return this.f359415f;
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return this.f359414e.get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final int d(int i12, Object[] objArr) {
            return this.f359415f.d(i12, objArr);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public final N4<K> iterator() {
            return this.f359415f.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f359414e.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    public static final class c extends AbstractC37401r1<Object> {

        /* renamed from: d, reason: collision with root package name */
        public final transient Object[] f359416d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f359417e;

        /* renamed from: f, reason: collision with root package name */
        public final transient int f359418f;

        public c(Object[] objArr, int i12, int i13) {
            this.f359416d = objArr;
            this.f359417e = i12;
            this.f359418f = i13;
        }

        @Override // java.util.List
        public final Object get(int i12) {
            com.google.common.base.M.i(i12, this.f359418f);
            Object obj = this.f359416d[(i12 * 2) + this.f359417e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f359418f;
        }
    }

    public J3(@I41.a Object obj, Object[] objArr, int i12) {
        this.f359406e = obj;
        this.f359407f = objArr;
        this.f359408g = i12;
    }

    public static <K, V> J3<K, V> s(int i12, Object[] objArr, AbstractC37412t1.b<K, V> bVar) {
        if (i12 == 0) {
            return (J3) f359405h;
        }
        if (i12 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new J3<>(null, objArr, 1);
        }
        com.google.common.base.M.k(i12, objArr.length >> 1);
        Object objT = t(objArr, i12, H1.s(i12), 0);
        if (objT instanceof Object[]) {
            Object[] objArr2 = (Object[]) objT;
            AbstractC37412t1.b.a aVar = (AbstractC37412t1.b.a) objArr2[2];
            if (bVar == null) {
                throw aVar.a();
            }
            bVar.f360002c = aVar;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objT = obj;
            i12 = iIntValue;
        }
        return new J3<>(objT, objArr, i12);
    }

    @I41.a
    public static Object t(Object[] objArr, int i12, int i13, int i14) {
        AbstractC37412t1.b.a aVar = null;
        if (i12 == 1) {
            Objects.requireNonNull(objArr[i14]);
            Objects.requireNonNull(objArr[i14 ^ 1]);
            return null;
        }
        int i15 = i13 - 1;
        int i16 = -1;
        if (i13 <= 128) {
            byte[] bArr = new byte[i13];
            Arrays.fill(bArr, (byte) -1);
            int i17 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                int i19 = (i18 * 2) + i14;
                int i22 = (i17 * 2) + i14;
                Object obj = objArr[i19];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i19 ^ 1];
                Objects.requireNonNull(obj2);
                int iB2 = C37348i1.b(obj.hashCode());
                while (true) {
                    int i23 = iB2 & i15;
                    int i24 = bArr[i23] & 255;
                    if (i24 == 255) {
                        bArr[i23] = (byte) i22;
                        if (i17 < i18) {
                            objArr[i22] = obj;
                            objArr[i22 ^ 1] = obj2;
                        }
                        i17++;
                    } else {
                        if (obj.equals(objArr[i24])) {
                            int i25 = i24 ^ 1;
                            Object obj3 = objArr[i25];
                            Objects.requireNonNull(obj3);
                            aVar = new AbstractC37412t1.b.a(obj, obj2, obj3);
                            objArr[i25] = obj2;
                            break;
                        }
                        iB2 = i23 + 1;
                    }
                }
            }
            return i17 == i12 ? bArr : new Object[]{bArr, Integer.valueOf(i17), aVar};
        }
        if (i13 <= 32768) {
            short[] sArr = new short[i13];
            Arrays.fill(sArr, (short) -1);
            int i26 = 0;
            for (int i27 = 0; i27 < i12; i27++) {
                int i28 = (i27 * 2) + i14;
                int i29 = (i26 * 2) + i14;
                Object obj4 = objArr[i28];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i28 ^ 1];
                Objects.requireNonNull(obj5);
                int iB3 = C37348i1.b(obj4.hashCode());
                while (true) {
                    int i32 = iB3 & i15;
                    int i33 = sArr[i32] & 65535;
                    if (i33 == 65535) {
                        sArr[i32] = (short) i29;
                        if (i26 < i27) {
                            objArr[i29] = obj4;
                            objArr[i29 ^ 1] = obj5;
                        }
                        i26++;
                    } else {
                        if (obj4.equals(objArr[i33])) {
                            int i34 = i33 ^ 1;
                            Object obj6 = objArr[i34];
                            Objects.requireNonNull(obj6);
                            aVar = new AbstractC37412t1.b.a(obj4, obj5, obj6);
                            objArr[i34] = obj5;
                            break;
                        }
                        iB3 = i32 + 1;
                    }
                }
            }
            return i26 == i12 ? sArr : new Object[]{sArr, Integer.valueOf(i26), aVar};
        }
        int[] iArr = new int[i13];
        Arrays.fill(iArr, -1);
        int i35 = 0;
        int i36 = 0;
        while (i35 < i12) {
            int i37 = (i35 * 2) + i14;
            int i38 = (i36 * 2) + i14;
            Object obj7 = objArr[i37];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i37 ^ 1];
            Objects.requireNonNull(obj8);
            int iB4 = C37348i1.b(obj7.hashCode());
            while (true) {
                int i39 = iB4 & i15;
                int i42 = iArr[i39];
                if (i42 == i16) {
                    iArr[i39] = i38;
                    if (i36 < i35) {
                        objArr[i38] = obj7;
                        objArr[i38 ^ 1] = obj8;
                    }
                    i36++;
                } else {
                    if (obj7.equals(objArr[i42])) {
                        int i43 = i42 ^ 1;
                        Object obj9 = objArr[i43];
                        Objects.requireNonNull(obj9);
                        aVar = new AbstractC37412t1.b.a(obj7, obj8, obj9);
                        objArr[i43] = obj8;
                        break;
                    }
                    iB4 = i39 + 1;
                    i16 = -1;
                }
            }
            i35++;
            i16 = -1;
        }
        return i36 == i12 ? iArr : new Object[]{iArr, Integer.valueOf(i36), aVar};
    }

    @I41.a
    public static Object u(@I41.a Object obj, Object[] objArr, int i12, int i13, @I41.a Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i12 == 1) {
            Object obj3 = objArr[i13];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i13 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB2 = C37348i1.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length;
                int i15 = bArr[i14] & 255;
                if (i15 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB3 = C37348i1.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length2;
                int i17 = sArr[i16] & 65535;
                if (i17 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB4 = C37348i1.b(obj2.hashCode());
            while (true) {
                int i18 = iB4 & length3;
                int i19 = iArr[i18];
                if (i19 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i19])) {
                    return objArr[i19 ^ 1];
                }
                iB4 = i18 + 1;
            }
        }
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final H1<Map.Entry<K, V>> d() {
        return new a(this, this.f359407f, 0, this.f359408g);
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final H1<K> e() {
        return new b(this, new c(this.f359407f, 0, this.f359408g));
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final AbstractC37378n1<V> f() {
        return new c(this.f359407f, 1, this.f359408g);
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
    @I41.a
    public final V get(@I41.a Object obj) {
        V v12 = (V) u(this.f359406e, this.f359407f, this.f359408g, 0, obj);
        if (v12 == null) {
            return null;
        }
        return v12;
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final boolean k() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f359408g;
    }
}
