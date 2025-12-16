package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class z55 implements Iterator, my7 {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public int c;

    public z55(Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                return this.b.hasNext();
            default:
                return this.c > 0 && this.b.hasNext();
        }
        while (true) {
            int i = this.c;
            it = this.b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new uj7(i, this.b.next());
                }
                ve3.p();
                throw null;
            default:
                int i2 = this.c;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.c = i2 - 1;
                return this.b.next();
        }
        while (true) {
            int i3 = this.c;
            it = this.b;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z55(a65 a65Var, byte b) {
        this.c = a65Var.c;
        this.b = a65Var.b.iterator();
    }

    public z55(a65 a65Var) {
        this.b = a65Var.b.iterator();
        this.c = a65Var.c;
    }
}
