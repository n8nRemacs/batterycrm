package com.yandex.runtime.attestation_storage.internal;

import j.N;

/* loaded from: classes8.dex */
public interface AttestationListener {
    void onAttestationFailed(@N String str);

    void onAttestationReceived(@N byte[] bArr);
}
