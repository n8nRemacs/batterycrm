package defpackage;

/* loaded from: classes2.dex */
public final class p2h {
    public final gsc a;
    public final float b;
    public final float c;
    public final boolean d;

    public p2h(u10 u10Var) {
        this.a = u10Var.c;
        this.b = u10Var.a;
        this.c = u10Var.b;
        this.d = u10Var.d;
    }

    public final u10 a() {
        u10 u10Var = new u10(2);
        u10Var.c = this.a;
        u10Var.a = this.b;
        u10Var.b = this.c;
        u10Var.d = this.d;
        return u10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2h.class == obj.getClass()) {
            p2h p2hVar = (p2h) obj;
            if (Float.compare(p2hVar.b, this.b) == 0 && Float.compare(p2hVar.c, this.c) == 0 && this.d == p2hVar.d && this.a == p2hVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        gsc gscVar = this.a;
        int iHashCode = (gscVar != null ? gscVar.hashCode() : 0) * 31;
        float f = this.b;
        int iFloatToIntBits = (iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.c;
        return ((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        return "VideoConvertOptions{quality=" + this.a + ", startTrimPosition=" + this.b + ", endTrimPosition=" + this.c + ", mute=" + this.d + '}';
    }
}
