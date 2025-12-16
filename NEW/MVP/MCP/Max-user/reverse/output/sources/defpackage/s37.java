package defpackage;

/* loaded from: classes.dex */
public final class s37 extends v37 {
    public final boolean a;

    public s37(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s37) && this.a == ((s37) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Missing(isMissing=", ")", this.a);
    }
}
