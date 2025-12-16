package defpackage;

/* loaded from: classes2.dex */
public final class zhc extends id0 {
    public final p5g b;

    public zhc(p5g p5gVar) {
        super(15);
        this.b = p5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhc) && this.b.equals(((zhc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLink(link=" + this.b + ")";
    }
}
