package defpackage;

/* loaded from: classes2.dex */
public final class cth {
    public static final bth Companion = new bth();
    public final String a;

    public /* synthetic */ cth(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            g5j.c(i, 1, ath.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cth) && fni.a(this.a, ((cth) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("WebAppOpenMaxLinkRequest(url=", this.a, ")");
    }
}
