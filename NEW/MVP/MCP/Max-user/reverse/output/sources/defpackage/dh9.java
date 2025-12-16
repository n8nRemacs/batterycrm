package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class dh9 implements Iterator, my7 {
    public final Iterator a;
    public final Iterator b;
    public final /* synthetic */ az4 c;

    public dh9(az4 az4Var) {
        this.c = az4Var;
        this.a = ((Iterable) ((at) az4Var.b).b).iterator();
        this.b = ((Iterable) ((at) az4Var.c).b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.c.getClass();
        return new imb(this.a.next(), this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
