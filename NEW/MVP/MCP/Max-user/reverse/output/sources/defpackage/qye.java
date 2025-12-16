package defpackage;

/* loaded from: classes2.dex */
public final class qye extends vx3 {
    public final n5g a;

    public qye(n5g n5gVar) {
        this.a = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qye) && this.a.equals(((qye) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ")";
    }
}
