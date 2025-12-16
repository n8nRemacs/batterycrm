package com.huawei.agconnect.config.a;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class h {
    public static SecretKeySpec a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != 16 || bArr2.length != 16 || bArr3.length != 16) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        b(bArr, -4);
        byte[] bArrC = c(bArr, bArr2);
        b(bArrC, 6);
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(f.a(c(bArrC, bArr3)).toCharArray(), bArr4, 5000, 128)).getEncoded(), "AES");
    }

    public static void b(byte[] bArr, int i12) {
        for (int i13 = 0; i13 < bArr.length; i13++) {
            if (i12 < 0) {
                bArr[i13] = (byte) (bArr[i13] << (-i12));
            } else {
                bArr[i13] = (byte) (bArr[i13] >> i12);
            }
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i12 = 0; i12 < bArr.length; i12++) {
            bArr3[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
        }
        return bArr3;
    }
}
