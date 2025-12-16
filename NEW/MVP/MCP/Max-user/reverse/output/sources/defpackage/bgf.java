package defpackage;

/* loaded from: classes2.dex */
public final class bgf implements cgf {
    public final int a;

    public bgf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgf) && this.a == ((bgf) obj).a;
    }

    public final int hashCode() {
        return az1.v(this.a);
    }

    public final String toString() {
        return "TypeChange(newType=" + ctd.q(this.a) + ")";
    }
}
