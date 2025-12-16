package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wyg {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int[] f;
    public final float[] g;

    public wyg(float f, float f2, float f3, float f4, float f5, float[] fArr, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = iArr;
        this.g = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyg)) {
            return false;
        }
        wyg wygVar = (wyg) obj;
        return Float.compare(this.a, wygVar.a) == 0 && Float.compare(this.b, wygVar.b) == 0 && Float.compare(this.c, wygVar.c) == 0 && Float.compare(this.d, wygVar.d) == 0 && Float.compare(this.e, wygVar.e) == 0 && fni.a(this.f, wygVar.f) && fni.a(this.g, wygVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + hf3.b(hf3.b(hf3.b(hf3.b(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f);
        String string2 = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("GradientEllipse(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", radiusX=");
        sb.append(this.c);
        sb.append(", radiusY=");
        sb.append(this.d);
        sb.append(", angle=");
        sb.append(this.e);
        sb.append(", color=");
        sb.append(string);
        sb.append(", stops=");
        return ho7.l(sb, string2, ")");
    }
}
