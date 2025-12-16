package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
final class kx implements vl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final oj f387276a;

    public kx(@j.N oj ojVar) {
        this.f387276a = ojVar;
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void a(@j.N RelativeLayout relativeLayout) {
        relativeLayout.setBackground(y5.f391932b);
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void b() {
        this.f387276a.b();
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void c() {
        this.f387276a.c();
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void d() {
        this.f387276a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.vl
    @j.N
    public final RelativeLayout a(@j.N wx wxVar, @j.N AdResponse adResponse) {
        Context context = wxVar.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(wxVar, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.f387276a.d(), z5.a(context, wxVar));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void a(boolean z12) {
        this.f387276a.a(z12);
    }

    @Override // com.yandex.mobile.ads.impl.vl
    public final void a() {
        this.f387276a.a();
    }
}
