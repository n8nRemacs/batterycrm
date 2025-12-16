package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m20 {
    public final l20 a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public m20(l20 l20Var) {
        this.a = l20Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m20) {
            return this.a.equals(((m20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
