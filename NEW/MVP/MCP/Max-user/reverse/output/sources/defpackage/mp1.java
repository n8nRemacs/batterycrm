package defpackage;

/* loaded from: classes.dex */
public final class mp1 {
    public final s5g a;

    public mp1(r5g r5gVar) {
        this.a = r5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp1) && fni.a(this.a, ((mp1) obj).a);
    }

    public final int hashCode() {
        s5g s5gVar = this.a;
        return (s5gVar == null ? 0 : s5gVar.hashCode()) * 31;
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=null)";
    }
}
