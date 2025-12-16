package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzgj {
    public static byte[] zza(byte[]... bArr) {
        int i12 = 0;
        int length = 0;
        while (true) {
            if (i12 >= bArr.length) {
                break;
            }
            length += bArr[i12].length;
            i12++;
        }
        byte[] bArr2 = new byte[length];
        int i13 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i13, length2);
            i13 += length2;
        }
        return bArr2;
    }
}
