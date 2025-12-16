package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42821v;

/* compiled from: UByteArray.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/p0;", "", "Lkotlin/o0;", "a", "storage", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@InterfaceC43069u
@X41.g
/* loaded from: classes8.dex */
public final class p0 implements Collection<o0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final byte[] f406876b;

    /* compiled from: UByteArray.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/p0$a;", "", "Lkotlin/o0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<o0>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final byte[] f406877b;

        /* renamed from: c, reason: collision with root package name */
        public int f406878c;

        public a(@Y61.k byte[] bArr) {
            this.f406877b = bArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f406878c < this.f406877b.length;
        }

        @Override // java.util.Iterator
        public final o0 next() {
            int i12 = this.f406878c;
            byte[] bArr = this.f406877b;
            if (i12 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f406878c));
            }
            this.f406878c = i12 + 1;
            return o0.a(bArr[i12]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @X
    private /* synthetic */ p0(byte[] bArr) {
        this.f406876b = bArr;
    }

    public static final /* synthetic */ p0 a(byte[] bArr) {
        return new p0(bArr);
    }

    @Y61.k
    public static Iterator b() {
        return new a(null);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(o0 o0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends o0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof o0) {
            return C42756l.I(this.f406876b, ((o0) obj).f406875b) >= 0;
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
            if (obj instanceof o0) {
                if (C42756l.I(this.f406876b, ((o0) obj).f406875b) >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return kotlin.jvm.internal.L.f(this.f406876b, ((p0) obj).f406876b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f406876b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f406876b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<o0> iterator() {
        return new a(this.f406876b);
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
        return this.f406876b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f406876b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
