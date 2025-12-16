package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vtd {
    public int a = 2;
    public boolean b = false;
    public float[] c = null;
    public int d = 0;
    public float e = 0.0f;
    public int f = 0;
    public float g = 0.0f;

    public static vtd a() {
        vtd vtdVar = new vtd();
        vtdVar.b = true;
        return vtdVar;
    }

    public final void b(float f, float f2, float f3, float f4) {
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vtd.class != obj.getClass()) {
            return false;
        }
        vtd vtdVar = (vtd) obj;
        if (this.b == vtdVar.b && this.d == vtdVar.d && Float.compare(vtdVar.e, this.e) == 0 && this.f == vtdVar.f && Float.compare(vtdVar.g, this.g) == 0 && this.a == vtdVar.a) {
            return Arrays.equals(this.c, vtdVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int iV = (((i != 0 ? az1.v(i) : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int iHashCode = (((iV + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f = this.e;
        int iFloatToIntBits = (((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f) * 31;
        float f2 = this.g;
        return (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 961;
    }
}
