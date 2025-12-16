package defpackage;

/* loaded from: classes2.dex */
public final class hfc implements jfc {
    public final long a;

    public hfc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfc) && this.a == ((hfc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "ProfilePhotoUpdate(photoId=", ")");
    }
}
