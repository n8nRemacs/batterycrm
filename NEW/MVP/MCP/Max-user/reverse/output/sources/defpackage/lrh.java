package defpackage;

/* loaded from: classes2.dex */
public final class lrh {
    public static final krh Companion = new krh();
    public final String a;
    public final boolean b;

    public /* synthetic */ lrh(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, jrh.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrh)) {
            return false;
        }
        lrh lrhVar = (lrh) obj;
        return fni.a(this.a, lrhVar.a) && this.b == lrhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppHapticFeedbackSelectionChange(requestId=" + this.a + ", disableVibrationFallback=" + this.b + ")";
    }
}
