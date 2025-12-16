package defpackage;

/* loaded from: classes2.dex */
public final class jk2 {
    public final long a;
    public final long b;
    public final String c;
    public final o05 d;
    public final boolean e;

    public jk2(long j, long j2, String str, o05 o05Var, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = o05Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk2)) {
            return false;
        }
        jk2 jk2Var = (jk2) obj;
        return this.a == jk2Var.a && this.b == jk2Var.b && fni.a(this.c, jk2Var.c) && this.d == jk2Var.d && this.e == jk2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + u45.e(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "DownloadData(msgId=", ", attachId=");
        hf3.e(this.b, ", localAttachId=", this.c, sbL);
        sbL.append(", cause=");
        sbL.append(this.d);
        sbL.append(", completed=");
        sbL.append(this.e);
        sbL.append(")");
        return sbL.toString();
    }
}
