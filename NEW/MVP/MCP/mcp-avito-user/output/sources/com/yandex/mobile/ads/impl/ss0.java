package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* loaded from: classes8.dex */
public final class ss0<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f390021a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final oj0 f390022b = new oj0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final rj0 f390023c = new rj0();

    public ss0(@j.N NativeAdAssets nativeAdAssets) {
        this.f390021a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f390022b.getClass();
        ImageView imageView = (ImageView) v12.findViewById(R.id.icon_placeholder);
        NativeAdImage icon = this.f390021a.getIcon();
        NativeAdImage favicon = this.f390021a.getFavicon();
        if (imageView != null && icon == null && favicon == null) {
            this.f390023c.getClass();
            gj1 gj1Var = new gj1((TextView) v12.findViewById(R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(gj1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
