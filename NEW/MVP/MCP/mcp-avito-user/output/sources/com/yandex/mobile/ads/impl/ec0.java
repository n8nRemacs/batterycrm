package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import okhttp3.internal.http2.Http2;

/* loaded from: classes8.dex */
public final class ec0 {

    /* renamed from: i, reason: collision with root package name */
    private static final fc0 f384885i = tv0.e();

    /* renamed from: a, reason: collision with root package name */
    public final String f384886a;

    /* renamed from: b, reason: collision with root package name */
    public final String f384887b;

    /* renamed from: c, reason: collision with root package name */
    public final String f384888c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final MediaCodecInfo.CodecCapabilities f384889d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f384890e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f384891f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f384892g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f384893h;

    @j.k0
    public ec0(String str, String str2, String str3, @j.P MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z12, boolean z13, boolean z14) {
        this.f384886a = (String) db.a(str);
        this.f384887b = str2;
        this.f384888c = str3;
        this.f384889d = codecCapabilities;
        this.f384892g = z12;
        this.f384890e = z13;
        this.f384891f = z14;
        this.f384893h = qg0.d(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.ec0 a(java.lang.String r8, java.lang.String r9, java.lang.String r10, @j.P android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            com.yandex.mobile.ads.impl.ec0 r13 = new com.yandex.mobile.ads.impl.ec0
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L47
            int r1 = com.yandex.mobile.ads.impl.pc1.f388768a
            r2 = 19
            if (r1 < r2) goto L47
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L47
            r2 = 22
            if (r1 > r2) goto L45
            com.yandex.mobile.ads.impl.fc0 r1 = com.yandex.mobile.ads.impl.ec0.f384885i
            java.lang.String r2 = r1.d()
            java.lang.String r3 = com.yandex.mobile.ads.impl.pc1.f388771d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L30
            java.lang.String r2 = r1.c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L45
        L30:
            java.lang.String r2 = r1.e()
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L47
            java.lang.String r1 = r1.f()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L45
            goto L47
        L45:
            r6 = r0
            goto L48
        L47:
            r6 = r14
        L48:
            r1 = 21
            if (r11 == 0) goto L56
            int r2 = com.yandex.mobile.ads.impl.pc1.f388768a
            if (r2 < r1) goto L56
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L56:
            if (r15 != 0) goto L69
            if (r11 == 0) goto L67
            int r15 = com.yandex.mobile.ads.impl.pc1.f388768a
            if (r15 < r1) goto L67
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L67
            goto L69
        L67:
            r7 = r14
            goto L6a
        L69:
            r7 = r0
        L6a:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ec0.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.yandex.mobile.ads.impl.ec0");
    }

    public final boolean b(vw vwVar) {
        if (this.f384893h) {
            return this.f384890e;
        }
        Pair<Integer, Integer> pairB = jc0.b(vwVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f384886a;
    }

    public final boolean a(vw vwVar) {
        int i12;
        Pair<Integer, Integer> pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f384887b.equals(vwVar.f391181l) && !this.f384887b.equals(jc0.a(vwVar))) {
            return false;
        }
        int i13 = 16;
        if (vwVar.f391178i != null && (pairB = jc0.b(vwVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i14 = 8;
            if ("video/dolby-vision".equals(vwVar.f391181l)) {
                if ("video/avc".equals(this.f384887b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f384887b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f384893h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f384889d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (pc1.f388768a <= 23 && "video/x-vnd.on2.vp9".equals(this.f384887b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f384889d;
                    int iIntValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i14 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i14 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i14 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i14 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i14 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i14 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i14 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i14 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i14;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                        if ("video/hevc".equals(this.f384887b) && 2 == iIntValue) {
                            fc0 fc0Var = f384885i;
                            String strJ = fc0Var.j();
                            String str = pc1.f388769b;
                            if (strJ.equals(str) || fc0Var.a().equals(str)) {
                            }
                        }
                    }
                }
                StringBuilder sbA = Cif.a("codec.profileLevel, ");
                sbA.append(vwVar.f391178i);
                sbA.append(", ");
                sbA.append(this.f384888c);
                a(sbA.toString());
                return false;
            }
        }
        if (this.f384893h) {
            int i15 = vwVar.f391186q;
            if (i15 <= 0 || (i12 = vwVar.f391187r) <= 0) {
                return true;
            }
            if (pc1.f388768a >= 21) {
                return a(i15, i12, vwVar.f391188s);
            }
            boolean z12 = i15 * i12 <= jc0.a();
            if (!z12) {
                StringBuilder sbA2 = Cif.a("legacyFrameSize, ");
                sbA2.append(vwVar.f391186q);
                sbA2.append("x");
                sbA2.append(vwVar.f391187r);
                a(sbA2.toString());
            }
            return z12;
        }
        int i16 = pc1.f388768a;
        if (i16 >= 21) {
            int i17 = vwVar.f391195z;
            if (i17 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f384889d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                if (audioCapabilities == null) {
                    a("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i17)) {
                    a(ba.a("sampleRate.support, ", i17));
                    return false;
                }
            }
            int i18 = vwVar.f391194y;
            if (i18 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f384889d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    a("channelCount.aCaps");
                    return false;
                }
                String str2 = this.f384886a;
                String str3 = this.f384887b;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i16 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                    if ("audio/ac3".equals(str3)) {
                        i13 = 6;
                    } else if (!"audio/eac3".equals(str3)) {
                        i13 = 30;
                    }
                    ka0.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i13 + "]");
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i18) {
                    a(ba.a("channelCount.support, ", i18));
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (pc1.f388768a >= 29 && "video/x-vnd.on2.vp9".equals(this.f384887b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f384889d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final xn a(vw vwVar, vw vwVar2) {
        int i12 = !pc1.a(vwVar.f391181l, vwVar2.f391181l) ? 8 : 0;
        if (this.f384893h) {
            if (vwVar.f391189t != vwVar2.f391189t) {
                i12 |= 1024;
            }
            if (!this.f384890e && (vwVar.f391186q != vwVar2.f391186q || vwVar.f391187r != vwVar2.f391187r)) {
                i12 |= 512;
            }
            if (!pc1.a(vwVar.f391193x, vwVar2.f391193x)) {
                i12 |= 2048;
            }
            String str = this.f384886a;
            String str2 = pc1.f388771d;
            fc0 fc0Var = f384885i;
            if (str2.startsWith(fc0Var.i()) && fc0Var.g().equals(str) && !vwVar.a(vwVar2)) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new xn(this.f384886a, vwVar, vwVar2, vwVar.a(vwVar2) ? 3 : 2, 0);
            }
        } else {
            if (vwVar.f391194y != vwVar2.f391194y) {
                i12 |= 4096;
            }
            if (vwVar.f391195z != vwVar2.f391195z) {
                i12 |= 8192;
            }
            if (vwVar.f391164A != vwVar2.f391164A) {
                i12 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i12 == 0 && "audio/mp4a-latm".equals(this.f384887b)) {
                Pair<Integer, Integer> pairB = jc0.b(vwVar);
                Pair<Integer, Integer> pairB2 = jc0.b(vwVar2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new xn(this.f384886a, vwVar, vwVar2, 3, 0);
                    }
                }
            }
            if (!vwVar.a(vwVar2)) {
                i12 |= 32;
            }
            if ("audio/opus".equals(this.f384887b)) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new xn(this.f384886a, vwVar, vwVar2, 1, 0);
            }
        }
        return new xn(this.f384886a, vwVar, vwVar2, 0, i12);
    }

    @j.X
    public final boolean a(int i12, int i13, double d12) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f384889d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(pc1.a(i12, widthAlignment) * widthAlignment, pc1.a(i13, heightAlignment) * heightAlignment);
        int i14 = point.x;
        int i15 = point.y;
        if (d12 != -1.0d && d12 >= 1.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i14, i15, Math.floor(d12));
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i14, i15);
        }
        if (!zIsSizeSupported) {
            if (i12 < i13) {
                String str = this.f384886a;
                fc0 fc0Var = f384885i;
                if ((fc0Var.h().equals(str) && fc0Var.b().equals(pc1.f388769b)) ? false : true) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point(pc1.a(i13, widthAlignment2) * widthAlignment2, pc1.a(i12, heightAlignment2) * heightAlignment2);
                    int i16 = point2.x;
                    int i17 = point2.y;
                    if (d12 != -1.0d && d12 >= 1.0d) {
                        zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i16, i17, Math.floor(d12));
                    } else {
                        zIsSizeSupported2 = videoCapabilities.isSizeSupported(i16, i17);
                    }
                    if (zIsSizeSupported2) {
                        StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "sizeAndRate.rotated, ", "x", "x");
                        sbY.append(d12);
                        StringBuilder sbA = androidx.appcompat.app.r.A("AssumedSupport [", sbY.toString(), "] [");
                        sbA.append(this.f384886a);
                        sbA.append(", ");
                        sbA.append(this.f384887b);
                        sbA.append("] [");
                        sbA.append(pc1.f388772e);
                        sbA.append("]");
                        ka0.a("MediaCodecInfo", sbA.toString());
                    }
                }
            }
            StringBuilder sbY2 = androidx.appcompat.app.r.y(i12, i13, "sizeAndRate.support, ", "x", "x");
            sbY2.append(d12);
            a(sbY2.toString());
            return false;
        }
        return true;
    }

    @j.P
    @j.X
    public final Point a(int i12, int i13) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f384889d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(pc1.a(i12, widthAlignment) * widthAlignment, pc1.a(i13, heightAlignment) * heightAlignment);
    }

    private void a(String str) {
        StringBuilder sbA = androidx.appcompat.app.r.A("NoSupport [", str, "] [");
        sbA.append(this.f384886a);
        sbA.append(", ");
        sbA.append(this.f384887b);
        sbA.append("] [");
        sbA.append(pc1.f388772e);
        sbA.append("]");
        ka0.a("MediaCodecInfo", sbA.toString());
    }
}
