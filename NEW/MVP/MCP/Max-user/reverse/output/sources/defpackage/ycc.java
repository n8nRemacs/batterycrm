package defpackage;

/* loaded from: classes2.dex */
public final class ycc extends ddc {
    public final p5g b;

    public ycc(p5g p5gVar) {
        this.b = p5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycc) && this.b.equals(((ycc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLinkToChat(text=" + this.b + ")";
    }
}
