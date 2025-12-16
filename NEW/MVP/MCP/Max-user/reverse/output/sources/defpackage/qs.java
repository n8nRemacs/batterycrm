package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class qs implements Iterator, my7 {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object o;

    public qs(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        switch (this.d) {
            case 0:
                objF = ((us) this.o).f(i);
                break;
            case 1:
                objF = ((us) this.o).i(i);
                break;
            default:
                objF = ((xs) this.o).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.b - 1;
        this.b = i;
        switch (this.d) {
            case 0:
                ((us) this.o).g(i);
                break;
            case 1:
                ((us) this.o).g(i);
                break;
            default:
                ((xs) this.o).d(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qs(xs xsVar) {
        this(xsVar.c);
        this.d = 2;
        this.o = xsVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qs(us usVar, int i) {
        this(usVar.c);
        this.d = i;
        switch (i) {
            case 1:
                this.o = usVar;
                this(usVar.c);
                break;
            default:
                this.o = usVar;
                break;
        }
    }
}
