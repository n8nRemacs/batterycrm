package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: AbstractIterator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/b;", "T", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42736b<T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public int f406664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public T f406665c;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f406664b;
        if (i12 == 0) {
            this.f406664b = 3;
            a();
            if (this.f406664b != 1) {
                return false;
            }
        } else if (i12 != 1) {
            if (i12 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i12 = this.f406664b;
        if (i12 == 1) {
            this.f406664b = 0;
            return this.f406665c;
        }
        if (i12 != 2) {
            this.f406664b = 3;
            a();
            if (this.f406664b == 1) {
                this.f406664b = 0;
                return this.f406665c;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
