package kotlinx.coroutines.debug.internal;

import Z41.g;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42746g;
import kotlin.collections.AbstractC42748h;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.a0;

/* compiled from: ConcurrentWeakMap.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\n\u000b\fR\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R!\u0010\t\u001a\u0018\u0012\u0014\u0012\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u00078\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/internal/b;", "", "K", "V", "Lkotlin/collections/g;", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/b$a;", "core", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b<K, V> extends AbstractC42746g<K, V> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411046c = AtomicIntegerFieldUpdater.newUpdater(b.class, "_size$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411047d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ReferenceQueue<K> f411048b;
    private volatile /* synthetic */ Object core$volatile;

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\bR\u0019\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$a;", "", "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/t;", "keys", "Lkotlinx/atomicfu/AtomicInt;", "load", "values", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f411049g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final int f411050a;

        /* renamed from: b, reason: collision with root package name */
        public final int f411051b;

        /* renamed from: c, reason: collision with root package name */
        public final int f411052c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f411053d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f411054e;
        private volatile /* synthetic */ int load$volatile;

        /* compiled from: ConcurrentWeakMap.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$a$a;", "E", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.debug.internal.b$a$a, reason: collision with other inner class name */
        public final class C11710a<E> implements Iterator<E>, Z41.d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final N f411056b;

            /* renamed from: c, reason: collision with root package name */
            public int f411057c = -1;

            /* renamed from: d, reason: collision with root package name */
            public K f411058d;

            /* renamed from: e, reason: collision with root package name */
            public V f411059e;

            /* JADX WARN: Multi-variable type inference failed */
            public C11710a(@Y61.k Y41.p<? super K, ? super V, ? extends E> pVar) {
                this.f411056b = (N) pVar;
                a();
            }

            public final void a() {
                K k12;
                while (true) {
                    int i12 = this.f411057c + 1;
                    this.f411057c = i12;
                    b<K, V>.a aVar = a.this;
                    if (i12 >= aVar.f411050a) {
                        return;
                    }
                    t tVar = (t) aVar.f411053d.get(i12);
                    if (tVar != null && (k12 = (K) tVar.get()) != null) {
                        this.f411058d = k12;
                        Object obj = (V) aVar.f411054e.get(this.f411057c);
                        if (obj instanceof u) {
                            obj = (V) ((u) obj).f411077a;
                        }
                        if (obj != null) {
                            this.f411059e = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f411057c < a.this.f411050a;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
            @Override // java.util.Iterator
            public final E next() {
                if (this.f411057c >= a.this.f411050a) {
                    throw new NoSuchElementException();
                }
                K k12 = this.f411058d;
                if (k12 == false) {
                    k12 = (K) G0.f406611a;
                }
                V v12 = this.f411059e;
                if (v12 == false) {
                    v12 = (V) G0.f406611a;
                }
                E e12 = (E) this.f411056b.invoke(k12, v12);
                a();
                return e12;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("not implemented");
            }
        }

        public a(int i12) {
            this.f411050a = i12;
            this.f411051b = Integer.numberOfLeadingZeros(i12) + 1;
            this.f411052c = (i12 * 2) / 3;
            this.f411053d = new AtomicReferenceArray(i12);
            this.f411054e = new AtomicReferenceArray(i12);
        }

        @Y61.l
        public final Object a(@Y61.k K k12, @Y61.l V v12, @Y61.l t<K> tVar) {
            a0 a0Var;
            int i12;
            int iHashCode = (k12.hashCode() * (-1640531527)) >>> this.f411051b;
            boolean z12 = false;
            loop0: while (true) {
                AtomicReferenceArray atomicReferenceArray = this.f411053d;
                t tVar2 = (t) atomicReferenceArray.get(iHashCode);
                a0Var = kotlinx.coroutines.debug.internal.c.f411067a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f411049g;
                if (tVar2 == null) {
                    if (v12 != null) {
                        if (!z12) {
                            do {
                                i12 = atomicIntegerFieldUpdater.get(this);
                                if (i12 >= this.f411052c) {
                                    return a0Var;
                                }
                            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, i12 + 1));
                            z12 = true;
                        }
                        boolean z13 = z12;
                        if (tVar == null) {
                            tVar = new t<>(k12, b.this.f411048b);
                        }
                        t<K> tVar3 = tVar;
                        while (!atomicReferenceArray.compareAndSet(iHashCode, null, tVar3)) {
                            if (atomicReferenceArray.get(iHashCode) != null) {
                                z12 = z13;
                                tVar = tVar3;
                            }
                        }
                        break loop0;
                    }
                    return null;
                }
                Object obj = tVar2.get();
                if (!k12.equals(obj)) {
                    if (obj == null) {
                        c(iHashCode);
                    }
                    if (iHashCode == 0) {
                        iHashCode = this.f411050a;
                    }
                    iHashCode--;
                } else if (z12) {
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                }
            }
            while (true) {
                AtomicReferenceArray atomicReferenceArray2 = this.f411054e;
                Object obj2 = atomicReferenceArray2.get(iHashCode);
                if (obj2 instanceof u) {
                    return a0Var;
                }
                while (!atomicReferenceArray2.compareAndSet(iHashCode, obj2, v12)) {
                    if (atomicReferenceArray2.get(iHashCode) != obj2) {
                        break;
                    }
                }
                return obj2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Y61.k
        public final b<K, V>.a b() {
            int i12;
            Object obj;
            while (true) {
                b<K, V> bVar = b.this;
                int f38339g = bVar.getF38339g();
                if (f38339g < 4) {
                    f38339g = 4;
                }
                b<K, V>.a aVar = (b<K, V>.a) bVar.new a(Integer.highestOneBit(f38339g) * 4);
                while (i12 < this.f411050a) {
                    t tVar = (t) this.f411053d.get(i12);
                    Object obj2 = tVar != null ? tVar.get() : null;
                    if (tVar != null && obj2 == null) {
                        c(i12);
                    }
                    while (true) {
                        AtomicReferenceArray atomicReferenceArray = this.f411054e;
                        obj = atomicReferenceArray.get(i12);
                        if (!(obj instanceof u)) {
                            u uVar = obj == null ? kotlinx.coroutines.debug.internal.c.f411068b : obj.equals(Boolean.TRUE) ? kotlinx.coroutines.debug.internal.c.f411069c : new u(obj);
                            while (!atomicReferenceArray.compareAndSet(i12, obj, uVar)) {
                                if (atomicReferenceArray.get(i12) != obj) {
                                    break;
                                }
                            }
                            break;
                        }
                        obj = ((u) obj).f411077a;
                        break;
                    }
                    i12 = (obj2 == null || obj == null || aVar.a(obj2, obj, tVar) != kotlinx.coroutines.debug.internal.c.f411067a) ? i12 + 1 : 0;
                }
                return aVar;
            }
        }

        public final void c(int i12) {
            while (true) {
                AtomicReferenceArray atomicReferenceArray = this.f411054e;
                Object obj = atomicReferenceArray.get(i12);
                if (obj == null || (obj instanceof u)) {
                    return;
                }
                while (!atomicReferenceArray.compareAndSet(i12, obj, null)) {
                    if (atomicReferenceArray.get(i12) != obj) {
                        break;
                    }
                }
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b.f411046c;
                b<K, V> bVar = b.this;
                bVar.getClass();
                b.f411046c.decrementAndGet(bVar);
                return;
            }
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$b;", "K", "V", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.debug.internal.b$b, reason: collision with other inner class name */
    public static final class C11711b<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: b, reason: collision with root package name */
        public final K f411061b;

        /* renamed from: c, reason: collision with root package name */
        public final V f411062c;

        public C11711b(K k12, V v12) {
            this.f411061b = k12;
            this.f411062c = v12;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f411061b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f411062c;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v12) {
            throw new UnsupportedOperationException("not implemented");
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$c;", "E", "Lkotlin/collections/h;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c<E> extends AbstractC42748h<E> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final N f411063b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k Y41.p<? super K, ? super V, ? extends E> pVar) {
            this.f411063b = (N) pVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(E e12) {
            throw new UnsupportedOperationException("not implemented");
        }

        @Override // kotlin.collections.AbstractC42748h
        /* renamed from: getSize */
        public final int getF395508f() {
            return b.this.getF38339g();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @Y61.k
        public final Iterator<E> iterator() {
            a aVar = (a) b.f411047d.get(b.this);
            aVar.getClass();
            return aVar.new C11710a(this.f411063b);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "V", "", "k", "v", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<K, V, Map.Entry<K, V>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f411065l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Object obj2) {
            return new C11711b(obj, obj2);
        }
    }

    public b() {
        this(false, 1, null);
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Set<Map.Entry<K, V>> a() {
        return new c(d.f411065l);
    }

    @Override // kotlin.collections.AbstractC42746g
    @Y61.k
    public final Set<K> b() {
        return new c(e.f411066l);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator it = ((c) b()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final synchronized V d(K k12, V v12) {
        V v13;
        a aVarB = (a) f411047d.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a.f411049g;
            v13 = (V) aVarB.a(k12, v12, null);
            if (v13 == kotlinx.coroutines.debug.internal.c.f411067a) {
                aVarB = aVarB.b();
                f411047d.set(this, aVarB);
            }
        }
        return v13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public final V get(@Y61.l Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) f411047d.get(this);
        aVar.getClass();
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> aVar.f411051b;
        while (true) {
            t tVar = (t) aVar.f411053d.get(iHashCode);
            if (tVar == null) {
                return null;
            }
            Object obj2 = tVar.get();
            if (obj.equals(obj2)) {
                Object obj3 = aVar.f411054e.get(iHashCode);
                if (obj3 instanceof u) {
                    obj3 = ((u) obj3).f411077a;
                }
                return (V) obj3;
            }
            if (obj2 == null) {
                aVar.c(iHashCode);
            }
            if (iHashCode == 0) {
                iHashCode = aVar.f411050a;
            }
            iHashCode--;
        }
    }

    @Override // kotlin.collections.AbstractC42746g
    /* renamed from: getSize */
    public final int getF38339g() {
        return f411046c.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public final V put(@Y61.k K k12, @Y61.k V v12) {
        a aVar = (a) f411047d.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a.f411049g;
        V vD2 = (V) aVar.a(k12, v12, null);
        if (vD2 == kotlinx.coroutines.debug.internal.c.f411067a) {
            vD2 = d(k12, v12);
        }
        if (vD2 == null) {
            f411046c.incrementAndGet(this);
        }
        return vD2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Y61.l
    public final V remove(@Y61.l Object obj) {
        if (obj == 0) {
            return null;
        }
        a aVar = (a) f411047d.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a.f411049g;
        V vD2 = (V) aVar.a(obj, null, null);
        if (vD2 == kotlinx.coroutines.debug.internal.c.f411067a) {
            vD2 = d(obj, null);
        }
        if (vD2 != null) {
            f411046c.decrementAndGet(this);
        }
        return vD2;
    }

    public /* synthetic */ b(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    public b(boolean z12) {
        this.core$volatile = new a(16);
        this.f411048b = z12 ? new ReferenceQueue<>() : null;
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "K", "", "V", "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<K, V, K> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f411066l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        @Y61.k
        public final K invoke(@Y61.k K k12, @Y61.k V v12) {
            return k12;
        }
    }
}
