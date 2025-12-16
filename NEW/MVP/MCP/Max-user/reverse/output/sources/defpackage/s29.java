package defpackage;

/* loaded from: classes.dex */
public class s29 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public s29(s29 s29Var) {
        this.a = s29Var.a;
        this.b = s29Var.b;
        this.c = s29Var.c;
        this.d = s29Var.d;
        this.e = s29Var.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s29)) {
            return false;
        }
        s29 s29Var = (s29) obj;
        return this.a.equals(s29Var.a) && this.b == s29Var.b && this.c == s29Var.c && this.d == s29Var.d && this.e == s29Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public s29(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
