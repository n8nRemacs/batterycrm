package defpackage;

/* loaded from: classes2.dex */
public final class rib extends cda {
    public final long b;
    public final long c;
    public final String d;

    public rib(long j, long j2, String str) {
        super(qqg.a);
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rib)) {
            return false;
        }
        rib ribVar = (rib) obj;
        return this.b == ribVar.b && this.c == ribVar.c && fni.a(this.d, ribVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a9h.a(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "OpenVideoWebView(chatId=", ", messageId=");
        hf3.e(this.c, ", videoUrl=", this.d, sbL);
        sbL.append(")");
        return sbL.toString();
    }
}
