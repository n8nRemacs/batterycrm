package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Hkdf {
    private Hkdf() {
    }

    public static byte[] computeEciesHkdfSymmetricKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, byte[] bArr4, int i12) {
        return computeHkdf(str, Bytes.concat(bArr, bArr2), bArr3, bArr4, i12);
    }

    public static byte[] computeHkdf(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i12) throws IllegalStateException, GeneralSecurityException {
        Mac engineFactory = EngineFactory.MAC.getInstance(str);
        if (i12 > engineFactory.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            engineFactory.init(new SecretKeySpec(new byte[engineFactory.getMacLength()], str));
        } else {
            engineFactory.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i12];
        engineFactory.init(new SecretKeySpec(engineFactory.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i13 = 1;
        int length = 0;
        while (true) {
            engineFactory.update(bArrDoFinal);
            engineFactory.update(bArr3);
            engineFactory.update((byte) i13);
            bArrDoFinal = engineFactory.doFinal();
            if (bArrDoFinal.length + length >= i12) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i12 - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i13++;
        }
    }
}
