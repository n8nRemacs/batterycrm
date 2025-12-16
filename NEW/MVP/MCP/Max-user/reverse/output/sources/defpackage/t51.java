package defpackage;

/* loaded from: classes.dex */
public final class t51 implements w51 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public t51(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.w51
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.w51
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t51)) {
            return false;
        }
        t51 t51Var = (t51) obj;
        return this.a == t51Var.a && this.b == t51Var.b && this.c == t51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a9h.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return vb9.f(xc0.j(this.a, "Chat(chatId=", ", isVideoEnabled=", this.b), ", isAudioEnabled=", this.c, ")");
    }
}
