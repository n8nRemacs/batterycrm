package defpackage;

/* loaded from: classes2.dex */
public final class rtb {
    public final String a;
    public final long b;

    public rtb(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtb)) {
            return false;
        }
        rtb rtbVar = (rtb) obj;
        return fni.a(this.a, rtbVar.a) && this.b == rtbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("PhoneAndServerPhone(phone=", this.b, this.a, ", serverPhone=");
        sbQ.append(")");
        return sbQ.toString();
    }
}
