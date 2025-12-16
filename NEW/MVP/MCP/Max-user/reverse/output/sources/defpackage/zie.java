package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class zie {
    public final eje a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List e;
    public final ti1 f;
    public final Long g;

    public zie(int i, ti1 ti1Var, eje ejeVar, Long l, String str, List list, boolean z) {
        this.a = ejeVar;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = ti1Var;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zie)) {
            return false;
        }
        zie zieVar = (zie) obj;
        return fni.a(this.a, zieVar.a) && fni.a(this.b, zieVar.b) && this.c == zieVar.c && this.d == zieVar.d && fni.a(this.e, zieVar.e) && fni.a(this.f, zieVar.f) && fni.a(this.g, zieVar.g);
    }

    public final int hashCode() {
        int iL = xrf.l(this.e, iti.a(this.d, fui.b(u45.e(Integer.hashCode(this.a.a) * 31, 31, this.b), this.c)), 31);
        ti1 ti1Var = this.f;
        int iHashCode = (iL + (ti1Var == null ? 0 : ti1Var.hashCode())) * 31;
        Long l = this.g;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantCount=" + this.d + ", participantIds=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
