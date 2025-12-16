package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m1e {
    public final l1e a;
    public final de7 b;

    public m1e(l1e l1eVar, de7 de7Var) {
        this.a = l1eVar;
        this.b = de7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1e)) {
            return false;
        }
        m1e m1eVar = (m1e) obj;
        return this.a == m1eVar.a && Objects.equals(this.b, m1eVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
