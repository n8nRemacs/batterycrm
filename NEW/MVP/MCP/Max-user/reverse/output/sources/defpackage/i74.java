package defpackage;

/* loaded from: classes2.dex */
public final class i74 implements j74 {
    public final s5g a;

    public i74(s5g s5gVar) {
        this.a = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i74) && fni.a(this.a, ((i74) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(message=" + this.a + ")";
    }
}
