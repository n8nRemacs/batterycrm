package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e8a {
    public float[] a;
    public int b;

    public e8a(int i) {
        this.a = i == 0 ? q26.a : new float[i];
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder sbM = ho7.m(i, "Index ", " must be in 0..");
        sbM.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e8a) {
            e8a e8aVar = (e8a) obj;
            int i = e8aVar.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = e8aVar.a;
                to7 to7VarH = n7j.h(0, i2);
                int i3 = to7VarH.a;
                int i4 = to7VarH.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            float f = fArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i2++;
        }
        return sb.toString();
    }
}
