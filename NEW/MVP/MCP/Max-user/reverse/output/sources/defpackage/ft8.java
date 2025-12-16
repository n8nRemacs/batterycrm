package defpackage;

/* loaded from: classes2.dex */
public final class ft8 implements it8 {
    public final ece a;
    public final int b;

    public ft8(ece eceVar, int i) {
        this.a = eceVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft8)) {
            return false;
        }
        ft8 ft8Var = (ft8) obj;
        return fni.a(this.a, ft8Var.a) && this.b == ft8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMediaItem(item=" + this.a + ", uiPosition=" + this.b + ")";
    }
}
