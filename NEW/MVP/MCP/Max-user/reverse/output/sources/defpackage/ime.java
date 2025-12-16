package defpackage;

/* loaded from: classes2.dex */
public final class ime extends id0 {
    public final n5g b;

    public ime(n5g n5gVar) {
        super(17);
        this.b = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ime) && this.b.equals(((ime) obj).b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c);
    }

    public final String toString() {
        return "ShowSuccess(message=" + this.b + ")";
    }
}
