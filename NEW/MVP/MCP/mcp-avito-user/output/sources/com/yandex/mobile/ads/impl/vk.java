package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* loaded from: classes8.dex */
public final class vk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f390902a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final oj0 f390903b = new oj0();

    /* renamed from: c, reason: collision with root package name */
    private final int f390904c;

    public vk(@j.N NativeAdAssets nativeAdAssets, int i12) {
        this.f390902a = nativeAdAssets;
        this.f390904c = i12;
    }

    @j.P
    public final ImageView a(@j.N View view) {
        return a(view, 1, this.f390902a.getFavicon());
    }

    @j.P
    public final ImageView b(@j.N View view) {
        return a(view, 2, this.f390902a.getIcon());
    }

    @j.P
    private ImageView a(@j.N View view, @j.N int i12, @j.P NativeAdImage nativeAdImage) {
        int i13 = this.f390902a.getIcon() != null ? 2 : this.f390902a.getFavicon() != null ? 1 : 3;
        if (nativeAdImage == null || i13 != i12) {
            return null;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        int i14 = this.f390904c;
        if (i14 <= width && i14 <= height) {
            this.f390903b.getClass();
            return (ImageView) view.findViewById(R.id.icon_large);
        }
        this.f390903b.getClass();
        return (ImageView) view.findViewById(R.id.icon_small);
    }
}
