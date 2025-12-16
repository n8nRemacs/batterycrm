package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class rg7 implements Serializable {
    public static final rg7 c = new rg7(new int[0]);
    public final int[] a;
    public final int b;

    public rg7(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public static rg7 b(int i) {
        return new rg7(new int[]{i});
    }

    public final int a(int i) {
        u5j.d(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rg7) {
            rg7 rg7Var = (rg7) obj;
            int i = rg7Var.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (a(i3) == rg7Var.a(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
