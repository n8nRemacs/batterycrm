package defpackage;

/* loaded from: classes2.dex */
public final class thc extends xhc {
    public final String a;

    public thc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thc) && fni.a(this.a, ((thc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("CopyToClipboard(text=", this.a, ")");
    }
}
