package n51;

import Y61.k;
import Y61.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.L;

/* compiled from: TargetPlatform.kt */
/* renamed from: n51.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44200c implements Collection<AbstractC44199b>, Z41.a {
    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(AbstractC44199b abstractC44199b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends AbstractC44199b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof AbstractC44199b) {
            throw null;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44200c)) {
            return false;
        }
        ((C44200c) obj).getClass();
        return L.f(null, null);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @k
    public final Iterator<AbstractC44199b> iterator() {
        throw null;
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
    public final boolean removeIf(Predicate<? super AbstractC44199b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @k
    public final String toString() {
        return C42745f0.O(null, "/", null, null, null, 62);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
