package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzi implements zzeg {

    /* renamed from: a, reason: collision with root package name */
    public static final zzeg f352561a = new zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeg
    public final boolean zza(int i12) {
        switch (i12) {
            case 17:
            case 18:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return true;
            case 19:
            case 20:
            default:
                return false;
        }
    }
}
