package defpackage;

/* loaded from: classes2.dex */
public final class oi1 {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Integer d;
    public final Integer e;

    public oi1(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi1)) {
            return false;
        }
        oi1 oi1Var = (oi1) obj;
        return fni.a(this.a, oi1Var.a) && fni.a(this.b, oi1Var.b) && fni.a(this.c, oi1Var.c) && fni.a(this.d, oi1Var.d) && fni.a(this.e, oi1Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "AudioRedundancyParams(isNoLaceEnabled=" + this.a + ", isDREDWithFecEnabled=" + this.b + ", isDREDLowBitrateEnabled=" + this.c + ", minAudioBitrateBps=" + this.d + ", dREDSwitchBitrateBps=" + this.e + ")";
    }
}
