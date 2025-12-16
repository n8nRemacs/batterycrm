package defpackage;

/* loaded from: classes2.dex */
public final class oeb {
    public final float a;
    public final int b;

    public oeb(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeb)) {
            return false;
        }
        oeb oebVar = (oeb) obj;
        return Float.compare(this.a, oebVar.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.b == oebVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + hf3.b(Float.hashCode(this.a) * 31, 0.0f, 31);
    }

    public final String toString() {
        return "IndicatorConfig(topCorners=" + this.a + ", bottomCorners=0.0, height=" + this.b + ")";
    }
}
