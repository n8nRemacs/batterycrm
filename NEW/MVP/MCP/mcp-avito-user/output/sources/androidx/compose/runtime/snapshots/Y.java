package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.J;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateSet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/Y;", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Y<T> implements Iterator<T>, Z41.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J<T> f38676b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Iterator<T> f38677c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public T f38678d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public T f38679e;

    /* renamed from: f, reason: collision with root package name */
    public int f38680f;

    /* JADX WARN: Multi-variable type inference failed */
    public Y(@Y61.k J<T> j12, @Y61.k Iterator<? extends T> it) {
        this.f38676b = j12;
        this.f38677c = it;
        this.f38680f = ((J.a) C22176v.h(j12.f38653b)).f38655d;
        this.f38678d = this.f38679e;
        this.f38679e = it.hasNext() ? (T) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38679e != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (((J.a) C22176v.h(this.f38676b.f38653b)).f38655d != this.f38680f) {
            throw new ConcurrentModificationException();
        }
        this.f38678d = this.f38679e;
        Iterator<T> it = this.f38677c;
        this.f38679e = it.hasNext() ? it.next() : null;
        T t12 = this.f38678d;
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        J<T> j12 = this.f38676b;
        if (((J.a) C22176v.h(j12.f38653b)).f38655d != this.f38680f) {
            throw new ConcurrentModificationException();
        }
        T t12 = this.f38678d;
        if (t12 == null) {
            throw new IllegalStateException();
        }
        j12.remove(t12);
        this.f38678d = null;
        G0 g02 = G0.f406611a;
        this.f38680f = ((J.a) C22176v.h(j12.f38653b)).f38655d;
    }
}
