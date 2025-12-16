package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class a97 {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a97.class == obj.getClass()) {
            a97 a97Var = (a97) obj;
            if (this.b == a97Var.b && Objects.equals(this.a, a97Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }
}
