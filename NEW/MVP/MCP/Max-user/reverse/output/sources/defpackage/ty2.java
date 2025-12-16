package defpackage;

/* loaded from: classes2.dex */
public final class ty2 extends id0 {
    public final String b;
    public final String c;

    public ty2(String str, String str2) {
        super(5);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2)) {
            return false;
        }
        ty2 ty2Var = (ty2) obj;
        return fni.a(this.b, ty2Var.b) && fni.a(this.c, ty2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("CropPhoto(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
