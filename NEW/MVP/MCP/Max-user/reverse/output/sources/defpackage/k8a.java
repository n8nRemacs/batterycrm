package defpackage;

/* loaded from: classes.dex */
public final class k8a {
    public long[] a;
    public int b;

    public final boolean a(long j) {
        int i;
        long[] jArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (j == jArr[i3]) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            return false;
        }
        if (i3 < 0 || i3 >= (i = this.b)) {
            StringBuilder sbM = ho7.m(i3, "Index ", " must be in 0..");
            sbM.append(this.b - 1);
            throw new IndexOutOfBoundsException(sbM.toString());
        }
        long[] jArr2 = this.a;
        long j2 = jArr2[i3];
        if (i3 != i - 1) {
            int i4 = i3 + 1;
            System.arraycopy(jArr2, i4, jArr2, i3, i - i4);
        }
        this.b--;
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k8a) {
            k8a k8aVar = (k8a) obj;
            int i = k8aVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = k8aVar.a;
                to7 to7VarH = n7j.h(0, i2);
                int i3 = to7VarH.a;
                int i4 = to7VarH.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
