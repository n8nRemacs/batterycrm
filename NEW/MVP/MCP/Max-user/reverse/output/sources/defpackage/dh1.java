package defpackage;

/* loaded from: classes.dex */
public final class dh1 extends gh1 {
    public final zi1 a;
    public final boolean b;
    public final boolean c;

    public dh1(zi1 zi1Var, boolean z, boolean z2) {
        this.a = zi1Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh1)) {
            return false;
        }
        dh1 dh1Var = (dh1) obj;
        return fni.a(this.a, dh1Var.a) && this.b == dh1Var.b && this.c == dh1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a9h.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HasItemActions(opponentId=");
        sb.append(this.a);
        sb.append(", hasMenuAction=");
        sb.append(this.b);
        sb.append(", isRaiseHand=");
        return az1.k(sb, this.c, ")");
    }
}
