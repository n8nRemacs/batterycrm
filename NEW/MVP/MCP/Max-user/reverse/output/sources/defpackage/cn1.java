package defpackage;

/* loaded from: classes.dex */
public final class cn1 extends en1 {
    public final km1 D = km1.a;
    public final s5g E;
    public final Integer F;

    public cn1(s5g s5gVar, Integer num) {
        this.E = s5gVar;
        this.F = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn1)) {
            return false;
        }
        cn1 cn1Var = (cn1) obj;
        return this.D == cn1Var.D && fni.a(this.E, cn1Var.E) && fni.a(this.F, cn1Var.F);
    }

    public final int hashCode() {
        int iD = xc0.d(this.D.hashCode() * 31, 31, this.E);
        Integer num = this.F;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(priority=" + this.D + ", textSource=" + this.E + ", icon=" + this.F + ")";
    }
}
