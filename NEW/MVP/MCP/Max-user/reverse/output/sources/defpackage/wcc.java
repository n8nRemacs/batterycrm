package defpackage;

/* loaded from: classes2.dex */
public final class wcc extends ddc {
    public final p5g b;

    public wcc(p5g p5gVar) {
        this.b = p5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcc) && this.b.equals(((wcc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ExternalShareLink(text=" + this.b + ")";
    }
}
