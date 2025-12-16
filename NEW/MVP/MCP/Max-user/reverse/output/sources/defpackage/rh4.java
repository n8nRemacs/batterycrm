package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class rh4 {
    public final String a;
    public final gf6 b;
    public final gf6 c;
    public final int d;
    public final int e;

    public rh4(String str, gf6 gf6Var, gf6 gf6Var2, int i, int i2) {
        fsi.b(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        gf6Var.getClass();
        this.b = gf6Var;
        gf6Var2.getClass();
        this.c = gf6Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rh4.class == obj.getClass()) {
            rh4 rh4Var = (rh4) obj;
            if (this.d == rh4Var.d && this.e == rh4Var.e && this.a.equals(rh4Var.a) && this.b.equals(rh4Var.b) && this.c.equals(rh4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + u45.e((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
