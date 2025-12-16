package defpackage;

/* loaded from: classes2.dex */
public final class ng0 {
    public static final ng0 e = new ng0(null, null, new mg0(false, false), new lg0(false, false));
    public final kz0 a;
    public final pmd b;
    public final mg0 c;
    public final lg0 d;

    public ng0(kz0 kz0Var, pmd pmdVar, mg0 mg0Var, lg0 lg0Var) {
        this.a = kz0Var;
        this.b = pmdVar;
        this.c = mg0Var;
        this.d = lg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        return fni.a(this.a, ng0Var.a) && fni.a(this.b, ng0Var.b) && fni.a(this.c, ng0Var.c) && fni.a(this.d, ng0Var.d);
    }

    public final int hashCode() {
        kz0 kz0Var = this.a;
        int iHashCode = (kz0Var == null ? 0 : kz0Var.hashCode()) * 31;
        pmd pmdVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (pmdVar != null ? pmdVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "BadNetworkIndicatorConfig(calcNetworkStatusConfig=" + this.a + ", reportNetworkStatusConfig=" + this.b + ", signalingConfig=" + this.c + ", debugLoggingConfig=" + this.d + ")";
    }
}
