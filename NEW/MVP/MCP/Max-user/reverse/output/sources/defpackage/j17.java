package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j17 implements Iterable, my7 {
    public final String[] a;

    public j17(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        ro7 ro7Var = new ro7(length, x6j.a(length, 0, -1), -2);
        int i = ro7Var.a;
        int i2 = ro7Var.b;
        int i3 = ro7Var.c;
        if (i3 >= 0) {
            if (i > i2) {
                return null;
            }
        } else if (i < i2) {
            return null;
        }
        while (!dnf.n(str, strArr[i], true)) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return strArr[i + 1];
    }

    public final String b(int i) {
        return this.a[i * 2];
    }

    public final i17 c() {
        i17 i17Var = new i17();
        af3.t(i17Var.a, this.a);
        return i17Var;
    }

    public final String d(int i) {
        return this.a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j17) {
            return Arrays.equals(this.a, ((j17) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        imb[] imbVarArr = new imb[size];
        for (int i = 0; i < size; i++) {
            imbVarArr[i] = new imb(b(i), d(i));
        }
        return new f2(2, imbVarArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strD = d(i);
            sb.append(strB);
            sb.append(": ");
            if (yxg.p(strB)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        return sb.toString();
    }
}
