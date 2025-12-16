package defpackage;

/* loaded from: classes.dex */
public final class sd1 extends ud1 {
    public final boolean a;

    public sd1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd1) && this.a == ((sd1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("TalkingState(isEnabled=", ")", this.a);
    }
}
