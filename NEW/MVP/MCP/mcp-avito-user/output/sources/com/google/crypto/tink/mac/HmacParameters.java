package com.google.crypto.tink.mac;

import AK.c;
import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.j;
import com.google.crypto.tink.annotations.Alpha;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

@Alpha
/* loaded from: classes6.dex */
public final class HmacParameters extends MacParameters {
    private final HashType hashType;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    public static final class Builder {
        private HashType hashType;

        @h
        private Integer keySizeBytes;

        @h
        private Integer tagSizeBytes;
        private Variant variant;

        private static void validateTagSizeBytes(int i12, HashType hashType) throws GeneralSecurityException {
            if (i12 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i12)));
            }
            if (hashType == HashType.SHA1) {
                if (i12 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i12)));
                }
                return;
            }
            if (hashType == HashType.SHA224) {
                if (i12 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i12)));
                }
                return;
            }
            if (hashType == HashType.SHA256) {
                if (i12 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i12)));
                }
            } else if (hashType == HashType.SHA384) {
                if (i12 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i12)));
                }
            } else {
                if (hashType != HashType.SHA512) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i12 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i12)));
                }
            }
        }

        public HmacParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.tagSizeBytes == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.hashType == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.variant == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.keySizeBytes));
            }
            validateTagSizeBytes(this.tagSizeBytes.intValue(), this.hashType);
            return new HmacParameters(this.keySizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant, this.hashType);
        }

        @InterfaceC19845a
        public Builder setHashType(HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        @InterfaceC19845a
        public Builder setKeySizeBytes(int i12) {
            this.keySizeBytes = Integer.valueOf(i12);
            return this;
        }

        @InterfaceC19845a
        public Builder setTagSizeBytes(int i12) {
            this.tagSizeBytes = Integer.valueOf(i12);
            return this;
        }

        @InterfaceC19845a
        public Builder setVariant(Variant variant) {
            this.variant = variant;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
            this.tagSizeBytes = null;
            this.hashType = null;
            this.variant = Variant.NO_PREFIX;
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

    @j
    public static final class Variant {
        private final String name;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant LEGACY = new Variant("LEGACY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        private Variant(String str) {
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
        if (!(obj instanceof HmacParameters)) {
            return false;
        }
        HmacParameters hmacParameters = (HmacParameters) obj;
        return hmacParameters.getKeySizeBytes() == getKeySizeBytes() && hmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && hmacParameters.getVariant() == getVariant() && hmacParameters.getHashType() == getHashType();
    }

    public int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public HashType getHashType() {
        return this.hashType;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public int getTotalTagSizeBytes() {
        Variant variant = this.variant;
        if (variant == Variant.NO_PREFIX) {
            return getCryptographicTagSizeBytes();
        }
        if (variant != Variant.TINK && variant != Variant.CRUNCHY && variant != Variant.LEGACY) {
            throw new IllegalStateException("Unknown variant");
        }
        int cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        return cryptographicTagSizeBytes + 5;
    }

    public Variant getVariant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant, this.hashType);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HMAC Parameters (variant: ");
        sb2.append(this.variant);
        sb2.append(", hashType: ");
        sb2.append(this.hashType);
        sb2.append(", ");
        sb2.append(this.tagSizeBytes);
        sb2.append("-byte tags, and ");
        return c.i(this.keySizeBytes, "-byte key)", sb2);
    }

    private HmacParameters(int i12, int i13, Variant variant, HashType hashType) {
        this.keySizeBytes = i12;
        this.tagSizeBytes = i13;
        this.variant = variant;
        this.hashType = hashType;
    }
}
