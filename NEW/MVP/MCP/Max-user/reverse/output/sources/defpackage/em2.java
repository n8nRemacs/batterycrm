package defpackage;

/* loaded from: classes2.dex */
public final class em2 extends id0 {
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public em2(long j, long j2, String str, boolean z) {
        super(4);
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em2)) {
            return false;
        }
        em2 em2Var = (em2) obj;
        return this.b == em2Var.b && this.c == em2Var.c && fni.a(this.d, em2Var.d) && this.e == em2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + u45.e(a9h.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "OpenImage(chatId=", ", messageId=");
        hf3.e(this.c, ", attachLocalId=", this.d, sbL);
        return vb9.f(sbL, ", isSingleAttach=", this.e, ")");
    }
}
