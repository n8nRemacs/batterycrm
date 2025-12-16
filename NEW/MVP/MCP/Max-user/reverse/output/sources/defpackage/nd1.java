package defpackage;

/* loaded from: classes.dex */
public final class nd1 extends ud1 {
    public final wd0 a;

    public nd1(wd0 wd0Var) {
        this.a = wd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd1) && fni.a(this.a, ((nd1) obj).a);
    }

    public final int hashCode() {
        wd0 wd0Var = this.a;
        if (wd0Var == null) {
            return 0;
        }
        return wd0Var.hashCode();
    }

    public final String toString() {
        return "Avatar(avatarInfo=" + this.a + ")";
    }
}
