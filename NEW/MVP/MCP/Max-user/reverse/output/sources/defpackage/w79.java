package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w79 implements t69 {
    public final b89 a;

    public w79(b89 b89Var) {
        this.a = b89Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != w79.class) {
            return false;
        }
        return Objects.equals(this.a, ((w79) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
