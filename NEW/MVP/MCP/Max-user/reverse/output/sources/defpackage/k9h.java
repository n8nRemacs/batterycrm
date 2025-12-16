package defpackage;

/* loaded from: classes2.dex */
public final class k9h extends n9h {
    public final boolean a;

    public k9h(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9h) && this.a == ((k9h) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("FrontCamera(isTimerVisible=", ")", this.a);
    }
}
