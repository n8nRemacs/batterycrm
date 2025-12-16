package defpackage;

/* loaded from: classes2.dex */
public final class of0 {
    public static final /* synthetic */ int b = 0;
    public final String a;

    static {
        ve3.j("space_light", "gradient_light");
        ve3.j("space_dark", "gradient_dark");
    }

    public of0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of0) && fni.a(this.a, ((of0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("BackgroundNameId(name=", this.a, ")");
    }
}
