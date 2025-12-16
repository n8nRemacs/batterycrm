package defpackage;

/* loaded from: classes2.dex */
public final class irh {
    public static final hrh Companion = new hrh();
    public static final zy7[] c = {null, nrh.Companion.serializer()};
    public final String a;
    public final nrh b;

    public /* synthetic */ irh(int i, String str, nrh nrhVar) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, grh.a.d());
            throw null;
        }
        this.a = str;
        this.b = nrhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irh)) {
            return false;
        }
        irh irhVar = (irh) obj;
        return fni.a(this.a, irhVar.a) && this.b == irhVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppHapticFeedbackResponse(requestId=" + this.a + ", status=" + this.b + ")";
    }

    public irh(String str, nrh nrhVar) {
        this.a = str;
        this.b = nrhVar;
    }
}
