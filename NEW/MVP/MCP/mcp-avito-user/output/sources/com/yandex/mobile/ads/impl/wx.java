package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.j00;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class wx extends j00 {

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final ll1 f391508n;

    public wx(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        super(context, adResponse, n2Var);
        this.f391508n = new ll1(this);
    }

    @Override // com.yandex.mobile.ads.impl.nr0
    public final void b(Context context) {
        super.b(context);
        WebSettings settings = getSettings();
        settings.setDatabasePath(getContext().getDatabasePath("com.yandex.mobile.ads.db").getAbsolutePath());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
    }

    @Override // com.yandex.mobile.ads.impl.j00
    @SuppressLint({"AddJavascriptInterface"})
    public final void c(@j.N Context context) {
        addJavascriptInterface(new j00.a(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.nr0
    public final void h() {
        this.f391508n.a(i());
    }
}
