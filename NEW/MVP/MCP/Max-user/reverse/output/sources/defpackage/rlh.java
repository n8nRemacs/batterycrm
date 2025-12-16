package defpackage;

/* loaded from: classes2.dex */
public final class rlh implements vlh {
    public final String a;
    public final String b;
    public final go0 c;

    public rlh(go0 go0Var, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = go0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlh)) {
            return false;
        }
        rlh rlhVar = (rlh) obj;
        return fni.a(this.a, rlhVar.a) && fni.a(this.b, rlhVar.b) && fni.a(this.c, rlhVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        go0 go0Var = this.c;
        return iHashCode2 + (go0Var != null ? go0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("AuthBiometry(title=", this.a, ", reason=", this.b, ", cryptoObject=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
