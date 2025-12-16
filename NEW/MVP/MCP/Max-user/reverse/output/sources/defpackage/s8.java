package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s8 implements lw0 {
    public static final uy0 Z = new uy0(12);
    public final long X;
    public final boolean Y;
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] d;
    public final long[] o;

    public s8(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        fsi.b(iArr.length == uriArr.length);
        this.a = j;
        this.b = i;
        this.d = iArr;
        this.c = uriArr;
        this.o = jArr;
        this.X = j2;
        this.Y = z;
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || this.Y || (i2 = iArr[i3]) == 0 || i2 == 1) {
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
        if (obj != null && s8.class == obj.getClass()) {
            s8 s8Var = (s8) obj;
            if (this.a == s8Var.a && this.b == s8Var.b && Arrays.equals(this.c, s8Var.c) && Arrays.equals(this.d, s8Var.d) && Arrays.equals(this.o, s8Var.o) && this.X == s8Var.X && this.Y == s8Var.Y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        long j = this.a;
        int iHashCode = (Arrays.hashCode(this.o) + ((Arrays.hashCode(this.d) + ((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31)) * 31)) * 31;
        long j2 = this.X;
        return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.Y ? 1 : 0);
    }
}
