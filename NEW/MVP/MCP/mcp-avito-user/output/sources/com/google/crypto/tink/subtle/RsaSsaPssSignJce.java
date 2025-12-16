package com.google.crypto.tink.subtle;

import aZ0.j;
import androidx.appcompat.app.r;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

@j
/* loaded from: classes6.dex */
public final class RsaSsaPssSignJce implements PublicKeySign {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final String RAW_RSA_ALGORITHM = "RSA/ECB/NOPADDING";
    private final Enums.HashType mgf1Hash;
    private final RSAPrivateCrtKey privateKey;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssSignJce(RSAPrivateCrtKey rSAPrivateCrtKey, Enums.HashType hashType, Enums.HashType hashType2, int i12) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
        this.privateKey = rSAPrivateCrtKey;
        this.publicKey = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.sigHash = hashType;
        this.mgf1Hash = hashType2;
        this.saltLength = i12;
    }

    private byte[] emsaPssEncode(byte[] bArr, int i12) throws GeneralSecurityException {
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] bArrDigest = engineFactory.digest(bArr);
        int digestLength = engineFactory.getDigestLength();
        int iF2 = r.f(i12, 1, 8, 1);
        int i13 = this.saltLength;
        if (iF2 < digestLength + i13 + 2) {
            throw new GeneralSecurityException("encoding error");
        }
        byte[] bArrRandBytes = Random.randBytes(i13);
        int i14 = digestLength + 8;
        byte[] bArr2 = new byte[this.saltLength + i14];
        System.arraycopy(bArrDigest, 0, bArr2, 8, digestLength);
        System.arraycopy(bArrRandBytes, 0, bArr2, i14, bArrRandBytes.length);
        byte[] bArrDigest2 = engineFactory.digest(bArr2);
        int i15 = (iF2 - digestLength) - 1;
        byte[] bArr3 = new byte[i15];
        int i16 = this.saltLength;
        bArr3[((iF2 - i16) - digestLength) - 2] = 1;
        System.arraycopy(bArrRandBytes, 0, bArr3, ((iF2 - i16) - digestLength) - 1, bArrRandBytes.length);
        byte[] bArrMgf1 = SubtleUtil.mgf1(bArrDigest2, i15, this.mgf1Hash);
        byte[] bArr4 = new byte[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            bArr4[i17] = (byte) (bArr3[i17] ^ bArrMgf1[i17]);
        }
        for (int i18 = 0; i18 < (iF2 * 8) - i12; i18++) {
            int i19 = i18 / 8;
            bArr4[i19] = (byte) ((~(1 << (7 - (i18 % 8)))) & bArr4[i19]);
        }
        int i22 = digestLength + i15;
        byte[] bArr5 = new byte[i22 + 1];
        System.arraycopy(bArr4, 0, bArr5, 0, i15);
        System.arraycopy(bArrDigest2, 0, bArr5, i15, bArrDigest2.length);
        bArr5[i22] = -68;
        return bArr5;
    }

    private byte[] rsasp1(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        EngineFactory<EngineWrapper.TCipher, Cipher> engineFactory = EngineFactory.CIPHER;
        Cipher engineFactory2 = engineFactory.getInstance(RAW_RSA_ALGORITHM);
        engineFactory2.init(2, this.privateKey);
        byte[] bArrDoFinal = engineFactory2.doFinal(bArr);
        Cipher engineFactory3 = engineFactory.getInstance(RAW_RSA_ALGORITHM);
        engineFactory3.init(1, this.publicKey);
        if (new BigInteger(1, bArr).equals(new BigInteger(1, engineFactory3.doFinal(bArrDoFinal)))) {
            return bArrDoFinal;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) {
        return rsasp1(emsaPssEncode(bArr, this.publicKey.getModulus().bitLength() - 1));
    }
}
