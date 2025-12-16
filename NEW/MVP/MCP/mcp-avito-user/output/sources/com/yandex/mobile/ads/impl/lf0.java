package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class lf0 implements com.monetization.ads.mediation.nativeads.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final View f387457a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.nativeads.c0 f387458b;

    public lf0(@Y61.k View view, @Y61.k com.yandex.mobile.ads.nativeads.c0 c0Var) {
        this.f387457a = view;
        this.f387458b = c0Var;
    }

    @Y61.l
    public final TextView getAgeView() {
        return this.f387458b.a();
    }

    @Y61.l
    public final TextView getBodyView() {
        return this.f387458b.c();
    }

    @Y61.l
    public final TextView getCallToActionView() {
        return this.f387458b.d();
    }

    @Y61.l
    public final TextView getDomainView() {
        return this.f387458b.f();
    }

    @Y61.l
    public final ImageView getFeedbackView() {
        return this.f387458b.g();
    }

    @Y61.l
    public final ImageView getIconView() {
        return this.f387458b.h();
    }

    @Y61.l
    public final FrameLayout getMediaView() {
        return this.f387458b.j();
    }

    @Y61.k
    public final View getNativeAdView() {
        return this.f387457a;
    }

    @Y61.l
    public final TextView getPriceView() {
        return this.f387458b.l();
    }

    @Y61.l
    public final View getRatingView() {
        return this.f387458b.m();
    }

    @Y61.l
    public final TextView getReviewCountView() {
        return this.f387458b.n();
    }

    @Y61.l
    public final TextView getSponsoredView() {
        return this.f387458b.o();
    }

    @Y61.l
    public final TextView getTitleView() {
        return this.f387458b.p();
    }

    @Y61.l
    public final TextView getWarningView() {
        return this.f387458b.q();
    }
}
