package defpackage;

/* loaded from: classes2.dex */
public final class sod {
    public final CharSequence a;
    public final Long b;
    public final Long c;

    public sod(CharSequence charSequence, Long l, Long l2) {
        this.a = charSequence;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sod)) {
            return false;
        }
        sod sodVar = (sod) obj;
        return fni.a(this.a, sodVar.a) && fni.a(this.b, sodVar.b) && fni.a(this.c, sodVar.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Result(text=" + ((Object) this.a) + ", editMsgId=" + this.b + ", replyMsgId=" + this.c + ")";
    }
}
