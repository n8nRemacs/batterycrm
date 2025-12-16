package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zw6 {
    public final yw6 a;
    public final ax6 b;

    public zw6(yw6 yw6Var, ax6 ax6Var) {
        this.a = yw6Var;
        this.b = ax6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw6)) {
            return false;
        }
        zw6 zw6Var = (zw6) obj;
        return fni.a(this.a, zw6Var.a) && fni.a(this.b, zw6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GradientsBannerDKColors(background=" + this.a + ", stroke=" + this.b + ")";
    }
}
