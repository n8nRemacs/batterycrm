package defpackage;

/* loaded from: classes2.dex */
public final class uae implements wae {
    public final vo6 a;

    public uae(vo6 vo6Var) {
        this.a = vo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uae) && fni.a(this.a, ((uae) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAlbumSelected(album=" + this.a + ")";
    }
}
