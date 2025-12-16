package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class mg7 {
    public boolean a;
    public int b;
    public Object[] c;

    public mg7(int i) {
        u4j.a(i, "initialCapacity");
        this.c = new Object[i];
        this.b = 0;
    }

    public static rs0 e() {
        rs0 rs0Var = new rs0(6, (byte) 0);
        rs0Var.c = true;
        rs0Var.b = 0;
        return rs0Var;
    }

    public static int h(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public void a(Object obj) {
        obj.getClass();
        g(1);
        Object[] objArr = this.c;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public void b(Object... objArr) {
        int length = objArr.length;
        pyi.a(length, objArr);
        g(length);
        System.arraycopy(objArr, 0, this.c, this.b, length);
        this.b += length;
    }

    public abstract mg7 c(Object obj);

    public void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            g(collection.size());
            if (collection instanceof ng7) {
                this.b = ((ng7) collection).b(this.b, this.c);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract void f(fl flVar, n2g n2gVar);

    public void g(int i) {
        Object[] objArr = this.c;
        int iH = h(objArr.length, this.b + i);
        if (iH > objArr.length || this.a) {
            this.c = Arrays.copyOf(this.c, iH);
            this.a = false;
        }
    }
}
