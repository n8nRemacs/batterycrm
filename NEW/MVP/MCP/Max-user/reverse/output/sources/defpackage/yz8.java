package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class yz8 {
    public static final yz8 f = new yz8(new wz8());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = zxg.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public yz8(wz8 wz8Var) {
        long j2 = wz8Var.a;
        long j3 = wz8Var.b;
        long j4 = wz8Var.c;
        float f2 = wz8Var.d;
        float f3 = wz8Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static yz8 b(Bundle bundle) {
        wz8 wz8Var = new wz8();
        yz8 yz8Var = f;
        wz8Var.a = bundle.getLong(g, yz8Var.a);
        wz8Var.b = bundle.getLong(h, yz8Var.b);
        wz8Var.c = bundle.getLong(i, yz8Var.c);
        wz8Var.d = bundle.getFloat(j, yz8Var.d);
        wz8Var.e = bundle.getFloat(k, yz8Var.e);
        return new yz8(wz8Var);
    }

    public final wz8 a() {
        wz8 wz8Var = new wz8();
        wz8Var.a = this.a;
        wz8Var.b = this.b;
        wz8Var.c = this.c;
        wz8Var.d = this.d;
        wz8Var.e = this.e;
        return wz8Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        yz8 yz8Var = f;
        long j2 = yz8Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = yz8Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = yz8Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = yz8Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = yz8Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz8)) {
            return false;
        }
        yz8 yz8Var = (yz8) obj;
        return this.a == yz8Var.a && this.b == yz8Var.b && this.c == yz8Var.c && this.d == yz8Var.d && this.e == yz8Var.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
