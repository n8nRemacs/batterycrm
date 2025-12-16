package defpackage;

/* loaded from: classes2.dex */
public final class juh implements avh {
    public final String a;

    public juh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof juh) && fni.a(this.a, ((juh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("OpenLinkExternal(url=", this.a, ")");
    }
}
