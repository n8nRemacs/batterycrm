package defpackage;

/* loaded from: classes2.dex */
public final class ghc {
    public final long a;
    public final long b;
    public final py0 c;

    public ghc(long j, long j2, py0 py0Var) {
        this.a = j;
        this.b = j2;
        this.c = py0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghc)) {
            return false;
        }
        ghc ghcVar = (ghc) obj;
        return this.a == ghcVar.a && this.b == ghcVar.b && fni.a(this.c, ghcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "ProfileEntity(id=", ", serverId=");
        sbL.append(this.b);
        sbL.append(", profileData=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
