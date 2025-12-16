package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class jgg {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final lfg b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = zxg.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public jgg(lfg lfgVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = lfgVar.a;
        this.a = i2;
        boolean z2 = false;
        hsi.b(i2 == iArr.length && i2 == zArr.length);
        this.b = lfgVar;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean a() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jgg.class == obj.getClass()) {
            jgg jggVar = (jgg) obj;
            if (this.c == jggVar.c && this.b.equals(jggVar.b) && Arrays.equals(this.d, jggVar.d) && Arrays.equals(this.e, jggVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
