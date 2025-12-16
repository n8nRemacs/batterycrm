package defpackage;

/* loaded from: classes.dex */
public final class x51 implements z51 {
    public final rt1 a;

    public x51(rt1 rt1Var) {
        this.a = rt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x51) && fni.a(this.a, ((x51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.a + ")";
    }
}
