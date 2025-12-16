package defpackage;

/* loaded from: classes.dex */
public final class bh1 extends gh1 {
    public final zi1 a;
    public final String b;
    public final String c;

    public bh1(zi1 zi1Var, String str, String str2) {
        this.a = zi1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh1)) {
            return false;
        }
        bh1 bh1Var = (bh1) obj;
        return fni.a(this.a, bh1Var.a) && fni.a(this.b, bh1Var.b) && fni.a(this.c, bh1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", url=");
        return ho7.l(sb, this.c, ")");
    }
}
