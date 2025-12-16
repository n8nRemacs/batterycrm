package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m98 implements ListIterator, my7 {
    public int b;
    public int d;
    public final f3 o;
    public final /* synthetic */ int a = 0;
    public int c = -1;

    public m98(o98 o98Var, int i) {
        this.o = o98Var;
        this.b = i;
        this.d = ((AbstractList) o98Var).modCount;
    }

    public void a() {
        if (((AbstractList) ((n98) this.o).o).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                a();
                n98 n98Var = (n98) this.o;
                int i = this.b;
                this.b = i + 1;
                n98Var.add(i, obj);
                this.c = -1;
                this.d = ((AbstractList) n98Var).modCount;
                break;
            default:
                b();
                o98 o98Var = (o98) this.o;
                int i2 = this.b;
                this.b = i2 + 1;
                o98Var.add(i2, obj);
                this.c = -1;
                this.d = ((AbstractList) o98Var).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((o98) this.o)).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((n98) this.o).c) {
                }
                break;
            default:
                if (this.b < ((o98) this.o).b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                n98 n98Var = (n98) this.o;
                if (i >= n98Var.c) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                this.c = i;
                return n98Var.a[n98Var.b + i];
            default:
                b();
                int i2 = this.b;
                o98 o98Var = (o98) this.o;
                if (i2 >= o98Var.b) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                this.c = i2;
                return o98Var.a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                n98 n98Var = (n98) this.o;
                return n98Var.a[n98Var.b + i2];
            default:
                b();
                int i3 = this.b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.b = i4;
                this.c = i4;
                return ((o98) this.o).a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                i = this.b;
                break;
            default:
                i = this.b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                n98 n98Var = (n98) this.o;
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                n98Var.a(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) n98Var).modCount;
                return;
            default:
                o98 o98Var = (o98) this.o;
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                o98Var.a(i2);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) o98Var).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((n98) this.o).set(i, obj);
                return;
            default:
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((o98) this.o).set(i2, obj);
                return;
        }
    }

    public m98(n98 n98Var, int i) {
        this.o = n98Var;
        this.b = i;
        this.d = ((AbstractList) n98Var).modCount;
    }
}
