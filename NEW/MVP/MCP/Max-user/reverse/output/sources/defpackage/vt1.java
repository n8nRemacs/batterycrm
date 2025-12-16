package defpackage;

/* loaded from: classes2.dex */
public final class vt1 {
    public final z81 a;

    public vt1(z81 z81Var) {
        this.a = z81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt1) && fni.a(this.a, ((vt1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Feedback(feedback=" + this.a + ")";
    }
}
