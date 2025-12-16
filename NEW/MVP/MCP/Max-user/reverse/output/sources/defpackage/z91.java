package defpackage;

/* loaded from: classes.dex */
public final class z91 implements ba1 {
    public final r51 a;

    public z91(r51 r51Var) {
        this.a = r51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z91) && fni.a(this.a, ((z91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateJoinLinkEvent(event=" + this.a + ")";
    }
}
