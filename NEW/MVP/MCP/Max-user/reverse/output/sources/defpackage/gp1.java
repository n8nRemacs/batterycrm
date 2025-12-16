package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class gp1 {
    public final yi1 a;
    public final fje b;
    public final zie c;

    public gp1(yi1 yi1Var, fje fjeVar, zie zieVar) {
        this.a = yi1Var;
        this.b = fjeVar;
        this.c = zieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp1)) {
            return false;
        }
        gp1 gp1Var = (gp1) obj;
        return fni.a(this.a, gp1Var.a) && fni.a(this.b, gp1Var.b) && fni.a(this.c, gp1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Objects.hashCode(this.a.a) * 31)) * 31;
        zie zieVar = this.c;
        return iHashCode + (zieVar == null ? 0 : zieVar.hashCode());
    }

    public final String toString() {
        return "InvitedParams(me=" + this.a + ", roomId=" + this.b + ", room=" + this.c + ")";
    }
}
