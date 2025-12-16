package defpackage;

/* loaded from: classes2.dex */
public final class n77 implements p77 {
    public final String a;

    public n77(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n77) && fni.a(this.a, ((n77) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho7.i("CustomMode(host=", this.a, ")");
    }
}
