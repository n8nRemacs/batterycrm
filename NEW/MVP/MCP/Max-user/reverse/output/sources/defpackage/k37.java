package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k37 implements o37 {
    public final long a;
    public final long b;
    public final boolean c;
    public final ArrayList d;
    public final String e;

    public k37(long j, long j2, boolean z, ArrayList arrayList, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k37)) {
            return false;
        }
        k37 k37Var = (k37) obj;
        return this.a == k37Var.a && this.b == k37Var.b && this.c == k37Var.c && this.d.equals(k37Var.d) && this.e.equals(k37Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + a9h.b(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Group(chatServerId=", ", chatLocalId=");
        sbL.append(this.b);
        sbL.append(", isGroupCallAvailable=");
        sbL.append(this.c);
        sbL.append(", messagesIds=");
        sbL.append(this.d);
        sbL.append(", link=");
        sbL.append(this.e);
        sbL.append(")");
        return sbL.toString();
    }
}
