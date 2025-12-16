package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class f5f extends l3 implements xg7 {
    public static final f5f b = new f5f(new Object[0]);
    public final Object[] a;

    public f5f(Object[] objArr) {
        this.a = objArr;
    }

    public final htb a() {
        return new htb(this, null, this.a, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        hqi.c(i, getSize());
        return this.a[i];
    }

    @Override // defpackage.j0
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.i2, java.util.List
    public final int indexOf(Object obj) {
        return ys.y(this.a, obj);
    }

    @Override // defpackage.i2, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        hqi.d(i, objArr.length);
        return new av0(i, objArr.length, objArr);
    }
}
