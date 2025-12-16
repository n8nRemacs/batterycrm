package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.z;
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
/* loaded from: classes6.dex */
public final class MediaCodecUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f345543a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    @B
    public static final HashMap<b, List<m>> f345544b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static int f345545c = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th2, a aVar) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f345546a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f345547b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f345548c;

        public b(String str, boolean z12, boolean z13) {
            this.f345546a = str;
            this.f345547b = z12;
            this.f345548c = z13;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f345546a, bVar.f345546a) && this.f345547b == bVar.f345547b && this.f345548c == bVar.f345548c;
        }

        public final int hashCode() {
            return ((H.d(31, 31, this.f345546a) + (this.f345547b ? 1231 : 1237)) * 31) + (this.f345548c ? 1231 : 1237);
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

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final int b() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final boolean c() {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final MediaCodecInfo d(int i12) {
            return MediaCodecList.getCodecInfoAt(i12);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    @X
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f345549a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public MediaCodecInfo[] f345550b;

        public e(boolean z12, boolean z13) {
            this.f345549a = (z12 || z13) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final int b() {
            if (this.f345550b == null) {
                this.f345550b = new MediaCodecList(this.f345549a).getCodecInfos();
            }
            return this.f345550b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final boolean c() {
            return true;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final MediaCodecInfo d(int i12) {
            if (this.f345550b == null) {
                this.f345550b = new MediaCodecList(this.f345549a).getCodecInfos();
            }
            return this.f345550b[i12];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    public interface f<T> {
        int a(T t12);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (U.f348106a < 26 && U.f348107b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f345608a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.f("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new q(new o(0)));
        }
        int i12 = U.f348106a;
        if (i12 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f345608a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new q(new o(1)));
            }
        }
        if (i12 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f345608a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    @P
    public static String b(I i12) {
        Pair<Integer, Integer> pairD;
        if ("audio/eac3-joc".equals(i12.f343476m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(i12.f343476m) || (pairD = d(i12)) == null) {
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
    /* JADX WARN: Removed duplicated region for block: B:154:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0343 A[PHI: r1
  0x0343: PHI (r1v48 int) = (r1v47 int), (r1v50 int), (r1v51 int), (r1v52 int), (r1v53 int) binds: [B:246:0x0319, B:250:0x0321, B:252:0x0325, B:254:0x0329, B:256:0x032d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:566:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> d(com.google.android.exoplayer2.I r26) {
        /*
            Method dump skipped, instructions count: 2244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.d(com.google.android.exoplayer2.I):android.util.Pair");
    }

    public static synchronized List<m> e(String str, boolean z12, boolean z13) {
        try {
            b bVar = new b(str, z12, z13);
            HashMap<b, List<m>> map = f345544b;
            List<m> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            int i12 = U.f348106a;
            ArrayList<m> arrayListF = f(bVar, i12 >= 21 ? new e(z12, z13) : new d());
            if (z12 && arrayListF.isEmpty() && 21 <= i12 && i12 <= 23) {
                arrayListF = f(bVar, new d());
                if (!arrayListF.isEmpty()) {
                    String str2 = arrayListF.get(0).f345608a;
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

    public static ArrayList<m> f(b bVar, c cVar) throws Exception {
        String strC;
        b bVar2 = bVar;
        c cVar2 = cVar;
        try {
            ArrayList<m> arrayList = new ArrayList<>();
            String str = bVar2.f345546a;
            int iB2 = cVar.b();
            boolean zC2 = cVar.c();
            int i12 = 0;
            while (i12 < iB2) {
                MediaCodecInfo mediaCodecInfoD = cVar2.d(i12);
                int i13 = U.f348106a;
                if (i13 < 29 || !mediaCodecInfoD.isAlias()) {
                    String name = mediaCodecInfoD.getName();
                    if (g(mediaCodecInfoD, name, zC2, str) && (strC = c(mediaCodecInfoD, name, str)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoD.getCapabilitiesForType(strC);
                            boolean zE2 = cVar2.e("tunneled-playback", strC, capabilitiesForType);
                            boolean zA2 = cVar2.a("tunneled-playback", capabilitiesForType);
                            boolean z12 = bVar2.f345548c;
                            if ((z12 || !zA2) && (!z12 || zE2)) {
                                boolean zE3 = cVar2.e("secure-playback", strC, capabilitiesForType);
                                boolean zA3 = cVar2.a("secure-playback", capabilitiesForType);
                                boolean z13 = bVar2.f345547b;
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
                                        arrayList.add(m.f(name, str, strC, capabilitiesForType, zIsHardwareAccelerated, false));
                                    } else if (!zC2 && zE3) {
                                        arrayList.add(m.f(name + ".secure", str, strC, capabilitiesForType, zIsHardwareAccelerated, true));
                                        return arrayList;
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            if (U.f348106a > 23 || arrayList.isEmpty()) {
                                throw e12;
                            }
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
        int i12 = U.f348106a;
        if (i12 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i12 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = U.f348107b;
            if ("a70".equals(str3) || ("Xiaomi".equals(U.f348108c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i12 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = U.f348107b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i12 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = U.f348107b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i12 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(U.f348108c))) {
            String str6 = U.f348107b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i12 <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(U.f348108c)) {
            String str7 = U.f348107b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i12 <= 19 && U.f348107b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i12 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (U.f348106a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (z.k(str)) {
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
        if (f345545c == -1) {
            int iMax = 0;
            List<m> listE = e("video/avc", false, false);
            m mVar = listE.isEmpty() ? null : listE.get(0);
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f345611d;
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
                iMax = Math.max(iMax2, U.f348106a >= 21 ? 345600 : 172800);
            }
            f345545c = iMax;
        }
        return f345545c;
    }
}
