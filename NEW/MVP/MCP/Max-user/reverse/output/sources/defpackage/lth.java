package defpackage;

/* loaded from: classes2.dex */
public final class lth {
    public static final kth Companion = new kth();
    public final String a;

    public /* synthetic */ lth(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            g5j.c(i, 1, jth.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lth) && fni.a(this.a, ((lth) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("WebAppRequestPhoneRequest(requestId=", this.a, ")");
    }
}
