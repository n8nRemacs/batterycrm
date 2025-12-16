package defpackage;

/* loaded from: classes2.dex */
public final class oua {
    public final yl a;
    public final tl b;

    public oua(yl ylVar, tl tlVar) {
        this.a = ylVar;
        this.b = tlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oua)) {
            return false;
        }
        oua ouaVar = (oua) obj;
        return fni.a(this.a, ouaVar.a) && fni.a(this.b, ouaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OkApiRequest(request=" + this.a + ", config=" + this.b + ")";
    }
}
