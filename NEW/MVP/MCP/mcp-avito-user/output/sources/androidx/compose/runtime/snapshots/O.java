package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateList.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/O;", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class O<T> implements ListIterator<T>, Z41.f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D<T> f38661b;

    /* renamed from: c, reason: collision with root package name */
    public int f38662c;

    /* renamed from: d, reason: collision with root package name */
    public int f38663d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f38664e;

    public O(@Y61.k D<T> d12, int i12) {
        this.f38661b = d12;
        this.f38662c = i12 - 1;
        this.f38664e = d12.g();
    }

    public final void a() {
        if (this.f38661b.g() != this.f38664e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t12) {
        a();
        int i12 = this.f38662c + 1;
        D<T> d12 = this.f38661b;
        d12.add(i12, t12);
        this.f38663d = -1;
        this.f38662c++;
        this.f38664e = d12.g();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f38662c < this.f38661b.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38662c >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i12 = this.f38662c + 1;
        this.f38663d = i12;
        D<T> d12 = this.f38661b;
        E.a(i12, d12.size());
        T t12 = d12.get(i12);
        this.f38662c = i12;
        return t12;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38662c + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i12 = this.f38662c;
        D<T> d12 = this.f38661b;
        E.a(i12, d12.size());
        int i13 = this.f38662c;
        this.f38663d = i13;
        this.f38662c--;
        return d12.get(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38662c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i12 = this.f38662c;
        D<T> d12 = this.f38661b;
        d12.remove(i12);
        this.f38662c--;
        this.f38663d = -1;
        this.f38664e = d12.g();
    }

    @Override // java.util.ListIterator
    public final void set(T t12) {
        a();
        int i12 = this.f38663d;
        if (i12 < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        D<T> d12 = this.f38661b;
        d12.set(i12, t12);
        this.f38664e = d12.g();
    }
}
