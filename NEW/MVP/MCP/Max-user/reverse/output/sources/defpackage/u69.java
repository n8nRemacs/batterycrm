package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u69 {
    public final b89 a;
    public final int b;
    public final int c;
    public final t69 d;
    public final Bundle e;

    public u69(b89 b89Var, int i, int i2, boolean z, t69 t69Var, Bundle bundle) {
        this.a = b89Var;
        this.b = i;
        this.c = i2;
        this.d = t69Var;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u69)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        u69 u69Var = (u69) obj;
        t69 t69Var = this.d;
        return (t69Var == null && u69Var.d == null) ? this.a.equals(u69Var.a) : Objects.equals(t69Var, u69Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        b89 b89Var = this.a;
        sb.append(b89Var.a.a);
        sb.append(", uid=");
        return ho7.j(sb, b89Var.a.c, "}");
    }
}
