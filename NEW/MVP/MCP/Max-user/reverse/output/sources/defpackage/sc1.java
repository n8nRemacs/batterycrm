package defpackage;

/* loaded from: classes.dex */
public final class sc1 extends id0 {
    public final CharSequence b;

    public sc1(CharSequence charSequence) {
        super(2);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc1) && fni.a(this.b, ((sc1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLink(link=" + ((Object) this.b) + ")";
    }
}
