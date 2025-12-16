package defpackage;

/* loaded from: classes2.dex */
public final class e7e implements g7e {
    public final boolean a;

    public e7e(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7e) && this.a == ((e7e) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Show(openWithAnimation=", ")", this.a);
    }
}
