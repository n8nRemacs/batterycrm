package defpackage;

/* loaded from: classes2.dex */
public final class h74 implements j74 {
    public final s5g a;

    public h74(s5g s5gVar) {
        this.a = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h74) && fni.a(this.a, ((h74) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(message=" + this.a + ")";
    }
}
