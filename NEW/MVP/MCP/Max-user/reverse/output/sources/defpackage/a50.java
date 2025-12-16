package defpackage;

/* loaded from: classes.dex */
public final class a50 {
    public static final a50 d = new z40().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a50(z40 z40Var) {
        this.a = z40Var.a;
        this.b = z40Var.b;
        this.c = z40Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a50.class != obj.getClass()) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return this.a == a50Var.a && this.b == a50Var.b && this.c == a50Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
