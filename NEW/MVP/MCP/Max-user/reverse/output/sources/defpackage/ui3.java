package defpackage;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ui3 implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap o;

    public ui3(wi3 wi3Var, byte b) {
        this.o = wi3Var;
        this.b = wi3Var.X;
        this.c = wi3Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                }
                break;
            default:
                if (this.c >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                wi3 wi3Var = (wi3) this.o;
                if (wi3Var.X != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.c;
                this.d = i;
                Object objA = a(i);
                int i2 = this.c + 1;
                if (i2 >= wi3Var.Y) {
                    i2 = -1;
                }
                this.c = i2;
                return objA;
            default:
                wi3 wi3Var2 = (wi3) this.o;
                if (wi3Var2.X != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.c;
                this.d = i3;
                Object objB = b(i3);
                int i4 = this.c + 1;
                if (i4 >= wi3Var2.Y) {
                    i4 = -1;
                }
                this.c = i4;
                return objB;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                wi3 wi3Var = (wi3) this.o;
                int i = wi3Var.X;
                int i2 = this.b;
                if (i != i2) {
                    throw new ConcurrentModificationException();
                }
                int i3 = this.d;
                if (!(i3 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b = i2 + 32;
                wi3Var.remove(wi3Var.i()[i3]);
                this.c--;
                this.d = -1;
                return;
            default:
                wi3 wi3Var2 = (wi3) this.o;
                if (wi3Var2.X != this.b) {
                    throw new ConcurrentModificationException();
                }
                rui.e("no calls to next() since the last call to remove()", this.d >= 0);
                this.b += 32;
                wi3Var2.remove(wi3Var2.m()[this.d]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public ui3(wi3 wi3Var) {
        this.o = wi3Var;
        this.b = wi3Var.X;
        this.c = wi3Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
