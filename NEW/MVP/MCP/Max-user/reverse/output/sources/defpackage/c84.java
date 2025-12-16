package defpackage;

/* loaded from: classes.dex */
public final class c84 extends p0 {
    public static final kc3 b = new kc3(17);
    public final String a;

    public c84(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c84) && fni.a(this.a, ((c84) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return u45.l(new StringBuilder("CoroutineName("), this.a, ')');
    }
}
