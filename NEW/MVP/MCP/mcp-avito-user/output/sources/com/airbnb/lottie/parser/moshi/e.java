package com.airbnb.lottie.parser.moshi;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedHashTreeMap.java */
/* loaded from: classes10.dex */
final class e<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Comparator<Comparable> f59990j = new a();

    /* renamed from: h, reason: collision with root package name */
    public e<K, V>.d f59997h;

    /* renamed from: i, reason: collision with root package name */
    public e<K, V>.C2078e f59998i;

    /* renamed from: e, reason: collision with root package name */
    public int f59994e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f59995f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<? super K> f59991b = f59990j;

    /* renamed from: d, reason: collision with root package name */
    public final g<K, V> f59993d = new g<>();

    /* renamed from: c, reason: collision with root package name */
    public g<K, V>[] f59992c = new g[16];

    /* renamed from: g, reason: collision with root package name */
    public int f59996g = 12;

    /* compiled from: LinkedHashTreeMap.java */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    public static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f59999a;

        /* renamed from: b, reason: collision with root package name */
        public int f60000b;

        /* renamed from: c, reason: collision with root package name */
        public int f60001c;

        /* renamed from: d, reason: collision with root package name */
        public int f60002d;

        public final void a(g<K, V> gVar) {
            gVar.f60012d = null;
            gVar.f60010b = null;
            gVar.f60011c = null;
            gVar.f60018j = 1;
            int i12 = this.f60000b;
            if (i12 > 0) {
                int i13 = this.f60002d;
                if ((i13 & 1) == 0) {
                    this.f60002d = i13 + 1;
                    this.f60000b = i12 - 1;
                    this.f60001c++;
                }
            }
            gVar.f60010b = this.f59999a;
            this.f59999a = gVar;
            int i14 = this.f60002d;
            int i15 = i14 + 1;
            this.f60002d = i15;
            int i16 = this.f60000b;
            if (i16 > 0 && (i15 & 1) == 0) {
                this.f60002d = i14 + 2;
                this.f60000b = i16 - 1;
                this.f60001c++;
            }
            int i17 = 4;
            while (true) {
                int i18 = i17 - 1;
                if ((this.f60002d & i18) != i18) {
                    return;
                }
                int i19 = this.f60001c;
                if (i19 == 0) {
                    g<K, V> gVar2 = this.f59999a;
                    g<K, V> gVar3 = gVar2.f60010b;
                    g<K, V> gVar4 = gVar3.f60010b;
                    gVar3.f60010b = gVar4.f60010b;
                    this.f59999a = gVar3;
                    gVar3.f60011c = gVar4;
                    gVar3.f60012d = gVar2;
                    gVar3.f60018j = gVar2.f60018j + 1;
                    gVar4.f60010b = gVar3;
                    gVar2.f60010b = gVar3;
                } else if (i19 == 1) {
                    g<K, V> gVar5 = this.f59999a;
                    g<K, V> gVar6 = gVar5.f60010b;
                    this.f59999a = gVar6;
                    gVar6.f60012d = gVar5;
                    gVar6.f60018j = gVar5.f60018j + 1;
                    gVar5.f60010b = gVar6;
                    this.f60001c = 0;
                } else if (i19 == 2) {
                    this.f60001c = 0;
                }
                i17 *= 2;
            }
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f60003a;
    }

    /* compiled from: LinkedHashTreeMap.java */
    public final class d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedHashTreeMap.java */
        public class a extends e<K, V>.f<Map.Entry<K, V>> {
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            e.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            g gVarA;
            V v12;
            Object value;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            e eVar = e.this;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            g gVar = null;
            if (key != null) {
                try {
                    gVarA = eVar.a(key, false);
                } catch (ClassCastException unused) {
                }
            } else {
                gVarA = null;
            }
            if (gVarA != null && ((v12 = gVarA.f60017i) == (value = entry.getValue()) || (v12 != null && v12.equals(value)))) {
                gVar = gVarA;
            }
            return gVar != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            g gVarA;
            V v12;
            Object value;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            e eVar = e.this;
            Object key = entry.getKey();
            g gVar = null;
            if (key != null) {
                try {
                    gVarA = eVar.a(key, false);
                } catch (ClassCastException unused) {
                }
            } else {
                gVarA = null;
            }
            if (gVarA != null && ((v12 = gVarA.f60017i) == (value = entry.getValue()) || (v12 != null && v12.equals(value)))) {
                gVar = gVarA;
            }
            if (gVar == null) {
                return false;
            }
            eVar.c(gVar, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return e.this.f59994e;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.airbnb.lottie.parser.moshi.e$e, reason: collision with other inner class name */
    public final class C2078e extends AbstractSet<K> {

        /* compiled from: LinkedHashTreeMap.java */
        /* renamed from: com.airbnb.lottie.parser.moshi.e$e$a */
        public class a extends e<K, V>.f<K> {
            @Override // com.airbnb.lottie.parser.moshi.e.f, java.util.Iterator
            public final K next() {
                return a().f60015g;
            }
        }

        public C2078e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return e.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e eVar = e.this;
            g<K, V> gVarA = null;
            if (obj != null) {
                try {
                    gVarA = eVar.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (gVarA != null) {
                eVar.c(gVarA, true);
            }
            return gVarA != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return e.this.f59994e;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    public abstract class f<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public g<K, V> f60006b;

        /* renamed from: c, reason: collision with root package name */
        public g<K, V> f60007c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f60008d;

        public f() {
            this.f60006b = e.this.f59993d.f60013e;
            this.f60008d = e.this.f59995f;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.f60006b;
            e eVar = e.this;
            if (gVar == eVar.f59993d) {
                throw new NoSuchElementException();
            }
            if (eVar.f59995f != this.f60008d) {
                throw new ConcurrentModificationException();
            }
            this.f60006b = gVar.f60013e;
            this.f60007c = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f60006b != e.this.f59993d;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f60007c;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            e eVar = e.this;
            eVar.c(gVar, true);
            this.f60007c = null;
            this.f60008d = eVar.f59995f;
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final g<K, V> a(K k12, boolean z12) {
        g<K, V> gVar;
        int i12;
        g<K, V> gVar2;
        g<K, V> gVar3;
        g<K, V> gVar4;
        g<K, V> gVar5;
        g<K, V> gVar6;
        g<K, V> gVar7;
        g<K, V>[] gVarArr = this.f59992c;
        int iHashCode = k12.hashCode();
        int i13 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i14 = ((i13 >>> 7) ^ i13) ^ (i13 >>> 4);
        int length = i14 & (gVarArr.length - 1);
        g<K, V> gVar8 = gVarArr[length];
        Comparator<Comparable> comparator = f59990j;
        Comparator<? super K> comparator2 = this.f59991b;
        g<K, V> gVar9 = null;
        if (gVar8 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) k12 : null;
            while (true) {
                K k13 = gVar8.f60015g;
                int iCompareTo = comparable != null ? comparable.compareTo(k13) : comparator2.compare(k12, k13);
                if (iCompareTo == 0) {
                    return gVar8;
                }
                g<K, V> gVar10 = iCompareTo < 0 ? gVar8.f60011c : gVar8.f60012d;
                if (gVar10 == null) {
                    i12 = iCompareTo;
                    gVar = gVar8;
                    break;
                }
                gVar8 = gVar10;
            }
        } else {
            gVar = gVar8;
            i12 = 0;
        }
        if (!z12) {
            return null;
        }
        g<K, V> gVar11 = this.f59993d;
        if (gVar != null) {
            g<K, V> gVar12 = new g<>(gVar, k12, i14, gVar11, gVar11.f60014f);
            if (i12 < 0) {
                gVar.f60011c = gVar12;
            } else {
                gVar.f60012d = gVar12;
            }
            b(gVar, true);
            gVar2 = gVar12;
        } else {
            if (comparator2 == comparator && !(k12 instanceof Comparable)) {
                throw new ClassCastException(k12.getClass().getName().concat(" is not Comparable"));
            }
            gVar2 = new g<>(gVar, k12, i14, gVar11, gVar11.f60014f);
            gVarArr[length] = gVar2;
        }
        int i15 = this.f59994e;
        this.f59994e = i15 + 1;
        if (i15 > this.f59996g) {
            g<K, V>[] gVarArr2 = this.f59992c;
            int length2 = gVarArr2.length;
            int i16 = length2 * 2;
            g<K, V>[] gVarArr3 = new g[i16];
            c cVar = new c();
            b bVar = new b();
            b bVar2 = new b();
            int i17 = 0;
            while (i17 < length2) {
                g<K, V> gVar13 = gVarArr2[i17];
                if (gVar13 == null) {
                    gVar4 = gVar9;
                } else {
                    g<K, V> gVar14 = gVar9;
                    for (g<K, V> gVar15 = gVar13; gVar15 != null; gVar15 = gVar15.f60011c) {
                        gVar15.f60010b = gVar14;
                        gVar14 = gVar15;
                    }
                    cVar.f60003a = gVar14;
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        g<K, V> gVar16 = cVar.f60003a;
                        if (gVar16 == null) {
                            gVar16 = gVar9;
                        } else {
                            g<K, V> gVar17 = gVar16.f60010b;
                            gVar16.f60010b = gVar9;
                            g<K, V> gVar18 = gVar16.f60012d;
                            while (true) {
                                g<K, V> gVar19 = gVar18;
                                gVar3 = gVar17;
                                gVar17 = gVar19;
                                if (gVar17 == null) {
                                    break;
                                }
                                gVar17.f60010b = gVar3;
                                gVar18 = gVar17.f60011c;
                            }
                            cVar.f60003a = gVar3;
                        }
                        if (gVar16 == null) {
                            break;
                        }
                        if ((gVar16.f60016h & length2) == 0) {
                            i18++;
                        } else {
                            i19++;
                        }
                        gVar9 = null;
                    }
                    bVar.f60000b = ((Integer.highestOneBit(i18) * 2) - 1) - i18;
                    bVar.f60002d = 0;
                    bVar.f60001c = 0;
                    bVar.f59999a = null;
                    bVar2.f60000b = ((Integer.highestOneBit(i19) * 2) - 1) - i19;
                    bVar2.f60002d = 0;
                    bVar2.f60001c = 0;
                    bVar2.f59999a = null;
                    g<K, V> gVar20 = null;
                    while (gVar13 != null) {
                        gVar13.f60010b = gVar20;
                        gVar20 = gVar13;
                        gVar13 = gVar13.f60011c;
                    }
                    cVar.f60003a = gVar20;
                    while (true) {
                        g<K, V> gVar21 = cVar.f60003a;
                        if (gVar21 == null) {
                            gVar21 = null;
                            gVar4 = null;
                        } else {
                            g<K, V> gVar22 = gVar21.f60010b;
                            gVar4 = null;
                            gVar21.f60010b = null;
                            g<K, V> gVar23 = gVar21.f60012d;
                            while (true) {
                                gVar5 = gVar22;
                                gVar22 = gVar23;
                                if (gVar22 == null) {
                                    break;
                                }
                                gVar22.f60010b = gVar5;
                                gVar23 = gVar22.f60011c;
                            }
                            cVar.f60003a = gVar5;
                        }
                        if (gVar21 == null) {
                            break;
                        }
                        if ((gVar21.f60016h & length2) == 0) {
                            bVar.a(gVar21);
                        } else {
                            bVar2.a(gVar21);
                        }
                    }
                    if (i18 > 0) {
                        gVar6 = bVar.f59999a;
                        if (gVar6.f60010b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        gVar6 = gVar4;
                    }
                    gVarArr3[i17] = gVar6;
                    int i22 = i17 + length2;
                    if (i19 > 0) {
                        gVar7 = bVar2.f59999a;
                        if (gVar7.f60010b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        gVar7 = gVar4;
                    }
                    gVarArr3[i22] = gVar7;
                }
                i17++;
                gVar9 = gVar4;
            }
            this.f59992c = gVarArr3;
            this.f59996g = (i16 / 4) + (i16 / 2);
        }
        this.f59995f++;
        return gVar2;
    }

    public final void b(g<K, V> gVar, boolean z12) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f60011c;
            g<K, V> gVar3 = gVar.f60012d;
            int i12 = gVar2 != null ? gVar2.f60018j : 0;
            int i13 = gVar3 != null ? gVar3.f60018j : 0;
            int i14 = i12 - i13;
            if (i14 == -2) {
                g<K, V> gVar4 = gVar3.f60011c;
                g<K, V> gVar5 = gVar3.f60012d;
                int i15 = (gVar4 != null ? gVar4.f60018j : 0) - (gVar5 != null ? gVar5.f60018j : 0);
                if (i15 == -1 || (i15 == 0 && !z12)) {
                    e(gVar);
                } else {
                    f(gVar3);
                    e(gVar);
                }
                if (z12) {
                    return;
                }
            } else if (i14 == 2) {
                g<K, V> gVar6 = gVar2.f60011c;
                g<K, V> gVar7 = gVar2.f60012d;
                int i16 = (gVar6 != null ? gVar6.f60018j : 0) - (gVar7 != null ? gVar7.f60018j : 0);
                if (i16 == 1 || (i16 == 0 && !z12)) {
                    f(gVar);
                } else {
                    e(gVar2);
                    f(gVar);
                }
                if (z12) {
                    return;
                }
            } else if (i14 == 0) {
                gVar.f60018j = i12 + 1;
                if (z12) {
                    return;
                }
            } else {
                gVar.f60018j = Math.max(i12, i13) + 1;
                if (!z12) {
                    return;
                }
            }
            gVar = gVar.f60010b;
        }
    }

    public final void c(g<K, V> gVar, boolean z12) {
        g<K, V> gVar2;
        g<K, V> gVar3;
        int i12;
        if (z12) {
            g<K, V> gVar4 = gVar.f60014f;
            gVar4.f60013e = gVar.f60013e;
            gVar.f60013e.f60014f = gVar4;
            gVar.f60014f = null;
            gVar.f60013e = null;
        }
        g<K, V> gVar5 = gVar.f60011c;
        g<K, V> gVar6 = gVar.f60012d;
        g<K, V> gVar7 = gVar.f60010b;
        int i13 = 0;
        if (gVar5 == null || gVar6 == null) {
            if (gVar5 != null) {
                d(gVar, gVar5);
                gVar.f60011c = null;
            } else if (gVar6 != null) {
                d(gVar, gVar6);
                gVar.f60012d = null;
            } else {
                d(gVar, null);
            }
            b(gVar7, false);
            this.f59994e--;
            this.f59995f++;
            return;
        }
        if (gVar5.f60018j > gVar6.f60018j) {
            g<K, V> gVar8 = gVar5.f60012d;
            while (true) {
                g<K, V> gVar9 = gVar8;
                gVar3 = gVar5;
                gVar5 = gVar9;
                if (gVar5 == null) {
                    break;
                } else {
                    gVar8 = gVar5.f60012d;
                }
            }
        } else {
            g<K, V> gVar10 = gVar6.f60011c;
            while (true) {
                gVar2 = gVar6;
                gVar6 = gVar10;
                if (gVar6 == null) {
                    break;
                } else {
                    gVar10 = gVar6.f60011c;
                }
            }
            gVar3 = gVar2;
        }
        c(gVar3, false);
        g<K, V> gVar11 = gVar.f60011c;
        if (gVar11 != null) {
            i12 = gVar11.f60018j;
            gVar3.f60011c = gVar11;
            gVar11.f60010b = gVar3;
            gVar.f60011c = null;
        } else {
            i12 = 0;
        }
        g<K, V> gVar12 = gVar.f60012d;
        if (gVar12 != null) {
            i13 = gVar12.f60018j;
            gVar3.f60012d = gVar12;
            gVar12.f60010b = gVar3;
            gVar.f60012d = null;
        }
        gVar3.f60018j = Math.max(i12, i13) + 1;
        d(gVar, gVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f59992c, (Object) null);
        this.f59994e = 0;
        this.f59995f++;
        g<K, V> gVar = this.f59993d;
        g<K, V> gVar2 = gVar.f60013e;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f60013e;
            gVar2.f60014f = null;
            gVar2.f60013e = null;
            gVar2 = gVar3;
        }
        gVar.f60014f = gVar;
        gVar.f60013e = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        g<K, V> gVarA = null;
        if (obj != 0) {
            try {
                gVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return gVarA != null;
    }

    public final void d(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f60010b;
        gVar.f60010b = null;
        if (gVar2 != null) {
            gVar2.f60010b = gVar3;
        }
        if (gVar3 == null) {
            this.f59992c[gVar.f60016h & (r0.length - 1)] = gVar2;
        } else if (gVar3.f60011c == gVar) {
            gVar3.f60011c = gVar2;
        } else {
            gVar3.f60012d = gVar2;
        }
    }

    public final void e(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f60011c;
        g<K, V> gVar3 = gVar.f60012d;
        g<K, V> gVar4 = gVar3.f60011c;
        g<K, V> gVar5 = gVar3.f60012d;
        gVar.f60012d = gVar4;
        if (gVar4 != null) {
            gVar4.f60010b = gVar;
        }
        d(gVar, gVar3);
        gVar3.f60011c = gVar;
        gVar.f60010b = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f60018j : 0, gVar4 != null ? gVar4.f60018j : 0) + 1;
        gVar.f60018j = iMax;
        gVar3.f60018j = Math.max(iMax, gVar5 != null ? gVar5.f60018j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        e<K, V>.d dVar = this.f59997h;
        if (dVar != null) {
            return dVar;
        }
        e<K, V>.d dVar2 = new d();
        this.f59997h = dVar2;
        return dVar2;
    }

    public final void f(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f60011c;
        g<K, V> gVar3 = gVar.f60012d;
        g<K, V> gVar4 = gVar2.f60011c;
        g<K, V> gVar5 = gVar2.f60012d;
        gVar.f60011c = gVar5;
        if (gVar5 != null) {
            gVar5.f60010b = gVar;
        }
        d(gVar, gVar2);
        gVar2.f60012d = gVar;
        gVar.f60010b = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f60018j : 0, gVar5 != null ? gVar5.f60018j : 0) + 1;
        gVar.f60018j = iMax;
        gVar2.f60018j = Math.max(iMax, gVar4 != null ? gVar4.f60018j : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        g<K, V> gVarA;
        if (obj != 0) {
            try {
                gVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            gVarA = null;
        }
        if (gVarA != null) {
            return gVarA.f60017i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        e<K, V>.C2078e c2078e = this.f59998i;
        if (c2078e != null) {
            return c2078e;
        }
        e<K, V>.C2078e c2078e2 = new C2078e();
        this.f59998i = c2078e2;
        return c2078e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k12, V v12) {
        if (k12 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarA = a(k12, true);
        V v13 = gVarA.f60017i;
        gVarA.f60017i = v12;
        return v13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        g<K, V> gVarA;
        if (obj != 0) {
            try {
                gVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            gVarA = null;
        }
        if (gVarA != null) {
            c(gVarA, true);
        }
        if (gVarA != null) {
            return gVarA.f60017i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f59994e;
    }

    /* compiled from: LinkedHashTreeMap.java */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public g<K, V> f60010b;

        /* renamed from: c, reason: collision with root package name */
        public g<K, V> f60011c;

        /* renamed from: d, reason: collision with root package name */
        public g<K, V> f60012d;

        /* renamed from: e, reason: collision with root package name */
        public g<K, V> f60013e;

        /* renamed from: f, reason: collision with root package name */
        public g<K, V> f60014f;

        /* renamed from: g, reason: collision with root package name */
        public final K f60015g;

        /* renamed from: h, reason: collision with root package name */
        public final int f60016h;

        /* renamed from: i, reason: collision with root package name */
        public V f60017i;

        /* renamed from: j, reason: collision with root package name */
        public int f60018j;

        public g() {
            this.f60015g = null;
            this.f60016h = -1;
            this.f60014f = this;
            this.f60013e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k12 = this.f60015g;
            if (k12 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k12.equals(entry.getKey())) {
                return false;
            }
            V v12 = this.f60017i;
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
            return this.f60015g;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f60017i;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k12 = this.f60015g;
            int iHashCode = k12 == null ? 0 : k12.hashCode();
            V v12 = this.f60017i;
            return (v12 != null ? v12.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            V v13 = this.f60017i;
            this.f60017i = v12;
            return v13;
        }

        public final String toString() {
            return this.f60015g + ContainerUtils.KEY_VALUE_DELIMITER + this.f60017i;
        }

        public g(g<K, V> gVar, K k12, int i12, g<K, V> gVar2, g<K, V> gVar3) {
            this.f60010b = gVar;
            this.f60015g = k12;
            this.f60016h = i12;
            this.f60018j = 1;
            this.f60013e = gVar2;
            this.f60014f = gVar3;
            gVar3.f60013e = this;
            gVar2.f60014f = this;
        }
    }
}
