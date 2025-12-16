package h0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentOrderedSetIterator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lh0/d;", "E", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class d<E> implements Iterator<E>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Object f396964b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<E, C40753a> f396965c;

    /* renamed from: d, reason: collision with root package name */
    public int f396966d;

    public d(@k Map map, @l Object obj) {
        this.f396964b = obj;
        this.f396965c = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f396966d < this.f396965c.size();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e12 = (E) this.f396964b;
        this.f396966d++;
        C40753a c40753a = this.f396965c.get(e12);
        if (c40753a != null) {
            this.f396964b = c40753a.f396954b;
            return e12;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e12 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
