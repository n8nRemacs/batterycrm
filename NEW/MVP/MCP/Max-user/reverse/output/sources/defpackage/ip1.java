package defpackage;

/* loaded from: classes2.dex */
public final class ip1 {
    public final fje a;
    public final zie b;

    public ip1(eje ejeVar, zie zieVar) {
        this.a = ejeVar;
        this.b = zieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip1)) {
            return false;
        }
        ip1 ip1Var = (ip1) obj;
        return fni.a(this.a, ip1Var.a) && fni.a(this.b, ip1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
