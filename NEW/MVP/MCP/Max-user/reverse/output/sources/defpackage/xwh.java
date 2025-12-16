package defpackage;

/* loaded from: classes2.dex */
public final class xwh {
    public static final wwh Companion = new wwh();
    public final String a;
    public final boolean b;

    public /* synthetic */ xwh(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, vwh.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwh)) {
            return false;
        }
        xwh xwhVar = (xwh) obj;
        return fni.a(this.a, xwhVar.a) && this.b == xwhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSetupScreenCaptureBehaviorRequest(requestId=" + this.a + ", isScreenCaptureEnabled=" + this.b + ")";
    }
}
