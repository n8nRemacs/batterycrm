package defpackage;

/* loaded from: classes2.dex */
public final class u58 extends y58 {
    public final String a;

    public u58(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u58) && fni.a(this.a, ((u58) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("OpenExternalLink(url=", this.a, ")");
    }
}
