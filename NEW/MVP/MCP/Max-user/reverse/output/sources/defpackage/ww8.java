package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class ww8 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ww8(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ww8.class) {
            return false;
        }
        ww8 ww8Var = (ww8) obj;
        return TextUtils.equals(this.a, ww8Var.a) && this.b == ww8Var.b && this.c == ww8Var.c;
    }

    public final int hashCode() {
        return ((u45.e(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
