package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class c89 {
    public h89 a;

    public c89(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new h89(str, i, i2);
            return;
        }
        g89 g89Var = new g89(str, i, i2);
        b5.r(i, i2, str);
        this.a = g89Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c89) {
            return this.a.equals(((c89) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
