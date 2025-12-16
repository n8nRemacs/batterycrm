package defpackage;

/* loaded from: classes2.dex */
public final class f9 {
    public static final f9 f;
    public final fk6 a;
    public final fk6 b;
    public final fk6 c;
    public final boolean d;
    public final fk6 e;

    static {
        fk6 fk6Var = fk6.u0;
        fk6 fk6Var2 = fk6.c;
        f = new f9(fk6Var2, fk6Var, fk6Var2, false, fk6Var2);
    }

    public f9(fk6 fk6Var, fk6 fk6Var2, fk6 fk6Var3, boolean z, fk6 fk6Var4) {
        this.a = fk6Var;
        this.b = fk6Var2;
        this.c = fk6Var3;
        this.d = z;
        this.e = fk6Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return this.a == f9Var.a && this.b == f9Var.b && this.c == f9Var.c && this.d == f9Var.d && this.e == f9Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + a9h.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "AdaptiveTrackSelectionConfig(minFrameSize=" + this.a + ", maxFrameSize=" + this.b + ", minInitialFrameSize=" + this.c + ", adaptiveToViewport=" + this.d + ", adaptiveToViewportMinFrameSize=" + this.e + ")";
    }
}
