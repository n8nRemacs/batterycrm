package com.google.crypto.tink.util;

import aZ0.j;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.annotations.Alpha;
import java.math.BigInteger;
import java.security.MessageDigest;

@Alpha
@j
/* loaded from: classes6.dex */
public final class SecretBigInteger {
    private final BigInteger value;

    private SecretBigInteger(BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public static SecretBigInteger fromBigInteger(BigInteger bigInteger, SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess != null) {
            return new SecretBigInteger(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public boolean equalsSecretBigInteger(SecretBigInteger secretBigInteger) {
        return MessageDigest.isEqual(this.value.toByteArray(), secretBigInteger.value.toByteArray());
    }

    public BigInteger getBigInteger(SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess != null) {
            return this.value;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
