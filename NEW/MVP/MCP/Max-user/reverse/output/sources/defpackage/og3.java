package defpackage;

/* loaded from: classes2.dex */
public final class og3 {
    public final mg3 a;
    public final ng3 b;
    public final qg3 c;
    public final sg3 d;

    public og3(mg3 mg3Var, ng3 ng3Var, qg3 qg3Var, sg3 sg3Var) {
        this.a = mg3Var;
        this.b = ng3Var;
        this.c = qg3Var;
        this.d = sg3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3)) {
            return false;
        }
        og3 og3Var = (og3) obj;
        return fni.a(this.a, og3Var.a) && fni.a(this.b, og3Var.b) && fni.a(this.c, og3Var.c) && fni.a(this.d, og3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonColors(bubbleGradientPrimary=" + this.a + ", bubbleGradientSecondary=" + this.b + ", stickerPrimary=" + this.c + ", stickerSecondary=" + this.d + ")";
    }
}
