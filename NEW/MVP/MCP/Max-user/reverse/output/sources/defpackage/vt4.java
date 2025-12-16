package defpackage;

/* loaded from: classes.dex */
public final class vt4 {
    public final fsc a;
    public final int b;
    public final int c;

    public vt4(int i, int i2, Class cls) {
        this(fsc.a(cls), i, i2);
    }

    public static vt4 a(Class cls) {
        return new vt4(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vt4)) {
            return false;
        }
        vt4 vt4Var = (vt4) obj;
        return this.a.equals(vt4Var.a) && this.b == vt4Var.b && this.c == vt4Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(ho7.f(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return ho7.l(sb, str, "}");
    }

    public vt4(fsc fscVar, int i, int i2) {
        this.a = fscVar;
        this.b = i;
        this.c = i2;
    }
}
