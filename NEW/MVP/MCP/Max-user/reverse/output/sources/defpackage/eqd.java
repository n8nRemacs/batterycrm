package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class eqd implements ListIterator, my7 {
    public final /* synthetic */ int a = 0;
    public final ListIterator b;
    public final /* synthetic */ Object c;

    public eqd(wp8 wp8Var, int i) {
        this.c = wp8Var;
        this.b = ((List) wp8Var.b).listIterator(ue3.z(i, wp8Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
        }
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int i;
        switch (this.a) {
            case 0:
                fqd fqdVar = (fqd) this.c;
                iPreviousIndex = this.b.previousIndex();
                i = ve3.i(fqdVar);
                break;
            default:
                wp8 wp8Var = (wp8) this.c;
                iPreviousIndex = this.b.previousIndex();
                i = ve3.i(wp8Var);
                break;
        }
        return i - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
        }
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int i;
        switch (this.a) {
            case 0:
                fqd fqdVar = (fqd) this.c;
                iNextIndex = this.b.nextIndex();
                i = ve3.i(fqdVar);
                break;
            default:
                wp8 wp8Var = (wp8) this.c;
                iNextIndex = this.b.nextIndex();
                i = ve3.i(wp8Var);
                break;
        }
        return i - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                this.b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public eqd(fqd fqdVar, int i) {
        this.c = fqdVar;
        this.b = fqdVar.a.listIterator(ue3.z(i, fqdVar));
    }
}
