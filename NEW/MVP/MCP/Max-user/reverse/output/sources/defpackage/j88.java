package defpackage;

/* loaded from: classes2.dex */
public final class j88 {
    public final String a;
    public final s5g b;

    public j88(s5g s5gVar, String str) {
        this.a = str;
        this.b = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j88)) {
            return false;
        }
        j88 j88Var = (j88) obj;
        return fni.a(this.a, j88Var.a) && fni.a(this.b, j88Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinkValidationState(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
