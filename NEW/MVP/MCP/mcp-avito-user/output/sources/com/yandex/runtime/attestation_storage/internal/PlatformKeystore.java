package com.yandex.runtime.attestation_storage.internal;

import com.yandex.runtime.attestation.EcPublicKey;
import j.N;
import j.P;
import j.l0;

/* loaded from: classes8.dex */
public interface PlatformKeystore {
    @N
    @l0
    byte[] ecSign(@N byte[] bArr);

    @l0
    void generateKey(@N byte[] bArr);

    @N
    @l0
    byte[] getAppAttestKeyAssertion();

    @N
    @l0
    String getAppAttestKeyId();

    @P
    @l0
    String getApplicationId();

    @N
    @l0
    EcPublicKey getEcPublicKey();

    @N
    @l0
    byte[] getKeystoreProof();

    @l0
    boolean hasKey();

    @l0
    void removeKey();

    @l0
    void requestAttestKey(@N byte[] bArr, long j12, @N AttestationListener attestationListener);
}
