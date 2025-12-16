package defpackage;

/* loaded from: classes.dex */
public final class na2 {
    public static final ma2 b = new ma2();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof na2) {
            return fni.a(this.a, ((na2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof la2) {
            return ((la2) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
