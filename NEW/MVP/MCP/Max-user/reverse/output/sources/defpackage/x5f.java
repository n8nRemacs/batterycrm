package defpackage;

/* loaded from: classes.dex */
public final class x5f implements ry9 {
    public final float a;
    public final int b;

    public x5f(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x5f.class == obj.getClass()) {
            x5f x5fVar = (x5f) obj;
            if (this.a == x5fVar.a && this.b == x5fVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
