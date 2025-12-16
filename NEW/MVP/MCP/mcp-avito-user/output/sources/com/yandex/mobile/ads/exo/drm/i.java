package com.yandex.mobile.ads.exo.drm;

import android.media.MediaDrm;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.yandex.mobile.ads.impl.pc1;
import j.InterfaceC42164u;
import j.P;
import j.X;

@X
/* loaded from: classes8.dex */
final class i {
    @InterfaceC42164u
    public static boolean a(@P Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    @InterfaceC42164u
    public static int b(Throwable th2) throws NumberFormatException {
        int iA2 = pc1.a(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        if (iA2 != 2 && iA2 != 4) {
            if (iA2 != 10) {
                if (iA2 != 7) {
                    if (iA2 != 8) {
                        switch (iA2) {
                            case 15:
                                break;
                            case 16:
                            case 18:
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (iA2) {
                                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                        return AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                                    default:
                                        return AuthCode.StatusCode.PERMISSION_EXPIRED;
                                }
                        }
                    }
                    return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
                }
            }
            return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
        }
        return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
    }
}
