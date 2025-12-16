package defpackage;

/* loaded from: classes2.dex */
public final class cpg {
    public final ek8 a;

    public cpg(ek8 ek8Var) {
        this.a = ek8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpg) && fni.a(this.a, ((cpg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypingState(typing=" + this.a + ")";
    }
}
