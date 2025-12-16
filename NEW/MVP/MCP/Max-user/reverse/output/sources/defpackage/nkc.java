package defpackage;

/* loaded from: classes2.dex */
public final class nkc extends id0 {
    public final String b;

    public nkc(String str) {
        super(16);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nkc) && fni.a(this.b, ((nkc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("CallByNumber(phone=", this.b, ")");
    }
}
