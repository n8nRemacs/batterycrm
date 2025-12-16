package defpackage;

/* loaded from: classes2.dex */
public final class tpe extends id0 {
    public final String b;
    public final String c;

    public tpe(String str, String str2) {
        super(19);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpe)) {
            return false;
        }
        tpe tpeVar = (tpe) obj;
        return fni.a(this.b, tpeVar.b) && fni.a(this.c, tpeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("CropAvatar(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
