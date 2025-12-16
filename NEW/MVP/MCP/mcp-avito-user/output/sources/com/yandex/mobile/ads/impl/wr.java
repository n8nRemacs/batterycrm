package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.vw;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class wr {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f391478a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f391479b = {-1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f391480c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static vw a(byte[] bArr, @j.P String str, @j.P String str2) {
        or0 or0Var;
        if (bArr[0] == 127) {
            or0Var = new or0(bArr.length, bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b12 = bArrCopyOf[0];
            if (b12 == -2 || b12 == -1) {
                for (int i12 = 0; i12 < bArrCopyOf.length - 1; i12 += 2) {
                    byte b13 = bArrCopyOf[i12];
                    int i13 = i12 + 1;
                    bArrCopyOf[i12] = bArrCopyOf[i13];
                    bArrCopyOf[i13] = b13;
                }
            }
            or0Var = new or0(bArrCopyOf.length, bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                or0 or0Var2 = new or0(bArrCopyOf.length, bArrCopyOf);
                while (or0Var2.b() >= 16) {
                    or0Var2.d(2);
                    or0Var.a(or0Var2.b(14));
                }
            }
            or0Var.a(bArrCopyOf.length, bArrCopyOf);
        }
        or0Var.d(60);
        int i14 = f391478a[or0Var.b(6)];
        int i15 = f391479b[or0Var.b(4)];
        int iB2 = or0Var.b(5);
        int i16 = iB2 < 29 ? (f391480c[iB2] * 1000) / 2 : -1;
        or0Var.d(10);
        return new vw.a().c(str).f("audio/vnd.dts").b(i16).c(i14 + (or0Var.b(2) > 0 ? 1 : 0)).n(i15).a((DrmInitData) null).e(str2).a();
    }
}
