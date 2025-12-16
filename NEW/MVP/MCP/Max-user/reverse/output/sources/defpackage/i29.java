package defpackage;

/* loaded from: classes2.dex */
public final class i29 {
    public final h29 a;
    public final h29 b;
    public final h29 c;
    public final h29 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i29() {
        h29 h29Var = h29.a;
        this(h29Var, h29Var, h29Var, h29Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i29)) {
            return false;
        }
        i29 i29Var = (i29) obj;
        return this.a == i29Var.a && this.b == i29Var.b && this.c == i29Var.c && this.d == i29Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    public i29(h29 h29Var, h29 h29Var2, h29 h29Var3, h29 h29Var4) {
        this.a = h29Var;
        this.b = h29Var2;
        this.c = h29Var3;
        this.d = h29Var4;
    }
}
