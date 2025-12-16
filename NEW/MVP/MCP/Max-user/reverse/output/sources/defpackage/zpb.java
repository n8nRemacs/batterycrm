package defpackage;

/* loaded from: classes2.dex */
public final class zpb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final bqb f;
    public final int g;
    public final int h;
    public final String i;

    public zpb(int i, int i2, int i3, int i4, String str, bqb bqbVar, int i5, int i6, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = bqbVar;
        this.g = i5;
        this.h = i6;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zpb.class.equals(obj.getClass())) {
            return false;
        }
        zpb zpbVar = (zpb) obj;
        if (this.a == zpbVar.a && this.b == zpbVar.b && this.c == zpbVar.c && this.d == zpbVar.d && this.h == zpbVar.h && fni.a(this.i, zpbVar.i) && fni.a(this.f, zpbVar.f) && this.g == zpbVar.g) {
            return fni.a(this.e, zpbVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.h) * 31;
        String str = this.e;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        bqb bqbVar = this.f;
        int iHashCode2 = (((iHashCode + (bqbVar != null ? bqbVar.a.hashCode() : 0)) * 31) + this.g) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("PeerVideoSettings{maxDimension=", this.a, ", initialMaxDimension=", this.b, ", maxBitrateK=");
        hf3.g(sbK, this.c, ", maxFrameRate=", this.d, ", temporalLayersCount=");
        sbK.append(this.h);
        sbK.append(", degradationPreference='");
        sbK.append(this.e);
        sbK.append("', bitrateTable=");
        sbK.append(this.f);
        sbK.append(", mediaAdaptationScale=");
        sbK.append(this.g);
        sbK.append(", source='");
        return ho7.l(sbK, this.i, "'}");
    }
}
