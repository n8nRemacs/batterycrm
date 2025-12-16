package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* loaded from: classes8.dex */
public final class yh<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAd f392012a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final rj0 f392013b = new rj0();

    public yh(@j.N NativeAd nativeAd) {
        this.f392012a = nativeAd;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f392013b.getClass();
        TextView textView = (TextView) v12.findViewById(R.id.call_to_action);
        NativeAdType adType = this.f392012a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == NativeAdType.APP_INSTALL) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
