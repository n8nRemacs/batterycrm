package defpackage;

/* loaded from: classes2.dex */
public final class prc extends cda {
    public final zyd b;

    public prc(zyd zydVar) {
        super(qqg.a);
        this.b = zydVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prc) && fni.a(this.b, ((prc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PopWithResult(result=" + this.b + ")";
    }
}
