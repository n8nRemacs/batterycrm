package defpackage;

/* loaded from: classes.dex */
public final class zm1 extends en1 {
    public final boolean D;

    public zm1(boolean z) {
        this.D = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm1) && this.D == ((zm1) obj).D;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.D);
    }

    public final String toString() {
        return xrf.p("ShareScreen(isEnabled=", ")", this.D);
    }
}
