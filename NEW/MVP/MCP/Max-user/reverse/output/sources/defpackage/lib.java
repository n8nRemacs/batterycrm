package defpackage;

/* loaded from: classes2.dex */
public final class lib extends cda {
    public final long b;
    public final boolean c;

    public lib(long j, boolean z) {
        super(qqg.a);
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lib)) {
            return false;
        }
        lib libVar = (lib) obj;
        return this.b == libVar.b && this.c == libVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.b, "OpenOneToOneCall(opponentId=", ", isVideo=", this.c);
        sbJ.append(")");
        return sbJ.toString();
    }
}
