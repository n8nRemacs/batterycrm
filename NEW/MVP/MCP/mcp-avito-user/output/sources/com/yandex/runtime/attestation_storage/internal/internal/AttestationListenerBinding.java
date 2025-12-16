package com.yandex.runtime.attestation_storage.internal.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.attestation_storage.internal.AttestationListener;
import j.N;

/* loaded from: classes8.dex */
public class AttestationListenerBinding implements AttestationListener {
    private final NativeObject nativeObject;

    public AttestationListenerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.attestation_storage.internal.AttestationListener
    public native void onAttestationFailed(@N String str);

    @Override // com.yandex.runtime.attestation_storage.internal.AttestationListener
    public native void onAttestationReceived(@N byte[] bArr);
}
