package defpackage;

/* loaded from: classes2.dex */
public final class m0h {
    public final j0h a;
    public final n0h b;

    public m0h(j0h j0hVar, n0h n0hVar) {
        this.a = j0hVar;
        this.b = n0hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0h)) {
            return false;
        }
        m0h m0hVar = (m0h) obj;
        return fni.a(this.a, m0hVar.a) && fni.a(this.b, m0hVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VfxColors(buttonIconOverlayPlain=" + this.a + ", emptyBlock=" + this.b + ")";
    }
}
