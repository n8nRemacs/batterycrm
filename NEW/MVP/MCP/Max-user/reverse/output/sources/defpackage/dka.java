package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class dka extends l0g {
    public final qb2 c;
    public final long[] d;
    public final boolean o;

    public dka(qb2 qb2Var, long[] jArr, boolean z) {
        this.c = qb2Var;
        this.d = jArr;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dka)) {
            return false;
        }
        dka dkaVar = (dka) obj;
        return this.o == dkaVar.o && fni.a(this.c, dkaVar.c) && Arrays.equals(this.d, dkaVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((this.c.hashCode() + (Boolean.hashCode(this.o) * 31)) * 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        String string = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder("Response(chat=");
        sb.append(this.c);
        sb.append(", messageIds=");
        sb.append(string);
        sb.append(", isTtl=");
        return az1.k(sb, this.o, ")");
    }
}
