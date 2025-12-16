package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a2f {
    public static final a2f d;
    public final Comparable[] a;
    public final Object[] b;
    public final int c;

    static {
        Comparable[] comparableArr = new Comparable[0];
        d = new a2f(comparableArr, comparableArr);
    }

    public a2f(Comparable[] comparableArr, Object[] objArr) {
        if (comparableArr.length == objArr.length) {
            this.a = comparableArr;
            this.b = objArr;
            this.c = comparableArr.length;
        } else {
            StringBuilder sb = new StringBuilder("different array sizes: ");
            sb.append(comparableArr.length);
            sb.append(" keys and ");
            throw new IllegalArgumentException(ho7.j(sb, objArr.length, " values"));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2f)) {
            return false;
        }
        a2f a2fVar = (a2f) obj;
        return a2fVar.c == this.c && Arrays.equals(a2fVar.a, this.a) && Arrays.equals(a2fVar.b, this.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.c; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append("{");
            sb.append(this.a[i]);
            sb.append(" : ");
            sb.append(this.b[i]);
            sb.append('}');
        }
        sb.append(']');
        return sb.toString();
    }
}
