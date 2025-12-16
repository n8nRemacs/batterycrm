package com.avito.android.advertising.adapter.items.avito;

import Db.InterfaceC13381a;
import Fb.InterfaceC13553c;
import Y61.k;
import android.view.View;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import ob.InterfaceC44739c;

/* compiled from: AvitoNetworkImagePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/f;", "Lcom/avito/android/advertising/adapter/items/avito/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44739c> f87143b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f87144c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advertising.ui.i f87145d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advertising.loaders.event_service.c f87146e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC13381a f87147f;

    @Inject
    public f(@k InterfaceC13381a interfaceC13381a, @k com.avito.android.advertising.loaders.event_service.c cVar, @k com.avito.android.advertising.ui.i iVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k h31.e eVar) {
        this.f87143b = eVar;
        this.f87144c = aVar;
        this.f87145d = iVar;
        this.f87146e = cVar;
        this.f87147f = interfaceC13381a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC13553c interfaceC13553c = (InterfaceC13553c) eVar;
        AvitoNetworkImageBannerItem avitoNetworkImageBannerItem = (AvitoNetworkImageBannerItem) aVar;
        AvitoNetworkBanner.Image banner = avitoNetworkImageBannerItem.getBanner();
        h31.e<InterfaceC44739c> eVar2 = this.f87143b;
        WeakReference weakReference = new WeakReference(eVar2);
        BannerInfo bannerInfo = avitoNetworkImageBannerItem.getBannerInfo();
        WeakReference weakReference2 = new WeakReference(this.f87144c);
        if (this.f87147f.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View view = interfaceC13553c.getView();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(view, avitoNetworkImageBannerItem);
        }
        InterfaceC44739c interfaceC44739c = eVar2.get();
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(bannerInfo, i12);
        }
        interfaceC13553c.j1(banner.f87976b);
        interfaceC13553c.a(new d(weakReference, bannerInfo, i12, this, banner, weakReference2));
        interfaceC13553c.d(new e(interfaceC13553c));
    }
}
