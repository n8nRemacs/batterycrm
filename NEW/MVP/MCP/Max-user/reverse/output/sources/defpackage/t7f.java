package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class t7f {
    public final List a;
    public final bn8 b;
    public final xib c;
    public final boolean d;

    public t7f(List list, bn8 bn8Var, xib xibVar, boolean z) {
        this.a = list;
        this.b = bn8Var;
        this.c = xibVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7f)) {
            return false;
        }
        t7f t7fVar = (t7f) obj;
        return fni.a(this.a, t7fVar.a) && fni.a(this.b, t7fVar.b) && fni.a(this.c, t7fVar.c) && this.d == t7fVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bn8 bn8Var = this.b;
        int iHashCode2 = (iHashCode + (bn8Var == null ? 0 : bn8Var.hashCode())) * 31;
        xib xibVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (xibVar != null ? xibVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SpeakerModeState(opponentsPages=" + this.a + ", mainOpponentState=" + this.b + ", opponentPipState=" + this.c + ", isP2GCallAnimationDepended=" + this.d + ")";
    }
}
