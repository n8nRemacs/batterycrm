package defpackage;

/* loaded from: classes2.dex */
public final class zq2 {
    public final ku3 a;
    public final int b;

    public zq2(ku3 ku3Var, int i) {
        this.a = ku3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq2)) {
            return false;
        }
        zq2 zq2Var = (zq2) obj;
        return this.a.equals(zq2Var.a) && this.b == zq2Var.b;
    }

    public final int hashCode() {
        return az1.v(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMember(contact=");
        sb.append(this.a);
        sb.append(", role=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MEMBER" : "ADMIN" : "OWNER");
        sb.append(")");
        return sb.toString();
    }
}
