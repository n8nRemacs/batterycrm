package defpackage;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public abstract class cx8 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (xxg.a < 26 && xxg.b.equals("R9") && arrayList.size() == 1 && ((ow8) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(ow8.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new dj3(7, new zb8(20)));
        }
        int i = xxg.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((ow8) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new dj3(7, new zb8(21)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((ow8) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((ow8) arrayList.remove(0));
    }

    public static String b(gf6 gf6Var) {
        Pair pairD;
        if ("audio/eac3-joc".equals(gf6Var.v0)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(gf6Var.v0) || (pairD = d(gf6Var)) == null) {
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
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03fd A[PHI: r1
  0x03fd: PHI (r1v59 int) = (r1v58 int), (r1v61 int), (r1v62 int), (r1v63 int), (r1v64 int) binds: [B:283:0x03d6, B:287:0x03de, B:289:0x03e2, B:291:0x03e6, B:293:0x03ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0403 A[Catch: NumberFormatException -> 0x0411, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0411, blocks: (B:280:0x03b8, B:282:0x03cc, B:294:0x03ec, B:305:0x0403), top: B:633:0x03b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(defpackage.gf6 r33) {
        /*
            Method dump skipped, instructions count: 2692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx8.d(gf6):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        try {
            ww8 ww8Var = new ww8(str, z, z2);
            HashMap map = b;
            List list = (List) map.get(ww8Var);
            if (list != null) {
                return list;
            }
            int i = xxg.a;
            ArrayList arrayListF = f(ww8Var, i >= 21 ? new zw8(z, z2) : new kc3(24));
            if (z && arrayListF.isEmpty() && 21 <= i && i <= 23) {
                arrayListF = f(ww8Var, new kc3(24));
                if (!arrayListF.isEmpty()) {
                    String str2 = ((ow8) arrayListF.get(0)).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            a(str, arrayListF);
            wg7 wg7VarJ = wg7.j(arrayListF);
            map.put(ww8Var, wg7VarJ);
            return wg7VarJ;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList f(ww8 ww8Var, yw8 yw8Var) throws Exception {
        String strC;
        String str;
        String str2;
        ow8 ow8VarG;
        ww8 ww8Var2 = ww8Var;
        boolean z = ww8Var2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = ww8Var2.a;
            int iP = yw8Var.p();
            boolean zQ = yw8Var.q();
            int i = 0;
            while (i < iP) {
                MediaCodecInfo mediaCodecInfoB = yw8Var.b(i);
                int i2 = xxg.a;
                if (i2 < 29 || !mediaCodecInfoB.isAlias()) {
                    String name = mediaCodecInfoB.getName();
                    if (g(mediaCodecInfoB, name, zQ, str3) && (strC = c(mediaCodecInfoB, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strC);
                            boolean zE = yw8Var.e("tunneled-playback", strC, capabilitiesForType);
                            boolean zO = yw8Var.o("tunneled-playback", capabilitiesForType);
                            boolean z2 = ww8Var2.c;
                            if ((z2 || !zO) && (!z2 || zE)) {
                                boolean zE2 = yw8Var.e("secure-playback", strC, capabilitiesForType);
                                boolean zO2 = yw8Var.o("secure-playback", capabilitiesForType);
                                if ((z || !zO2) && (!z || zE2)) {
                                    boolean zIsHardwareAccelerated = i2 >= 29 ? mediaCodecInfoB.isHardwareAccelerated() : !h(mediaCodecInfoB, str3);
                                    h(mediaCodecInfoB, str3);
                                    if (i2 >= 29) {
                                        mediaCodecInfoB.isVendor();
                                    } else {
                                        String strG = dsi.g(mediaCodecInfoB.getName());
                                        if (!strG.startsWith("omx.google.") && !strG.startsWith("c2.android.")) {
                                            strG.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zQ && z == zE2) && (zQ || z)) {
                                        boolean z3 = zIsHardwareAccelerated;
                                        str2 = name;
                                        if (!zQ && zE2) {
                                            str = strC;
                                            try {
                                                arrayList.add(ow8.g(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, z3, true));
                                                break;
                                            } catch (Exception e) {
                                                e = e;
                                                if (xxg.a <= 23 || arrayList.isEmpty()) {
                                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 25 + str.length());
                                                    sb.append("Failed to query codec ");
                                                    sb.append(str2);
                                                    sb.append(" (");
                                                    sb.append(str);
                                                    sb.append(")");
                                                    Log.e("MediaCodecUtil", sb.toString());
                                                    throw e;
                                                }
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                                sb2.append("Skipping codec ");
                                                sb2.append(str2);
                                                sb2.append(" (failed to query capabilities)");
                                                Log.e("MediaCodecUtil", sb2.toString());
                                                i++;
                                                ww8Var2 = ww8Var;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        try {
                                            ow8VarG = ow8.g(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false);
                                            str2 = name;
                                        } catch (Exception e2) {
                                            e = e2;
                                            str2 = name;
                                        }
                                        try {
                                            arrayList.add(ow8VarG);
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = str;
                                            if (xxg.a <= 23) {
                                            }
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 25 + str.length());
                                            sb3.append("Failed to query codec ");
                                            sb3.append(str2);
                                            sb3.append(" (");
                                            sb3.append(str);
                                            sb3.append(")");
                                            Log.e("MediaCodecUtil", sb3.toString());
                                            throw e;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str = strC;
                            str2 = name;
                        }
                    }
                }
                i++;
                ww8Var2 = ww8Var;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e5);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = xxg.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = xxg.b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(xxg.c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = xxg.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = xxg.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(xxg.c))) {
            String str6 = xxg.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(xxg.c)) {
            String str7 = xxg.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && xxg.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (xxg.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (wz9.h(str)) {
            return true;
        }
        String strG = dsi.g(mediaCodecInfo.getName());
        if (strG.startsWith("arc.")) {
            return false;
        }
        if (strG.startsWith("omx.google.") || strG.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strG.startsWith("omx.sec.") && strG.contains(".sw.")) || strG.equals("omx.qcom.video.decoder.hevcswvdec") || strG.startsWith("c2.android.") || strG.startsWith("c2.google.")) {
            return true;
        }
        return (strG.startsWith("omx.") || strG.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            ow8 ow8Var = listE.isEmpty() ? null : (ow8) listE.get(0);
            if (ow8Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = ow8Var.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, xxg.a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }
}
