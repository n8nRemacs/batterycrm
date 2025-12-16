package defpackage;

/* loaded from: classes2.dex */
public final class yt0 {
    public final rt0 a;
    public final zt0 b;
    public final au0 c;
    public final bu0 d;

    public yt0(rt0 rt0Var, zt0 zt0Var, au0 au0Var, bu0 bu0Var) {
        this.a = rt0Var;
        this.b = zt0Var;
        this.c = au0Var;
        this.d = bu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt0)) {
            return false;
        }
        yt0 yt0Var = (yt0) obj;
        return fni.a(this.a, yt0Var.a) && fni.a(this.b, yt0Var.b) && fni.a(this.c, yt0Var.c) && fni.a(this.d, yt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BubbleColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
