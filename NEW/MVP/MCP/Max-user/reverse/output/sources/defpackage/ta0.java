package defpackage;

/* loaded from: classes.dex */
public final class ta0 extends cea {
    public final bea a;
    public final aea b;

    public ta0(bea beaVar, aea aeaVar) {
        this.a = beaVar;
        this.b = aeaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cea) {
            cea ceaVar = (cea) obj;
            bea beaVar = this.a;
            if (beaVar != null ? beaVar.equals(((ta0) ceaVar).a) : ((ta0) ceaVar).a == null) {
                aea aeaVar = this.b;
                if (aeaVar != null ? aeaVar.equals(((ta0) ceaVar).b) : ((ta0) ceaVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        bea beaVar = this.a;
        int iHashCode = ((beaVar == null ? 0 : beaVar.hashCode()) ^ 1000003) * 1000003;
        aea aeaVar = this.b;
        return (aeaVar != null ? aeaVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
