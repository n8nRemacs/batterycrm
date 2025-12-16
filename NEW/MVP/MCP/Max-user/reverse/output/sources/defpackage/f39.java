package defpackage;

/* loaded from: classes2.dex */
public final class f39 extends id0 {
    public final String b;

    public f39(String str) {
        super(9);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f39) && fni.a(this.b, ((f39) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("PopWithPickedImage(uriString=", this.b, ")");
    }
}
