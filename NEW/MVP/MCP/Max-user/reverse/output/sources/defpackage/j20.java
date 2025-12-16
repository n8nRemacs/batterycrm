package defpackage;

import android.media.AudioAttributes;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class j20 implements lw0 {
    public static final j20 Y = new j20(0, 0, 1, 1, 0);
    public AudioAttributes X;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;

    public j20(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.o = i5;
    }

    public final AudioAttributes a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.X == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i = xxg.a;
            if (i >= 29) {
                h20.a(usage, this.d);
            }
            if (i >= 32) {
                i20.a(usage, this.o);
            }
            this.X = usage.build();
        }
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j20.class == obj.getClass()) {
            j20 j20Var = (j20) obj;
            if (this.a == j20Var.a && this.b == j20Var.b && this.c == j20Var.c && this.d == j20Var.d && this.o == j20Var.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.o;
    }
}
