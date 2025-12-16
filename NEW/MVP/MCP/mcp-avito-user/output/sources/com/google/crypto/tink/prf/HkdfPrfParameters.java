package com.google.crypto.tink.prf;

import AK.c;
import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.j;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

@Alpha
/* loaded from: classes6.dex */
public final class HkdfPrfParameters extends PrfParameters {
    private static final int MIN_KEY_SIZE = 16;
    private final HashType hashType;
    private final int keySizeBytes;

    @h
    private final Bytes salt;

    public static final class Builder {

        @h
        private HashType hashType;

        @h
        private Integer keySizeBytes;

        @h
        private Bytes salt;

        public HkdfPrfParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.hashType != null) {
                return new HkdfPrfParameters(num.intValue(), this.hashType, this.salt);
            }
            throw new GeneralSecurityException("hash type is not set");
        }

        @InterfaceC19845a
        public Builder setHashType(HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        @InterfaceC19845a
        public Builder setKeySizeBytes(int i12) throws InvalidAlgorithmParameterException {
            if (i12 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", Integer.valueOf(i12 * 8)));
            }
            this.keySizeBytes = Integer.valueOf(i12);
            return this;
        }

        @InterfaceC19845a
        public Builder setSalt(Bytes bytes) {
            if (bytes.size() == 0) {
                return this;
            }
            this.salt = bytes;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
            this.hashType = null;
            this.salt = null;
        }
    }

    @j
    public static final class HashType {
        public static final HashType SHA1 = new HashType("SHA1");
        public static final HashType SHA224 = new HashType("SHA224");
        public static final HashType SHA256 = new HashType("SHA256");
        public static final HashType SHA384 = new HashType("SHA384");
        public static final HashType SHA512 = new HashType("SHA512");
        private final String name;

        private HashType(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HkdfPrfParameters)) {
            return false;
        }
        HkdfPrfParameters hkdfPrfParameters = (HkdfPrfParameters) obj;
        return hkdfPrfParameters.getKeySizeBytes() == getKeySizeBytes() && hkdfPrfParameters.getHashType() == getHashType() && Objects.equals(hkdfPrfParameters.getSalt(), getSalt());
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    @h
    public Bytes getSalt() {
        return this.salt;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), this.hashType, this.salt);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HKDF PRF Parameters (hashType: ");
        sb2.append(this.hashType);
        sb2.append(", salt: ");
        sb2.append(this.salt);
        sb2.append(", and ");
        return c.i(this.keySizeBytes, "-byte key)", sb2);
    }

    private HkdfPrfParameters(int i12, HashType hashType, Bytes bytes) {
        this.keySizeBytes = i12;
        this.hashType = hashType;
        this.salt = bytes;
    }
}
