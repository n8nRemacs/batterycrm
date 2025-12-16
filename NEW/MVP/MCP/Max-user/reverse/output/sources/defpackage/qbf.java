package defpackage;

/* loaded from: classes2.dex */
public final class qbf implements sbf {
    public final String a;
    public final long b;

    public qbf(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbf)) {
            return false;
        }
        qbf qbfVar = (qbf) obj;
        return fni.a(this.a, qbfVar.a) && this.b == qbfVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("ShowWarningBottomSheet(fileUrl=", this.b, this.a, ", fileSize=");
        sbQ.append(")");
        return sbQ.toString();
    }
}
