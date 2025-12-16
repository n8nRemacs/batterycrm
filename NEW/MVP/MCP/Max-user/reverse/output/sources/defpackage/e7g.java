package defpackage;

/* loaded from: classes.dex */
public final class e7g {
    public final boolean a;

    public e7g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7g) && this.a == ((e7g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Selection(isSelected=", ")", this.a);
    }
}
