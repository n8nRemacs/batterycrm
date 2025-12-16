package com.avito.android.advertising.adapter.items.avito.bdui;

import Db.InterfaceC13381a;
import android.view.View;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import ob.InterfaceC44738b;

/* compiled from: AvitoNetworkAvlBDUIPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/e;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44738b f87036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.i f87037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87038d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87039e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87040f;

    @Inject
    public e(@Y61.k InterfaceC44738b interfaceC44738b, @Y61.k com.avito.android.advertising.ui.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k InterfaceC13381a interfaceC13381a) {
        this.f87036b = interfaceC44738b;
        this.f87037c = iVar;
        this.f87038d = aVar;
        this.f87039e = cVar;
        this.f87040f = interfaceC13381a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        p pVar = (p) eVar;
        AvitoNetworkBDUIBannerItem avitoNetworkBDUIBannerItem = (AvitoNetworkBDUIBannerItem) aVar;
        InterfaceC44738b interfaceC44738b = this.f87036b;
        WeakReference weakReference = new WeakReference(interfaceC44738b);
        WeakReference weakReference2 = new WeakReference(this.f87038d);
        if (this.f87040f.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View view = pVar.getView();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(view, avitoNetworkBDUIBannerItem);
        }
        interfaceC44738b.J4(avitoNetworkBDUIBannerItem.f87013h, i12);
        pVar.Ax(avitoNetworkBDUIBannerItem.f87014i, new d(weakReference, avitoNetworkBDUIBannerItem, i12, this, weakReference2, 0));
        pVar.YG(new com.avito.android.advertising.adapter.items.adstub.avl.b(weakReference, 2));
    }
}
