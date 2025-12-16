package defpackage;

/* loaded from: classes2.dex */
public final class gme extends id0 {
    public final s5g b;

    public gme(s5g s5gVar) {
        super(17);
        this.b = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gme) && fni.a(this.b, ((gme) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowError(message=" + this.b + ")";
    }
}
