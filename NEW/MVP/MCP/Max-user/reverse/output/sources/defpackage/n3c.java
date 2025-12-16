package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class n3c implements lw0 {
    public final z16 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        fsi.d(!false);
        new z16(sparseBooleanArray);
    }

    public n3c(z16 z16Var) {
        this.a = z16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n3c) {
            return this.a.equals(((n3c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
