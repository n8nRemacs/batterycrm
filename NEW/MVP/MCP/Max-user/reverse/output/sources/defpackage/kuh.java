package defpackage;

/* loaded from: classes2.dex */
public final class kuh implements avh {
    public final boolean a;

    public kuh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuh) && this.a == ((kuh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("OpenQrScanner(fileSelect=", ")", this.a);
    }
}
