package defpackage;

/* loaded from: classes2.dex */
public final class mn9 {
    public final long a;
    public final CharSequence b;
    public final sn9 c;
    public final boolean d;
    public final boolean e;

    public mn9(long j, CharSequence charSequence, sn9 sn9Var, boolean z, boolean z2) {
        this.a = j;
        this.b = charSequence;
        this.c = sn9Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn9)) {
            return false;
        }
        mn9 mn9Var = (mn9) obj;
        return this.a == mn9Var.a && fni.a(this.b, mn9Var.b) && fni.a(this.c, mn9Var.c) && this.d == mn9Var.d && this.e == mn9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a9h.b((this.c.hashCode() + u45.g(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditMessageData(messageId=");
        sb.append(this.a);
        sb.append(", messageText=");
        sb.append((Object) this.b);
        sb.append(", quoteData=");
        sb.append(this.c);
        sb.append(", hasMediaAttaches=");
        sb.append(this.d);
        return vb9.f(sb, ", shouldInsertOriginalText=", this.e, ")");
    }
}
