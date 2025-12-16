package defpackage;

/* loaded from: classes.dex */
public final class v3a implements ry9 {
    public final float a;
    public final float b;

    public v3a(float f, float f2) {
        hsi.a("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v3a.class == obj.getClass()) {
            v3a v3aVar = (v3a) obj;
            if (this.a == v3aVar.a && this.b == v3aVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
