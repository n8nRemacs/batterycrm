package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v8 {
    public static final v8 f = new v8(new t8[0], 0, -9223372036854775807L, 0);
    public static final t8 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final t8[] e;

    static {
        t8 t8Var = new t8(0L, -1, -1, new int[0], new k09[0], new long[0], 0L, false, new String[0], false);
        int[] iArr = t8Var.f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = t8Var.g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        g = new t8(t8Var.a, 0, t8Var.c, iArrCopyOf, (k09[]) Arrays.copyOf(t8Var.e, 0), jArrCopyOf, t8Var.i, t8Var.j, (String[]) Arrays.copyOf(t8Var.h, 0), t8Var.k);
        String str = zxg.a;
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public v8(t8[] t8VarArr, long j2, long j3, int i2) {
        this.b = j2;
        this.c = j3;
        this.a = t8VarArr.length + i2;
        this.e = t8VarArr;
        this.d = i2;
    }

    public final t8 a(int i2) {
        int i3 = this.d;
        return i2 < i3 ? g : this.e[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v8.class != obj.getClass()) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return this.a == v8Var.a && this.b == v8Var.b && this.c == v8Var.c && this.d == v8Var.d && Arrays.equals(this.e, v8Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            t8[] t8VarArr = this.e;
            if (i2 >= t8VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(t8VarArr[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < t8VarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = t8VarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(t8VarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < t8VarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < t8VarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
