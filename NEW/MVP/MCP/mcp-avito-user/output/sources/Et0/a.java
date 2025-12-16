package ET0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;

/* compiled from: ImmutableList.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LET0/a;", "T", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a<T> implements List<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f4014b;

    public a(@Y61.k ArrayList arrayList) {
        this.f4014b = arrayList;
    }

    @Override // java.util.List
    public final void add(int i12, T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4014b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        return this.f4014b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f4014b.equals(((a) obj).f4014b);
    }

    @Override // java.util.List
    public final T get(int i12) {
        return (T) this.f4014b.get(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f4014b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f4014b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4014b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return this.f4014b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f4014b.lastIndexOf(obj);
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<T> listIterator() {
        return this.f4014b.listIterator();
    }

    @Override // java.util.List
    public final T remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final T set(int i12, T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4014b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final List<T> subList(int i12, int i13) {
        return this.f4014b.subList(i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ImmutableList(value="), this.f4014b, ')');
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<T> listIterator(int i12) {
        return this.f4014b.listIterator(i12);
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
