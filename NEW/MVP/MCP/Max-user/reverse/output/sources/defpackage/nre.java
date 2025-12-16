package defpackage;

/* loaded from: classes2.dex */
public final class nre extends id0 {
    public final String b;

    public nre(String str) {
        super(20);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nre) && fni.a(this.b, ((nre) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho7.i("OpenSystemRingtones(selected=", this.b, ")");
    }
}
