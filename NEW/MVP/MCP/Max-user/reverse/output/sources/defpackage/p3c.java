package defpackage;

/* loaded from: classes.dex */
public final class p3c {
    public final a26 a;

    public p3c(a26 a26Var) {
        this.a = a26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p3c) {
            return this.a.equals(((p3c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
