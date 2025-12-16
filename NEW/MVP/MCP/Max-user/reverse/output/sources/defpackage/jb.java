package defpackage;

/* loaded from: classes.dex */
public final class jb implements lb {
    public final boolean a;

    public jb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb) && this.a == ((jb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("DisableScreenRecord(isRemoved=", ")", this.a);
    }
}
