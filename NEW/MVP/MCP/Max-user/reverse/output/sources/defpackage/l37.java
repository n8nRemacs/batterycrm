package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l37 implements o37 {
    public final String a;
    public final long b;
    public final long c;
    public final CharSequence d;
    public final ArrayList e;

    public l37(String str, long j, long j2, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l37)) {
            return false;
        }
        l37 l37Var = (l37) obj;
        return this.a.equals(l37Var.a) && this.b == l37Var.b && this.c == l37Var.c && fni.a(this.d, l37Var.d) && this.e.equals(l37Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + u45.g(this.d, a9h.a(a9h.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("Link(link=", this.b, this.a, ", chatLocalId=");
        az1.r(this.c, ", chatServerId=", ", chatName=", sbQ);
        sbQ.append((Object) this.d);
        sbQ.append(", messagesIds=");
        sbQ.append(this.e);
        sbQ.append(")");
        return sbQ.toString();
    }
}
