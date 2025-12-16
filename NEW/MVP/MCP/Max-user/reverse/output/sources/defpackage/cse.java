package defpackage;

/* loaded from: classes2.dex */
public final class cse extends id0 {
    public final p5g b;

    public cse(p5g p5gVar) {
        super(21);
        this.b = p5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cse) && this.b.equals(((cse) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.b + ")";
    }
}
