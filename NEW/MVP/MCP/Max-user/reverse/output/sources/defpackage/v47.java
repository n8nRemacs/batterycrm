package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v47 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public v47(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v47)) {
            return false;
        }
        v47 v47Var = (v47) obj;
        return this.b == v47Var.b && Double.compare(this.c, v47Var.c) == 0 && Objects.equals(this.a, v47Var.a) && Objects.equals(this.d, v47Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public v47(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        hsi.g(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }
}
