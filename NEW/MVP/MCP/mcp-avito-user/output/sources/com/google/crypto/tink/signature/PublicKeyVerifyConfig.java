package com.google.crypto.tink.signature;

@Deprecated
/* loaded from: classes6.dex */
public final class PublicKeyVerifyConfig {
    private PublicKeyVerifyConfig() {
    }

    @Deprecated
    public static void registerStandardKeyTypes() {
        SignatureConfig.register();
    }
}
