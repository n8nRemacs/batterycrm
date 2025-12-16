package defpackage;

/* loaded from: classes2.dex */
public final class rv7 implements tv7 {
    public final String a;
    public final String b;

    public rv7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv7)) {
            return false;
        }
        rv7 rv7Var = (rv7) obj;
        return fni.a(this.a, rv7Var.a) && fni.a(this.b, rv7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("JsEvent(name=", this.a, ", data=", this.b, ")");
    }
}
