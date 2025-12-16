package defpackage;

/* loaded from: classes2.dex */
public final class wl9 {
    public final f9d a;
    public final int b;

    public wl9(f9d f9dVar, int i) {
        this.a = f9dVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl9)) {
            return false;
        }
        wl9 wl9Var = (wl9) obj;
        return fni.a(this.a, wl9Var.a) && this.b == wl9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionWithCount(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
