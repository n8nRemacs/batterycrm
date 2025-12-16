package defpackage;

/* loaded from: classes.dex */
public final class sr1 {
    public final boolean a;
    public final boolean b;

    public sr1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr1)) {
            return false;
        }
        sr1 sr1Var = (sr1) obj;
        return this.a == sr1Var.a && this.b == sr1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("ButtonsVisibility(moreButtonVisibility=", this.a, ", settingsButtonVisibility=", this.b, ")");
    }
}
