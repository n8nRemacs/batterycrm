package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ks8 implements ry9 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ks8(byte[] bArr, int i, int i2, String str) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                hsi.b(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                hsi.b(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                hsi.b(z);
                break;
            case "auxiliary.tracks.map":
                hsi.b(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList b() {
        hsi.f("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ks8.class == obj.getClass()) {
            ks8 ks8Var = (ks8) obj;
            if (this.a.equals(ks8Var.a) && Arrays.equals(this.b, ks8Var.b) && this.c == ks8Var.c && this.d == ks8Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + u45.e(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.String r0 = r6.a
            r1 = 0
            r2 = 1
            byte[] r3 = r6.b
            int r4 = r6.d
            if (r4 == 0) goto L53
            if (r4 == r2) goto L4e
            r2 = 23
            if (r4 == r2) goto L41
            r2 = 67
            if (r4 == r2) goto L38
            r2 = 75
            if (r4 == r2) goto L2c
            r2 = 78
            if (r4 == r2) goto L1d
            goto L7c
        L1d:
            umb r1 = new umb
            r1.<init>(r3)
            long r1 = r1.C()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L2c:
            r1 = r3[r1]
            int r1 = java.lang.Byte.toUnsignedInt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L38:
            int r1 = defpackage.jni.c(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L41:
            int r1 = defpackage.jni.c(r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto Laa
        L4e:
            java.lang.String r1 = defpackage.zxg.q(r3)
            goto Laa
        L53:
            java.lang.String r4 = "auxiliary.tracks.map"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L7c
            java.util.ArrayList r1 = r6.b()
            java.lang.String r3 = "track types = "
            java.lang.StringBuilder r3 = defpackage.az1.m(r3)
            d47 r4 = new d47
            r5 = 44
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5, r2)
            java.util.Iterator r1 = r1.iterator()
            r4.a(r3, r1)
            java.lang.String r1 = r3.toString()
            goto Laa
        L7c:
            java.lang.String r2 = defpackage.zxg.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r4 = r3.length
            int r4 = r4 * 2
            r2.<init>(r4)
        L86:
            int r4 = r3.length
            if (r1 >= r4) goto La6
            r4 = r3[r1]
            int r4 = r4 >> 4
            r4 = r4 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r2.append(r4)
            r4 = r3[r1]
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r5)
            r2.append(r4)
            int r1 = r1 + 1
            goto L86
        La6:
            java.lang.String r1 = r2.toString()
        Laa:
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = defpackage.wy1.i(r2, r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks8.toString():java.lang.String");
    }
}
