package defpackage;

/* loaded from: classes2.dex */
public final class ih5 {
    public static final eh5 Companion = new eh5();
    public final String a;
    public final hh5 b;

    public /* synthetic */ ih5(int i, String str, hh5 hh5Var) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, dh5.a.d());
            throw null;
        }
        this.a = str;
        this.b = hh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih5)) {
            return false;
        }
        ih5 ih5Var = (ih5) obj;
        return fni.a(this.a, ih5Var.a) && fni.a(this.b, ih5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorResponse(requestId=" + this.a + ", error=" + this.b + ")";
    }

    public ih5(String str, hh5 hh5Var) {
        this.a = str;
        this.b = hh5Var;
    }
}
