package defpackage;

import android.os.Parcelable;

/* loaded from: classes2.dex */
public interface w68 extends Parcelable {
    default String n() {
        u68 u68Var = this instanceof u68 ? (u68) this : null;
        if (u68Var != null) {
            return u68Var.n();
        }
        return null;
    }
}
