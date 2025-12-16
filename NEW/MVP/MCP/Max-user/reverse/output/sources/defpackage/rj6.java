package defpackage;

/* loaded from: classes2.dex */
public final class rj6 {
    public static final rj6 d = new rj6(null, 7);
    public final g2h a;
    public final int b;
    public final int c;

    public /* synthetic */ rj6(g2h g2hVar, int i) {
        this((i & 1) != 0 ? null : g2hVar, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj6)) {
            return false;
        }
        rj6 rj6Var = (rj6) obj;
        return fni.a(this.a, rj6Var.a) && this.b == rj6Var.b && this.c == rj6Var.c;
    }

    public final int hashCode() {
        g2h g2hVar = this.a;
        return Integer.hashCode(this.c) + xrf.k(this.b, (g2hVar == null ? 0 : g2hVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractorData(videoContent=");
        sb.append(this.a);
        sb.append(", frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        return ho7.j(sb, this.c, ")");
    }

    public rj6(g2h g2hVar, int i, int i2) {
        this.a = g2hVar;
        this.b = i;
        this.c = i2;
    }
}
