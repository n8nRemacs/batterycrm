package defpackage;

/* loaded from: classes2.dex */
public final class vpe extends id0 {
    public final long b;

    public vpe(long j) {
        super(19);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpe) && this.b == ((vpe) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "ProfileAvatars(id=", ")");
    }
}
