package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n98 extends f3 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final n98 d;
    public final o98 o;

    public n98(Object[] objArr, int i, int i2, n98 n98Var, o98 o98Var) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = n98Var;
        this.o = o98Var;
        ((AbstractList) this).modCount = ((AbstractList) o98Var).modCount;
    }

    @Override // defpackage.f3
    public final Object a(int i) {
        f();
        e();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        return g(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        e();
        d(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        e();
        int size = collection.size();
        c(this.b + this.c, collection, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        o98 o98Var = this.o;
        n98 n98Var = this.d;
        if (n98Var != null) {
            n98Var.c(i, collection, i2);
        } else {
            o98 o98Var2 = o98.d;
            o98Var.c(i, collection, i2);
        }
        this.a = o98Var.a;
        this.c += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        e();
        h(this.b, this.c);
    }

    public final void d(int i, Object obj) {
        ((AbstractList) this).modCount++;
        o98 o98Var = this.o;
        n98 n98Var = this.d;
        if (n98Var != null) {
            n98Var.d(i, obj);
        } else {
            o98 o98Var2 = o98.d;
            o98Var.d(i, obj);
        }
        this.a = o98Var.a;
        this.c++;
    }

    public final void e() {
        if (((AbstractList) this.o).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        e();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (fni.a(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.o.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object g(int i) {
        Object objG;
        ((AbstractList) this).modCount++;
        n98 n98Var = this.d;
        if (n98Var != null) {
            objG = n98Var.g(i);
        } else {
            o98 o98Var = o98.d;
            objG = this.o.g(i);
        }
        this.c--;
        return objG;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        e();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        return this.a[this.b + i];
    }

    @Override // defpackage.f3
    public final int getSize() {
        e();
        return this.c;
    }

    public final void h(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        n98 n98Var = this.d;
        if (n98Var != null) {
            n98Var.h(i, i2);
        } else {
            o98 o98Var = o98.d;
            this.o.h(i, i2);
        }
        this.c -= i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        e();
        Object[] objArr = this.a;
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final int i(int i, int i2, Collection collection, boolean z) {
        int i3;
        n98 n98Var = this.d;
        if (n98Var != null) {
            i3 = n98Var.i(i, i2, collection, z);
        } else {
            o98 o98Var = o98.d;
            i3 = this.o.i(i, i2, collection, z);
        }
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= i3;
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        e();
        for (int i = 0; i < this.c; i++) {
            if (fni.a(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        e();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        e();
        for (int i = this.c - 1; i >= 0; i--) {
            if (fni.a(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        f();
        e();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            a(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        f();
        e();
        return i(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        f();
        e();
        return i(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        e();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        cpi.a(i, i2, this.c);
        return new n98(this.a, this.b + i, i2 - i, this, this.o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        e();
        int length = objArr.length;
        int i = this.c;
        int i2 = this.b;
        if (length < i) {
            return Arrays.copyOfRange(this.a, i2, i + i2, objArr.getClass());
        }
        ys.l(0, i2, i + i2, this.a, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        e();
        return fqi.a(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        e();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        return new m98(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        e();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            d(this.b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        f();
        e();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            c(this.b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        e();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return ys.p(i2, i + i2, objArr);
    }
}
