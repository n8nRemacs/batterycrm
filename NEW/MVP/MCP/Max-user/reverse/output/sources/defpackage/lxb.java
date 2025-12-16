package defpackage;

/* loaded from: classes2.dex */
public final class lxb implements mxb {
    public final n5g a;

    public lxb(n5g n5gVar) {
        this.a = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxb) && this.a.equals(((lxb) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.a + ")";
    }
}
