package defpackage;

/* loaded from: classes2.dex */
public final class uc0 implements vc0 {
    public final String a;
    public final String b;

    public uc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return fni.a(this.a, uc0Var.a) && fni.a(this.b, uc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("CropAvatar(uriAsString=", this.a, ", path=", this.b, ")");
    }
}
