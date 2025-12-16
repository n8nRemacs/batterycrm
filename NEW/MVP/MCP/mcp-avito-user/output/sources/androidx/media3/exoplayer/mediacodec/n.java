package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.C23108t;
import androidx.media3.common.D;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.C23139h;
import j.InterfaceC42164u;
import j.P;
import j.X;
import j.k0;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* compiled from: MediaCodecInfo.java */
@J
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f49386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49388c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final MediaCodecInfo.CodecCapabilities f49389d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49390e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49391f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f49392g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f49393h;

    /* compiled from: MediaCodecInfo.java */
    @X
    public static final class a {
        @InterfaceC42164u
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i12, int i13, double d12) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                String str = M.f47888b;
                if (!str.equals("sabrina") && !str.equals("boreal")) {
                    String str2 = M.f47890d;
                    if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                        m.d();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointA = m.a(i12, i13, (int) d12);
                        for (int i14 = 0; i14 < supportedPerformancePoints.size(); i14++) {
                            if (m.b(supportedPerformancePoints.get(i14)).covers(performancePointA)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 0;
        }
    }

    @k0
    public n(String str, String str2, String str3, @P MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z12, boolean z13, boolean z14) {
        str.getClass();
        this.f49386a = str;
        this.f49387b = str2;
        this.f49388c = str3;
        this.f49389d = codecCapabilities;
        this.f49392g = z12;
        this.f49390e = z13;
        this.f49391f = z14;
        this.f49393h = "video".equals(D.e(str2));
    }

    @X
    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i12, int i13, double d12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(M.g(i12, widthAlignment) * widthAlignment, M.g(i13, heightAlignment) * heightAlignment);
        int i14 = point.x;
        int i15 = point.y;
        return (d12 == -1.0d || d12 < 1.0d) ? videoCapabilities.isSizeSupported(i14, i15) : videoCapabilities.areSizeAndRateSupported(i14, i15, Math.floor(d12));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.exoplayer.mediacodec.n h(java.lang.String r9, java.lang.String r10, java.lang.String r11, @j.P android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            androidx.media3.exoplayer.mediacodec.n r8 = new androidx.media3.exoplayer.mediacodec.n
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L3d
            int r2 = androidx.media3.common.util.M.f47887a
            r3 = 19
            if (r2 < r3) goto L3d
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            r3 = 22
            if (r2 > r3) goto L3b
            java.lang.String r2 = androidx.media3.common.util.M.f47890d
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
            int r3 = androidx.media3.common.util.M.f47887a
            if (r3 < r2) goto L4c
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r12.isFeatureSupported(r3)
        L4c:
            if (r14 != 0) goto L5f
            if (r12 == 0) goto L5d
            int r14 = androidx.media3.common.util.M.f47887a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):androidx.media3.exoplayer.mediacodec.n");
    }

    public final C23139h b(C23108t c23108t, C23108t c23108t2) {
        int i12 = !M.a(c23108t.f47757m, c23108t2.f47757m) ? 8 : 0;
        if (this.f49393h) {
            if (c23108t.f47765u != c23108t2.f47765u) {
                i12 |= 1024;
            }
            if (!this.f49390e && (c23108t.f47762r != c23108t2.f47762r || c23108t.f47763s != c23108t2.f47763s)) {
                i12 |= 512;
            }
            if (!M.a(c23108t.f47769y, c23108t2.f47769y)) {
                i12 |= 2048;
            }
            if (M.f47890d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f49386a) && !c23108t.g(c23108t2)) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new C23139h(this.f49386a, c23108t, c23108t2, c23108t.g(c23108t2) ? 3 : 2, 0);
            }
        } else {
            if (c23108t.f47770z != c23108t2.f47770z) {
                i12 |= 4096;
            }
            if (c23108t.f47737A != c23108t2.f47737A) {
                i12 |= 8192;
            }
            if (c23108t.f47738B != c23108t2.f47738B) {
                i12 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str = this.f49387b;
            if (i12 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair<Integer, Integer> pairD = MediaCodecUtil.d(c23108t);
                Pair<Integer, Integer> pairD2 = MediaCodecUtil.d(c23108t2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C23139h(this.f49386a, c23108t, c23108t2, 3, 0);
                    }
                }
            }
            if (!c23108t.g(c23108t2)) {
                i12 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new C23139h(this.f49386a, c23108t, c23108t2, 1, 0);
            }
        }
        return new C23139h(this.f49386a, c23108t, c23108t2, 0, i12);
    }

    public final boolean c(C23108t c23108t, boolean z12) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair<Integer, Integer> pairD = MediaCodecUtil.d(c23108t);
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c23108t.f47757m);
        int i12 = 8;
        String str = this.f49387b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.f49393h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f49389d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (M.f47887a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i12 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i12 = 512;
            } else if (iIntValue3 >= 60000000) {
                i12 = 256;
            } else if (iIntValue3 >= 30000000) {
                i12 = 128;
            } else if (iIntValue3 >= 18000000) {
                i12 = 64;
            } else if (iIntValue3 >= 12000000) {
                i12 = 32;
            } else if (iIntValue3 >= 7200000) {
                i12 = 16;
            } else if (iIntValue3 < 3600000) {
                i12 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i12;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z12)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = M.f47888b;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + c23108t.f47754j + ", " + this.f49388c);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(androidx.media3.common.C23108t r9) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.n.d(androidx.media3.common.t):boolean");
    }

    public final boolean e(C23108t c23108t) {
        if (this.f49393h) {
            return this.f49390e;
        }
        Pair<Integer, Integer> pairD = MediaCodecUtil.d(c23108t);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    @X
    public final boolean f(int i12, int i13, double d12) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f49389d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (M.f47887a >= 29) {
            int iA2 = a.a(videoCapabilities, i12, i13, d12);
            if (iA2 == 2) {
                return true;
            }
            if (iA2 == 1) {
                StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "sizeAndRate.cover, ", "x", "@");
                sbY.append(d12);
                g(sbY.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i12, i13, d12)) {
            if (i12 >= i13 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f49386a) && "mcv5a".equals(M.f47888b)) || !a(videoCapabilities, i13, i12, d12))) {
                StringBuilder sbY2 = androidx.appcompat.app.r.y(i12, i13, "sizeAndRate.support, ", "x", "@");
                sbY2.append(d12);
                g(sbY2.toString());
                return false;
            }
            androidx.appcompat.app.r.y(i12, i13, "sizeAndRate.rotated, ", "x", "@").append(d12);
            int i14 = M.f47887a;
            androidx.media3.common.util.s.b();
        }
        return true;
    }

    public final void g(String str) {
        int i12 = M.f47887a;
        androidx.media3.common.util.s.b();
    }

    public final String toString() {
        return this.f49386a;
    }
}
