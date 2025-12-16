package defpackage;

/* loaded from: classes2.dex */
public final class oph extends qv7 {
    public final String c;
    public final String d;

    public oph(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oph)) {
            return false;
        }
        oph ophVar = (oph) obj;
        return fni.a(this.c, ophVar.c) && fni.a(this.d, ophVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("DownloadFile(url=", this.c, ", fileName=", this.d, ")");
    }
}
