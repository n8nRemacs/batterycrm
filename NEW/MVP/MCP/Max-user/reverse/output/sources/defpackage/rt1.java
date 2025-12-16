package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class rt1 {
    public final vfh a;
    public final List b;
    public final iqg c;
    public final t08 d;
    public final boolean e;
    public final wd0 f;
    public final boolean g;
    public final boolean h;

    public rt1(vfh vfhVar, List list, iqg iqgVar, t08 t08Var, boolean z, wd0 wd0Var, boolean z2, boolean z3) {
        this.a = vfhVar;
        this.b = list;
        this.c = iqgVar;
        this.d = t08Var;
        this.e = z;
        this.f = wd0Var;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt1)) {
            return false;
        }
        rt1 rt1Var = (rt1) obj;
        return this.a == rt1Var.a && fni.a(this.b, rt1Var.b) && fni.a(this.c, rt1Var.c) && fni.a(this.d, rt1Var.d) && this.e == rt1Var.e && fni.a(this.f, rt1Var.f) && this.g == rt1Var.g && this.h == rt1Var.h;
    }

    public final int hashCode() {
        int iL = xrf.l(this.b, this.a.hashCode() * 31, 31);
        iqg iqgVar = this.c;
        int iHashCode = (iL + (iqgVar == null ? 0 : iqgVar.hashCode())) * 31;
        t08 t08Var = this.d;
        int iB = a9h.b((iHashCode + (t08Var == null ? 0 : t08Var.hashCode())) * 31, 31, this.e);
        wd0 wd0Var = this.f;
        return Boolean.hashCode(this.h) + a9h.b((iB + (wd0Var != null ? wd0Var.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        return "CallViewState(activeMode=" + this.a + ", modes=" + this.b + ", unavailableCallState=" + this.c + ", labelSpeakerState=" + this.d + ", isGroupCall=" + this.e + ", mainSpeakerAvatar=" + this.f + ", isCallEventsUnavailable=" + this.g + ", isP2GCallAnimationDepended=" + this.h + ")";
    }
}
