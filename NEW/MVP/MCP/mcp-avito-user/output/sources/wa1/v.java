package wa1;

/* loaded from: classes9.dex */
public abstract class v {
    public static byte[] a(int i12, int i13, int i14, byte[] bArr) {
        if (i14 == 0) {
            return bArr;
        }
        if (i14 % 90 != 0 || 90 > i14 || i14 >= 271) {
            throw new IllegalArgumentException("0 <= rotation < 360, rotation % 90 == 0");
        }
        byte[] bArr2 = new byte[bArr.length];
        int i15 = i12 * i13;
        boolean z12 = i14 % 180 != 0;
        boolean z13 = i14 % 270 != 0;
        boolean z14 = i14 >= 180;
        for (int i16 = 0; i16 < i13; i16++) {
            for (int i17 = 0; i17 < i12; i17++) {
                int i18 = (i16 * i12) + i17;
                int i19 = ((i16 >> 1) * i12) + i15 + (i17 & (-2));
                int i22 = i19 + 1;
                int i23 = z12 ? i13 : i12;
                int i24 = z12 ? i12 : i13;
                int i25 = z12 ? i16 : i17;
                int i26 = z12 ? i17 : i16;
                if (z13) {
                    i25 = (i23 - i25) - 1;
                }
                if (z14) {
                    i26 = (i24 - i26) - 1;
                }
                int i27 = (i26 * i23) + i25;
                int i28 = ((i26 >> 1) * i23) + i15 + (i25 & (-2));
                bArr2[i27] = (byte) (bArr[i18] & 255);
                bArr2[i28] = (byte) (bArr[i19] & 255);
                bArr2[i28 + 1] = (byte) (bArr[i22] & 255);
            }
        }
        return bArr2;
    }
}
