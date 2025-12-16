package defpackage;

/* loaded from: classes2.dex */
public final class hi3 {
    public final gi3 a;
    public final ii3 b;

    public hi3(gi3 gi3Var, ii3 ii3Var) {
        this.a = gi3Var;
        this.b = ii3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi3)) {
            return false;
        }
        hi3 hi3Var = (hi3) obj;
        return fni.a(this.a, hi3Var.a) && fni.a(this.b, hi3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonStatesBackgroundColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
