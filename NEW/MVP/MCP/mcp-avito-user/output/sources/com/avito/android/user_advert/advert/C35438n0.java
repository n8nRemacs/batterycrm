package com.avito.android.user_advert.advert;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.user_advert.advert.delegate.auto_select_close.i;
import hc.C40911a;
import iI0.C41303h;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_advert.advert.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35438n0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.delegate.auto_select_close.i f310567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.a f310568m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f310569n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MyAdvertAutoSelect.MyAdvertAutoSelectButton f310570o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35438n0(com.avito.android.user_advert.advert.delegate.auto_select_close.i iVar, l0.a aVar, C35435m0 c35435m0, MyAdvertAutoSelect.MyAdvertAutoSelectButton myAdvertAutoSelectButton) {
        super(0);
        this.f310567l = iVar;
        this.f310568m = aVar;
        this.f310569n = c35435m0;
        this.f310570o = myAdvertAutoSelectButton;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        i.a aVar = (i.a) this.f310567l;
        String title = aVar.f308555a.getTitle();
        C35435m0 c35435m0 = this.f310569n;
        if (title != null) {
            if (kotlin.jvm.internal.L.f(aVar.f308555a.getTitle(), "Кешбэк от Авито за покупку автомобиля")) {
                InterfaceC28373a interfaceC28373a = c35435m0.f310480m;
                C40911a.f397284g.getClass();
                interfaceC28373a.c(new C40911a(FromPage.f90018h, title, null, "select_entrypoint", 4, null));
            } else {
                InterfaceC28373a interfaceC28373a2 = c35435m0.f310480m;
                C40911a.f397284g.getClass();
                interfaceC28373a2.c(new C40911a(FromPage.f90017g, title, null, "select_entrypoint", 4, null));
            }
        }
        this.f310568m.f406838b = true;
        MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
        MyAdvertAutoSelect.MyAdvertAutoSelectButton myAdvertAutoSelectButton = this.f310570o;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a(myAdvertAutoSelectButton.getDeeplink());
        }
        DeepLink deeplink = myAdvertAutoSelectButton.getDeeplink();
        WebViewLink webViewLink = deeplink instanceof WebViewLink ? (WebViewLink) deeplink : null;
        if (webViewLink != null) {
            c35435m0.f310480m.c(new C41303h(webViewLink.getF133855b().toString()));
        }
        return kotlin.G0.f406611a;
    }
}
