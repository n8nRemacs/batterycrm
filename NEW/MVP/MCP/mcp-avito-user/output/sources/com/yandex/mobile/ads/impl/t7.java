package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes8.dex */
public final class t7 {
    private static InstreamAdPlayerError.Reason a(Throwable th2) {
        InstreamAdPlayerError.Reason reason;
        if (th2 instanceof ExoPlaybackException) {
            InstreamAdPlayerError.Reason reasonB = b(th2);
            if (reasonB != null) {
                return reasonB;
            }
            Throwable cause = th2.getCause();
            InstreamAdPlayerError.Reason reasonA = cause != null ? a(cause) : null;
            if (reasonA != null) {
                return reasonA;
            }
            reason = InstreamAdPlayerError.Reason.UNKNOWN;
        } else if (th2 instanceof ExoTimeoutException) {
            reason = InstreamAdPlayerError.Reason.TIMEOUT;
        } else if (th2 instanceof IllegalSeekPositionException) {
            reason = InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION;
        } else if (th2 instanceof MediaCodecUtil.DecoderQueryException) {
            reason = InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR;
        } else if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
            reason = InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR;
        } else if (th2 instanceof MediaCodecVideoDecoderException) {
            InstreamAdPlayerError.Reason reasonB2 = b(th2);
            if (reasonB2 != null) {
                return reasonB2;
            }
            reason = InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR;
        } else if (th2 instanceof BehindLiveWindowException) {
            reason = InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR;
        } else if (th2 instanceof MediaCodec.CryptoException) {
            reason = InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED;
        } else if (th2 instanceof DrmSession.DrmSessionException) {
            Throwable cause2 = ((DrmSession.DrmSessionException) th2).getCause();
            reason = cause2 == null ? InstreamAdPlayerError.Reason.DRM_SESSION_ERROR : ((cause2 instanceof MediaDrmResetException) || (cause2 instanceof ResourceBusyException)) ? InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY : ((cause2 instanceof MediaCodec.CryptoException) || (cause2 instanceof KeysExpiredException)) ? InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED : InstreamAdPlayerError.Reason.DRM_SESSION_ERROR;
        } else if (th2 instanceof HttpDataSource.CleartextNotPermittedException) {
            reason = InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED;
        } else if (th2 instanceof HttpDataSource.InvalidResponseCodeException) {
            int i12 = ((HttpDataSource.InvalidResponseCodeException) th2).f347735e;
            reason = i12 != 401 ? i12 != 403 ? i12 != 404 ? InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN : InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND : InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN : InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED;
        } else if (th2 instanceof HttpDataSource.HttpDataSourceException) {
            reason = ((HttpDataSource.HttpDataSourceException) th2).getCause() instanceof SSLHandshakeException ? InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR : InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE;
        } else if (th2 instanceof ParserException) {
            reason = InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR;
        } else if (th2 instanceof Loader.UnexpectedLoaderException) {
            reason = InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR;
        } else {
            if (th2 instanceof AudioSink.ConfigurationException ? true : th2 instanceof AudioSink.InitializationException ? true : th2 instanceof DefaultAudioSink.InvalidAudioTrackTimestampException) {
                reason = InstreamAdPlayerError.Reason.AUDIO_ERROR;
            } else if (th2 instanceof SubtitleDecoderException) {
                reason = InstreamAdPlayerError.Reason.SUBTITLE_ERROR;
            } else {
                reason = th2 instanceof Cache.CacheException ? true : th2 instanceof CacheDataSink.CacheDataSinkException ? InstreamAdPlayerError.Reason.CACHE_ERROR : InstreamAdPlayerError.Reason.UNKNOWN;
            }
        }
        return reason;
    }

    private static InstreamAdPlayerError.Reason b(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause == null) {
            return null;
        }
        if (!(cause instanceof MediaCodec.CodecException) && !(cause instanceof IllegalStateException) && !(cause instanceof IllegalArgumentException)) {
            return null;
        }
        StackTraceElement[] stackTrace = cause.getStackTrace();
        if ((stackTrace.length == 0) || !stackTrace[0].isNativeMethod() || !kotlin.jvm.internal.L.f(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
            return null;
        }
        String methodName = stackTrace[0].getMethodName();
        if (methodName == null) {
            methodName = "";
        }
        if (methodName.equals("native_dequeueOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER;
        }
        if (methodName.equals("native_dequeueInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER;
        }
        if (methodName.equals("native_stop")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP;
        }
        if (methodName.equals("native_setSurface")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE;
        }
        if (methodName.equals("releaseOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER;
        }
        if (methodName.equals("native_queueSecureInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER;
        }
        if (cause instanceof MediaCodec.CodecException) {
            return InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN;
        }
        return null;
    }

    @Y61.k
    public static InstreamAdPlayerError c(@Y61.k Throwable th2) {
        return new InstreamAdPlayerError(a(th2), th2);
    }
}
