package defpackage;

/* loaded from: classes2.dex */
public final class f9d {
    public final g9d a;
    public final x8d b;

    public f9d(g9d g9dVar, x8d x8dVar) {
        this.a = g9dVar;
        this.b = x8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9d)) {
            return false;
        }
        f9d f9dVar = (f9d) obj;
        return this.a == f9dVar.a && fni.a(this.b, f9dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionData(type=" + this.a + ", id=" + ((Object) this.b) + ")";
    }
}
