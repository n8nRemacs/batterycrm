package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class h89 {
    public final String a;
    public final int b;
    public final int c;

    public h89(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h89)) {
            return false;
        }
        h89 h89Var = (h89) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || h89Var.b < 0) ? TextUtils.equals(str, h89Var.a) && i == h89Var.c : TextUtils.equals(str, h89Var.a) && i2 == h89Var.b && i == h89Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
