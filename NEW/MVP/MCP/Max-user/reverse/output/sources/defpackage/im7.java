package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class im7 {
    public final gm7 a;

    public im7(gm7 gm7Var) {
        this.a = gm7Var;
    }

    public static im7 a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new im7(new hm7(obj)) : new im7(new gm7(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof im7)) {
            return false;
        }
        return this.a.equals(((im7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
