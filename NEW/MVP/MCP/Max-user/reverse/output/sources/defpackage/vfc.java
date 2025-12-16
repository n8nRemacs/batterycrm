package defpackage;

/* loaded from: classes2.dex */
public final class vfc extends id0 {
    public final String b;
    public final String c;

    public vfc(String str, String str2) {
        super(14);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfc)) {
            return false;
        }
        vfc vfcVar = (vfc) obj;
        return fni.a(this.b, vfcVar.b) && fni.a(this.c, vfcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("CropAvatar(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
