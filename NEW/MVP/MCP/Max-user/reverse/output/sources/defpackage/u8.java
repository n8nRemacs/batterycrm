package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u8 implements lw0 {
    public static final u8 X = new u8(new s8[0], 0, -9223372036854775807L, 0);
    public static final s8 Y;
    public static final uy0 Z;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final s8[] o;

    static {
        int iMax = Math.max(0, 0);
        int[] iArrCopyOf = Arrays.copyOf(new int[0], iMax);
        Arrays.fill(iArrCopyOf, 0, iMax, 0);
        int iMax2 = Math.max(0, 0);
        long[] jArrCopyOf = Arrays.copyOf(new long[0], iMax2);
        Arrays.fill(jArrCopyOf, 0, iMax2, -9223372036854775807L);
        Y = new s8(0L, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), jArrCopyOf, 0L, false);
        Z = new uy0(11);
    }

    public u8(s8[] s8VarArr, long j, long j2, int i) {
        this.b = j;
        this.c = j2;
        this.a = s8VarArr.length + i;
        this.o = s8VarArr;
        this.d = i;
    }

    public final s8 a(int i) {
        int i2 = this.d;
        return i < i2 ? Y : this.o[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u8.class != obj.getClass()) {
            return false;
        }
        u8 u8Var = (u8) obj;
        int i = xxg.a;
        return this.a == u8Var.a && this.b == u8Var.b && this.c == u8Var.c && this.d == u8Var.d && Arrays.equals(this.o, u8Var.o);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31) + Arrays.hashCode(this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            s8[] s8VarArr = this.o;
            if (i >= s8VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(s8VarArr[i].a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < s8VarArr[i].d.length; i2++) {
                sb.append("ad(state=");
                int i3 = s8VarArr[i].d[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(s8VarArr[i].o[i2]);
                sb.append(')');
                if (i2 < s8VarArr[i].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < s8VarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
