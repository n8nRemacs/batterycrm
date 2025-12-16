package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class xja extends l0g {
    public final fh9 X;
    public final long[] Y;
    public final long c;
    public final long d;
    public final int o;

    public xja(long j, long j2, int i, fh9 fh9Var, long[] jArr) {
        this.c = j;
        this.d = j2;
        this.o = i;
        this.X = fh9Var;
        this.Y = jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xja)) {
            return false;
        }
        xja xjaVar = (xja) obj;
        return this.c == xjaVar.c && this.d == xjaVar.d && this.o == xjaVar.o && fni.a(this.X, xjaVar.X) && Arrays.equals(this.Y, xjaVar.Y);
    }

    public final int hashCode() {
        int iK = utb.k(this.o, a9h.a(Long.hashCode(this.c) * 31, 31, this.d), 31);
        fh9 fh9Var = this.X;
        return Arrays.hashCode(this.Y) + ((iK + (fh9Var != null ? fh9Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        String string = Arrays.toString(this.Y);
        StringBuilder sbL = az1.l(this.c, "Response(chatId=", ", userId=");
        sbL.append(this.d);
        sbL.append(", updateType=");
        int i = this.o;
        sbL.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "FIRE_SUCCESS" : "DELETED" : "EDITED" : "CREATED");
        sbL.append(", message=");
        sbL.append(this.X);
        sbL.append(", messageIds=");
        sbL.append(string);
        sbL.append(")");
        return sbL.toString();
    }
}
