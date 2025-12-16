package com.google.crypto.tink.aead;

import AK.c;
import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class AesGcmSivParameters extends AeadParameters {
    private final int keySizeBytes;
    private final Variant variant;

    public static final class Builder {

        @h
        private Integer keySizeBytes;
        private Variant variant;

        public AesGcmSivParameters build() throws GeneralSecurityException {
            Integer num = this.keySizeBytes;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.variant != null) {
                return new AesGcmSivParameters(num.intValue(), this.variant);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        @InterfaceC19845a
        public Builder setKeySizeBytes(int i12) throws InvalidAlgorithmParameterException {
            if (i12 != 16 && i12 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i12)));
            }
            this.keySizeBytes = Integer.valueOf(i12);
            return this;
        }

        @InterfaceC19845a
        public Builder setVariant(Variant variant) {
            this.variant = variant;
            return this;
        }

        private Builder() {
            this.keySizeBytes = null;
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
        if (!(obj instanceof AesGcmSivParameters)) {
            return false;
        }
        AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) obj;
        return aesGcmSivParameters.getKeySizeBytes() == getKeySizeBytes() && aesGcmSivParameters.getVariant() == getVariant();
    }

    public int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public Variant getVariant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.keySizeBytes), this.variant);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb2.append(this.variant);
        sb2.append(", ");
        return c.i(this.keySizeBytes, "-byte key)", sb2);
    }

    private AesGcmSivParameters(int i12, Variant variant) {
        this.keySizeBytes = i12;
        this.variant = variant;
    }
}
