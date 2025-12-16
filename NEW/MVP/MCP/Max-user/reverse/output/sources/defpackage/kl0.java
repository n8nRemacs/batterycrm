package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kl0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public kl0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl0)) {
            return false;
        }
        kl0 kl0Var = (kl0) obj;
        return this.c == kl0Var.c && this.d == kl0Var.d && Objects.equals(this.a, kl0Var.a) && Objects.equals(this.b, kl0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
