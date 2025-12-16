package com.avito.android.advertising.adapter.items.avito.bdui;

import Db.InterfaceC13381a;
import android.view.View;
import com.avito.android.advertising.loaders.BannerInfo;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ob.InterfaceC44739c;

/* compiled from: AvitoNetworkBDUIPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/l;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/k;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87078b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.i f87079c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87080d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87081e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87082f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87083g;

    @Inject
    public l(@Y61.k h31.e<InterfaceC44739c> eVar, @Y61.k com.avito.android.advertising.ui.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k InterfaceC13381a interfaceC13381a, @Y61.k com.avito.android.advertising.a aVar2) {
        this.f87078b = eVar;
        this.f87079c = iVar;
        this.f87080d = aVar;
        this.f87081e = cVar;
        this.f87082f = interfaceC13381a;
        this.f87083g = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        p pVar = (p) eVar;
        AvitoNetworkBDUIBannerItem avitoNetworkBDUIBannerItem = (AvitoNetworkBDUIBannerItem) aVar;
        h31.e<InterfaceC44739c> eVar2 = this.f87078b;
        WeakReference weakReference = new WeakReference(eVar2);
        WeakReference weakReference2 = new WeakReference(this.f87080d);
        if (this.f87082f.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View view = pVar.getView();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(view, avitoNetworkBDUIBannerItem);
        }
        InterfaceC44739c interfaceC44739c = eVar2.get();
        BannerInfo bannerInfo = avitoNetworkBDUIBannerItem.f87013h;
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(bannerInfo, i12);
        }
        pVar.Ax(avitoNetworkBDUIBannerItem.f87014i, new d(weakReference, avitoNetworkBDUIBannerItem, i12, this, weakReference2, 1));
        boolean zF2 = L.f(bannerInfo.getBannerCode(), "root_widget_android");
        if (this.f87083g.b() || !zF2) {
            return;
        }
        pVar.NE();
    }
}
