package defpackage;

/* loaded from: classes2.dex */
public final class tvg {
    public final String a;
    public final long b;

    public tvg(svg svgVar) {
        this.a = svgVar.a;
        this.b = svgVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadResult{token='");
        sb.append(l8g.f(this.a));
        sb.append("', attachId=");
        return utb.l(sb, this.b, '}');
    }
}
