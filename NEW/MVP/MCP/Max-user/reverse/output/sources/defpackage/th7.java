package defpackage;

/* loaded from: classes2.dex */
public final class th7 {
    public final rh7 a;
    public final int b;

    public th7(rh7 rh7Var, int i) {
        this.a = rh7Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th7)) {
            return false;
        }
        th7 th7Var = (th7) obj;
        return this.a == th7Var.a && this.b == th7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredCondition(key=" + this.a + ", quantity=" + this.b + ")";
    }
}
