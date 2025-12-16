package defpackage;

/* loaded from: classes.dex */
public final class rd1 extends ud1 {
    public final boolean a;

    public rd1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd1) && this.a == ((rd1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("RaiseHand(isRaised=", ")", this.a);
    }
}
