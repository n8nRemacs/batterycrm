package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cp1 {
    public final eje a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;
    public final ti1 f;
    public final Long g;

    public cp1(int i, ti1 ti1Var, eje ejeVar, Long l, String str, List list, boolean z) {
        this.a = ejeVar;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
        this.f = ti1Var;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp1)) {
            return false;
        }
        cp1 cp1Var = (cp1) obj;
        return fni.a(this.a, cp1Var.a) && fni.a(this.b, cp1Var.b) && this.c == cp1Var.c && fni.a(this.d, cp1Var.d) && this.e == cp1Var.e && fni.a(this.f, cp1Var.f) && fni.a(this.g, cp1Var.g);
    }

    public final int hashCode() {
        int iA = iti.a(this.e, xrf.l(this.d, fui.b(u45.e(Integer.hashCode(this.a.a) * 31, 31, this.b), this.c), 31));
        ti1 ti1Var = this.f;
        int iHashCode = (iA + (ti1Var == null ? 0 : ti1Var.hashCode())) * 31;
        Long l = this.g;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "CallSessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantIds=" + this.d + ", participantCount=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
