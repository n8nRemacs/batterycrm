package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class iqd extends i2 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public iqd(int i, Object[] objArr) {
        this.a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            StringBuilder sbM = ho7.m(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM.append(objArr.length);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
    }

    public final void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.d) {
            StringBuilder sbM = ho7.m(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM.append(this.d);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(ho7.g("index: ", i, size, ", size: "));
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.j0
    public final int getSize() {
        return this.d;
    }

    @Override // defpackage.i2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new hqd(this);
    }

    @Override // defpackage.j0, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override // defpackage.j0, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
