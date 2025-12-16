package defpackage;

/* loaded from: classes2.dex */
public final class wte implements aue {
    public final String a;

    public wte(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wte) && fni.a(this.a, ((wte) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("CopyLink(text=", this.a, ")");
    }
}
