package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class et7 extends rrg {
    public final /* synthetic */ Object X;
    public int b;
    public Object c;
    public final /* synthetic */ int d;
    public final Iterator o;

    public et7() {
        super(0);
        this.b = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iV = az1.v(i);
        if (iV == 0) {
            return true;
        }
        if (iV == 2) {
            return false;
        }
        this.b = 4;
        switch (this.d) {
            case 0:
                do {
                    Iterator it = this.o;
                    if (!it.hasNext()) {
                        this.b = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((l7c) this.X).apply(next));
            default:
                do {
                    Iterator it2 = this.o;
                    if (!it2.hasNext()) {
                        this.b = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((cke) this.X).b.contains(next));
        }
        this.c = next;
        if (this.b == 3) {
            return false;
        }
        this.b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public et7(Iterator it, l7c l7cVar) {
        this();
        this.d = 0;
        this.o = it;
        this.X = l7cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public et7(cke ckeVar) {
        this();
        this.d = 1;
        this.X = ckeVar;
        this.o = ckeVar.a.iterator();
    }
}
