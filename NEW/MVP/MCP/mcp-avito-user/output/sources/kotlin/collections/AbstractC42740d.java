package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AbstractMap.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/collections/d;", "K", "V", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42740d<K, V> implements Map<K, V>, Z41.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f406719d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public volatile b f406720b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public volatile C11633d f406721c;

    /* compiled from: AbstractMap.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/d$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/d$b", "Lkotlin/collections/i;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$b */
    public static final class b extends AbstractC42750i<K> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC42740d<K, V> f406722c;

        /* compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/d$b$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.collections.d$b$a */
        public static final class a implements Iterator<K>, Z41.a {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f406723b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f406723b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f406723b.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                return this.f406723b.next().getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(AbstractC42740d<K, ? extends V> abstractC42740d) {
            this.f406722c = abstractC42740d;
        }

        @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.f406722c.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractC42734a
        /* renamed from: getSize */
        public final int getF406660f() {
            return this.f406722c.getF38330f();
        }

        @Override // kotlin.collections.AbstractC42750i, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f406722c.b().iterator());
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", "V", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC42740d<K, V> f406724l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC42740d<K, ? extends V> abstractC42740d) {
            super(1);
            this.f406724l = abstractC42740d;
        }

        @Override // Y41.l
        public final CharSequence invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            int i12 = AbstractC42740d.f406719d;
            AbstractC42740d<K, V> abstractC42740d = this.f406724l;
            StringBuilder sb2 = new StringBuilder();
            Object key = entry.getKey();
            sb2.append(key == abstractC42740d ? "(this Map)" : String.valueOf(key));
            sb2.append('=');
            Object value = entry.getValue();
            sb2.append(value != abstractC42740d ? String.valueOf(value) : "(this Map)");
            return sb2.toString();
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/d$d", "Lkotlin/collections/a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    public static final class C11633d extends AbstractC42734a<V> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC42740d<K, V> f406725b;

        /* compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/d$d$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.collections.d$d$a */
        public static final class a implements Iterator<V>, Z41.a {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f406726b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f406726b = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f406726b.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return this.f406726b.next().getValue();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C11633d(AbstractC42740d<K, ? extends V> abstractC42740d) {
            this.f406725b = abstractC42740d;
        }

        @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.f406725b.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractC42734a
        /* renamed from: getSize */
        public final int getF406660f() {
            return this.f406725b.getF38330f();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(this.f406725b.b().iterator());
        }
    }

    static {
        new a(null);
    }

    public abstract Set b();

    @Y61.k
    public Set<K> c() {
        if (this.f406720b == null) {
            this.f406720b = new b(this);
        }
        return this.f406720b;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setB = b();
        if (setB.isEmpty()) {
            return false;
        }
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.L.f(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    public Collection<V> d() {
        if (this.f406721c == null) {
            this.f406721c = new C11633d(this);
        }
        return this.f406721c;
    }

    public final Map.Entry<K, V> e(K k12) {
        Object next;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((Map.Entry) next).getKey(), k12)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    @Override // java.util.Map
    public final boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getF38330f() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v12 = get(key);
                if (kotlin.jvm.internal.L.f(value, v12) && (v12 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Y61.l
    public V get(Object obj) {
        Map.Entry<K, V> entryE = e(obj);
        if (entryE != null) {
            return entryE.getValue();
        }
        return null;
    }

    /* renamed from: getSize */
    public int getF38330f() {
        return b().size();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return getF38330f() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    @Override // java.util.Map
    public final V put(K k12, V v12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getF38330f();
    }

    @Y61.k
    public final String toString() {
        return C42745f0.O(b(), ", ", "{", "}", new c(this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
