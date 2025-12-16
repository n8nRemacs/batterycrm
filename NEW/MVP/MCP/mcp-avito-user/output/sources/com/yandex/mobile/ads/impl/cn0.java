package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdType;

/* loaded from: classes8.dex */
public final class cn0 {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f384347a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f384348b;

        static {
            int[] iArr = new int[NativeAdType.values().length];
            f384348b = iArr;
            try {
                iArr[NativeAdType.APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f384348b[NativeAdType.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f384348b[NativeAdType.MEDIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[n6.b(3).length];
            f384347a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f384347a[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f384347a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @j.N
    public static int a(@j.N NativeAdType nativeAdType) {
        int i12 = a.f384348b[nativeAdType.ordinal()];
        if (i12 != 1) {
            return (i12 == 2 || i12 != 3) ? 1 : 3;
        }
        return 2;
    }
}
