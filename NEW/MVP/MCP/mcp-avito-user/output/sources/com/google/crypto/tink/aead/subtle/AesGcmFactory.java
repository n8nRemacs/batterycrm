package com.google.crypto.tink.aead.subtle;

import aZ0.j;
import androidx.compose.foundation.H;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.subtle.AesGcmJce;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@j
/* loaded from: classes6.dex */
public final class AesGcmFactory implements AeadFactory {
    private final int keySizeInBytes;

    public AesGcmFactory(int i12) {
        this.keySizeInBytes = validateAesKeySize(i12);
    }

    private static int validateAesKeySize(int i12) throws InvalidAlgorithmParameterException {
        if (i12 == 16 || i12 == 32) {
            return i12;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid AES key size, expected 16 or 32, but got %d", Integer.valueOf(i12)));
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public Aead createAead(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == getKeySizeInBytes()) {
            return new AesGcmJce(bArr);
        }
        throw new GeneralSecurityException(H.j(getKeySizeInBytes(), bArr.length, "Symmetric key has incorrect length; expected ", ", but got "));
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public int getKeySizeInBytes() {
        return this.keySizeInBytes;
    }
}
