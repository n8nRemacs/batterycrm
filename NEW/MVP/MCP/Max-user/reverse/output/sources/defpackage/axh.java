package defpackage;

/* loaded from: classes2.dex */
public final class axh {
    public static final zwh Companion = new zwh();
    public final String a;
    public final boolean b;

    public /* synthetic */ axh(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, ywh.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axh)) {
            return false;
        }
        axh axhVar = (axh) obj;
        return fni.a(this.a, axhVar.a) && this.b == axhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSetupScreenCaptureBehaviorResponse(requestId=" + this.a + ", isScreenCaptureEnabled=" + this.b + ")";
    }

    public axh(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
