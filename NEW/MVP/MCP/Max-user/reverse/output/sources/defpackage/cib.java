package defpackage;

/* loaded from: classes2.dex */
public final class cib extends cda {
    public final String b;

    public cib(String str) {
        super(qqg.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cib) && fni.a(this.b, ((cib) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("OpenExternalLink(url=", this.b, ")");
    }
}
