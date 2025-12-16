package defpackage;

/* loaded from: classes.dex */
public final class fp2 {
    public final sj6 a;
    public final boolean b;

    public fp2(sj6 sj6Var, int i) {
        sj6Var = (i & 1) != 0 ? null : sj6Var;
        boolean z = (i & 2) == 0;
        this.a = sj6Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp2)) {
            return false;
        }
        fp2 fp2Var = (fp2) obj;
        return fni.a(this.a, fp2Var.a) && this.b == fp2Var.b;
    }

    public final int hashCode() {
        sj6 sj6Var = this.a;
        return Boolean.hashCode(true) + a9h.b((sj6Var == null ? 0 : sj6Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "FrameState(frame=" + this.a + ", loading=" + this.b + ", featureEnabled=true)";
    }
}
