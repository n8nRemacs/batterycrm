package defpackage;

/* loaded from: classes2.dex */
public final class rb5 {
    public final mc5 a;

    public rb5(mc5 mc5Var) {
        this.a = mc5Var;
    }

    public final nc5 a(CharSequence charSequence, int i, int i2) {
        long[] jArr;
        int i3;
        mc5 mc5Var = this.a;
        if (mc5Var == null) {
            return null;
        }
        long[] jArr2 = (long[]) mc5Var.b;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = 0;
        while (i5 >= 0 && i5 < jArr2.length && i4 < i2) {
            char cCharAt = charSequence.charAt(i4);
            int i11 = i5 + 1;
            int i12 = (((int) jArr2[i5]) + i11) - 1;
            while (true) {
                if (i11 > i12) {
                    jArr = jArr2;
                    i3 = -(i11 + 1);
                    break;
                }
                i3 = ((i12 - i11) >>> 1) + i11;
                jArr = jArr2;
                char c = (char) (jArr2[i3] & 65535);
                if (c >= cCharAt) {
                    if (c <= cCharAt) {
                        break;
                    }
                    i12 = i3 - 1;
                } else {
                    i11 = i3 + 1;
                }
                jArr2 = jArr;
            }
            if (i3 <= 0) {
                break;
            }
            i6++;
            long j = jArr[i3];
            int i13 = (int) ((j >>> 48) & 65535);
            if (i13 == 65535) {
                i13 = -1;
            }
            int i14 = (int) ((j >>> 40) & 255);
            if (i14 == 255) {
                i14 = -1;
            }
            int i15 = (int) ((j >>> 32) & 255);
            if (i15 == 255) {
                i15 = -1;
            }
            int i16 = i13;
            int i17 = (int) ((j >>> 24) & 255);
            if (i17 == 255) {
                i17 = -1;
            }
            if (i14 != -1 && i15 != -1 && i17 != -1) {
                i10 += i6;
                i8 = i15;
                i9 = i17;
                i7 = i14;
                i6 = 0;
            }
            i4++;
            jArr2 = jArr;
            i5 = i16;
        }
        if (i7 == -1 || i8 == -1 || i9 == -1) {
            return null;
        }
        return new nc5(i7, i8, i9, i10, 0);
    }
}
