package defpackage;

/* loaded from: classes2.dex */
public final class bp3 extends id0 {
    public final String b;

    public bp3(String str) {
        super(7);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp3) && fni.a(this.b, ((bp3) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho7.i("GoToStartScreen(phone=", this.b, ")");
    }
}
