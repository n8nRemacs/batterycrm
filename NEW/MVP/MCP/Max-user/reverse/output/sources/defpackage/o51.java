package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;

/* loaded from: classes.dex */
public final class o51 {
    public final Conversation a;
    public final gxi b;
    public final boolean c;
    public final boolean d;

    public o51(Conversation conversation, gxi gxiVar, boolean z, boolean z2) {
        this.a = conversation;
        this.b = gxiVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o51)) {
            return false;
        }
        o51 o51Var = (o51) obj;
        return fni.a(this.a, o51Var.a) && fni.a(this.b, o51Var.b) && this.c == o51Var.c && this.d == o51Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Result(conversation=" + this.a + ", callTarget=" + this.b + ", isNewCall=" + this.c + ", isIncoming=" + this.d + ")";
    }
}
