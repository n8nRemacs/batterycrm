package defpackage;

/* loaded from: classes2.dex */
public final class zs8 implements it8 {
    public final boolean a;

    public zs8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs8) && this.a == ((zs8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Close(withClear=", ")", this.a);
    }
}
