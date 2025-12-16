package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class q19 {
    public final long a;
    public final long b;
    public final Set c;
    public final long d;

    public q19(long j, long j2, Set set, long j3) {
        this.a = j;
        this.b = j2;
        this.c = set;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q19)) {
            return false;
        }
        q19 q19Var = (q19) obj;
        return this.a == q19Var.a && this.b == q19Var.b && fni.a(this.c, q19Var.c) && this.d == q19Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "MediaMarkers(backward=", ", forward=");
        sbL.append(this.b);
        sbL.append(", types=");
        sbL.append(this.c);
        return u45.i(this.d, ", chatId=", ")", sbL);
    }
}
