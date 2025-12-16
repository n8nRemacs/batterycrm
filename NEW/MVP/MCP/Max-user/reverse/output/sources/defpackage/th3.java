package defpackage;

/* loaded from: classes2.dex */
public final class th3 {
    public final hg3 a;
    public final kg3 b;
    public final vh3 c;
    public final bi3 d;
    public final ji3 e;
    public final oi3 f;
    public final qi3 g;

    public th3(hg3 hg3Var, kg3 kg3Var, vh3 vh3Var, bi3 bi3Var, ji3 ji3Var, oi3 oi3Var, qi3 qi3Var) {
        this.a = hg3Var;
        this.b = kg3Var;
        this.c = vh3Var;
        this.d = bi3Var;
        this.e = ji3Var;
        this.f = oi3Var;
        this.g = qi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th3)) {
            return false;
        }
        th3 th3Var = (th3) obj;
        return fni.a(this.a, th3Var.a) && fni.a(this.b, th3Var.b) && fni.a(this.c, th3Var.c) && fni.a(this.d, th3Var.d) && fni.a(this.e, th3Var.e) && fni.a(this.f, th3Var.f) && fni.a(this.g, th3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonColors(action=" + this.a + ", background=" + this.b + ", icon=" + this.c + ", shadows=" + this.d + ", states=" + this.e + ", stroke=" + this.f + ", text=" + this.g + ")";
    }
}
