package defpackage;

/* loaded from: classes2.dex */
public final class d39 extends id0 {
    public final String b;
    public final String c;

    public d39(String str, String str2) {
        super(9);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d39)) {
            return false;
        }
        d39 d39Var = (d39) obj;
        return fni.a(this.b, d39Var.b) && fni.a(this.c, d39Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("OpenCropScreen(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
