package defpackage;

/* loaded from: classes2.dex */
public final class suh implements avh {
    public final String a;

    public suh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suh) && fni.a(this.a, ((suh) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho7.i("ShowMaxShareDialog(text=", this.a, ")");
    }
}
