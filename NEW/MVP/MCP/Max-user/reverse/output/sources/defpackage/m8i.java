package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m8i {
    public int b = 0;
    public final boolean[] a = new boolean[ig0.values().length];

    public final boolean a(ig0 ig0Var, boolean z) {
        int iOrdinal = ig0Var.ordinal();
        boolean[] zArr = this.a;
        boolean z2 = zArr[iOrdinal];
        zArr[ig0Var.ordinal()] = z;
        if (z2 == z) {
            return false;
        }
        this.b += z ? 1 : -1;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m8i.class == obj.getClass()) {
            m8i m8iVar = (m8i) obj;
            if (this.b == m8iVar.b && Arrays.equals(this.a, m8iVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
