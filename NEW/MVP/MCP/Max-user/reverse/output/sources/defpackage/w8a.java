package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class w8a {
    public Object[] a;
    public int b;
    public u8a c;

    public w8a(int i) {
        this.a = i == 0 ? rqa.a : new Object[i];
    }

    public final void a(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            StringBuilder sbM = ho7.m(i, "Index ", " must be in 0..");
            sbM.append(this.b);
            throw new IndexOutOfBoundsException(sbM.toString());
        }
        e(i2 + 1);
        Object[] objArr = this.a;
        int i3 = this.b;
        if (i != i3) {
            ys.l(i + 1, i, i3, objArr, objArr);
        }
        objArr[i] = obj;
        this.b++;
    }

    public final void b(Object obj) {
        e(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        objArr[i] = obj;
        this.b = i + 1;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        e(list.size() + i);
        Object[] objArr = this.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w8a) {
            w8a w8aVar = (w8a) obj;
            int i = w8aVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = w8aVar.a;
                to7 to7VarH = n7j.h(0, i2);
                int i3 = to7VarH.a;
                int i4 = to7VarH.b;
                if (i3 > i4) {
                    return true;
                }
                while (fni.a(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder sbM = ho7.m(i, "Index ", " must be in 0..");
        sbM.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public final int g(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        return this.b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            StringBuilder sbM = ho7.m(i, "Index ", " must be in 0..");
            sbM.append(this.b - 1);
            throw new IndexOutOfBoundsException(sbM.toString());
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ys.l(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final String toString() {
        i0 i0Var = new i0(5, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) i0Var.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ w8a() {
        this(16);
    }
}
