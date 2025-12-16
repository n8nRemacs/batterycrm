package defpackage;

/* loaded from: classes2.dex */
public final class sae {
    public final boolean a;
    public final boolean b;

    public sae(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sae)) {
            return false;
        }
        sae saeVar = (sae) obj;
        return this.a == saeVar.a && this.b == saeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("SelectAlbumMode(onlyPhotoAlbums=", this.a, ", showEmptyAlbums=", this.b, ")");
    }
}
