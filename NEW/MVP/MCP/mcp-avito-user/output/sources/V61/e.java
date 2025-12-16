package V61;

import java.util.Iterator;
import org.hamcrest.m;

/* compiled from: SelfDescribingValueIterator.java */
/* loaded from: classes7.dex */
public class e<T> implements Iterator<m> {

    /* renamed from: b, reason: collision with root package name */
    public Iterator<T> f16927b;

    public e() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16927b.hasNext();
    }

    @Override // java.util.Iterator
    public final m next() {
        T next = this.f16927b.next();
        d dVar = new d();
        dVar.f16926a = next;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16927b.remove();
    }
}
