package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t8 {
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final k09[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final long i;
    public final boolean j;
    public final boolean k;

    static {
        String str = zxg.a;
        l = Integer.toString(0, 36);
        m = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        o = Integer.toString(3, 36);
        p = Integer.toString(4, 36);
        q = Integer.toString(5, 36);
        r = Integer.toString(6, 36);
        s = Integer.toString(7, 36);
        t = Integer.toString(8, 36);
        u = Integer.toString(9, 36);
        v = Integer.toString(10, 36);
    }

    public t8(long j, int i, int i2, int[] iArr, k09[] k09VarArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        hsi.b(iArr.length == k09VarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = k09VarArr;
        this.g = jArr;
        this.i = j2;
        this.j = z;
        this.d = new Uri[k09VarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.k = z2;
                return;
            }
            k09 k09Var = k09VarArr[i3];
            if (k09Var == null) {
                uri = null;
            } else {
                a09 a09Var = k09Var.b;
                a09Var.getClass();
                uri = a09Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.j || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t8.class == obj.getClass()) {
            t8 t8Var = (t8) obj;
            if (this.a == t8Var.a && this.b == t8Var.b && this.c == t8Var.c && Arrays.equals(this.e, t8Var.e) && Arrays.equals(this.f, t8Var.f) && Arrays.equals(this.g, t8Var.g) && this.i == t8Var.i && this.j == t8Var.j && Arrays.equals(this.h, t8Var.h) && this.k == t8Var.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int iHashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.i;
        return ((((((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.j ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + (this.k ? 1 : 0);
    }
}
