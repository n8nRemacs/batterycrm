package defpackage;

/* loaded from: classes.dex */
public final class n90 {
    public final int a;
    public final Throwable b;

    public n90(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n90) {
            n90 n90Var = (n90) obj;
            int i = n90Var.a;
            Throwable th2 = n90Var.b;
            if (this.a == i && ((th = this.b) != null ? th.equals(th2) : th2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
