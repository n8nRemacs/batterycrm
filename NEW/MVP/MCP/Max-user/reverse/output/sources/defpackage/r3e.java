package defpackage;

/* loaded from: classes2.dex */
public final class r3e extends e13 {
    public final boolean a;

    public r3e(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3e) && this.a == ((r3e) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("ScrollToTop(afterPin=", ")", this.a);
    }
}
