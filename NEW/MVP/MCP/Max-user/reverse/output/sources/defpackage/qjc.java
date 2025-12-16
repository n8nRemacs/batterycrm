package defpackage;

/* loaded from: classes2.dex */
public final class qjc implements rjc {
    public final s5g a;

    public qjc(s5g s5gVar) {
        this.a = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjc) && fni.a(this.a, ((qjc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowSuccessRestoredMembersSnackbar(caption=" + this.a + ")";
    }
}
