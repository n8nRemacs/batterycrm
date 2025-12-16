package defpackage;

/* loaded from: classes2.dex */
public final class ss8 {
    public final qs8 a;
    public final rs8 b;

    public ss8() {
        qs8 qs8Var = new qs8();
        rs8 rs8Var = new rs8();
        this.a = qs8Var;
        this.b = rs8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss8)) {
            return false;
        }
        ss8 ss8Var = (ss8) obj;
        return fni.a(this.a, ss8Var.a) && fni.a(this.b, ss8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaAdaptationConfig(badNetwork=" + this.a + ", goodNetwork=" + this.b + ")";
    }
}
