package defpackage;

/* loaded from: classes.dex */
public final class pd1 extends ud1 {
    public final boolean a;

    public pd1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd1) && this.a == ((pd1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("LoadingState(isEnabled=", ")", this.a);
    }
}
