package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42821v;

/* compiled from: UShortArray.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/D0;", "", "Lkotlin/C0;", "a", "storage", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@InterfaceC43069u
@X41.g
/* loaded from: classes8.dex */
public final class D0 implements Collection<C0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final short[] f406604b;

    /* compiled from: UShortArray.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/D0$a;", "", "Lkotlin/C0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<C0>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final short[] f406605b;

        /* renamed from: c, reason: collision with root package name */
        public int f406606c;

        public a(@Y61.k short[] sArr) {
            this.f406605b = sArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f406606c < this.f406605b.length;
        }

        @Override // java.util.Iterator
        public final C0 next() {
            int i12 = this.f406606c;
            short[] sArr = this.f406605b;
            if (i12 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f406606c));
            }
            this.f406606c = i12 + 1;
            return C0.a(sArr[i12]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @X
    private /* synthetic */ D0(short[] sArr) {
        this.f406604b = sArr;
    }

    public static final /* synthetic */ D0 a(short[] sArr) {
        return new D0(sArr);
    }

    @Y61.k
    public static Iterator b() {
        return new a(null);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C0 c02) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof C0) {
            return C42756l.L(this.f406604b, ((C0) obj).f406603b) >= 0;
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
            if (obj instanceof C0) {
                if (C42756l.L(this.f406604b, ((C0) obj).f406603b) >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof D0) {
            return kotlin.jvm.internal.L.f(this.f406604b, ((D0) obj).f406604b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f406604b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f406604b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<C0> iterator() {
        return new a(this.f406604b);
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
        return this.f406604b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f406604b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
