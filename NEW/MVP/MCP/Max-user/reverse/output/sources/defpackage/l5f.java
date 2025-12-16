package defpackage;

/* loaded from: classes2.dex */
public final class l5f implements n5f {
    public final oh8 a;

    public l5f(oh8 oh8Var) {
        this.a = oh8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5f) && fni.a(this.a, ((l5f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
