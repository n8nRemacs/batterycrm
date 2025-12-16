package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class cx6 {
    public final zw6 a;
    public final bx6 b;
    public final dx6 c;
    public final ex6 d;
    public final fx6 e;
    public final nx6 f;
    public final ox6 g;
    public final qx6 h;

    public cx6(zw6 zw6Var, bx6 bx6Var, dx6 dx6Var, ex6 ex6Var, fx6 fx6Var, nx6 nx6Var, ox6 ox6Var, qx6 qx6Var) {
        this.a = zw6Var;
        this.b = bx6Var;
        this.c = dx6Var;
        this.d = ex6Var;
        this.e = fx6Var;
        this.f = nx6Var;
        this.g = ox6Var;
        this.h = qx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx6)) {
            return false;
        }
        cx6 cx6Var = (cx6) obj;
        return fni.a(this.a, cx6Var.a) && fni.a(this.b, cx6Var.b) && fni.a(this.c, cx6Var.c) && fni.a(this.d, cx6Var.d) && fni.a(this.e, cx6Var.e) && fni.a(this.f, cx6Var.f) && fni.a(this.g, cx6Var.g) && fni.a(this.h, cx6Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((Arrays.hashCode(this.f.a) + ((this.e.hashCode() + ((this.d.hashCode() + ((Arrays.hashCode(this.c.a) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsColors(bannerDK=" + this.a + ", buttonTextPromo=" + this.b + ", complex=" + this.c + ", emptyBlockIconWrapper=" + this.d + ", loadingIcon=" + this.e + ", local=" + this.f + ", overlay=" + this.g + ", skeletonGradient=" + this.h + ")";
    }
}
