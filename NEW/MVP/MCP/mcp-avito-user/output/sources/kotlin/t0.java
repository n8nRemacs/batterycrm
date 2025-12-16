package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42821v;

/* compiled from: UIntArray.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/t0;", "", "Lkotlin/s0;", "a", "storage", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@InterfaceC43069u
@X41.g
/* loaded from: classes8.dex */
public final class t0 implements Collection<s0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f410567b;

    /* compiled from: UIntArray.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/t0$a;", "", "Lkotlin/s0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<s0>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final int[] f410568b;

        /* renamed from: c, reason: collision with root package name */
        public int f410569c;

        public a(@Y61.k int[] iArr) {
            this.f410568b = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410569c < this.f410568b.length;
        }

        @Override // java.util.Iterator
        public final s0 next() {
            int i12 = this.f410569c;
            int[] iArr = this.f410568b;
            if (i12 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f410569c));
            }
            this.f410569c = i12 + 1;
            return s0.a(iArr[i12]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @X
    private /* synthetic */ t0(int[] iArr) {
        this.f410567b = iArr;
    }

    public static final /* synthetic */ t0 a(int[] iArr) {
        return new t0(iArr);
    }

    @Y61.k
    public static Iterator b() {
        return new a(null);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(s0 s0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends s0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof s0) {
            return C42756l.g(((s0) obj).f410476b, this.f410567b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof s0) || !C42756l.g(((s0) obj).f410476b, this.f410567b)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            return kotlin.jvm.internal.L.f(this.f410567b, ((t0) obj).f410567b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f410567b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f410567b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<s0> iterator() {
        return new a(this.f410567b);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f410567b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f410567b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
