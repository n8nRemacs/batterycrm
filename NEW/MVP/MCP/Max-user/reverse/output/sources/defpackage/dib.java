package defpackage;

/* loaded from: classes2.dex */
public final class dib extends cda {
    public final jr6 b;

    public dib(jr6 jr6Var) {
        super(qqg.a);
        this.b = jr6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dib) && fni.a(this.b, ((dib) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenExternalMap(geoAttach=" + this.b + ")";
    }
}
