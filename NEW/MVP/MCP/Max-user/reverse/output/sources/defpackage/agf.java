package defpackage;

/* loaded from: classes2.dex */
public final class agf implements cgf {
    public final boolean a;

    public agf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agf) && this.a == ((agf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("SetSelection(selected=", ")", this.a);
    }
}
