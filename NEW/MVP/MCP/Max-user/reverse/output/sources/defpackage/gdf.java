package defpackage;

/* loaded from: classes2.dex */
public final class gdf {
    public final hdf a;

    public gdf(hdf hdfVar) {
        this.a = hdfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdf) && fni.a(this.a, ((gdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StatesIconColors(disabled=" + this.a + ")";
    }
}
