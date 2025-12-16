package defpackage;

/* loaded from: classes2.dex */
public final class im2 extends id0 {
    public final Long b;
    public final long c;
    public final boolean d;

    public im2(Long l, long j, boolean z) {
        super(4);
        this.b = l;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im2)) {
            return false;
        }
        im2 im2Var = (im2) obj;
        return this.b.equals(im2Var.b) && this.c == im2Var.c && this.d == im2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttach(attachId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        return vb9.f(sb, ", isForwardAttach=", this.d, ")");
    }
}
