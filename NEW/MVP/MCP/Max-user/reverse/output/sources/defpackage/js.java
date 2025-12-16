package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class js extends f3 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public js() {
        this.b = d;
    }

    @Override // defpackage.f3
    public final Object a(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        if (i == ve3.i(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        h();
        int iG = g(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iG];
        if (i < (this.c >> 1)) {
            int i3 = this.a;
            if (iG >= i3) {
                ys.l(i3 + 1, i3, iG, objArr, objArr);
            } else {
                ys.l(1, 0, iG, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.a;
                ys.l(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i5 = this.a;
            objArr3[i5] = null;
            this.a = d(i5);
        } else {
            int iG2 = g(ve3.i(this) + this.a);
            if (iG <= iG2) {
                Object[] objArr4 = this.b;
                ys.l(iG, iG + 1, iG2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                ys.l(iG, iG + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                ys.l(0, 1, iG2 + 1, objArr6, objArr6);
            }
            this.b[iG2] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        h();
        c(this.c + 1);
        int iG = g(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            int length = iG == 0 ? this.b.length - 1 : iG - 1;
            int i4 = this.a;
            int length2 = i4 == 0 ? this.b.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.b;
                objArr[length2] = objArr[i4];
                ys.l(i4, i4 + 1, length + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.b;
                ys.l(i4 - 1, i4, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                ys.l(0, 1, length + 1, objArr3, objArr3);
            }
            this.b[length] = obj;
            this.a = length2;
        } else {
            int iG2 = g(i3 + this.a);
            if (iG < iG2) {
                Object[] objArr4 = this.b;
                ys.l(iG + 1, iG, iG2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                ys.l(1, 0, iG2, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                ys.l(iG + 1, iG, objArr6.length - 1, objArr6, objArr6);
            }
            this.b[iG] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        h();
        c(collection.size() + this.c);
        int iG = g(this.c + this.a);
        int iG2 = g(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = iG2 + size;
            if (iG2 < iG) {
                int i4 = size + iG;
                Object[] objArr = this.b;
                if (i4 <= objArr.length) {
                    ys.l(i3, iG2, iG, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    ys.l(i3 - objArr.length, iG2, iG, objArr, objArr);
                } else {
                    int length = iG - (i4 - objArr.length);
                    ys.l(0, length, iG, objArr, objArr);
                    Object[] objArr2 = this.b;
                    ys.l(i3, iG2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.b;
                ys.l(size, 0, iG, objArr3, objArr3);
                Object[] objArr4 = this.b;
                if (i3 >= objArr4.length) {
                    ys.l(i3 - objArr4.length, iG2, objArr4.length, objArr4, objArr4);
                } else {
                    ys.l(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.b;
                    ys.l(i3, iG2, objArr5.length - size, objArr5, objArr5);
                }
            }
            b(iG2, collection);
            return true;
        }
        int i5 = this.a;
        int length2 = i5 - size;
        if (iG2 < i5) {
            Object[] objArr6 = this.b;
            ys.l(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iG2) {
                Object[] objArr7 = this.b;
                ys.l(objArr7.length - size, 0, iG2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.b;
                ys.l(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.b;
                ys.l(0, size, iG2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.b;
            ys.l(length2, i5, iG2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.b;
            length2 += objArr11.length;
            int i6 = iG2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                ys.l(length2, i5, iG2, objArr11, objArr11);
            } else {
                ys.l(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.b;
                ys.l(0, this.a + length3, iG2, objArr12, objArr12);
            }
        }
        this.a = length2;
        b(e(iG2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        h();
        c(this.c + 1);
        int length = this.a;
        if (length == 0) {
            length = this.b.length;
        }
        int i = length - 1;
        this.a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        h();
        c(getSize() + 1);
        this.b[g(getSize() + this.a)] = obj;
        this.c = getSize() + 1;
    }

    public final void b(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        ys.l(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        ys.l(length2 - i3, 0, i3, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            h();
            f(this.a, g(getSize() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int e(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void f(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.b, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.b;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.b, 0, i2, (Object) null);
    }

    public final int g(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, size, ", size: "));
        }
        return this.b[g(this.a + i)];
    }

    @Override // defpackage.f3
    public final int getSize() {
        return this.c;
    }

    public final void h() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iG = g(getSize() + this.a);
        int length = this.a;
        if (length < iG) {
            while (length < iG) {
                if (fni.a(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iG) {
            return -1;
        }
        int length2 = this.b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iG; i2++) {
                    if (fni.a(obj, this.b[i2])) {
                        length = i2 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (fni.a(obj, this.b[length])) {
                i = this.a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getSize() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iG = g(getSize() + this.a);
        int i2 = this.a;
        if (i2 < iG) {
            length = iG - 1;
            if (i2 <= length) {
                while (!fni.a(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iG) {
            int i3 = iG - 1;
            while (true) {
                if (-1 >= i3) {
                    length = this.b.length - 1;
                    int i4 = this.a;
                    if (i4 <= length) {
                        while (!fni.a(obj, this.b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                } else {
                    if (fni.a(obj, this.b[i3])) {
                        length = i3 + this.b.length;
                        i = this.a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iG;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iG2 = g(getSize() + this.a);
            int i = this.a;
            if (i < iG2) {
                iG = i;
                while (i < iG2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[iG] = obj;
                        iG++;
                    }
                    i++;
                }
                Arrays.fill(this.b, iG, iG2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iG = g(i2);
                for (int i3 = 0; i3 < iG2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[iG] = obj3;
                        iG = d(iG);
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.c = e(iG - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = d(i);
        this.c = getSize() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        int iG = g(ve3.i(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[iG];
        objArr[iG] = null;
        this.c = getSize() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        cpi.a(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            a(i);
            return;
        }
        h();
        if (i < this.c - i2) {
            int iG = g((i - 1) + this.a);
            int iG2 = g((i2 - 1) + this.a);
            while (i > 0) {
                int i4 = iG + 1;
                int iMin = Math.min(i, Math.min(i4, iG2 + 1));
                Object[] objArr = this.b;
                int i5 = iG2 - iMin;
                int i6 = iG - iMin;
                ys.l(i5 + 1, i6 + 1, i4, objArr, objArr);
                iG = e(i6);
                iG2 = e(i5);
                i -= iMin;
            }
            int iG3 = g(this.a + i3);
            f(this.a, iG3);
            this.a = iG3;
        } else {
            int iG4 = g(this.a + i2);
            int iG5 = g(this.a + i);
            int i7 = this.c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i7, Math.min(objArr2.length - iG4, objArr2.length - iG5));
                Object[] objArr3 = this.b;
                int i8 = iG4 + i2;
                ys.l(iG5, iG4, i8, objArr3, objArr3);
                iG4 = g(i8);
                iG5 = g(iG5 + i2);
            }
            int iG6 = g(this.c + this.a);
            f(e(iG6 - i3), iG6);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iG;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iG2 = g(getSize() + this.a);
            int i = this.a;
            if (i < iG2) {
                iG = i;
                while (i < iG2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[iG] = obj;
                        iG++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.b, iG, iG2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iG = g(i2);
                for (int i3 = 0; i3 < iG2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iG] = obj3;
                        iG = d(iG);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.c = e(iG - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, size, ", size: "));
        }
        int iG = g(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    public js(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(ho7.f(i, "Illegal Capacity: "));
        }
        this.b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iG = g(this.c + this.a);
        int i2 = this.a;
        if (i2 < iG) {
            ys.m(i2, iG, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            ys.l(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            ys.l(objArr3.length - this.a, 0, iG, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        h();
        c(collection.size() + getSize());
        b(g(getSize() + this.a), collection);
        return true;
    }
}
