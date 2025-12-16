package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;

/* loaded from: classes8.dex */
public final class a8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final i8 f383432a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f383433b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final h8 f383434c = new h8();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final e8 f383435d;

    public a8(@j.N Context context, @j.N i8 i8Var) {
        this.f383433b = context;
        this.f383432a = i8Var;
        this.f383435d = new e8(context);
    }

    @j.N
    @SuppressLint({"InflateParams"})
    public final ViewGroup a() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f383433b).inflate(R.layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        this.f383434c.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R.id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f383435d);
        }
        this.f383434c.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.adtune_webview_container);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f383432a);
        }
        return viewGroup;
    }
}
