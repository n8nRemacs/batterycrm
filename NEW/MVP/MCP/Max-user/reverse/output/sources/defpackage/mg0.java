package defpackage;

/* loaded from: classes2.dex */
public final class mg0 {
    public final boolean a;
    public final boolean b;

    public mg0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg0)) {
            return false;
        }
        mg0 mg0Var = (mg0) obj;
        return this.a == mg0Var.a && this.b == mg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("SignalingConfig(dcReportNetworkStatEnabled=", this.a, ", producerCommandV3=", this.b, ")");
    }
}
