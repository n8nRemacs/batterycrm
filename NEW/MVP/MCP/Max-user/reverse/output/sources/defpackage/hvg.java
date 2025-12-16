package defpackage;

/* loaded from: classes2.dex */
public final class hvg {
    public final float a;
    public final long b;
    public final String c;

    public hvg(float f, long j, String str) {
        this.a = f;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvg)) {
            return false;
        }
        hvg hvgVar = (hvg) obj;
        return Float.compare(this.a, hvgVar.a) == 0 && this.b == hvgVar.b && fni.a(this.c, hvgVar.c);
    }

    public final int hashCode() {
        int iA = a9h.a(Float.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadState(progress=");
        sb.append(this.a);
        sb.append(", fileSize=");
        sb.append(this.b);
        return ctd.j(sb, ", uploadToken=", this.c, ")");
    }
}
