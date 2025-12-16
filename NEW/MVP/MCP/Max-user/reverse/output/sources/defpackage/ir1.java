package defpackage;

/* loaded from: classes.dex */
public final class ir1 extends gxi {
    public final long a;
    public final boolean b;

    public ir1(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.gxi
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir1)) {
            return false;
        }
        ir1 ir1Var = (ir1) obj;
        return this.a == ir1Var.a && this.b == ir1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "Chat(chatId=", ", isVideo=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}
