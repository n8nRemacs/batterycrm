package defpackage;

/* loaded from: classes2.dex */
public final class q21 implements s21 {
    public final long a;
    public final boolean b;
    public final String c;

    public q21(long j, String str, boolean z) {
        this.a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21Var = (q21) obj;
        return this.a == q21Var.a && this.b == q21Var.b && fni.a(this.c, q21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ctd.j(xc0.j(this.a, "Chat(chatId=", ", isVideo=", this.b), ", link=", this.c, ")");
    }
}
