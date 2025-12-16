package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* renamed from: com.yandex.mobile.ads.impl.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39313d {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f384496a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, JosStatusCodes.RTN_CODE_COMMON_ERROR, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f384497b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.yandex.mobile.ads.impl.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f384498a;

        /* renamed from: b, reason: collision with root package name */
        public final int f384499b;

        /* renamed from: c, reason: collision with root package name */
        public final String f384500c;

        public /* synthetic */ a(int i12, int i13, String str, int i14) {
            this(i12, i13, str);
        }

        private a(int i12, int i13, String str) {
            this.f384498a = i12;
            this.f384499b = i13;
            this.f384500c = str;
        }
    }

    public static a a(or0 or0Var, boolean z12) {
        int iB2;
        int iB3;
        int iB4 = or0Var.b(5);
        if (iB4 == 31) {
            iB4 = or0Var.b(6) + 32;
        }
        int iB5 = or0Var.b(4);
        if (iB5 == 15) {
            iB2 = or0Var.b(24);
        } else {
            if (iB5 >= 13) {
                throw tr0.a((String) null, (Exception) null);
            }
            iB2 = f384496a[iB5];
        }
        int iB6 = or0Var.b(4);
        String strA = ba.a("mp4a.40.", iB4);
        if (iB4 == 5 || iB4 == 29) {
            int iB7 = or0Var.b(4);
            if (iB7 == 15) {
                iB3 = or0Var.b(24);
            } else {
                if (iB7 >= 13) {
                    throw tr0.a((String) null, (Exception) null);
                }
                iB3 = f384496a[iB7];
            }
            iB2 = iB3;
            int iB8 = or0Var.b(5);
            if (iB8 == 31) {
                iB8 = or0Var.b(6) + 32;
            }
            iB4 = iB8;
            if (iB4 == 22) {
                iB6 = or0Var.b(4);
            }
        }
        if (z12) {
            if (iB4 != 6 && iB4 != 7 && iB4 != 17 && iB4 != 1 && iB4 != 2 && iB4 != 3 && iB4 != 4) {
                switch (iB4) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw tr0.a("Unsupported audio object type: " + iB4);
                }
            }
            if (or0Var.f()) {
                ka0.d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (or0Var.f()) {
                or0Var.d(14);
            }
            boolean zF2 = or0Var.f();
            if (iB6 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iB4 == 6 || iB4 == 20) {
                or0Var.d(3);
            }
            if (zF2) {
                if (iB4 == 22) {
                    or0Var.d(16);
                }
                if (iB4 == 17 || iB4 == 19 || iB4 == 20 || iB4 == 23) {
                    or0Var.d(3);
                }
                or0Var.d(1);
            }
            switch (iB4) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iB9 = or0Var.b(2);
                    if (iB9 == 2 || iB9 == 3) {
                        throw tr0.a("Unsupported epConfig: " + iB9);
                    }
            }
        }
        int i12 = f384497b[iB6];
        if (i12 != -1) {
            return new a(iB2, i12, strA, 0);
        }
        throw tr0.a((String) null, (Exception) null);
    }
}
