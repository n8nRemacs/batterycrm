package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z6g {
    public final float a;
    public final float b;
    public final int[] c;
    public final float[] d;
    public final float e;
    public final float f;
    public final float g;

    public z6g(float f, float f2, float f3, float f4, float f5, float[] fArr, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = iArr;
        this.d = fArr;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6g)) {
            return false;
        }
        z6g z6gVar = (z6g) obj;
        return Float.compare(this.a, z6gVar.a) == 0 && Float.compare(this.b, z6gVar.b) == 0 && fni.a(this.c, z6gVar.c) && fni.a(this.d, z6gVar.d) && Float.compare(this.e, z6gVar.e) == 0 && Float.compare(this.f, z6gVar.f) == 0 && Float.compare(this.g, z6gVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + hf3.b(hf3.b((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + hf3.b(Float.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.c);
        String string2 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder("GradientEllipse(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", color=");
        ho7.r(sb, string, ", stops=", string2, ", radiusX=");
        sb.append(this.e);
        sb.append(", radiusY=");
        sb.append(this.f);
        sb.append(", angle=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
