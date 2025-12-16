package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class fx4 {
    public final Intent a;
    public final String b;

    public fx4(Intent intent, String str) {
        this.a = intent;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx4)) {
            return false;
        }
        fx4 fx4Var = (fx4) obj;
        return fni.a(this.a, fx4Var.a) && fni.a(this.b, fx4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DirectionsIntentHolder(intent=" + this.a + ", tag=" + this.b + ")";
    }
}
