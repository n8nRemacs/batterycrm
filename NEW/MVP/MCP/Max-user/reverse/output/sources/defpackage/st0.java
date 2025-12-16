package defpackage;

/* loaded from: classes2.dex */
public final class st0 {
    public final tt0 a;
    public final ut0 b;
    public final vt0 c;

    public st0(tt0 tt0Var, ut0 ut0Var, vt0 vt0Var) {
        this.a = tt0Var;
        this.b = ut0Var;
        this.c = vt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st0)) {
            return false;
        }
        st0 st0Var = (st0) obj;
        return fni.a(this.a, st0Var.a) && fni.a(this.b, st0Var.b) && fni.a(this.c, st0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BubbleBackgroundFocusColors(regular=" + this.a + ", singleMedia=" + this.b + ", transparent=" + this.c + ")";
    }
}
