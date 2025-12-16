package defpackage;

/* loaded from: classes2.dex */
public final class bz {
    public final String a;
    public final String b;
    public final Integer c;

    public bz(String str, Integer num, String str2) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return fni.a(this.a, bzVar.a) && fni.a(this.b, bzVar.b) && fni.a(this.c, bzVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("AttachData(attachName=", this.a, ", image=", this.b, ", placeholder=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
