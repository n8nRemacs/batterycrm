package defpackage;

/* loaded from: classes2.dex */
public final class rn9 {
    public final boolean a;
    public final CharSequence b;

    public rn9(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn9)) {
            return false;
        }
        rn9 rn9Var = (rn9) obj;
        return this.a == rn9Var.a && fni.a(this.b, rn9Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "MiniAppData(isVisible=" + this.a + ", title=" + ((Object) this.b) + ")";
    }
}
