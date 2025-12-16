package defpackage;

/* loaded from: classes2.dex */
public final class wkc extends id0 {
    public final String b;

    public wkc(String str) {
        super(16);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkc) && fni.a(this.b, ((wkc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("OpenExternalLink(link=", this.b, ")");
    }
}
