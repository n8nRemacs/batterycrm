package com.avito.android.ui.view;

import Y61.k;
import android.annotation.SuppressLint;
import b31.C25402a;
import b31.C25404c;
import com.yatatsu.powerwebview.PowerWebView;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: PowerWebViewWrapper.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/view/d;", "Lcom/avito/android/ui/view/c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PowerWebView f304687a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C25402a f304688b;

    public d(@k PowerWebView powerWebView) {
        this.f304687a = powerWebView;
        this.f304688b = C25404c.a(powerWebView);
    }

    public final void a(@k com.yatatsu.powerwebview.d dVar) {
        this.f304687a.a(dVar);
    }

    @SuppressLint({"JavascriptInterface"})
    public final void b(@k Object obj, @k String str) {
        this.f304687a.addJavascriptInterface(obj, str);
    }

    public final boolean c() {
        PowerWebView powerWebView = this.f304687a;
        if (!powerWebView.canGoBack()) {
            return false;
        }
        powerWebView.goBack();
        return true;
    }

    public final void d(@k String str) {
        this.f304687a.loadUrl(str);
    }

    public final void e(@k String str) {
        this.f304687a.removeJavascriptInterface(str);
    }
}
