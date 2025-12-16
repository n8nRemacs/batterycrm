package defpackage;

/* loaded from: classes.dex */
public final class ns0 {
    public final ms8 a;
    public final ms8 b;
    public final ms8 c;
    public final a71 d;

    public ns0(ms8 ms8Var, ms8 ms8Var2, ms8 ms8Var3, a71 a71Var) {
        this.a = ms8Var;
        this.b = ms8Var2;
        this.c = ms8Var3;
        this.d = a71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns0)) {
            return false;
        }
        ns0 ns0Var = (ns0) obj;
        return this.a == ns0Var.a && this.b == ns0Var.b && this.c == ns0Var.c && fni.a(this.d, ns0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BottomPanelState(isMicrophoneEnabled=" + this.a + ", isVideoEnabled=" + this.b + ", isRaiseHandEnabled=" + this.c + ", dynamicType=" + this.d + ")";
    }
}
