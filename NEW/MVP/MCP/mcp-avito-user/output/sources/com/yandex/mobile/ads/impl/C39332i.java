package com.yandex.mobile.ads.impl;

import com.facebook.imageutils.JfifUtil;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.vw;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39332i {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f386248a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f386249b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f386250c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f386251d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f386252e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f386253f = {69, 87, 104, 121, 139, 174, JfifUtil.MARKER_RST0, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.yandex.mobile.ads.impl.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final String f386254a;

        /* renamed from: b, reason: collision with root package name */
        public final int f386255b;

        /* renamed from: c, reason: collision with root package name */
        public final int f386256c;

        /* renamed from: d, reason: collision with root package name */
        public final int f386257d;

        /* renamed from: e, reason: collision with root package name */
        public final int f386258e;

        public /* synthetic */ a(String str, int i12, int i13, int i14, int i15, int i16) {
            this(str, i13, i14, i15, i16);
        }

        private a(@j.P String str, int i12, int i13, int i14, int i15) {
            this.f386254a = str;
            this.f386256c = i12;
            this.f386255b = i13;
            this.f386257d = i14;
            this.f386258e = i15;
        }
    }

    public static vw a(pr0 pr0Var, String str, String str2, @j.P DrmInitData drmInitData) {
        int i12 = f386249b[(pr0Var.t() & 192) >> 6];
        int iT2 = pr0Var.t();
        int i13 = f386251d[(iT2 & 56) >> 3];
        if ((iT2 & 4) != 0) {
            i13++;
        }
        return new vw.a().c(str).f("audio/ac3").c(i13).n(i12).a(drmInitData).e(str2).a();
    }

    public static vw b(pr0 pr0Var, String str, String str2, @j.P DrmInitData drmInitData) {
        pr0Var.f(2);
        int i12 = f386249b[(pr0Var.t() & 192) >> 6];
        int iT2 = pr0Var.t();
        int i13 = f386251d[(iT2 & 14) >> 1];
        if ((iT2 & 1) != 0) {
            i13++;
        }
        if (((pr0Var.t() & 30) >> 1) > 0 && (2 & pr0Var.t()) != 0) {
            i13 += 2;
        }
        return new vw.a().c(str).f((pr0Var.a() <= 0 || (pr0Var.t() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").c(i13).n(i12).a(drmInitData).e(str2).a();
    }

    public static a a(or0 or0Var) {
        int iA2;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int iB2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        int iE2 = or0Var.e();
        or0Var.d(40);
        boolean z12 = or0Var.b(5) > 10;
        or0Var.c(iE2);
        int i22 = -1;
        if (z12) {
            or0Var.d(16);
            int iB3 = or0Var.b(2);
            if (iB3 == 0) {
                i22 = 0;
            } else if (iB3 == 1) {
                i22 = 1;
            } else if (iB3 == 2) {
                i22 = 2;
            }
            or0Var.d(3);
            iA2 = (or0Var.b(11) + 1) * 2;
            int iB4 = or0Var.b(2);
            if (iB4 == 3) {
                i12 = f386250c[or0Var.b(2)];
                i16 = 6;
                iB2 = 3;
            } else {
                iB2 = or0Var.b(2);
                i16 = f386248a[iB2];
                i12 = f386249b[iB4];
            }
            i14 = i16 * 256;
            int iB5 = or0Var.b(3);
            boolean zF2 = or0Var.f();
            i13 = f386251d[iB5] + (zF2 ? 1 : 0);
            or0Var.d(10);
            if (or0Var.f()) {
                or0Var.d(8);
            }
            if (iB5 == 0) {
                or0Var.d(5);
                if (or0Var.f()) {
                    or0Var.d(8);
                }
            }
            if (i22 == 1 && or0Var.f()) {
                or0Var.d(16);
            }
            if (or0Var.f()) {
                if (iB5 > 2) {
                    or0Var.d(2);
                }
                if ((iB5 & 1) == 0 || iB5 <= 2) {
                    i18 = 6;
                } else {
                    i18 = 6;
                    or0Var.d(6);
                }
                if ((iB5 & 4) != 0) {
                    or0Var.d(i18);
                }
                if (zF2 && or0Var.f()) {
                    or0Var.d(5);
                }
                if (i22 == 0) {
                    if (or0Var.f()) {
                        i19 = 6;
                        or0Var.d(6);
                    } else {
                        i19 = 6;
                    }
                    if (iB5 == 0 && or0Var.f()) {
                        or0Var.d(i19);
                    }
                    if (or0Var.f()) {
                        or0Var.d(i19);
                    }
                    int iB6 = or0Var.b(2);
                    if (iB6 == 1) {
                        or0Var.d(5);
                    } else if (iB6 == 2) {
                        or0Var.d(12);
                    } else if (iB6 == 3) {
                        int iB7 = or0Var.b(5);
                        if (or0Var.f()) {
                            or0Var.d(5);
                            if (or0Var.f()) {
                                or0Var.d(4);
                            }
                            if (or0Var.f()) {
                                or0Var.d(4);
                            }
                            if (or0Var.f()) {
                                or0Var.d(4);
                            }
                            if (or0Var.f()) {
                                or0Var.d(4);
                            }
                            if (or0Var.f()) {
                                or0Var.d(4);
                            }
                            if (or0Var.f()) {
                                or0Var.d(4);
                            }
                            if (or0Var.f()) {
                                or0Var.d(4);
                            }
                            if (or0Var.f()) {
                                if (or0Var.f()) {
                                    or0Var.d(4);
                                }
                                if (or0Var.f()) {
                                    or0Var.d(4);
                                }
                            }
                        }
                        if (or0Var.f()) {
                            or0Var.d(5);
                            if (or0Var.f()) {
                                or0Var.d(7);
                                if (or0Var.f()) {
                                    or0Var.d(8);
                                }
                            }
                        }
                        or0Var.d((iB7 + 2) * 8);
                        or0Var.c();
                    }
                    if (iB5 < 2) {
                        if (or0Var.f()) {
                            or0Var.d(14);
                        }
                        if (iB5 == 0 && or0Var.f()) {
                            or0Var.d(14);
                        }
                    }
                    if (or0Var.f()) {
                        if (iB2 == 0) {
                            or0Var.d(5);
                        } else {
                            for (int i23 = 0; i23 < i16; i23++) {
                                if (or0Var.f()) {
                                    or0Var.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (or0Var.f()) {
                or0Var.d(5);
                if (iB5 == 2) {
                    or0Var.d(4);
                }
                if (iB5 >= 6) {
                    or0Var.d(2);
                }
                if (or0Var.f()) {
                    or0Var.d(8);
                }
                if (iB5 == 0 && or0Var.f()) {
                    or0Var.d(8);
                }
                if (iB4 < 3) {
                    or0Var.h();
                }
            }
            if (i22 == 0 && iB2 != 3) {
                or0Var.h();
            }
            if (i22 == 2 && (iB2 == 3 || or0Var.f())) {
                i17 = 6;
                or0Var.d(6);
            } else {
                i17 = 6;
            }
            if (or0Var.f() && or0Var.b(i17) == 1 && or0Var.b(8) == 1) {
                str2 = "audio/eac3-joc";
            } else {
                str2 = "audio/eac3";
            }
            str = str2;
            i15 = i22;
        } else {
            or0Var.d(32);
            int iB8 = or0Var.b(2);
            String str3 = iB8 == 3 ? null : "audio/ac3";
            iA2 = a(iB8, or0Var.b(6));
            or0Var.d(8);
            int iB9 = or0Var.b(3);
            if ((iB9 & 1) != 0 && iB9 != 1) {
                or0Var.d(2);
            }
            if ((iB9 & 4) != 0) {
                or0Var.d(2);
            }
            if (iB9 == 2) {
                or0Var.d(2);
            }
            i12 = iB8 < 3 ? f386249b[iB8] : -1;
            i13 = f386251d[iB9] + (or0Var.f() ? 1 : 0);
            i14 = 1536;
            i15 = -1;
            str = str3;
        }
        return new a(str, i15, i13, i12, iA2, i14);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b12 = bArr[4];
        return a((b12 & 192) >> 6, b12 & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f386248a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int a(int i12, int i13) {
        int i14 = i13 / 2;
        if (i12 < 0) {
            return -1;
        }
        int[] iArr = f386249b;
        if (i12 >= 3 || i13 < 0) {
            return -1;
        }
        int[] iArr2 = f386253f;
        if (i14 >= 19) {
            return -1;
        }
        int i15 = iArr[i12];
        if (i15 == 44100) {
            return ((i13 % 2) + iArr2[i14]) * 2;
        }
        int i16 = f386252e[i14];
        return i15 == 32000 ? i16 * 6 : i16 * 4;
    }
}
