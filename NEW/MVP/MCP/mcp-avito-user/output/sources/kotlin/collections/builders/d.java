package kotlin.collections.builders;

import Y61.k;
import Y61.l;
import Z41.g;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MapBuilder.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\u000b\f\r\u000e\u000f\u0010B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlin/collections/builders/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d<K, V> implements Map<K, V>, Serializable, Z41.g {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f406683o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final d f406684p;

    /* renamed from: b, reason: collision with root package name */
    @k
    public K[] f406685b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public V[] f406686c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public int[] f406687d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public int[] f406688e;

    /* renamed from: f, reason: collision with root package name */
    public int f406689f;

    /* renamed from: g, reason: collision with root package name */
    public int f406690g;

    /* renamed from: h, reason: collision with root package name */
    public int f406691h;

    /* renamed from: i, reason: collision with root package name */
    public int f406692i;

    /* renamed from: j, reason: collision with root package name */
    public int f406693j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public kotlin.collections.builders.f<K> f406694k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public g<V> f406695l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public kotlin.collections.builders.e<K, V> f406696m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f406697n;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/d$a;", "", "<init>", "()V", "", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/d$b;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<K, V> extends C11631d<K, V> implements Iterator<Map.Entry<K, V>>, Z41.d {
        public b() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i12 = this.f406701c;
            d<K, V> dVar = this.f406700b;
            if (i12 >= dVar.f406690g) {
                throw new NoSuchElementException();
            }
            this.f406701c = i12 + 1;
            this.f406702d = i12;
            c cVar = new c(dVar, i12);
            b();
            return cVar;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/d$c;", "K", "V", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d<K, V> f406698b;

        /* renamed from: c, reason: collision with root package name */
        public final int f406699c;

        public c(@k d<K, V> dVar, int i12) {
            this.f406698b = dVar;
            this.f406699c = i12;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(@l Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (L.f(entry.getKey(), getKey()) && L.f(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f406698b.f406685b[this.f406699c];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f406698b.f406686c[this.f406699c];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            d<K, V> dVar = this.f406698b;
            dVar.c();
            V[] vArr = dVar.f406686c;
            if (vArr == null) {
                int length = dVar.f406685b.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                dVar.f406686c = vArr;
            }
            int i12 = this.f406699c;
            V v13 = vArr[i12];
            vArr[i12] = v12;
            return v13;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/d$d;", "K", "V", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.d$d, reason: collision with other inner class name */
    public static class C11631d<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d<K, V> f406700b;

        /* renamed from: c, reason: collision with root package name */
        public int f406701c;

        /* renamed from: d, reason: collision with root package name */
        public int f406702d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f406703e;

        public C11631d(@k d<K, V> dVar) {
            this.f406700b = dVar;
            this.f406703e = dVar.f406692i;
            b();
        }

        public final void a() {
            if (this.f406700b.f406692i != this.f406703e) {
                throw new ConcurrentModificationException();
            }
        }

        public final void b() {
            while (true) {
                int i12 = this.f406701c;
                d<K, V> dVar = this.f406700b;
                if (i12 >= dVar.f406690g || dVar.f406687d[i12] >= 0) {
                    return;
                } else {
                    this.f406701c = i12 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f406701c < this.f406700b.f406690g;
        }

        public final void remove() {
            a();
            if (this.f406702d == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            d<K, V> dVar = this.f406700b;
            dVar.c();
            dVar.l(this.f406702d);
            this.f406702d = -1;
            this.f406703e = dVar.f406692i;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/d$e;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e<K, V> extends C11631d<K, V> implements Iterator<K>, Z41.d {
        public e() {
            throw null;
        }

        @Override // java.util.Iterator
        public final K next() {
            a();
            int i12 = this.f406701c;
            d<K, V> dVar = this.f406700b;
            if (i12 >= dVar.f406690g) {
                throw new NoSuchElementException();
            }
            this.f406701c = i12 + 1;
            this.f406702d = i12;
            K k12 = dVar.f406685b[i12];
            b();
            return k12;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/d$f;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f<K, V> extends C11631d<K, V> implements Iterator<V>, Z41.d {
        public f() {
            throw null;
        }

        @Override // java.util.Iterator
        public final V next() {
            a();
            int i12 = this.f406701c;
            d<K, V> dVar = this.f406700b;
            if (i12 >= dVar.f406690g) {
                throw new NoSuchElementException();
            }
            this.f406701c = i12 + 1;
            this.f406702d = i12;
            V v12 = dVar.f406686c[i12];
            b();
            return v12;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f406697n = true;
        f406684p = dVar;
    }

    public d() {
        this(8);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f406697n) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(K k12) {
        c();
        while (true) {
            int iH2 = h(k12);
            int i12 = this.f406689f * 2;
            int length = this.f406688e.length / 2;
            if (i12 > length) {
                i12 = length;
            }
            int i13 = 0;
            while (true) {
                int[] iArr = this.f406688e;
                int i14 = iArr[iH2];
                if (i14 <= 0) {
                    int i15 = this.f406690g;
                    K[] kArr = this.f406685b;
                    if (i15 < kArr.length) {
                        int i16 = i15 + 1;
                        this.f406690g = i16;
                        kArr[i15] = k12;
                        this.f406687d[i15] = iH2;
                        iArr[iH2] = i16;
                        this.f406693j++;
                        this.f406692i++;
                        if (i13 > this.f406689f) {
                            this.f406689f = i13;
                        }
                        return i15;
                    }
                    f(1);
                } else {
                    if (L.f(this.f406685b[i14 - 1], k12)) {
                        return -i14;
                    }
                    i13++;
                    if (i13 > i12) {
                        k(this.f406688e.length * 2);
                        break;
                    }
                    iH2 = iH2 == 0 ? this.f406688e.length - 1 : iH2 - 1;
                }
            }
        }
    }

    @k
    public final d b() {
        c();
        this.f406697n = true;
        return this.f406693j > 0 ? this : f406684p;
    }

    public final void c() {
        if (this.f406697n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i12 = this.f406690g - 1;
        if (i12 >= 0) {
            int i13 = 0;
            while (true) {
                int[] iArr = this.f406687d;
                int i14 = iArr[i13];
                if (i14 >= 0) {
                    this.f406688e[i14] = 0;
                    iArr[i13] = -1;
                }
                if (i13 == i12) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        kotlin.collections.builders.c.c(0, this.f406690g, this.f406685b);
        V[] vArr = this.f406686c;
        if (vArr != null) {
            kotlin.collections.builders.c.c(0, this.f406690g, vArr);
        }
        this.f406693j = 0;
        this.f406690g = 0;
        this.f406692i++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i12;
        int i13 = this.f406690g;
        while (true) {
            i12 = -1;
            i13--;
            if (i13 >= 0) {
                if (this.f406687d[i13] >= 0 && L.f(this.f406686c[i13], obj)) {
                    i12 = i13;
                    break;
                }
            } else {
                break;
            }
        }
        return i12 >= 0;
    }

    public final void d(boolean z12) {
        int i12;
        V[] vArr = this.f406686c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i12 = this.f406690g;
            if (i13 >= i12) {
                break;
            }
            int[] iArr = this.f406687d;
            int i15 = iArr[i13];
            if (i15 >= 0) {
                K[] kArr = this.f406685b;
                kArr[i14] = kArr[i13];
                if (vArr != null) {
                    vArr[i14] = vArr[i13];
                }
                if (z12) {
                    iArr[i14] = i15;
                    this.f406688e[i15] = i14 + 1;
                }
                i14++;
            }
            i13++;
        }
        kotlin.collections.builders.c.c(i14, i12, this.f406685b);
        if (vArr != null) {
            kotlin.collections.builders.c.c(i14, this.f406690g, vArr);
        }
        this.f406690g = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(@k Collection<?> collection) {
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG2 = g(entry.getKey());
                    if (!(iG2 < 0 ? false : L.f(this.f406686c[iG2], entry.getValue()))) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        kotlin.collections.builders.e<K, V> eVar = this.f406696m;
        if (eVar != null) {
            return eVar;
        }
        kotlin.collections.builders.e<K, V> eVar2 = new kotlin.collections.builders.e<>(this);
        this.f406696m = eVar2;
        return eVar2;
    }

    @Override // java.util.Map
    public final boolean equals(@l Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f406693j != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i12) {
        K[] kArr = this.f406685b;
        int length = kArr.length;
        int i13 = this.f406690g;
        int i14 = length - i13;
        int i15 = i13 - this.f406693j;
        if (i14 < i12 && i14 + i15 >= i12 && i15 >= kArr.length / 4) {
            d(true);
            return;
        }
        int i16 = i13 + i12;
        if (i16 < 0) {
            throw new OutOfMemoryError();
        }
        if (i16 > kArr.length) {
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int length2 = kArr.length;
            aVar.getClass();
            int iD2 = AbstractC42738c.a.d(length2, i16);
            this.f406685b = (K[]) Arrays.copyOf(this.f406685b, iD2);
            V[] vArr = this.f406686c;
            this.f406686c = vArr != null ? (V[]) Arrays.copyOf(vArr, iD2) : null;
            this.f406687d = Arrays.copyOf(this.f406687d, iD2);
            f406683o.getClass();
            int iHighestOneBit = Integer.highestOneBit((iD2 >= 1 ? iD2 : 1) * 3);
            if (iHighestOneBit > this.f406688e.length) {
                k(iHighestOneBit);
            }
        }
    }

    public final int g(K k12) {
        int iH2 = h(k12);
        int i12 = this.f406689f;
        while (true) {
            int i13 = this.f406688e[iH2];
            if (i13 == 0) {
                return -1;
            }
            if (i13 > 0) {
                int i14 = i13 - 1;
                if (L.f(this.f406685b[i14], k12)) {
                    return i14;
                }
            }
            i12--;
            if (i12 < 0) {
                return -1;
            }
            iH2 = iH2 == 0 ? this.f406688e.length - 1 : iH2 - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @l
    public final V get(Object obj) {
        int iG2 = g(obj);
        if (iG2 < 0) {
            return null;
        }
        return this.f406686c[iG2];
    }

    public final int h(K k12) {
        return ((k12 != null ? k12.hashCode() : 0) * (-1640531527)) >>> this.f406691h;
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i12 = 0;
        while (bVar.hasNext()) {
            int i13 = bVar.f406701c;
            d<K, V> dVar = bVar.f406700b;
            if (i13 >= dVar.f406690g) {
                throw new NoSuchElementException();
            }
            bVar.f406701c = i13 + 1;
            bVar.f406702d = i13;
            K k12 = dVar.f406685b[i13];
            int iHashCode = k12 != null ? k12.hashCode() : 0;
            V v12 = dVar.f406686c[bVar.f406702d];
            int iHashCode2 = v12 != null ? v12.hashCode() : 0;
            bVar.b();
            i12 += iHashCode ^ iHashCode2;
        }
        return i12;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f406693j == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f406687d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f406692i
            int r0 = r0 + 1
            r5.f406692i = r0
            int r0 = r5.f406690g
            int r1 = r5.f406693j
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f406688e = r0
            kotlin.collections.builders.d$a r0 = kotlin.collections.builders.d.f406683o
            r0.getClass()
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f406691h = r6
        L21:
            int r6 = r5.f406690g
            if (r2 >= r6) goto L55
            int r6 = r2 + 1
            K[] r0 = r5.f406685b
            r0 = r0[r2]
            int r0 = r5.h(r0)
            int r1 = r5.f406689f
        L31:
            int[] r3 = r5.f406688e
            r4 = r3[r0]
            if (r4 != 0) goto L3f
            r3[r0] = r6
            int[] r1 = r5.f406687d
            r1[r2] = r0
            r2 = r6
            goto L21
        L3f:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4d
            int r4 = r0 + (-1)
            if (r0 != 0) goto L4b
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L31
        L4b:
            r0 = r4
            goto L31
        L4d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.d.k(int):void");
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        kotlin.collections.builders.f<K> fVar = this.f406694k;
        if (fVar != null) {
            return fVar;
        }
        kotlin.collections.builders.f<K> fVar2 = new kotlin.collections.builders.f<>(this);
        this.f406694k = fVar2;
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x001f->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f406685b
            r1 = 0
            r0[r12] = r1
            V[] r0 = r11.f406686c
            if (r0 == 0) goto Lb
            r0[r12] = r1
        Lb:
            int[] r0 = r11.f406687d
            r0 = r0[r12]
            int r1 = r11.f406689f
            int r1 = r1 * 2
            int[] r2 = r11.f406688e
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1b
            r1 = r2
        L1b:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1f:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r11.f406688e
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2a
        L29:
            r0 = r5
        L2a:
            int r4 = r4 + 1
            int r5 = r11.f406689f
            r6 = -1
            if (r4 <= r5) goto L36
            int[] r0 = r11.f406688e
            r0[r1] = r2
            goto L67
        L36:
            int[] r5 = r11.f406688e
            r7 = r5[r0]
            if (r7 != 0) goto L3f
            r5[r1] = r2
            goto L67
        L3f:
            if (r7 >= 0) goto L46
            r5[r1] = r6
        L43:
            r1 = r0
            r4 = r2
            goto L60
        L46:
            K[] r5 = r11.f406685b
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.h(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f406688e
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L60
            r9[r1] = r7
            int[] r4 = r11.f406687d
            r4[r8] = r1
            goto L43
        L60:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1f
            int[] r0 = r11.f406688e
            r0[r1] = r6
        L67:
            int[] r0 = r11.f406687d
            r0[r12] = r6
            int r12 = r11.f406693j
            int r12 = r12 + r6
            r11.f406693j = r12
            int r12 = r11.f406692i
            int r12 = r12 + 1
            r11.f406692i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.d.l(int):void");
    }

    @Override // java.util.Map
    @l
    public final V put(K k12, V v12) {
        c();
        int iA2 = a(k12);
        V[] vArr = this.f406686c;
        if (vArr == null) {
            int length = this.f406685b.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[length];
            this.f406686c = vArr;
        }
        if (iA2 >= 0) {
            vArr[iA2] = v12;
            return null;
        }
        int i12 = (-iA2) - 1;
        V v13 = vArr[i12];
        vArr[i12] = v12;
        return v13;
    }

    @Override // java.util.Map
    public final void putAll(@k Map<? extends K, ? extends V> map) {
        c();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA2 = a(entry.getKey());
            V[] vArr = this.f406686c;
            if (vArr == null) {
                int length = this.f406685b.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                this.f406686c = vArr;
            }
            if (iA2 >= 0) {
                vArr[iA2] = entry.getValue();
            } else {
                int i12 = (-iA2) - 1;
                if (!L.f(entry.getValue(), vArr[i12])) {
                    vArr[i12] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @l
    public final V remove(Object obj) {
        c();
        int iG2 = g(obj);
        if (iG2 < 0) {
            return null;
        }
        V v12 = this.f406686c[iG2];
        l(iG2);
        return v12;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f406693j;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f406693j * 3) + 2);
        sb2.append("{");
        b bVar = new b(this);
        int i12 = 0;
        while (bVar.hasNext()) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            int i13 = bVar.f406701c;
            d<K, V> dVar = bVar.f406700b;
            if (i13 >= dVar.f406690g) {
                throw new NoSuchElementException();
            }
            bVar.f406701c = i13 + 1;
            bVar.f406702d = i13;
            K k12 = dVar.f406685b[i13];
            if (k12 == dVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(k12);
            }
            sb2.append('=');
            V v12 = dVar.f406686c[bVar.f406702d];
            if (v12 == dVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(v12);
            }
            bVar.b();
            i12++;
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        g<V> gVar = this.f406695l;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.f406695l = gVar2;
        return gVar2;
    }

    public d(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i12];
        int[] iArr = new int[i12];
        f406683o.getClass();
        int iHighestOneBit = Integer.highestOneBit((i12 < 1 ? 1 : i12) * 3);
        this.f406685b = kArr;
        this.f406686c = null;
        this.f406687d = iArr;
        this.f406688e = new int[iHighestOneBit];
        this.f406689f = 2;
        this.f406690g = 0;
        this.f406691h = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
