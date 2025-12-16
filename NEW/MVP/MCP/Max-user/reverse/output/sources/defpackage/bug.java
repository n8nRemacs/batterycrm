package defpackage;

/* loaded from: classes2.dex */
public final class bug {
    public final String a;
    public final long b;
    public final wvg c;
    public final String d;

    public bug(String str, long j, wvg wvgVar, String str2) {
        this.a = str;
        this.b = j;
        this.c = wvgVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bug)) {
            return false;
        }
        bug bugVar = (bug) obj;
        return fni.a(this.a, bugVar.a) && this.b == bugVar.b && this.c == bugVar.c && fni.a(this.d, bugVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a9h.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("UploadData{path='", wqi.a() ? this.a : "*****", "', attachLocalId='", this.d, "', lastModified=");
        sbL.append(this.b);
        sbL.append(", uploadType=");
        sbL.append(this.c);
        sbL.append("}");
        return sbL.toString();
    }
}
