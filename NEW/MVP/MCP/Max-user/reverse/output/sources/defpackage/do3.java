package defpackage;

/* loaded from: classes2.dex */
public final class do3 extends l0g {
    public final String c;
    public final qxg d;

    public do3(String str, qxg qxgVar) {
        this.c = str;
        this.d = qxgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do3)) {
            return false;
        }
        do3 do3Var = (do3) obj;
        return fni.a(this.c, do3Var.c) && fni.a(this.d, do3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        qxg qxgVar = this.d;
        return iHashCode + (qxgVar == null ? 0 : qxgVar.hashCode());
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(hash=" + this.c + ", userSettings=" + this.d + ")";
    }
}
