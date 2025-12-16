package defpackage;

/* loaded from: classes2.dex */
public final class ii3 {
    public final int a;
    public final int b;
    public final int c;

    public ii3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii3)) {
            return false;
        }
        ii3 ii3Var = (ii3) obj;
        return this.a == ii3Var.a && this.b == ii3Var.b && this.c == ii3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("CommonStatesBackgroundDisabledColors(accent=", this.a, ", neutralFadeSecondary=", this.b, ", neutralThemed="), this.c, ")");
    }
}
