package defpackage;

/* loaded from: classes2.dex */
public final class w4a extends l0g {
    public final long c;
    public final sz d;

    public w4a(long j, sz szVar) {
        this.c = j;
        this.d = szVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4a)) {
            return false;
        }
        w4a w4aVar = (w4a) obj;
        return this.c == w4aVar.c && this.d.equals(w4aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(chatId=" + this.c + ", messages=" + this.d + ")";
    }
}
