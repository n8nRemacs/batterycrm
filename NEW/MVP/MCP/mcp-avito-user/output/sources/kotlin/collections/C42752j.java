package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42809i;
import kotlin.jvm.internal.C42821v;

/* compiled from: Collections.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/j;", "T", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42752j<T> implements Collection<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T[] f406736b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f406737c;

    /* JADX WARN: Multi-variable type inference failed */
    public C42752j(boolean z12, @Y61.k Object[] objArr) {
        this.f406736b = objArr;
        this.f406737c = z12;
    }

    @Override // java.util.Collection
    public final boolean add(T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return C42756l.h(obj, this.f406736b);
    }

    @Override // java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!C42756l.h(it.next(), this.f406736b)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f406736b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return C42809i.a(this.f406736b);
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
        return this.f406736b.length;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }

    @Override // java.util.Collection
    @Y61.k
    public final Object[] toArray() {
        T[] tArr = this.f406736b;
        return (this.f406737c && tArr.getClass().equals(Object[].class)) ? tArr : Arrays.copyOf(tArr, tArr.length, Object[].class);
    }
}
