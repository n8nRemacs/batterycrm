package defpackage;

/* loaded from: classes2.dex */
public final class i92 extends cda {
    public final n5g b;
    public final p5g c;
    public final long d;

    public i92(n5g n5gVar, p5g p5gVar, long j) {
        super(qqg.a);
        this.b = n5gVar;
        this.c = p5gVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i92)) {
            return false;
        }
        i92 i92Var = (i92) obj;
        return this.b.equals(i92Var.b) && this.c.equals(i92Var.c) && this.d == i92Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + (Integer.hashCode(this.b.c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowChangeOwnerBottomSheetEvent(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", contactId=");
        return ho7.k(sb, this.d, ")");
    }
}
