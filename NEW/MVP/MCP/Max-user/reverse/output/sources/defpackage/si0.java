package defpackage;

/* loaded from: classes2.dex */
public final class si0 {
    public final long a;
    public final pzf b;

    public si0(long j, pzf pzfVar) {
        this.a = j;
        this.b = pzfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si0)) {
            return false;
        }
        si0 si0Var = (si0) obj;
        return this.a == si0Var.a && fni.a(this.b, si0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BaseError(requestId=" + this.a + ", error=" + this.b + ")";
    }
}
