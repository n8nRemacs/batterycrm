package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class e89 {
    public final String a;
    public final int b;
    public final int c;

    public e89(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e89)) {
            return false;
        }
        e89 e89Var = (e89) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || e89Var.b < 0) ? TextUtils.equals(str, e89Var.a) && i == e89Var.c : TextUtils.equals(str, e89Var.a) && i2 == e89Var.b && i == e89Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
