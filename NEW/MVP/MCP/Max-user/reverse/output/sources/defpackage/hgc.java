package defpackage;

/* loaded from: classes2.dex */
public final class hgc implements igc {
    public final laj a;

    public hgc(laj lajVar) {
        this.a = lajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgc) && fni.a(this.a, ((hgc) obj).a);
    }

    public final int hashCode() {
        laj lajVar = this.a;
        if (lajVar == null) {
            return 0;
        }
        return lajVar.hashCode();
    }

    public final String toString() {
        return "ShortLinkPayload(state=" + this.a + ")";
    }
}
