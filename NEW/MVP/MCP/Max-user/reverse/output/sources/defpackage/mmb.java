package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mmb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public mmb(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i = this.d;
        int iF = rf3.f(-1, 4.5f, i);
        int iF2 = rf3.f(-1, 3.0f, i);
        if (iF != -1 && iF2 != -1) {
            this.h = rf3.i(-1, iF);
            this.g = rf3.i(-1, iF2);
            this.f = true;
            return;
        }
        int iF3 = rf3.f(-16777216, 4.5f, i);
        int iF4 = rf3.f(-16777216, 3.0f, i);
        if (iF3 == -1 || iF4 == -1) {
            this.h = iF != -1 ? rf3.i(-1, iF) : rf3.i(-16777216, iF3);
            this.g = iF2 != -1 ? rf3.i(-1, iF2) : rf3.i(-16777216, iF4);
            this.f = true;
        } else {
            this.h = rf3.i(-16777216, iF3);
            this.g = rf3.i(-16777216, iF4);
            this.f = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        rf3.a(this.a, this.b, this.c, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mmb.class == obj.getClass()) {
            mmb mmbVar = (mmb) obj;
            if (this.e == mmbVar.e && this.d == mmbVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(mmb.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
