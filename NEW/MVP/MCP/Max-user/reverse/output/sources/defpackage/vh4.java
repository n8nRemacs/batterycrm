package defpackage;

/* loaded from: classes2.dex */
public final class vh4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public vh4() {
        boolean zBooleanValue = ((Boolean) ((bwf) th4.a.b).getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ((bwf) th4.b.b).getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) ((bwf) th4.c.b).getValue()).booleanValue();
        this.a = zBooleanValue;
        this.b = zBooleanValue2;
        this.c = zBooleanValue3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh4)) {
            return false;
        }
        vh4 vh4Var = (vh4) obj;
        return this.a == vh4Var.a && this.b == vh4Var.b && this.c == vh4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return az1.k(ho7.p("DecodersConfig(isVP9Supported=", this.a, ", isAV1Supported=", this.b, ", isOpusSupported="), this.c, ")");
    }
}
