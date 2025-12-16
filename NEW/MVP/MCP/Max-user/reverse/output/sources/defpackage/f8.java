package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class f8 {
    public final int a;
    public final int b;
    public final Intent c;

    public f8(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.a == f8Var.a && this.b == f8Var.b && fni.a(this.c, f8Var.c);
    }

    public final int hashCode() {
        int iK = xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
        Intent intent = this.c;
        return iK + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("ActivityResult(requestCode=", this.a, ", resultCode=", this.b, ", data=");
        sbK.append(this.c);
        sbK.append(")");
        return sbK.toString();
    }
}
