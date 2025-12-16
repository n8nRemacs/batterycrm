package defpackage;

import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class xk7 implements zk7 {
    public final String a;
    public final s5g b;
    public final s5g c;
    public final RLottieDrawable d;
    public final boolean e;

    public xk7(String str, s5g s5gVar, s5g s5gVar2, RLottieDrawable rLottieDrawable, boolean z) {
        this.a = str;
        this.b = s5gVar;
        this.c = s5gVar2;
        this.d = rLottieDrawable;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk7)) {
            return false;
        }
        xk7 xk7Var = (xk7) obj;
        return fni.a(this.a, xk7Var.a) && fni.a(this.b, xk7Var.b) && fni.a(this.c, xk7Var.c) && fni.a(this.d, xk7Var.d) && this.e == xk7Var.e;
    }

    public final int hashCode() {
        int iD = xc0.d(xc0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        RLottieDrawable rLottieDrawable = this.d;
        return Boolean.hashCode(this.e) + ((iD + (rLottieDrawable == null ? 0 : rLottieDrawable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", drawable=");
        sb.append(this.d);
        sb.append(", useTextShimmer=");
        return az1.k(sb, this.e, ")");
    }
}
