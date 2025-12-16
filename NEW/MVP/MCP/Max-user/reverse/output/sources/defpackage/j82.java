package defpackage;

/* loaded from: classes2.dex */
public final class j82 extends n82 {
    public final r5g a;

    public j82(r5g r5gVar) {
        this.a = r5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j82) && this.a.equals(((j82) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ErrorWithLocalizedMessage(text=" + this.a + ")";
    }
}
