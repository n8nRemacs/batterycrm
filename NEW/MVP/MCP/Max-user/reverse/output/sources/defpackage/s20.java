package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class s20 {
    public static final s20 d;
    public final int a;
    public final int b;
    public final hh7 c;

    static {
        s20 s20Var;
        if (Build.VERSION.SDK_INT >= 33) {
            gh7 gh7Var = new gh7(4);
            for (int i = 1; i <= 10; i++) {
                gh7Var.a(Integer.valueOf(zxg.s(i)));
            }
            s20Var = new s20(2, gh7Var.j());
        } else {
            s20Var = new s20(2, 10);
        }
        d = s20Var;
    }

    public s20(int i, Set set) {
        this.a = i;
        hh7 hh7VarJ = hh7.j(set);
        this.c = hh7VarJ;
        rrg it = hh7VarJ.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s20)) {
            return false;
        }
        s20 s20Var = (s20) obj;
        return this.a == s20Var.a && this.b == s20Var.b && Objects.equals(this.c, s20Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        hh7 hh7Var = this.c;
        return i + (hh7Var == null ? 0 : hh7Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public s20(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
