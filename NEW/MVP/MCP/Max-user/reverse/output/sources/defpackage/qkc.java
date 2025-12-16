package defpackage;

/* loaded from: classes2.dex */
public final class qkc extends id0 {
    public final String b;
    public final String c;

    public qkc(String str, String str2) {
        super(16);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkc)) {
            return false;
        }
        qkc qkcVar = (qkc) obj;
        return fni.a(this.b, qkcVar.b) && fni.a(this.c, qkcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("CropAvatar(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
