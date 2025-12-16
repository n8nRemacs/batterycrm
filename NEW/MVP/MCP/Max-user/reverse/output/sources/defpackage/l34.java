package defpackage;

/* loaded from: classes2.dex */
public final class l34 implements p34 {
    public final s5g a;

    public l34(s5g s5gVar) {
        this.a = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l34) && fni.a(this.a, ((l34) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gallery(toolbarTitle=" + this.a + ")";
    }
}
