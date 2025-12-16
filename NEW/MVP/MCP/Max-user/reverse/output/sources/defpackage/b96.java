package defpackage;

/* loaded from: classes2.dex */
public final class b96 implements e96 {
    public final boolean a;

    public b96(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b96) && this.a == ((b96) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Close(afterCreate=", ")", this.a);
    }
}
