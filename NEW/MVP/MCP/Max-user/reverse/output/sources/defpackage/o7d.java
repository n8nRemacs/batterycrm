package defpackage;

/* loaded from: classes.dex */
public final class o7d extends p7d implements l7c {
    public static final /* synthetic */ int c = 0;
    public final hc4 a;
    public final hc4 b;

    static {
        new o7d(fc4.d, fc4.c);
    }

    public o7d(hc4 hc4Var, hc4 hc4Var2) {
        this.a = hc4Var;
        this.b = hc4Var2;
        if (hc4Var.compareTo(hc4Var2) > 0 || hc4Var == fc4.c || hc4Var2 == fc4.d) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            hc4Var.c(sb2);
            sb2.append("..");
            hc4Var2.d(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static o7d a(Long l, Long l2) {
        return new o7d(new fc4(l, 2), new gc4(l2));
    }

    @Override // defpackage.l7c
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.a.g(comparable) && !this.b.g(comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o7d) {
            o7d o7dVar = (o7d) obj;
            if (this.a.equals(o7dVar.a) && this.b.equals(o7dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.c(sb);
        sb.append("..");
        this.b.d(sb);
        return sb.toString();
    }
}
