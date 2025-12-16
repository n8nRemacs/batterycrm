package defpackage;

/* loaded from: classes2.dex */
public final class skc extends id0 {
    public final String b;

    public skc(String str) {
        super(16);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skc) && fni.a(this.b, ((skc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("ExternalCallback(params=", this.b, ")");
    }
}
