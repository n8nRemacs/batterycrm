package defpackage;

/* loaded from: classes2.dex */
public final class eff {
    public final boolean a;

    public eff(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eff) && this.a == ((eff) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("SetSelection(selected=", ")", this.a);
    }
}
