package defpackage;

/* loaded from: classes2.dex */
public final class yvh implements vvh {
    public final boolean a;

    public yvh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvh) && this.a == ((yvh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("ShowWebView(showBackButton=", ")", this.a);
    }
}
