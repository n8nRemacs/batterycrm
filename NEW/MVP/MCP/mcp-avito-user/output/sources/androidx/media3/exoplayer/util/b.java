package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23108t;
import androidx.media3.common.G;
import androidx.media3.common.H;
import androidx.media3.common.Metadata;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.V;
import androidx.media3.common.X;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.analytics.b;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23171w;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.common.collect.AbstractC37401r1;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

/* compiled from: EventLogger.java */
/* loaded from: classes.dex */
public class b implements androidx.media3.exoplayer.analytics.b {

    /* renamed from: d, reason: collision with root package name */
    public static final NumberFormat f50169d;

    /* renamed from: a, reason: collision with root package name */
    public final P.d f50170a = new P.d();

    /* renamed from: b, reason: collision with root package name */
    public final P.b f50171b = new P.b();

    /* renamed from: c, reason: collision with root package name */
    public final long f50172c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f50169d = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String R(long j12) {
        if (j12 == -9223372036854775807L) {
            return "?";
        }
        return f50169d.format(j12 / 1000.0f);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void A(b.C1823b c1823b, int i12) {
        T(c1823b, "repeatMode", i12 != 0 ? i12 != 1 ? i12 != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void B(b.C1823b c1823b, String str) {
        T(c1823b, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void C(b.C1823b c1823b, int i12, int i13) {
        T(c1823b, "surfaceSize", i12 + ", " + i13);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void D(b.C1823b c1823b, int i12) {
        T(c1823b, "drmSessionAcquired", "state=" + i12);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void E(b.C1823b c1823b, int i12) {
        T(c1823b, VoiceInfo.STATE, i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void F(b.C1823b c1823b, G g12) {
        T(c1823b, "playbackParameters", g12.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void G(b.C1823b c1823b, String str) {
        T(c1823b, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void H(b.C1823b c1823b) {
        S(c1823b, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void I(b.C1823b c1823b, Object obj) {
        T(c1823b, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void J(b.C1823b c1823b, PlaybackException playbackException) {
        P(c1823b, "playerFailed", null, playbackException);
        s.c();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void K(b.C1823b c1823b, C23138g c23138g) {
        S(c1823b, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void L(b.C1823b c1823b, int i12) {
        P p12 = c1823b.f48633b;
        int iP2 = p12.p();
        int iW2 = p12.w();
        Q(c1823b);
        s.b();
        for (int i13 = 0; i13 < Math.min(iP2, 3); i13++) {
            P.b bVar = this.f50171b;
            p12.n(i13, bVar, false);
            R(M.Q(bVar.f47382e));
            s.b();
        }
        if (iP2 > 3) {
            s.b();
        }
        for (int i14 = 0; i14 < Math.min(iW2, 3); i14++) {
            P.d dVar = this.f50170a;
            p12.v(i14, dVar);
            R(M.Q(dVar.f47420o));
            s.b();
        }
        if (iW2 > 3) {
            s.b();
        }
        s.b();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void M(b.C1823b c1823b, int i12, long j12, long j13) {
        P(c1823b, "audioTrackUnderrun", i12 + ", " + j12 + ", " + j13, null);
        s.c();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void N(b.C1823b c1823b, String str) {
        T(c1823b, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void O(b.C1823b c1823b) {
        S(c1823b, "audioEnabled");
    }

    public final String P(b.C1823b c1823b, String str, @j.P String str2, @j.P Exception exc) {
        String str3;
        StringBuilder sbZ = r.z(str, " [");
        sbZ.append(Q(c1823b));
        String string = sbZ.toString();
        if (exc instanceof PlaybackException) {
            StringBuilder sbZ2 = r.z(string, ", errorCode=");
            int i12 = ((PlaybackException) exc).f47432b;
            if (i12 == 5001) {
                str3 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            } else if (i12 == 5002) {
                str3 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
            } else if (i12 == 7000) {
                str3 = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
            } else if (i12 != 7001) {
                switch (i12) {
                    case 1000:
                        str3 = "ERROR_CODE_UNSPECIFIED";
                        break;
                    case 1001:
                        str3 = "ERROR_CODE_REMOTE_ERROR";
                        break;
                    case 1002:
                        str3 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        break;
                    case ErrorCodes.MALFORMED_URL_EXCEPTION /* 1003 */:
                        str3 = "ERROR_CODE_TIMEOUT";
                        break;
                    case ErrorCodes.PROTOCOL_EXCEPTION /* 1004 */:
                        str3 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        break;
                    default:
                        switch (i12) {
                            case 2000:
                                str3 = "ERROR_CODE_IO_UNSPECIFIED";
                                break;
                            case 2001:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                break;
                            case 2002:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                break;
                            case 2003:
                                str3 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                break;
                            case 2004:
                                str3 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                break;
                            case 2005:
                                str3 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                break;
                            case 2006:
                                str3 = "ERROR_CODE_IO_NO_PERMISSION";
                                break;
                            case 2007:
                                str3 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                break;
                            case 2008:
                                str3 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                break;
                            default:
                                switch (i12) {
                                    case 3001:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        break;
                                    case 3002:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        break;
                                    case 3003:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        break;
                                    case 3004:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        break;
                                    default:
                                        switch (i12) {
                                            case 4001:
                                                str3 = "ERROR_CODE_DECODER_INIT_FAILED";
                                                break;
                                            case 4002:
                                                str3 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                break;
                                            case 4003:
                                                str3 = "ERROR_CODE_DECODING_FAILED";
                                                break;
                                            case 4004:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                break;
                                            case 4005:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                break;
                                            default:
                                                switch (i12) {
                                                    case 6000:
                                                        str3 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                        break;
                                                    case AuthCode.StatusCode.WAITING_CONNECT /* 6001 */:
                                                        str3 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                        break;
                                                    case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                                        str3 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                        break;
                                                    case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                                        str3 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                        break;
                                                    case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                        break;
                                                    case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                                        str3 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                        break;
                                                    case AuthCode.StatusCode.PERMISSION_EXPIRED /* 6006 */:
                                                        str3 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                        break;
                                                    case 6007:
                                                        str3 = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                        break;
                                                    case 6008:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                        break;
                                                    default:
                                                        if (i12 < 1000000) {
                                                            str3 = "invalid error code";
                                                            break;
                                                        } else {
                                                            str3 = "custom error code";
                                                            break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                str3 = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
            }
            sbZ2.append(str3);
            string = sbZ2.toString();
        }
        if (str2 != null) {
            string = r.r(string, ", ", str2);
        }
        String strE = s.e(exc);
        if (!TextUtils.isEmpty(strE)) {
            StringBuilder sbZ3 = r.z(string, "\n  ");
            sbZ3.append(strE.replace("\n", "\n  "));
            sbZ3.append('\n');
            string = sbZ3.toString();
        }
        return r.q(string, "]");
    }

    public final String Q(b.C1823b c1823b) {
        String string = "window=" + c1823b.f48634c;
        A.b bVar = c1823b.f48635d;
        if (bVar != null) {
            StringBuilder sbZ = r.z(string, ", period=");
            sbZ.append(c1823b.f48633b.g(bVar.f47212a));
            string = sbZ.toString();
            if (bVar.a()) {
                StringBuilder sbZ2 = r.z(string, ", adGroup=");
                sbZ2.append(bVar.f47213b);
                StringBuilder sbZ3 = r.z(sbZ2.toString(), ", ad=");
                sbZ3.append(bVar.f47214c);
                string = sbZ3.toString();
            }
        }
        return "eventTime=" + R(c1823b.f48632a - this.f50172c) + ", mediaPos=" + R(c1823b.f48636e) + ", " + string;
    }

    public final void S(b.C1823b c1823b, String str) {
        P(c1823b, str, null, null);
        s.b();
    }

    public final void T(b.C1823b c1823b, String str, String str2) {
        P(c1823b, str, str2, null);
        s.b();
    }

    public final void U(Metadata metadata, String str) {
        int i12 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f47361b;
            if (i12 >= entryArr.length) {
                return;
            }
            Objects.toString(entryArr[i12]);
            s.b();
            i12++;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void a(b.C1823b c1823b, boolean z12) {
        T(c1823b, "isPlaying", Boolean.toString(z12));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void b(b.C1823b c1823b, C23108t c23108t) {
        T(c1823b, "audioInputFormat", C23108t.l(c23108t));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void c(b.C1823b c1823b) {
        S(c1823b, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void d(b.C1823b c1823b, Exception exc) {
        P(c1823b, "internalError", "drmSessionManagerError", exc);
        s.c();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void e(b.C1823b c1823b, int i12) {
        Q(c1823b);
        s.b();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void f(b.C1823b c1823b, boolean z12) {
        T(c1823b, "shuffleModeEnabled", Boolean.toString(z12));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void g(b.C1823b c1823b, int i12) {
        T(c1823b, "playbackSuppressionReason", i12 != 0 ? i12 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void i(b.C1823b c1823b, int i12) {
        T(c1823b, "droppedFrames", Integer.toString(i12));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void j(b.C1823b c1823b, V v12) {
        Metadata metadata;
        Q(c1823b);
        s.b();
        AbstractC37401r1<V.a> abstractC37401r1A = v12.a();
        for (int i12 = 0; i12 < abstractC37401r1A.size(); i12++) {
            V.a aVar = abstractC37401r1A.get(i12);
            s.b();
            for (int i13 = 0; i13 < aVar.f47544b; i13++) {
                aVar.b(i13);
                M.s(aVar.f47547e[i13]);
                C23108t.l(aVar.a(i13));
                s.b();
            }
            s.b();
        }
        boolean z12 = false;
        for (int i14 = 0; !z12 && i14 < abstractC37401r1A.size(); i14++) {
            V.a aVar2 = abstractC37401r1A.get(i14);
            for (int i15 = 0; !z12 && i15 < aVar2.f47544b; i15++) {
                if (aVar2.b(i15) && (metadata = aVar2.a(i15).f47755k) != null && metadata.c() > 0) {
                    s.b();
                    U(metadata, "    ");
                    s.b();
                    z12 = true;
                }
            }
        }
        s.b();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void k(b.C1823b c1823b, X x12) {
        T(c1823b, "videoSize", x12.f47555b + ", " + x12.f47556c);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void l(b.C1823b c1823b, C23171w c23171w) {
        T(c1823b, "downstreamFormat", C23108t.l(c23171w.f49854c));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void n(b.C1823b c1823b) {
        S(c1823b, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void o(b.C1823b c1823b, boolean z12) {
        T(c1823b, "loading", Boolean.toString(z12));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void p(b.C1823b c1823b) {
        S(c1823b, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void q(b.C1823b c1823b, Metadata metadata) {
        Q(c1823b);
        s.b();
        U(metadata, "  ");
        s.b();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void r(b.C1823b c1823b, boolean z12) {
        T(c1823b, "skipSilenceEnabled", Boolean.toString(z12));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void s(b.C1823b c1823b) {
        S(c1823b, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void t(b.C1823b c1823b, C23108t c23108t) {
        T(c1823b, "videoInputFormat", C23108t.l(c23108t));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void u(b.C1823b c1823b, int i12, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z12);
        sb2.append(", ");
        sb2.append(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        T(c1823b, "playWhenReady", sb2.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void v(b.C1823b c1823b, C23171w c23171w, IOException iOException) {
        P(c1823b, "internalError", "loadError", iOException);
        s.c();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void w(b.C1823b c1823b, C23091e c23091e) {
        T(c1823b, "audioAttributes", c23091e.f47651b + "," + c23091e.f47652c + "," + c23091e.f47653d + "," + c23091e.f47654e);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void x(b.C1823b c1823b, H.k kVar, H.k kVar2, int i12) {
        StringBuilder sb2 = new StringBuilder("reason=");
        sb2.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION");
        sb2.append(", PositionInfo:old [mediaItem=");
        sb2.append(kVar.f47255c);
        sb2.append(", period=");
        sb2.append(kVar.f47258f);
        sb2.append(", pos=");
        sb2.append(kVar.f47259g);
        int i13 = kVar.f47261i;
        if (i13 != -1) {
            sb2.append(", contentPos=");
            sb2.append(kVar.f47260h);
            sb2.append(", adGroup=");
            sb2.append(i13);
            sb2.append(", ad=");
            sb2.append(kVar.f47262j);
        }
        sb2.append("], PositionInfo:new [mediaItem=");
        sb2.append(kVar2.f47255c);
        sb2.append(", period=");
        sb2.append(kVar2.f47258f);
        sb2.append(", pos=");
        sb2.append(kVar2.f47259g);
        int i14 = kVar2.f47261i;
        if (i14 != -1) {
            sb2.append(", contentPos=");
            sb2.append(kVar2.f47260h);
            sb2.append(", adGroup=");
            sb2.append(i14);
            sb2.append(", ad=");
            sb2.append(kVar2.f47262j);
        }
        sb2.append("]");
        T(c1823b, "positionDiscontinuity", sb2.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void y(b.C1823b c1823b, float f12) {
        T(c1823b, "volume", Float.toString(f12));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void z(b.C1823b c1823b, String str) {
        T(c1823b, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @J
    public final void h(int i12, long j12, b.C1823b c1823b) {
    }
}
