package defpackage;

/* loaded from: classes2.dex */
public final class gi3 {
    public final fi3 a;
    public final int b;

    public gi3(fi3 fi3Var, int i) {
        this.a = fi3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi3)) {
            return false;
        }
        gi3 gi3Var = (gi3) obj;
        return this.a.equals(gi3Var.a) && this.b == gi3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "CommonStatesBackgroundActiveColors(action=" + this.a + ", neutralFadeTertiary=" + this.b + ")";
    }
}
