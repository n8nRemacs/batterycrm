package defpackage;

/* loaded from: classes2.dex */
public final class ceg {
    public final String a;

    public static String a(String str) {
        return ho7.i("TraceId(value=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ceg) {
            return fni.a(this.a, ((ceg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
