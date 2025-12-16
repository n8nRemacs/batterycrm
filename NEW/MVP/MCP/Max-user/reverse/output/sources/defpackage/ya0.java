package defpackage;

/* loaded from: classes.dex */
public final class ya0 {
    public final long a;
    public final ac0 b;
    public final ba0 c;

    public ya0(long j, ac0 ac0Var, ba0 ba0Var) {
        this.a = j;
        this.b = ac0Var;
        this.c = ba0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ya0) {
            ya0 ya0Var = (ya0) obj;
            if (this.a == ya0Var.a && this.b.equals(ya0Var.b) && this.c.equals(ya0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
