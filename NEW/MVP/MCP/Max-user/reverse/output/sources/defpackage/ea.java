package defpackage;

/* loaded from: classes2.dex */
public final class ea {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public ea(int i, long j, long j2, String str) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return this.a == eaVar.a && this.b == eaVar.b && this.c == eaVar.c && fni.a(this.d, eaVar.d);
    }

    public final int hashCode() {
        int iA = a9h.a(xrf.k(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant(id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        az1.r(this.c, ", inviterId=", ", alias=", sb);
        return ho7.l(sb, this.d, ")");
    }
}
