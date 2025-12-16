package defpackage;

/* loaded from: classes2.dex */
public final class kb6 implements lb6 {
    public final String a;

    public kb6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb6) && fni.a(this.a, ((kb6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("OpenUrl(url=", this.a, ")");
    }
}
