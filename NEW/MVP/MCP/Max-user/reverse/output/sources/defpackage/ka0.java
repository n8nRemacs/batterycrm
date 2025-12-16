package defpackage;

/* loaded from: classes.dex */
public final class ka0 implements q7i {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ka0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static ka0 e(q7i q7iVar) {
        return new ka0(q7iVar.c(), q7iVar.a(), q7iVar.b(), q7iVar.d());
    }

    @Override // defpackage.q7i
    public final float a() {
        return this.b;
    }

    @Override // defpackage.q7i
    public final float b() {
        return this.c;
    }

    @Override // defpackage.q7i
    public final float c() {
        return this.a;
    }

    @Override // defpackage.q7i
    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ka0) {
            ka0 ka0Var = (ka0) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ka0Var.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ka0Var.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(ka0Var.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(ka0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
