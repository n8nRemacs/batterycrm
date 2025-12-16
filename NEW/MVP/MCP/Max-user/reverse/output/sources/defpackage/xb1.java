package defpackage;

import android.text.SpannableString;

/* loaded from: classes.dex */
public final class xb1 {
    public static final xb1 c = new xb1(null, yb1.a);
    public final CharSequence a;
    public final yb1 b;

    public xb1(SpannableString spannableString, yb1 yb1Var) {
        this.a = spannableString;
        this.b = yb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb1)) {
            return false;
        }
        xb1 xb1Var = (xb1) obj;
        return fni.a(this.a, xb1Var.a) && this.b == xb1Var.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "CallIndicatorState(title=" + ((Object) this.a) + ", indicatorState=" + this.b + ")";
    }
}
