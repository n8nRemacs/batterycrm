package defpackage;

/* loaded from: classes2.dex */
public final class nuh implements avh {
    public final String a;
    public final String b;

    public nuh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuh)) {
            return false;
        }
        nuh nuhVar = (nuh) obj;
        return fni.a(this.a, nuhVar.a) && fni.a(this.b, nuhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("SendJsEvent(name=", this.a, ", data=", this.b, ")");
    }
}
