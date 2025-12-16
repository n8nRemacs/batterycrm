package defpackage;

/* loaded from: classes.dex */
public final class fh1 extends gh1 {
    public final String a;

    public fh1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh1) && fni.a(this.a, ((fh1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho7.i("Name(name=", this.a, ")");
    }
}
