package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/view/Z;", "T", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z<T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, Iterator<T>> f44987b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f44988c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Iterator<? extends T> f44989d;

    /* JADX WARN: Multi-variable type inference failed */
    public Z(@Y61.k Iterator<? extends T> it, @Y61.k Y41.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.f44987b = lVar;
        this.f44989d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44989d.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.f44989d.next();
        Iterator<? extends T> it = (Iterator) ((C22831l0) this.f44987b).invoke(next);
        ArrayList arrayList = this.f44988c;
        if (it == null || !it.hasNext()) {
            while (!this.f44989d.hasNext() && !arrayList.isEmpty()) {
                this.f44989d = (Iterator) C42745f0.Q(arrayList);
                C42745f0.n0(arrayList);
            }
        } else {
            arrayList.add(this.f44989d);
            this.f44989d = it;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
