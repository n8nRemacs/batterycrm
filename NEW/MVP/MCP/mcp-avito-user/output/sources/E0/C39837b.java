package e0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;

/* compiled from: ReadOnlyCollectionAdapters.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Le0/b;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39837b<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.c<E>, List<E>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<E> f394242b;

    /* JADX WARN: Multi-variable type inference failed */
    public C39837b(@k List<? extends E> list) {
        this.f394242b = list;
    }

    @Override // java.util.List
    public final void add(int i12, E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f394242b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        return this.f394242b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@l Object obj) {
        return this.f394242b.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i12) {
        return this.f394242b.get(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f394242b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f394242b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f394242b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public final Iterator<E> iterator() {
        return this.f394242b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f394242b.lastIndexOf(obj);
    }

    @Override // java.util.List
    @k
    public final ListIterator<E> listIterator() {
        return this.f394242b.listIterator();
    }

    @Override // java.util.List
    public final E remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i12, E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f394242b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i12, int i13) {
        return new C39837b(this.f394242b.subList(i12, i13));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @k
    public final String toString() {
        return this.f394242b.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @k
    public final ListIterator<E> listIterator(int i12) {
        return this.f394242b.listIterator(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
