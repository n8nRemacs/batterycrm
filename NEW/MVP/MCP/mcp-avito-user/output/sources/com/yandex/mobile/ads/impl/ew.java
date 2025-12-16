package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
final class ew implements vl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final oj f385116a;

    public ew(@j.N oj ojVar) {
        this.f385116a = ojVar;
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void a(@j.N RelativeLayout relativeLayout) {
        relativeLayout.setBackground(y5.f391931a);
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void b() {
        this.f385116a.b();
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void c() {
        this.f385116a.c();
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void d() {
        this.f385116a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.vl
    @j.N
    public final RelativeLayout a(@j.N wx wxVar, @j.N AdResponse adResponse) {
        Context context = wxVar.getContext();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParamsA = z5.a(context, adResponse);
        int i12 = rj1.f389556b;
        int iA2 = l41.a(context, 1, 64.0f);
        layoutParamsA.width = Math.min(layoutParamsA.width + iA2, context.getResources().getDisplayMetrics().widthPixels);
        layoutParamsA.height = Math.min(layoutParamsA.height + iA2, context.getResources().getDisplayMetrics().heightPixels);
        relativeLayout.setLayoutParams(layoutParamsA);
        relativeLayout.addView(wxVar, z5.a(context, adResponse));
        relativeLayout.addView(this.f385116a.d(), z5.a(context, wxVar));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void a(boolean z12) {
        this.f385116a.a(z12);
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void a() {
        this.f385116a.a();
    }
}
