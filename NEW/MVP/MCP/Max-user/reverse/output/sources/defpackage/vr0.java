package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class vr0 extends l0g {
    public final List c;
    public final gx3 d;
    public final tbf o;

    public vr0(List list, gx3 gx3Var, tbf tbfVar) {
        this.c = list;
        this.d = gx3Var;
        this.o = tbfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return fni.a(this.c, vr0Var.c) && fni.a(this.d, vr0Var.d) && fni.a(this.o, vr0Var.o);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        gx3 gx3Var = this.d;
        int iHashCode2 = (iHashCode + (gx3Var == null ? 0 : gx3Var.hashCode())) * 31;
        tbf tbfVar = this.o;
        return iHashCode2 + (tbfVar != null ? tbfVar.hashCode() : 0);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(botCommands=" + this.c + ", contact=" + this.d + ", startMessage=" + this.o + ")";
    }
}
