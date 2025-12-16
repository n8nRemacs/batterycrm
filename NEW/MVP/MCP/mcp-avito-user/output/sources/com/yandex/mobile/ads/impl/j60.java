package com.yandex.mobile.ads.impl;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class j60 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f386766a;

        static {
            int[] iArr = new int[InstreamAdPlayerError.Reason.values().length];
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER.ordinal()] = 1;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER.ordinal()] = 2;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP.ordinal()] = 3;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE.ordinal()] = 4;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER.ordinal()] = 5;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER.ordinal()] = 6;
            iArr[InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN.ordinal()] = 7;
            iArr[InstreamAdPlayerError.Reason.TIMEOUT.ordinal()] = 8;
            iArr[InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION.ordinal()] = 9;
            iArr[InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR.ordinal()] = 10;
            iArr[InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR.ordinal()] = 11;
            iArr[InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR.ordinal()] = 12;
            iArr[InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR.ordinal()] = 13;
            iArr[InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED.ordinal()] = 14;
            iArr[InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY.ordinal()] = 15;
            iArr[InstreamAdPlayerError.Reason.DRM_SESSION_ERROR.ordinal()] = 16;
            iArr[InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED.ordinal()] = 17;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED.ordinal()] = 18;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN.ordinal()] = 19;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND.ordinal()] = 20;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN.ordinal()] = 21;
            iArr[InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR.ordinal()] = 22;
            iArr[InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE.ordinal()] = 23;
            iArr[InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR.ordinal()] = 24;
            iArr[InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR.ordinal()] = 25;
            iArr[InstreamAdPlayerError.Reason.AUDIO_ERROR.ordinal()] = 26;
            iArr[InstreamAdPlayerError.Reason.SUBTITLE_ERROR.ordinal()] = 27;
            iArr[InstreamAdPlayerError.Reason.CACHE_ERROR.ordinal()] = 28;
            iArr[InstreamAdPlayerError.Reason.UNKNOWN.ordinal()] = 29;
            f386766a = iArr;
        }
    }

    @Y61.k
    public static cg1 a(@Y61.k InstreamAdPlayerError instreamAdPlayerError) {
        int i12;
        switch (a.f386766a[instreamAdPlayerError.getReason().ordinal()]) {
            case 1:
                i12 = 1;
                break;
            case 2:
                i12 = 2;
                break;
            case 3:
                i12 = 3;
                break;
            case 4:
                i12 = 4;
                break;
            case 5:
                i12 = 5;
                break;
            case 6:
                i12 = 6;
                break;
            case 7:
                i12 = 7;
                break;
            case 8:
                i12 = 8;
                break;
            case 9:
                i12 = 9;
                break;
            case 10:
                i12 = 10;
                break;
            case 11:
                i12 = 11;
                break;
            case 12:
                i12 = 12;
                break;
            case 13:
                i12 = 13;
                break;
            case 14:
                i12 = 14;
                break;
            case 15:
                i12 = 15;
                break;
            case 16:
                i12 = 16;
                break;
            case 17:
                i12 = 17;
                break;
            case 18:
                i12 = 18;
                break;
            case 19:
                i12 = 19;
                break;
            case 20:
                i12 = 20;
                break;
            case 21:
                i12 = 21;
                break;
            case 22:
                i12 = 22;
                break;
            case 23:
                i12 = 23;
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                i12 = 24;
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i12 = 25;
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i12 = 26;
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i12 = 27;
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i12 = 28;
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                i12 = 29;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new cg1(i12, instreamAdPlayerError.getUnderlyingError());
    }
}
