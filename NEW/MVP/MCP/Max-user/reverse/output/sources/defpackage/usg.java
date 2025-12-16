package defpackage;

/* loaded from: classes2.dex */
public final class usg {
    public static final tsg Companion = new tsg();
    public final String a;

    public /* synthetic */ usg(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            g5j.c(i, 1, ssg.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usg) && fni.a(this.a, ((usg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("UnsupportedRequest(requestId=", this.a, ")");
    }
}
