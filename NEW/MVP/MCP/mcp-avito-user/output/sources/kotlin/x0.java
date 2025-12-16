package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42821v;

/* compiled from: ULongArray.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/x0;", "", "Lkotlin/w0;", "a", "storage", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@InterfaceC43069u
@X41.g
/* loaded from: classes8.dex */
public final class x0 implements Collection<w0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final long[] f410664b;

    /* compiled from: ULongArray.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/x0$a;", "", "Lkotlin/w0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<w0>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final long[] f410665b;

        /* renamed from: c, reason: collision with root package name */
        public int f410666c;

        public a(@Y61.k long[] jArr) {
            this.f410665b = jArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410666c < this.f410665b.length;
        }

        @Override // java.util.Iterator
        public final w0 next() {
            int i12 = this.f410666c;
            long[] jArr = this.f410665b;
            if (i12 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f410666c));
            }
            this.f410666c = i12 + 1;
            return w0.a(jArr[i12]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @X
    private /* synthetic */ x0(long[] jArr) {
        this.f410664b = jArr;
    }

    public static final /* synthetic */ x0 a(long[] jArr) {
        return new x0(jArr);
    }

    @Y61.k
    public static Iterator b() {
        return new a(null);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(w0 w0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends w0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof w0) {
            return C42756l.K(this.f410664b, ((w0) obj).f410663b) >= 0;
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
            if (obj instanceof w0) {
                if (C42756l.K(this.f410664b, ((w0) obj).f410663b) >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            return kotlin.jvm.internal.L.f(this.f410664b, ((x0) obj).f410664b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f410664b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f410664b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<w0> iterator() {
        return new a(this.f410664b);
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
        return this.f410664b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f410664b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
