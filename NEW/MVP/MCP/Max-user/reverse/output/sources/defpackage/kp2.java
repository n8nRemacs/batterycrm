package defpackage;

/* loaded from: classes.dex */
public final class kp2 {
    public final s5g a;
    public final boolean b;

    public kp2(s5g s5gVar, boolean z) {
        this.a = s5gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp2)) {
            return false;
        }
        kp2 kp2Var = (kp2) obj;
        return fni.a(this.a, kp2Var.a) && this.b == kp2Var.b;
    }

    public final int hashCode() {
        s5g s5gVar = this.a;
        return Boolean.hashCode(this.b) + ((s5gVar == null ? 0 : s5gVar.hashCode()) * 31);
    }

    public final String toString() {
        return "ToolbarState(title=" + this.a + ", showSaveToGallery=" + this.b + ")";
    }
}
