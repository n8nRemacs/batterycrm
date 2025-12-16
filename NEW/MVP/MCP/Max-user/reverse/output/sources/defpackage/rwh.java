package defpackage;

/* loaded from: classes2.dex */
public final class rwh {
    public static final qwh Companion = new qwh();
    public final boolean a;

    public /* synthetic */ rwh(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            g5j.c(i, 1, pwh.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwh) && this.a == ((rwh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("WebAppSetupBackButtonRequest(isVisible=", ")", this.a);
    }
}
