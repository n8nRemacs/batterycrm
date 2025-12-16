package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class y6g {
    public final int[] a;
    public final float b;

    public y6g(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6g)) {
            return false;
        }
        y6g y6gVar = (y6g) obj;
        return fni.a(this.a, y6gVar.a) && Float.compare(this.b, y6gVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Gradient(colors=" + Arrays.toString(this.a) + ", angle=" + this.b + ")";
    }
}
