package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/collections/J0;", "T", "", "Lkotlin/collections/H0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class J0<T> implements Iterator<H0<? extends T>>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Iterator<T> f406646b;

    /* renamed from: c, reason: collision with root package name */
    public int f406647c;

    /* JADX WARN: Multi-variable type inference failed */
    public J0(@Y61.k Iterator<? extends T> it) {
        this.f406646b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406646b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i12 = this.f406647c;
        this.f406647c = i12 + 1;
        if (i12 >= 0) {
            return new H0(i12, this.f406646b.next());
        }
        C42745f0.H0();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
