package com.google.crypto.tink.subtle;

import aZ0.j;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

@j
/* loaded from: classes6.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final Enums.HashType mgf1Hash;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssVerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType, Enums.HashType hashType2, int i12) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.publicKey = rSAPublicKey;
        this.sigHash = hashType;
        this.mgf1Hash = hashType2;
        this.saltLength = i12;
    }

    private void emsaPssVerify(byte[] bArr, byte[] bArr2, int i12) throws GeneralSecurityException {
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] bArrDigest = engineFactory.digest(bArr);
        int digestLength = engineFactory.getDigestLength();
        int length = bArr2.length;
        if (length < this.saltLength + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArr2[bArr2.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i13 = (length - digestLength) - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i13);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArrCopyOf.length, bArrCopyOf.length + digestLength);
        int i14 = 0;
        while (true) {
            int i15 = i13;
            MessageDigest messageDigest = engineFactory;
            byte[] bArr3 = bArrDigest;
            long j12 = (length * 8) - i12;
            if (i14 < j12) {
                if (((bArrCopyOf[i14 / 8] >> (7 - (i14 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i14++;
                i13 = i15;
                engineFactory = messageDigest;
                bArrDigest = bArr3;
            } else {
                byte[] bArrMgf1 = SubtleUtil.mgf1(bArrCopyOfRange, i15, this.mgf1Hash);
                int length2 = bArrMgf1.length;
                byte[] bArr4 = new byte[length2];
                for (int i16 = 0; i16 < length2; i16++) {
                    bArr4[i16] = (byte) (bArrMgf1[i16] ^ bArrCopyOf[i16]);
                }
                for (int i17 = 0; i17 <= j12; i17++) {
                    int i18 = i17 / 8;
                    bArr4[i18] = (byte) ((~(1 << (7 - (i17 % 8)))) & bArr4[i18]);
                }
                int i19 = 0;
                while (true) {
                    int i22 = this.saltLength;
                    if (i19 >= (r6 - i22) - 2) {
                        if (bArr4[(r6 - i22) - 2] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i22, length2);
                        int i23 = digestLength + 8;
                        byte[] bArr5 = new byte[this.saltLength + i23];
                        System.arraycopy(bArr3, 0, bArr5, 8, bArr3.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr5, i23, bArrCopyOfRange2.length);
                        if (!Bytes.equal(messageDigest.digest(bArr5), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr4[i19] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i19++;
                }
            }
        }
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        int iBitLength2 = (modulus.bitLength() + 6) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigIntegerBytes2Integer = SubtleUtil.bytes2Integer(bArr);
        if (bigIntegerBytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        emsaPssVerify(bArr2, SubtleUtil.integer2Bytes(bigIntegerBytes2Integer.modPow(publicExponent, modulus), iBitLength2), modulus.bitLength() - 1);
    }
}
