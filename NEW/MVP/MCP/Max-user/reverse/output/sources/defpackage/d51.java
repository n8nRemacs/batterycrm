package defpackage;

/* loaded from: classes.dex */
public final class d51 {
    public final Long a;
    public final CharSequence b;
    public final wd0 c;
    public final yd0 d;
    public final boolean e;

    public d51(Long l, CharSequence charSequence, wd0 wd0Var, yd0 yd0Var, boolean z) {
        this.a = l;
        this.b = charSequence;
        this.c = wd0Var;
        this.d = yd0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d51)) {
            return false;
        }
        d51 d51Var = (d51) obj;
        return fni.a(this.a, d51Var.a) && fni.a(this.b, d51Var.b) && fni.a(this.c, d51Var.c) && fni.a(this.d, d51Var.d) && this.e == d51Var.e;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        wd0 wd0Var = this.c;
        int iHashCode3 = (iHashCode2 + (wd0Var == null ? 0 : wd0Var.hashCode())) * 31;
        yd0 yd0Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (yd0Var != null ? yd0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallChatState(chatId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", overlay=");
        sb.append(this.d);
        sb.append(", isLinkCall=");
        return az1.k(sb, this.e, ")");
    }

    public /* synthetic */ d51(Long l, CharSequence charSequence, wd0 wd0Var, boolean z, int i) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : wd0Var, (yd0) null, z);
    }
}
