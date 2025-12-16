package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m37 implements o37 {
    public final long a;
    public final long b;
    public final ArrayList c;

    public m37(long j, long j2, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m37)) {
            return false;
        }
        m37 m37Var = (m37) obj;
        return this.a == m37Var.a && this.b == m37Var.b && this.c.equals(m37Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "OneToOne(opponentId=", ", chatId=");
        sbL.append(this.b);
        sbL.append(", messagesIds=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
