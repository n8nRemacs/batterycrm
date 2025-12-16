package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.z;
import j.P;
import j.X;
import j.k0;
import okhttp3.internal.http2.Http2;

/* compiled from: MediaCodecInfo.java */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f345608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f345609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f345610c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final MediaCodecInfo.CodecCapabilities f345611d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f345612e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f345613f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f345614g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f345615h;

    @k0
    public m(String str, String str2, String str3, @P MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z12, boolean z13, boolean z14) {
        str.getClass();
        this.f345608a = str;
        this.f345609b = str2;
        this.f345610c = str3;
        this.f345611d = codecCapabilities;
        this.f345614g = z12;
        this.f345612e = z13;
        this.f345613f = z14;
        this.f345615h = z.m(str2);
    }

    @X
    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i12, int i13, double d12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(U.g(i12, widthAlignment) * widthAlignment, U.g(i13, heightAlignment) * heightAlignment);
        int i14 = point.x;
        int i15 = point.y;
        return (d12 == -1.0d || d12 < 1.0d) ? videoCapabilities.isSizeSupported(i14, i15) : videoCapabilities.areSizeAndRateSupported(i14, i15, Math.floor(d12));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.mediacodec.m f(java.lang.String r9, java.lang.String r10, java.lang.String r11, @j.P android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            com.google.android.exoplayer2.mediacodec.m r8 = new com.google.android.exoplayer2.mediacodec.m
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L3d
            int r2 = com.google.android.exoplayer2.util.U.f348106a
            r3 = 19
            if (r2 < r3) goto L3d
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            r3 = 22
            if (r2 > r3) goto L3b
            java.lang.String r2 = com.google.android.exoplayer2.util.U.f348109d
            java.lang.String r3 = "ODROID-XU3"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L2a
            java.lang.String r3 = "Nexus 10"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3b
        L2a:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L3d
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L3b
            goto L3d
        L3b:
            r6 = r1
            goto L3e
        L3d:
            r6 = r0
        L3e:
            r2 = 21
            if (r12 == 0) goto L4c
            int r3 = com.google.android.exoplayer2.util.U.f348106a
            if (r3 < r2) goto L4c
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r12.isFeatureSupported(r3)
        L4c:
            if (r14 != 0) goto L5f
            if (r12 == 0) goto L5d
            int r14 = com.google.android.exoplayer2.util.U.f348106a
            if (r14 < r2) goto L5d
            java.lang.String r14 = "secure-playback"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L5d
            goto L5f
        L5d:
            r7 = r0
            goto L60
        L5f:
            r7 = r1
        L60:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.m.f(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):com.google.android.exoplayer2.mediacodec.m");
    }

    public final com.google.android.exoplayer2.decoder.h b(I i12, I i13) {
        int i14 = !U.a(i12.f343476m, i13.f343476m) ? 8 : 0;
        if (this.f345615h) {
            if (i12.f343484u != i13.f343484u) {
                i14 |= 1024;
            }
            if (!this.f345612e && (i12.f343481r != i13.f343481r || i12.f343482s != i13.f343482s)) {
                i14 |= 512;
            }
            if (!U.a(i12.f343488y, i13.f343488y)) {
                i14 |= 2048;
            }
            if (U.f348109d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f345608a) && !i12.c(i13)) {
                i14 |= 2;
            }
            if (i14 == 0) {
                return new com.google.android.exoplayer2.decoder.h(this.f345608a, i12, i13, i12.c(i13) ? 3 : 2, 0);
            }
        } else {
            if (i12.f343489z != i13.f343489z) {
                i14 |= 4096;
            }
            if (i12.f343458A != i13.f343458A) {
                i14 |= 8192;
            }
            if (i12.f343459B != i13.f343459B) {
                i14 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str = this.f345609b;
            if (i14 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair<Integer, Integer> pairD = MediaCodecUtil.d(i12);
                Pair<Integer, Integer> pairD2 = MediaCodecUtil.d(i13);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.google.android.exoplayer2.decoder.h(this.f345608a, i12, i13, 3, 0);
                    }
                }
            }
            if (!i12.c(i13)) {
                i14 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i14 |= 2;
            }
            if (i14 == 0) {
                return new com.google.android.exoplayer2.decoder.h(this.f345608a, i12, i13, 1, 0);
            }
        }
        return new com.google.android.exoplayer2.decoder.h(this.f345608a, i12, i13, 0, i14);
    }

    public final boolean c(I i12) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities2;
        int i13;
        Pair<Integer, Integer> pairD;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = i12.f343476m;
        String str2 = this.f345609b;
        if (!str2.equals(str) && !str2.equals(MediaCodecUtil.b(i12))) {
            return false;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f345611d;
        String str3 = i12.f343473j;
        int i14 = 16;
        boolean z12 = this.f345615h;
        if (str3 != null && (pairD = MediaCodecUtil.d(i12)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            int i15 = 2;
            if ("video/dolby-vision".equals(i12.f343476m)) {
                if ("video/avc".equals(str2)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str2)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (z12 || iIntValue == 42) {
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (U.f348106a <= 23 && "video/x-vnd.on2.vp9".equals(str2) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i15 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i15 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i15 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i15 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i15 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i15 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i15 = 16;
                    } else if (iIntValue3 >= 3600000) {
                        i15 = 8;
                    } else if (iIntValue3 >= 1800000) {
                        i15 = 4;
                    } else if (iIntValue3 < 800000) {
                        i15 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i15;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile != iIntValue || codecProfileLevel2.level < iIntValue2) {
                    }
                }
                int i16 = U.f348106a;
                return false;
            }
        }
        if (z12) {
            int i17 = i12.f343481r;
            if (i17 <= 0 || (i13 = i12.f343482s) <= 0) {
                return true;
            }
            return U.f348106a >= 21 ? e(i17, i13, i12.f343483t) : i17 * i13 <= MediaCodecUtil.i();
        }
        int i18 = U.f348106a;
        if (i18 < 21) {
            return true;
        }
        int i19 = i12.f343458A;
        if (i19 == -1 || (codecCapabilities != null && (audioCapabilities2 = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities2.isSampleRateSupported(i19))) {
            int i22 = i12.f343489z;
            if (i22 == -1) {
                return true;
            }
            if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null) {
                int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i18 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i14 = 6;
                    } else if (!"audio/eac3".equals(str2)) {
                        i14 = 30;
                    }
                    maxInputChannelCount = i14;
                }
                if (maxInputChannelCount >= i22) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(I i12) {
        if (this.f345615h) {
            return this.f345612e;
        }
        Pair<Integer, Integer> pairD = MediaCodecUtil.d(i12);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    @X
    public final boolean e(int i12, int i13, double d12) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f345611d;
        if (codecCapabilities == null) {
            int i14 = U.f348106a;
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            int i15 = U.f348106a;
            return false;
        }
        if (a(videoCapabilities, i12, i13, d12)) {
            return true;
        }
        if (i12 >= i13 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f345608a) && "mcv5a".equals(U.f348107b)) || !a(videoCapabilities, i13, i12, d12))) {
            int i16 = U.f348106a;
            return false;
        }
        int i17 = U.f348106a;
        return true;
    }

    public final String toString() {
        return this.f345608a;
    }
}
