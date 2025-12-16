package defpackage;

/* loaded from: classes2.dex */
public final class j0h {
    public final k0h a;
    public final l0h b;

    public j0h(k0h k0hVar, l0h l0hVar) {
        this.a = k0hVar;
        this.b = l0hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0h)) {
            return false;
        }
        j0h j0hVar = (j0h) obj;
        return fni.a(this.a, j0hVar.a) && fni.a(this.b, j0hVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(687865856) + (Integer.hashCode(520093696) * 31);
    }

    public final String toString() {
        return "VfxButtonIconOverlayPlainColors(elevation1=" + this.a + ", elevation2=" + this.b + ")";
    }
}
