package defpackage;

/* loaded from: classes.dex */
public final class pb0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public pb0(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pb0) {
            pb0 pb0Var = (pb0) obj;
            if (this.a == pb0Var.a && this.b == pb0Var.b && this.c == pb0Var.c && this.d == pb0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.c);
        sb.append(", ultraHdrOn=");
        return az1.k(sb, this.d, "}");
    }
}
