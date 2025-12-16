package defpackage;

/* loaded from: classes.dex */
public final class lp2 {
    public final j09 a;
    public final g2h b;

    public /* synthetic */ lp2(h09 h09Var, int i) {
        this((i & 1) != 0 ? null : h09Var, (g2h) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp2)) {
            return false;
        }
        lp2 lp2Var = (lp2) obj;
        return fni.a(this.a, lp2Var.a) && fni.a(this.b, lp2Var.b);
    }

    public final int hashCode() {
        j09 j09Var = this.a;
        int iHashCode = (j09Var == null ? 0 : j09Var.hashCode()) * 31;
        g2h g2hVar = this.b;
        return iHashCode + (g2hVar != null ? g2hVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public lp2(j09 j09Var, g2h g2hVar) {
        this.a = j09Var;
        this.b = g2hVar;
    }
}
