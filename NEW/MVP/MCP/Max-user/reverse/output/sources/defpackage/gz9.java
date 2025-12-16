package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class gz9 {
    public final SparseArray a;
    public zog b;

    public gz9(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(zog zogVar, int i, int i2) {
        int iA = zogVar.a(i);
        SparseArray sparseArray = this.a;
        gz9 gz9Var = sparseArray == null ? null : (gz9) sparseArray.get(iA);
        if (gz9Var == null) {
            gz9Var = new gz9(1);
            sparseArray.put(zogVar.a(i), gz9Var);
        }
        if (i2 > i) {
            gz9Var.a(zogVar, i + 1, i2);
        } else {
            gz9Var.b = zogVar;
        }
    }
}
