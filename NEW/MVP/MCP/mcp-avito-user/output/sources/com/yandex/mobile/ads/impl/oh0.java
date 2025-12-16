package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* loaded from: classes8.dex */
public final class oh0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f388534a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f388535b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f388536c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f388537d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f388538e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f388539f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f388540g = {JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f388541a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public String f388542b;

        /* renamed from: c, reason: collision with root package name */
        public int f388543c;

        /* renamed from: d, reason: collision with root package name */
        public int f388544d;

        /* renamed from: e, reason: collision with root package name */
        public int f388545e;

        /* renamed from: f, reason: collision with root package name */
        public int f388546f;

        /* renamed from: g, reason: collision with root package name */
        public int f388547g;

        public final boolean a(int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            if (!oh0.a(i12) || (i13 = (i12 >>> 19) & 3) == 1 || (i14 = (i12 >>> 17) & 3) == 0 || (i15 = (i12 >>> 12) & 15) == 0 || i15 == 15 || (i16 = (i12 >>> 10) & 3) == 3) {
                return false;
            }
            this.f388541a = i13;
            this.f388542b = oh0.f388534a[3 - i14];
            int i17 = oh0.f388535b[i16];
            this.f388544d = i17;
            if (i13 == 2) {
                this.f388544d = i17 / 2;
            } else if (i13 == 0) {
                this.f388544d = i17 / 4;
            }
            int i18 = (i12 >>> 9) & 1;
            this.f388547g = oh0.a(i13, i14);
            if (i14 == 3) {
                int i19 = i13 == 3 ? oh0.f388536c[i15 - 1] : oh0.f388537d[i15 - 1];
                this.f388546f = i19;
                this.f388543c = (((i19 * 12) / this.f388544d) + i18) * 4;
            } else {
                if (i13 == 3) {
                    int i22 = i14 == 2 ? oh0.f388538e[i15 - 1] : oh0.f388539f[i15 - 1];
                    this.f388546f = i22;
                    this.f388543c = ((i22 * 144) / this.f388544d) + i18;
                } else {
                    int i23 = oh0.f388540g[i15 - 1];
                    this.f388546f = i23;
                    this.f388543c = (((i14 == 1 ? 72 : 144) * i23) / this.f388544d) + i18;
                }
            }
            this.f388545e = ((i12 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static boolean a(int i12) {
        return (i12 & (-2097152)) == -2097152;
    }

    public static int b(int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i12 & (-2097152)) != -2097152 || (i13 = (i12 >>> 19) & 3) == 1 || (i14 = (i12 >>> 17) & 3) == 0 || (i15 = (i12 >>> 12) & 15) == 0 || i15 == 15 || (i16 = (i12 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f388535b[i16];
        if (i13 == 2) {
            i17 /= 2;
        } else if (i13 == 0) {
            i17 /= 4;
        }
        int i18 = (i12 >>> 9) & 1;
        if (i14 == 3) {
            return ((((i13 == 3 ? f388536c[i15 - 1] : f388537d[i15 - 1]) * 12) / i17) + i18) * 4;
        }
        int i19 = i13 == 3 ? i14 == 2 ? f388538e[i15 - 1] : f388539f[i15 - 1] : f388540g[i15 - 1];
        if (i13 == 3) {
            return androidx.compose.ui.graphics.colorspace.e.e(i19, 144, i17, i18);
        }
        return androidx.compose.ui.graphics.colorspace.e.e(i14 == 1 ? 72 : 144, i19, i17, i18);
    }

    public static int c(int i12) {
        int i13;
        int i14;
        if ((i12 & (-2097152)) != -2097152 || (i13 = (i12 >>> 19) & 3) == 1 || (i14 = (i12 >>> 17) & 3) == 0) {
            return -1;
        }
        int i15 = (i12 >>> 12) & 15;
        int i16 = (i12 >>> 10) & 3;
        if (i15 != 0 && i15 != 15 && i16 != 3) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        return 384;
                    }
                    throw new IllegalArgumentException();
                }
            } else if (i13 != 3) {
                return 576;
            }
            return 1152;
        }
        return -1;
    }

    public static int a(int i12, int i13) {
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        } else if (i12 != 3) {
            return 576;
        }
        return 1152;
    }
}
