package com.google.crypto.tink.mac;

import AK.c;
import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class AesCmacParameters extends MacParameters {
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final Variant variant;

    public static final class Builder {

        @h
        private Integer keySizeBytes;

        @h
        private Integer tagSizeBytes;
        private Variant variant;

        public AesCmacParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.tagSizeBytes == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.variant != null) {
                return new AesCmacParameters(num.intValue(), this.tagSizeBytes.intValue(), this.variant);
            }
            throw new GeneralSecurityException("variant not set");
        }

        @InterfaceC19845a
        public Builder setKeySizeBytes(int i12) throws InvalidAlgorithmParameterException {
            if (i12 != 16 && i12 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i12 * 8)));
            }
            this.keySizeBytes = Integer.valueOf(i12);
            return this;
        }

        @InterfaceC19845a
        public Builder setTagSizeBytes(int i12) throws GeneralSecurityException {
            if (i12 < 10 || 16 < i12) {
                throw new GeneralSecurityException(c.g(i12, "Invalid tag size for AesCmacParameters: "));
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
            this.tagSizeBytes = null;
            this.variant = Variant.NO_PREFIX;
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
        if (!(obj instanceof AesCmacParameters)) {
            return false;
        }
        AesCmacParameters aesCmacParameters = (AesCmacParameters) obj;
        return aesCmacParameters.getKeySizeBytes() == getKeySizeBytes() && aesCmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && aesCmacParameters.getVariant() == getVariant();
    }

    public int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
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
        return Objects.hash(Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(this.variant);
        sb2.append(", ");
        sb2.append(this.tagSizeBytes);
        sb2.append("-byte tags, and ");
        return c.i(this.keySizeBytes, "-byte key)", sb2);
    }

    private AesCmacParameters(int i12, int i13, Variant variant) {
        this.keySizeBytes = i12;
        this.tagSizeBytes = i13;
        this.variant = variant;
    }
}
