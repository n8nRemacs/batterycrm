package defpackage;

/* loaded from: classes.dex */
public final class ok1 implements pk1 {
    public final boolean a;

    public ok1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok1) && this.a == ((ok1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Close(showSnackbar=", ")", this.a);
    }
}
