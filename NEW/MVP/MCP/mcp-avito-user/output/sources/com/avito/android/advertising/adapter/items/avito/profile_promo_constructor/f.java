package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import Ca1.ViewOnClickListenerC13236c;
import Db.InterfaceC13381a;
import Y61.k;
import android.view.View;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.D;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.deep_linking.x;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ob.InterfaceC44739c;

/* compiled from: ProfilePromoConstructorPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/f;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/d;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44739c> f87190b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x f87191c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f87192d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advertising.kebab.f f87193e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC13381a f87194f;

    @Inject
    public f(@k h31.e<InterfaceC44739c> eVar, @k x xVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.advertising.kebab.f fVar, @k InterfaceC13381a interfaceC13381a) {
        this.f87190b = eVar;
        this.f87191c = xVar;
        this.f87192d = aVar;
        this.f87193e = fVar;
        this.f87194f = interfaceC13381a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AvitoNetworkBanner.MarkInfo markInfo;
        h hVar = (h) eVar;
        ProfilePromoBannerItem profilePromoBannerItem = (ProfilePromoBannerItem) aVar;
        D banner = profilePromoBannerItem.getBanner();
        h31.e<InterfaceC44739c> eVar2 = this.f87190b;
        WeakReference weakReference = new WeakReference(eVar2);
        BannerInfo f74925c = profilePromoBannerItem.getF74925c();
        AvitoNetworkBanner.MarkInfo f88006h = profilePromoBannerItem.getBanner().getF88006h();
        if (f88006h != null) {
            com.avito.android.advertising.ui.h.f88704a.getClass();
            String strG = com.avito.android.advertising.ui.h.g(f88006h.f87980b, f88006h.f87982d);
            if (strG == null) {
                strG = "";
            }
            markInfo = new AvitoNetworkBanner.MarkInfo(strG, f88006h.f87981c, null);
        } else {
            markInfo = null;
        }
        if (this.f87194f.f()) {
            com.avito.android.advertising.ui.h hVar2 = com.avito.android.advertising.ui.h.f88704a;
            View f87203b = hVar.getF87203b();
            hVar2.getClass();
            com.avito.android.advertising.ui.h.b(f87203b, profilePromoBannerItem);
        }
        InterfaceC44739c interfaceC44739c = eVar2.get();
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(f74925c, i12);
        }
        hVar.Xa(!profilePromoBannerItem.getIsHidden());
        hVar.setTitle(banner.getF88000b());
        hVar.h(banner.getF88001c());
        hVar.j1(banner.getF88002d());
        hVar.vG(markInfo);
        hVar.setOnClickListener(new com.avito.android.advertising.adapter.items.avito.bdui.d(weakReference, f74925c, i12, this, banner));
        hVar.FY(new ViewOnClickListenerC13236c(this, profilePromoBannerItem, markInfo, 15));
        hVar.d(new e(hVar));
    }
}
