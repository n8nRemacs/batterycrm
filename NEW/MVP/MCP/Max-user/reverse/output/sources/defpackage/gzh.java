package defpackage;

/* loaded from: classes2.dex */
public final class gzh extends qv7 {
    public final boolean c;

    public gzh(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzh) && this.c == ((gzh) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return xrf.p("ScreenCaptureBehavior(isEnabled=", ")", this.c);
    }
}
