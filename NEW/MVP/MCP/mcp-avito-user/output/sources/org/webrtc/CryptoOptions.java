package org.webrtc;

/* loaded from: classes9.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        public /* synthetic */ Builder(int i12) {
            this();
        }

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption, 0);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z12) {
            this.enableAes128Sha1_32CryptoCipher = z12;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z12) {
            this.enableEncryptedRtpHeaderExtensions = z12;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z12) {
            this.enableGcmCryptoSuites = z12;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z12) {
            this.requireFrameEncryption = z12;
            return this;
        }

        private Builder() {
        }
    }

    public final class SFrame {
        private final boolean requireFrameEncryption;

        public /* synthetic */ SFrame(CryptoOptions cryptoOptions, boolean z12, int i12) {
            this(z12);
        }

        @CalledByNative("SFrame")
        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z12) {
            this.requireFrameEncryption = z12;
        }
    }

    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public /* synthetic */ Srtp(CryptoOptions cryptoOptions, boolean z12, boolean z13, boolean z14, int i12) {
            this(z12, z13, z14);
        }

        @CalledByNative("Srtp")
        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        @CalledByNative("Srtp")
        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        @CalledByNative("Srtp")
        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z12, boolean z13, boolean z14) {
            this.enableGcmCryptoSuites = z12;
            this.enableAes128Sha1_32CryptoCipher = z13;
            this.enableEncryptedRtpHeaderExtensions = z14;
        }
    }

    public /* synthetic */ CryptoOptions(boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        this(z12, z13, z14, z15);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @CalledByNative
    public SFrame getSFrame() {
        return this.sframe;
    }

    @CalledByNative
    public Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z12, boolean z13, boolean z14, boolean z15) {
        this.srtp = new Srtp(this, z12, z13, z14, 0);
        this.sframe = new SFrame(this, z15, 0);
    }
}
