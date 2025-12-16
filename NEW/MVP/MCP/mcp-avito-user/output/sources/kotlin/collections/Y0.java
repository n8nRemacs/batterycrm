package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/Y0;", "T", "Lkotlin/collections/f;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class Y0<T> extends AbstractC42744f<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<T> f406650b;

    /* compiled from: ReversedViews.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010+\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/Y0$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListIterator<T>, Z41.f {

        /* renamed from: b, reason: collision with root package name */
        public final ListIterator<T> f406651b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y0<T> f406652c;

        public a(Y0<T> y02, int i12) {
            this.f406652c = y02;
            this.f406651b = y02.f406650b.listIterator(C42767q0.e(i12, y02));
        }

        @Override // java.util.ListIterator
        public final void add(T t12) {
            ListIterator<T> listIterator = this.f406651b;
            listIterator.add(t12);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f406651b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f406651b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f406651b.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return C42745f0.J(this.f406652c) - this.f406651b.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f406651b.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return C42745f0.J(this.f406652c) - this.f406651b.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f406651b.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t12) {
            this.f406651b.set(t12);
        }
    }

    public Y0(@Y61.k List<T> list) {
        this.f406650b = list;
    }

    @Override // kotlin.collections.AbstractC42744f
    public final T a(int i12) {
        return this.f406650b.remove(C42767q0.d(i12, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i12, T t12) {
        this.f406650b.add(C42767q0.e(i12, this), t12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f406650b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i12) {
        return this.f406650b.get(C42767q0.d(i12, this));
    }

    @Override // kotlin.collections.AbstractC42744f
    /* renamed from: getSize */
    public final int getF38308i() {
        return this.f406650b.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    @Y61.k
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i12, T t12) {
        return this.f406650b.set(C42767q0.d(i12, this), t12);
    }

    @Override // java.util.AbstractList, java.util.List
    @Y61.k
    public final ListIterator<T> listIterator(int i12) {
        return new a(this, i12);
    }
}
