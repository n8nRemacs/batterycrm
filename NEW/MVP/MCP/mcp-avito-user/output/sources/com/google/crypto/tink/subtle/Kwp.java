package com.google.crypto.tink.subtle;

import com.google.crypto.tink.KeyWrap;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public class Kwp implements KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = {-90, 89, 89, -90};
    static final int ROUNDS = 6;
    private final SecretKey aesKey;

    public Kwp(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != 16 && bArr.length != 32) {
            throw new GeneralSecurityException("Unsupported key length");
        }
        this.aesKey = new SecretKeySpec(bArr, "AES");
    }

    private byte[] computeW(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length <= 8 || bArr2.length > 2147483631 || bArr.length != 8) {
            throw new GeneralSecurityException("computeW called with invalid parameters");
        }
        int iWrappingSize = wrappingSize(bArr2.length);
        byte[] bArr3 = new byte[iWrappingSize];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, 8, bArr2.length);
        int i12 = 1;
        int i13 = (iWrappingSize / 8) - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, this.aesKey);
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        int i14 = 0;
        while (i14 < 6) {
            int i15 = 0;
            while (i15 < i13) {
                int i16 = i15 + 1;
                int i17 = i16 * 8;
                System.arraycopy(bArr3, i17, bArr4, 8, 8);
                engineFactory.doFinal(bArr4, 0, 16, bArr4);
                int i18 = (i14 * i13) + i15 + i12;
                for (int i19 = 0; i19 < 4; i19++) {
                    int i22 = 7 - i19;
                    bArr4[i22] = (byte) (((byte) (i18 & 255)) ^ bArr4[i22]);
                    i18 >>>= 8;
                }
                System.arraycopy(bArr4, 8, bArr3, i17, 8);
                i15 = i16;
                i12 = 1;
            }
            i14++;
            i12 = 1;
        }
        System.arraycopy(bArr4, 0, bArr3, 0, 8);
        return bArr3;
    }

    private byte[] invertW(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length < 24 || bArr.length % 8 != 0) {
            throw new GeneralSecurityException("Incorrect data size");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int length = bArrCopyOf.length / 8;
        int i12 = length - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(2, this.aesKey);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArrCopyOf, 0, bArr2, 0, 8);
        for (int i13 = 5; i13 >= 0; i13--) {
            for (int i14 = length - 2; i14 >= 0; i14--) {
                int i15 = (i14 + 1) * 8;
                System.arraycopy(bArrCopyOf, i15, bArr2, 8, 8);
                int i16 = (i13 * i12) + i14 + 1;
                for (int i17 = 0; i17 < 4; i17++) {
                    int i18 = 7 - i17;
                    bArr2[i18] = (byte) (bArr2[i18] ^ ((byte) (i16 & 255)));
                    i16 >>>= 8;
                }
                engineFactory.doFinal(bArr2, 0, 16, bArr2);
                System.arraycopy(bArr2, 8, bArrCopyOf, i15, 8);
            }
        }
        System.arraycopy(bArr2, 0, bArrCopyOf, 0, 8);
        return bArrCopyOf;
    }

    private int wrappingSize(int i12) {
        return (7 - ((i12 + 7) % 8)) + i12 + 8;
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(byte[] bArr) throws GeneralSecurityException {
        int i12;
        if (bArr.length < wrappingSize(16)) {
            throw new GeneralSecurityException("Wrapped key size is too small");
        }
        if (bArr.length > wrappingSize(4096)) {
            throw new GeneralSecurityException("Wrapped key size is too large");
        }
        if (bArr.length % 8 != 0) {
            throw new GeneralSecurityException("Wrapped key size must be a multiple of 8 bytes");
        }
        byte[] bArrInvertW = invertW(bArr);
        boolean z12 = true;
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= 4) {
                break;
            }
            if (PREFIX[i13] != bArrInvertW[i13]) {
                z12 = false;
            }
            i13++;
        }
        int i14 = 0;
        for (i12 = 4; i12 < 8; i12++) {
            i14 = (i14 << 8) + (bArrInvertW[i12] & 255);
        }
        if (wrappingSize(i14) == bArrInvertW.length) {
            for (int i15 = i14 + 8; i15 < bArrInvertW.length; i15++) {
                if (bArrInvertW[i15] != 0) {
                    z12 = false;
                }
            }
            z13 = z12;
        }
        if (z13) {
            return Arrays.copyOfRange(bArrInvertW, 8, i14 + 8);
        }
        throw new BadPaddingException("Invalid padding");
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Key size of key to wrap too small");
        }
        if (bArr.length > 4096) {
            throw new GeneralSecurityException("Key size of key to wrap too large");
        }
        byte[] bArr2 = new byte[8];
        byte[] bArr3 = PREFIX;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        for (int i12 = 0; i12 < 4; i12++) {
            bArr2[i12 + 4] = (byte) ((bArr.length >> ((3 - i12) * 8)) & 255);
        }
        return computeW(bArr2, bArr);
    }
}
