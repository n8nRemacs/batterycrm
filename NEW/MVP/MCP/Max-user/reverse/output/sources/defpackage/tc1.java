package defpackage;

/* loaded from: classes.dex */
public final class tc1 extends id0 {
    public final n5g b;

    public tc1(n5g n5gVar) {
        super(2);
        this.b = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc1) && this.b.equals(((tc1) obj).b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c);
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.b + ")";
    }
}
