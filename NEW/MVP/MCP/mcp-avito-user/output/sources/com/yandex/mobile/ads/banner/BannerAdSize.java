package com.yandex.mobile.ads.banner;

import android.content.Context;
import j.N;

/* loaded from: classes8.dex */
public final class BannerAdSize extends g {
    private static final long serialVersionUID = 2680092174282737642L;

    public BannerAdSize(int i12, int i13, @N int i14) {
        super(i12, i13, i14);
    }

    @N
    public static BannerAdSize fixedSize(@N Context context, int i12, int i13) {
        return new BannerAdSize(i12, i13, 1);
    }

    @N
    public static BannerAdSize inlineSize(@N Context context, int i12, int i13) {
        return new BannerAdSize(i12, i13, 2);
    }

    @N
    public static BannerAdSize stickySize(@N Context context, int i12) {
        return l.a(context, i12);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public int getHeight() {
        return super.getHeight();
    }

    @Override // com.yandex.mobile.ads.banner.g
    public int getHeightInPixels(@N Context context) {
        return super.getHeightInPixels(context);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public int getWidth() {
        return super.getWidth();
    }

    @Override // com.yandex.mobile.ads.banner.g
    public int getWidthInPixels(@N Context context) {
        return super.getWidthInPixels(context);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public int getHeight(@N Context context) {
        return super.getHeight(context);
    }

    @Override // com.yandex.mobile.ads.banner.g
    public int getWidth(@N Context context) {
        return super.getWidth(context);
    }
}
