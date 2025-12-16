package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/Z0;", "T", "Lkotlin/collections/c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
class Z0<T> extends AbstractC42738c<T> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<T> f406653c;

    /* compiled from: ReversedViews.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010*\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/Z0$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListIterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final ListIterator<T> f406654b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Z0<T> f406655c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Z0<? extends T> z02, int i12) {
            this.f406655c = z02;
            this.f406654b = z02.f406653c.listIterator(C42767q0.e(i12, z02));
        }

        @Override // java.util.ListIterator
        public final void add(T t12) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f406654b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f406654b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f406654b.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return C42745f0.J(this.f406655c) - this.f406654b.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f406654b.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return C42745f0.J(this.f406655c) - this.f406654b.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t12) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z0(@Y61.k List<? extends T> list) {
        this.f406653c = list;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final T get(int i12) {
        return this.f406653c.get(C42767q0.d(i12, this));
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF406660f() {
        return this.f406653c.size();
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.Collection, java.lang.Iterable, java.util.List
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    @Y61.k
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    @Y61.k
    public final ListIterator<T> listIterator(int i12) {
        return new a(this, i12);
    }
}
