package com.google.crypto.tink.aead;

import AK.c;
import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class AesGcmParameters extends AeadParameters {
    private final int ivSizeBytes;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    public static final class Builder {

        @h
        private Integer ivSizeBytes;

        @h
        private Integer keySizeBytes;

        @h
        private Integer tagSizeBytes;
        private Variant variant;

        public AesGcmParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.variant == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.ivSizeBytes == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.tagSizeBytes != null) {
                return new AesGcmParameters(num.intValue(), this.ivSizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        @InterfaceC19845a
        public Builder setIvSizeBytes(int i12) throws GeneralSecurityException {
            if (i12 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i12)));
            }
            this.ivSizeBytes = Integer.valueOf(i12);
            return this;
        }

        @InterfaceC19845a
        public Builder setKeySizeBytes(int i12) throws InvalidAlgorithmParameterException {
            if (i12 != 16 && i12 != 24 && i12 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i12)));
            }
            this.keySizeBytes = Integer.valueOf(i12);
            return this;
        }

        @InterfaceC19845a
        public Builder setTagSizeBytes(int i12) throws GeneralSecurityException {
            if (i12 != 12 && i12 != 13 && i12 != 14 && i12 != 15 && i12 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i12)));
            }
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
            this.ivSizeBytes = null;
            this.tagSizeBytes = null;
            this.variant = Variant.NO_PREFIX;
        }
    }

    @j
    public static final class Variant {
        private final String name;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
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
        if (!(obj instanceof AesGcmParameters)) {
            return false;
        }
        AesGcmParameters aesGcmParameters = (AesGcmParameters) obj;
        return aesGcmParameters.getKeySizeBytes() == getKeySizeBytes() && aesGcmParameters.getIvSizeBytes() == getIvSizeBytes() && aesGcmParameters.getTagSizeBytes() == getTagSizeBytes() && aesGcmParameters.getVariant() == getVariant();
    }

    public int getIvSizeBytes() {
        return this.ivSizeBytes;
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public int getTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public Variant getVariant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.ivSizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcm Parameters (variant: ");
        sb2.append(this.variant);
        sb2.append(", ");
        sb2.append(this.ivSizeBytes);
        sb2.append("-byte IV, ");
        sb2.append(this.tagSizeBytes);
        sb2.append("-byte tag, and ");
        return c.i(this.keySizeBytes, "-byte key)", sb2);
    }

    private AesGcmParameters(int i12, int i13, int i14, Variant variant) {
        this.keySizeBytes = i12;
        this.ivSizeBytes = i13;
        this.tagSizeBytes = i14;
        this.variant = variant;
    }
}
