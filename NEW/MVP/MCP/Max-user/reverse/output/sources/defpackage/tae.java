package defpackage;

/* loaded from: classes2.dex */
public final class tae implements wae {
    public final int a;

    public tae(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tae) && this.a == ((tae) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "AlbumHeightChanged(height=", ")");
    }
}
