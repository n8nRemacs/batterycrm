package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pq4 implements lw0 {
    public final int a;
    public final int[] b;
    public final int c;

    public pq4(int i, int i2, int[] iArr) {
        this.a = i;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = iArrCopyOf;
        this.c = i2;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pq4.class == obj.getClass()) {
            pq4 pq4Var = (pq4) obj;
            if (this.a == pq4Var.a && Arrays.equals(this.b, pq4Var.b) && this.c == pq4Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c;
    }
}
