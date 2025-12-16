package defpackage;

/* loaded from: classes.dex */
public final class kr1 extends gxi {
    public final long a;
    public final boolean b;

    public kr1(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.gxi
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr1)) {
            return false;
        }
        kr1 kr1Var = (kr1) obj;
        return this.a == kr1Var.a && this.b == kr1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "User(userId=", ", isVideo=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}
