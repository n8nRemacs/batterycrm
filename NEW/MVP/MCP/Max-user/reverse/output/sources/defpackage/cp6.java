package defpackage;

/* loaded from: classes2.dex */
public final class cp6 implements ep6 {
    public final vo6 a;

    public cp6(vo6 vo6Var) {
        this.a = vo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp6) && fni.a(this.a, ((cp6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectAlbum(album=" + this.a + ")";
    }
}
