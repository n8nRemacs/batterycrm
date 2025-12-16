package defpackage;

/* loaded from: classes2.dex */
public final class li4 {
    public static final li4 c = new li4((q8g) null, 3);
    public final cm6 a;
    public final cm6 b;

    public li4(cm6 cm6Var, cm6 cm6Var2) {
        this.a = cm6Var;
        this.b = cm6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li4)) {
            return false;
        }
        li4 li4Var = (li4) obj;
        return fni.a(this.a, li4Var.a) && fni.a(this.b, li4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Animations(push=" + this.a + ", pop=" + this.b + ")";
    }

    public /* synthetic */ li4(q8g q8gVar, int i) {
        this(k54.c, (i & 2) != 0 ? k54.d : q8gVar);
    }
}
