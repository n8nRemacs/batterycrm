package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ArrayIterator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/h;", "T", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42808h<T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T[] f406833b;

    /* renamed from: c, reason: collision with root package name */
    public int f406834c;

    public C42808h(@Y61.k T[] tArr) {
        this.f406833b = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f406834c < this.f406833b.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f406833b;
            int i12 = this.f406834c;
            this.f406834c = i12 + 1;
            return tArr[i12];
        } catch (ArrayIndexOutOfBoundsException e12) {
            this.f406834c--;
            throw new NoSuchElementException(e12.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
