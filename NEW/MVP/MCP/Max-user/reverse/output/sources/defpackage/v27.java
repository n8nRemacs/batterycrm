package defpackage;

/* loaded from: classes2.dex */
public final class v27 {
    public final int a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public v27(int i, String str, float f, float f2, float f3, float f4, float f5) {
        this.a = i;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v27)) {
            return false;
        }
        v27 v27Var = (v27) obj;
        return this.a == v27Var.a && fni.a(this.b, v27Var.b) && Float.compare(this.c, v27Var.c) == 0 && Float.compare(this.d, v27Var.d) == 0 && Float.compare(this.e, v27Var.e) == 0 && Float.compare(this.f, v27Var.f) == 0 && Float.compare(this.g, v27Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + hf3.b(hf3.b(hf3.b(hf3.b(u45.e(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        return "SelectedLineState(line=" + this.a + ", highlightText=" + this.b + ", textX=" + this.c + ", textY=" + this.d + ", baseLine=" + this.e + ", textWidth=" + this.f + ", textHeight=" + this.g + ")";
    }
}
