package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.foundation.H;
import androidx.media3.common.C23108t;
import androidx.media3.common.D;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import com.adjust.sdk.Constants;
import com.google.common.base.C37257c;
import com.google.common.collect.AbstractC37401r1;
import j.B;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

@SuppressLint({"InlinedApi"})
@J
/* loaded from: classes.dex */
public final class MediaCodecUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f49321a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    @B
    public static final HashMap<b, List<n>> f49322b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static int f49323c = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th2, a aVar) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f49324a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49325b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49326c;

        public b(String str, boolean z12, boolean z13) {
            this.f49324a = str;
            this.f49325b = z12;
            this.f49326c = z13;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f49324a, bVar.f49324a) && this.f49325b == bVar.f49325b && this.f49326c == bVar.f49326c;
        }

        public final int hashCode() {
            return ((H.d(31, 31, this.f49324a) + (this.f49325b ? 1231 : 1237)) * 31) + (this.f49326c ? 1231 : 1237);
        }
    }

    public interface c {
        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int b();

        boolean c();

        MediaCodecInfo d(int i12);

        boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    public static final class d implements c {
        public d() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final int b() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean c() {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final MediaCodecInfo d(int i12) {
            return MediaCodecList.getCodecInfoAt(i12);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    @X
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f49327a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public MediaCodecInfo[] f49328b;

        public e(boolean z12, boolean z13) {
            this.f49327a = (z12 || z13) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final int b() {
            if (this.f49328b == null) {
                this.f49328b = new MediaCodecList(this.f49327a).getCodecInfos();
            }
            return this.f49328b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean c() {
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final MediaCodecInfo d(int i12) {
            if (this.f49328b == null) {
                this.f49328b = new MediaCodecList(this.f49327a).getCodecInfos();
            }
            return this.f49328b[i12];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    public interface f<T> {
        int a(T t12);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (M.f47887a < 26 && M.f47888b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f49386a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new s(new q(0)));
        }
        int i12 = M.f47887a;
        if (i12 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).f49386a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new s(new q(1)));
            }
        }
        if (i12 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f49386a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    @P
    public static String b(C23108t c23108t) {
        Pair<Integer, Integer> pairD;
        if ("audio/eac3-joc".equals(c23108t.f47757m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c23108t.f47757m) || (pairD = d(c23108t)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    @P
    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036f A[PHI: r1
  0x036f: PHI (r1v60 int) = (r1v59 int), (r1v62 int), (r1v63 int), (r1v64 int), (r1v65 int) binds: [B:246:0x0346, B:249:0x034c, B:251:0x0350, B:253:0x0354, B:255:0x0358] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> d(androidx.media3.common.C23108t r32) {
        /*
            Method dump skipped, instructions count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.d(androidx.media3.common.t):android.util.Pair");
    }

    public static synchronized List<n> e(String str, boolean z12, boolean z13) {
        try {
            b bVar = new b(str, z12, z13);
            HashMap<b, List<n>> map = f49322b;
            List<n> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            int i12 = M.f47887a;
            ArrayList<n> arrayListF = f(bVar, i12 >= 21 ? new e(z12, z13) : new d());
            if (z12 && arrayListF.isEmpty() && 21 <= i12 && i12 <= 23) {
                arrayListF = f(bVar, new d());
                if (!arrayListF.isEmpty()) {
                    String str2 = arrayListF.get(0).f49386a;
                    androidx.media3.common.util.s.g();
                }
            }
            a(str, arrayListF);
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(arrayListF);
            map.put(bVar, abstractC37401r1V);
            return abstractC37401r1V;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ArrayList<n> f(b bVar, c cVar) throws Exception {
        String strC;
        b bVar2 = bVar;
        c cVar2 = cVar;
        try {
            ArrayList<n> arrayList = new ArrayList<>();
            String str = bVar2.f49324a;
            int iB2 = cVar.b();
            boolean zC2 = cVar.c();
            int i12 = 0;
            while (i12 < iB2) {
                MediaCodecInfo mediaCodecInfoD = cVar2.d(i12);
                int i13 = M.f47887a;
                if (i13 < 29 || !mediaCodecInfoD.isAlias()) {
                    String name = mediaCodecInfoD.getName();
                    if (g(mediaCodecInfoD, name, zC2, str) && (strC = c(mediaCodecInfoD, name, str)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoD.getCapabilitiesForType(strC);
                            boolean zE2 = cVar2.e("tunneled-playback", strC, capabilitiesForType);
                            boolean zA2 = cVar2.a("tunneled-playback", capabilitiesForType);
                            boolean z12 = bVar2.f49326c;
                            if ((z12 || !zA2) && (!z12 || zE2)) {
                                boolean zE3 = cVar2.e("secure-playback", strC, capabilitiesForType);
                                boolean zA3 = cVar2.a("secure-playback", capabilitiesForType);
                                boolean z13 = bVar2.f49325b;
                                if ((z13 || !zA3) && (!z13 || zE3)) {
                                    boolean zIsHardwareAccelerated = i13 >= 29 ? mediaCodecInfoD.isHardwareAccelerated() : !h(mediaCodecInfoD, str);
                                    h(mediaCodecInfoD, str);
                                    if (i13 >= 29) {
                                        mediaCodecInfoD.isVendor();
                                    } else {
                                        String strB = C37257c.b(mediaCodecInfoD.getName());
                                        if (!strB.startsWith("omx.google.") && !strB.startsWith("c2.android.")) {
                                            strB.startsWith("c2.google.");
                                        }
                                    }
                                    if ((zC2 && z13 == zE3) || (!zC2 && !z13)) {
                                        arrayList.add(n.h(name, str, strC, capabilitiesForType, zIsHardwareAccelerated, false));
                                    } else if (!zC2 && zE3) {
                                        arrayList.add(n.h(name + ".secure", str, strC, capabilitiesForType, zIsHardwareAccelerated, true));
                                        return arrayList;
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            if (M.f47887a > 23 || arrayList.isEmpty()) {
                                androidx.media3.common.util.s.c();
                                throw e12;
                            }
                            androidx.media3.common.util.s.c();
                        }
                    }
                }
                i12++;
                bVar2 = bVar;
                cVar2 = cVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new DecoderQueryException(e13, null);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z12, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z12 && str.endsWith(".secure"))) {
            return false;
        }
        int i12 = M.f47887a;
        if (i12 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i12 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = M.f47888b;
            if ("a70".equals(str3) || ("Xiaomi".equals(M.f47889c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i12 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = M.f47888b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i12 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = M.f47888b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i12 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(M.f47889c))) {
            String str6 = M.f47888b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i12 <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(M.f47889c)) {
            String str7 = M.f47888b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i12 <= 19 && M.f47888b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i12 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (M.f47887a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (D.g(str)) {
            return true;
        }
        String strB = C37257c.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        if (strB.startsWith("omx.google.") || strB.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strB.startsWith("omx.sec.") && strB.contains(".sw.")) || strB.equals("omx.qcom.video.decoder.hevcswvdec") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
            return true;
        }
        return (strB.startsWith("omx.") || strB.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i12;
        if (f49323c == -1) {
            int iMax = 0;
            List<n> listE = e("video/avc", false, false);
            n nVar = listE.isEmpty() ? null : listE.get(0);
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f49389d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i13 = codecProfileLevelArr[iMax].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i12 = 101376;
                                break;
                            case 64:
                                i12 = 202752;
                                break;
                            case 128:
                            case 256:
                                i12 = 414720;
                                break;
                            case 512:
                                i12 = 921600;
                                break;
                            case 1024:
                                i12 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i12 = 2097152;
                                break;
                            case 8192:
                                i12 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i12 = 5652480;
                                break;
                            case 32768:
                            case AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR /* 65536 */:
                                i12 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i12 = 35651584;
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                    } else {
                        i12 = 25344;
                    }
                    iMax2 = Math.max(i12, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, M.f47887a >= 21 ? 345600 : 172800);
            }
            f49323c = iMax;
        }
        return f49323c;
    }
}
