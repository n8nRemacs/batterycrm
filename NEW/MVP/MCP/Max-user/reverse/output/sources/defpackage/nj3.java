package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class nj3 {
    public final long a;
    public final byte b;
    public final List c;

    public nj3(long j, byte b, List list) {
        this.a = j;
        this.b = b;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj3)) {
            return false;
        }
        nj3 nj3Var = (nj3) obj;
        return this.a == nj3Var.a && this.b == nj3Var.b && fni.a(this.c, nj3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Byte.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ComplainReasonsEntity(id=" + this.a + ", typeId=" + ((int) this.b) + ", complainReason=" + this.c + ")";
    }
}
