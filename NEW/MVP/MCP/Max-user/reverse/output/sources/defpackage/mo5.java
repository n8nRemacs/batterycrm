package defpackage;

/* loaded from: classes.dex */
public final class mo5 extends cda {
    public final n5g b;

    public mo5(n5g n5gVar) {
        super(qqg.a);
        this.b = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo5) && this.b.equals(((mo5) obj).b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ")";
    }
}
