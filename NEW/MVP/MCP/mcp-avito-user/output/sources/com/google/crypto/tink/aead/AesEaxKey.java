package com.google.crypto.tink.aead;

import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.j;
import aZ0.s;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;

@Alpha
@j
/* loaded from: classes6.dex */
public final class AesEaxKey extends AeadKey {

    @h
    private final Integer idRequirement;
    private final SecretBytes keyBytes;
    private final Bytes outputPrefix;
    private final AesEaxParameters parameters;

    public static class Builder {

        @h
        private Integer idRequirement;

        @h
        private SecretBytes keyBytes;

        @h
        private AesEaxParameters parameters;

        private Bytes getOutputPrefix() {
            if (this.parameters.getVariant() == AesEaxParameters.Variant.NO_PREFIX) {
                return Bytes.copyFrom(new byte[0]);
            }
            if (this.parameters.getVariant() == AesEaxParameters.Variant.CRUNCHY) {
                return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.idRequirement.intValue()).array());
            }
            if (this.parameters.getVariant() == AesEaxParameters.Variant.TINK) {
                return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.idRequirement.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.parameters.getVariant());
        }

        public AesEaxKey build() throws GeneralSecurityException {
            AesEaxParameters aesEaxParameters = this.parameters;
            if (aesEaxParameters == null || this.keyBytes == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesEaxParameters.getKeySizeBytes() != this.keyBytes.size()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.parameters.hasIdRequirement() && this.idRequirement == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.parameters.hasIdRequirement() && this.idRequirement != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new AesEaxKey(this.parameters, this.keyBytes, getOutputPrefix(), this.idRequirement);
        }

        @InterfaceC19845a
        public Builder setIdRequirement(@h Integer num) {
            this.idRequirement = num;
            return this;
        }

        @InterfaceC19845a
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.keyBytes = secretBytes;
            return this;
        }

        @InterfaceC19845a
        public Builder setParameters(AesEaxParameters aesEaxParameters) {
            this.parameters = aesEaxParameters;
            return this;
        }

        private Builder() {
            this.parameters = null;
            this.keyBytes = null;
            this.idRequirement = null;
        }
    }

    @s
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof AesEaxKey)) {
            return false;
        }
        AesEaxKey aesEaxKey = (AesEaxKey) key;
        return aesEaxKey.parameters.equals(this.parameters) && aesEaxKey.keyBytes.equalsSecretBytes(this.keyBytes) && Objects.equals(aesEaxKey.idRequirement, this.idRequirement);
    }

    @Override // com.google.crypto.tink.Key
    @h
    public Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @s
    public SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    private AesEaxKey(AesEaxParameters aesEaxParameters, SecretBytes secretBytes, Bytes bytes, @h Integer num) {
        this.parameters = aesEaxParameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public AesEaxParameters getParameters() {
        return this.parameters;
    }
}
