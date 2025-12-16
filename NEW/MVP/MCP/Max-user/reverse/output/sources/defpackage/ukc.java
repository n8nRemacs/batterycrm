package defpackage;

/* loaded from: classes2.dex */
public final class ukc extends id0 {
    public final long b;
    public final pdc c;
    public final boolean d;
    public final String e;

    public ukc(long j, pdc pdcVar, boolean z, String str) {
        super(16);
        this.b = j;
        this.c = pdcVar;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukc)) {
            return false;
        }
        ukc ukcVar = (ukc) obj;
        return this.b == ukcVar.b && this.c == ukcVar.c && this.d == ukcVar.d && fni.a(this.e, ukcVar.e);
    }

    public final int hashCode() {
        int iB = a9h.b((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d);
        String str = this.e;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OpenCall(id=" + this.b + ", type=" + this.c + ", isVideo=" + this.d + ", joinLink=" + this.e + ")";
    }
}
