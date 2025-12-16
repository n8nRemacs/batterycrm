package defpackage;

/* loaded from: classes2.dex */
public final class vcc extends ddc {
    public final String b;

    public vcc(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vcc) && fni.a(this.b, ((vcc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("CopyToClipboard(link=", this.b, ")");
    }
}
