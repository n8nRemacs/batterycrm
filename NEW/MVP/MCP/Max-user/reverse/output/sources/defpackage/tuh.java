package defpackage;

/* loaded from: classes2.dex */
public final class tuh implements avh {
    public final String a;

    public tuh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuh) && fni.a(this.a, ((tuh) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho7.i("ShowNativeShareDialog(text=", this.a, ")");
    }
}
