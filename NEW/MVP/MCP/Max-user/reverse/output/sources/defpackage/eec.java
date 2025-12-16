package defpackage;

/* loaded from: classes2.dex */
public final class eec {
    public final boolean a;
    public final boolean b;

    public eec(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static eec a(eec eecVar, boolean z) {
        boolean z2 = eecVar.b;
        eecVar.getClass();
        return new eec(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eec)) {
            return false;
        }
        eec eecVar = (eec) obj;
        return this.a == eecVar.a && this.b == eecVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("State(isChecked=", this.a, ", isEnabled=", this.b, ")");
    }
}
