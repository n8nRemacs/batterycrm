package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ar9 {
    public final int a;
    public final int b;
    public final boolean c;

    public ar9(pb2 pb2Var, eh9 eh9Var, boolean z) {
        int iHashCode = eh9Var.c(pb2Var).hashCode();
        List list = eh9Var.a.N0;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        this.a = iHashCode;
        this.b = iHashCode2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar9)) {
            return false;
        }
        ar9 ar9Var = (ar9) obj;
        return this.a == ar9Var.a && this.b == ar9Var.b && this.c == ar9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return az1.k(wy1.k("Key(textHash=", this.a, ", messageElementsHash=", this.b, ", isChild="), this.c, ")");
    }
}
