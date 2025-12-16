package defpackage;

/* loaded from: classes.dex */
public final class f71 implements u71 {
    public final n73 a;

    public f71(n73 n73Var) {
        this.a = n73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f71) && fni.a(this.a, ((f71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChatsUpdate(info=" + this.a + ")";
    }
}
