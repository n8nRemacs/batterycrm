package defpackage;

/* loaded from: classes2.dex */
public final class pjc implements rjc {
    public final s5g a;

    public pjc(s5g s5gVar) {
        this.a = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pjc) && fni.a(this.a, ((pjc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowRestoreMembersSnackbar(caption=" + this.a + ")";
    }
}
