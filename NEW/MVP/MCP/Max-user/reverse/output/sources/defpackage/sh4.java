package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class sh4 {
    public final String a;
    public final hf6 b;
    public final hf6 c;
    public final int d;
    public final int e;

    public sh4(String str, hf6 hf6Var, hf6 hf6Var2, int i, int i2) {
        hsi.b(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        hf6Var.getClass();
        this.b = hf6Var;
        hf6Var2.getClass();
        this.c = hf6Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sh4.class == obj.getClass()) {
            sh4 sh4Var = (sh4) obj;
            if (this.d == sh4Var.d && this.e == sh4Var.e && this.a.equals(sh4Var.a) && this.b.equals(sh4Var.b) && this.c.equals(sh4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + u45.e((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
