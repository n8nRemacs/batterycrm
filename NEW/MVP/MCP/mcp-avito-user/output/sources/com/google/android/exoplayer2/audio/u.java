package com.google.android.exoplayer2.audio;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import j.P;

/* compiled from: MpegAudioUtil.java */
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f344088a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f344089b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f344090c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f344091d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f344092e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f344093f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f344094g = {JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f344095a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f344096b;

        /* renamed from: c, reason: collision with root package name */
        public int f344097c;

        /* renamed from: d, reason: collision with root package name */
        public int f344098d;

        /* renamed from: e, reason: collision with root package name */
        public int f344099e;

        /* renamed from: f, reason: collision with root package name */
        public int f344100f;

        /* renamed from: g, reason: collision with root package name */
        public int f344101g;

        public final boolean a(int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            if (!((i12 & (-2097152)) == -2097152) || (i13 = (i12 >>> 19) & 3) == 1 || (i14 = (i12 >>> 17) & 3) == 0 || (i15 = (i12 >>> 12) & 15) == 0 || i15 == 15 || (i16 = (i12 >>> 10) & 3) == 3) {
                return false;
            }
            this.f344095a = i13;
            this.f344096b = u.f344088a[3 - i14];
            int i17 = u.f344089b[i16];
            this.f344098d = i17;
            if (i13 == 2) {
                this.f344098d = i17 / 2;
            } else if (i13 == 0) {
                this.f344098d = i17 / 4;
            }
            int i18 = (i12 >>> 9) & 1;
            int i19 = 1152;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i19 = 384;
                }
            } else if (i13 != 3) {
                i19 = 576;
            }
            this.f344101g = i19;
            if (i14 == 3) {
                int i22 = i13 == 3 ? u.f344090c[i15 - 1] : u.f344091d[i15 - 1];
                this.f344100f = i22;
                this.f344097c = (((i22 * 12) / this.f344098d) + i18) * 4;
            } else {
                if (i13 == 3) {
                    int i23 = i14 == 2 ? u.f344092e[i15 - 1] : u.f344093f[i15 - 1];
                    this.f344100f = i23;
                    this.f344097c = ((i23 * 144) / this.f344098d) + i18;
                } else {
                    int i24 = u.f344094g[i15 - 1];
                    this.f344100f = i24;
                    this.f344097c = (((i14 == 1 ? 72 : 144) * i24) / this.f344098d) + i18;
                }
            }
            this.f344099e = ((i12 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        if (!((i12 & (-2097152)) == -2097152) || (i13 = (i12 >>> 19) & 3) == 1 || (i14 = (i12 >>> 17) & 3) == 0 || (i15 = (i12 >>> 12) & 15) == 0 || i15 == 15 || (i16 = (i12 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f344089b[i16];
        if (i13 == 2) {
            i17 /= 2;
        } else if (i13 == 0) {
            i17 /= 4;
        }
        int i18 = (i12 >>> 9) & 1;
        if (i14 == 3) {
            return ((((i13 == 3 ? f344090c[i15 - 1] : f344091d[i15 - 1]) * 12) / i17) + i18) * 4;
        }
        int i19 = i13 == 3 ? i14 == 2 ? f344092e[i15 - 1] : f344093f[i15 - 1] : f344094g[i15 - 1];
        if (i13 == 3) {
            return androidx.compose.ui.graphics.colorspace.e.e(i19, 144, i17, i18);
        }
        return androidx.compose.ui.graphics.colorspace.e.e(i14 == 1 ? 72 : 144, i19, i17, i18);
    }

    public static int b(int i12) {
        int i13;
        int i14;
        if (!((i12 & (-2097152)) == -2097152) || (i13 = (i12 >>> 19) & 3) == 1 || (i14 = (i12 >>> 17) & 3) == 0) {
            return -1;
        }
        int i15 = (i12 >>> 12) & 15;
        int i16 = (i12 >>> 10) & 3;
        if (i15 == 0 || i15 == 15 || i16 == 3) {
            return -1;
        }
        if (i14 == 1) {
            return i13 == 3 ? 1152 : 576;
        }
        if (i14 == 2) {
            return 1152;
        }
        if (i14 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
