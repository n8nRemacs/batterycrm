package defpackage;

/* loaded from: classes.dex */
public final class im1 extends en1 {
    public final vfh D;

    public im1(vfh vfhVar) {
        this.D = vfhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im1) && this.D == ((im1) obj).D;
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "ChangeMode(mode=" + this.D + ")";
    }
}
