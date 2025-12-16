package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class tyg {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float[] f;

    public tyg(float f, float f2, float f3, float f4, float f5, float[] fArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyg)) {
            return false;
        }
        tyg tygVar = (tyg) obj;
        return Float.compare(this.a, tygVar.a) == 0 && Float.compare(this.b, tygVar.b) == 0 && Float.compare(this.c, tygVar.c) == 0 && Float.compare(this.d, tygVar.d) == 0 && Float.compare(this.e, tygVar.e) == 0 && fni.a(this.f, tygVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + hf3.b(hf3.b(hf3.b(hf3.b(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "GradientEllipse(cx=" + this.a + ", cy=" + this.b + ", rx=" + this.c + ", ry=" + this.d + ", rotation=" + this.e + ", stops=" + Arrays.toString(this.f) + ")";
    }
}
