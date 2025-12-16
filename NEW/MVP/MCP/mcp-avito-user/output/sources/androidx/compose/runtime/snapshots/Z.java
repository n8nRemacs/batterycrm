package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.P1;
import androidx.compose.runtime.snapshots.D;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateList.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/Z;", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Z<T> implements List<T>, Z41.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D<T> f38681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38682c;

    /* renamed from: d, reason: collision with root package name */
    public int f38683d;

    /* renamed from: e, reason: collision with root package name */
    public int f38684e;

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010+\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/snapshots/Z$a", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListIterator<T>, Z41.f {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0.f f38685b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Z<T> f38686c;

        public a(l0.f fVar, Z<T> z12) {
            this.f38685b = fVar;
            this.f38686c = z12;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f38685b.f406840b < this.f38686c.f38684e - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f38685b.f406840b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            l0.f fVar = this.f38685b;
            int i12 = fVar.f406840b + 1;
            Z<T> z12 = this.f38686c;
            E.a(i12, z12.f38684e);
            fVar.f406840b = i12;
            return z12.get(i12);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f38685b.f406840b + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            l0.f fVar = this.f38685b;
            int i12 = fVar.f406840b;
            Z<T> z12 = this.f38686c;
            E.a(i12, z12.f38684e);
            fVar.f406840b = i12 - 1;
            return z12.get(i12);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f38685b.f406840b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public Z(@Y61.k D<T> d12, int i12, int i13) {
        this.f38681b = d12;
        this.f38682c = i12;
        this.f38683d = d12.g();
        this.f38684e = i13 - i12;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t12) {
        b();
        int i12 = this.f38682c + this.f38684e;
        D<T> d12 = this.f38681b;
        d12.add(i12, t12);
        this.f38684e++;
        this.f38683d = d12.g();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@Y61.k Collection<? extends T> collection) {
        return addAll(this.f38684e, collection);
    }

    public final void b() {
        if (this.f38681b.g() != this.f38683d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f38684e > 0) {
            b();
            int i12 = this.f38684e;
            int i13 = this.f38682c;
            D<T> d12 = this.f38681b;
            d12.l(i13, i12 + i13);
            this.f38684e = 0;
            this.f38683d = d12.g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i12) {
        b();
        E.a(i12, this.f38684e);
        return this.f38681b.get(this.f38682c + i12);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i12 = this.f38684e;
        int i13 = this.f38682c;
        kotlin.ranges.k it = kotlin.ranges.s.r(i13, i12 + i13).iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            if (kotlin.jvm.internal.L.f(obj, this.f38681b.get(iA2))) {
                return iA2 - i13;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f38684e == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i12 = this.f38684e;
        int i13 = this.f38682c;
        for (int i14 = (i12 + i13) - 1; i14 >= i13; i14--) {
            if (kotlin.jvm.internal.L.f(obj, this.f38681b.get(i14))) {
                return i14 - i13;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z12 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z12) {
                    z12 = true;
                }
            }
            return z12;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        b();
        D<T> d12 = this.f38681b;
        int i13 = this.f38682c;
        int i14 = this.f38684e + i13;
        int size = d12.size();
        do {
            synchronized (E.f38619a) {
                D.a aVar = (D.a) C22176v.h(d12.f38612b);
                i12 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVarBuilder = gVar.builder();
            gVarBuilder.subList(i13, i14).retainAll(collection);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g gVarB = gVarBuilder.b();
            if (kotlin.jvm.internal.L.f(gVarB, gVar)) {
                break;
            }
            D.a aVar2 = d12.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = D.b((D.a) C22176v.v(aVar2, d12, abstractC22167lJ), i12, gVarB, true);
            }
            C22176v.m(abstractC22167lJ, d12);
        } while (!zB2);
        int size2 = size - d12.size();
        if (size2 > 0) {
            this.f38683d = this.f38681b.g();
            this.f38684e -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i12, T t12) {
        E.a(i12, this.f38684e);
        b();
        int i13 = i12 + this.f38682c;
        D<T> d12 = this.f38681b;
        T t13 = d12.set(i13, t12);
        this.f38683d = d12.g();
        return t13;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f38684e;
    }

    @Override // java.util.List
    @Y61.k
    public final List<T> subList(int i12, int i13) {
        if (!(i12 >= 0 && i12 <= i13 && i13 <= this.f38684e)) {
            P1.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i14 = this.f38682c;
        return new Z(this.f38681b, i12 + i14, i13 + i14);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<T> listIterator(int i12) {
        b();
        l0.f fVar = new l0.f();
        fVar.f406840b = i12 - 1;
        return new a(fVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i12, @Y61.k Collection<? extends T> collection) {
        b();
        int i13 = i12 + this.f38682c;
        D<T> d12 = this.f38681b;
        boolean zAddAll = d12.addAll(i13, collection);
        if (zAddAll) {
            this.f38684e = collection.size() + this.f38684e;
            this.f38683d = d12.g();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i12) {
        b();
        int i13 = this.f38682c + i12;
        D<T> d12 = this.f38681b;
        T tRemove = d12.remove(i13);
        this.f38684e--;
        this.f38683d = d12.g();
        return tRemove;
    }

    @Override // java.util.List
    public final void add(int i12, T t12) {
        b();
        int i13 = this.f38682c + i12;
        D<T> d12 = this.f38681b;
        d12.add(i13, t12);
        this.f38684e++;
        this.f38683d = d12.g();
    }
}
