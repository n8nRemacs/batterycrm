package defpackage;

/* loaded from: classes2.dex */
public final class jm2 extends id0 {
    public final String b;

    public jm2(String str) {
        super(4);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm2) && fni.a(this.b, ((jm2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("ShareLink(link=", this.b, ")");
    }
}
