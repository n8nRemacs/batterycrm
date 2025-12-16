package com.avito.android.advertising.adapter.items.avito.bdui;

import android.net.Uri;
import android.view.View;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.D;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.V2;
import java.lang.ref.WeakReference;
import ob.InterfaceC44738b;
import ob.InterfaceC44739c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f87031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f87032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f87034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f87035g;

    public /* synthetic */ d(WeakReference weakReference, AvitoNetworkBDUIBannerItem avitoNetworkBDUIBannerItem, int i12, TV0.d dVar, WeakReference weakReference2, int i13) {
        this.f87030b = i13;
        this.f87031c = weakReference;
        this.f87032d = avitoNetworkBDUIBannerItem;
        this.f87033e = i12;
        this.f87035g = dVar;
        this.f87034f = weakReference2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC44739c interfaceC44739c;
        InterfaceC44739c interfaceC44739c2;
        switch (this.f87030b) {
            case 0:
                InterfaceC44738b interfaceC44738b = (InterfaceC44738b) this.f87031c.get();
                AvitoNetworkBDUIBannerItem avitoNetworkBDUIBannerItem = (AvitoNetworkBDUIBannerItem) this.f87032d;
                if (interfaceC44738b != null) {
                    interfaceC44738b.C1(avitoNetworkBDUIBannerItem.f87013h, this.f87033e);
                }
                e eVar = (e) this.f87035g;
                AvitoNetworkBanner.BDUI bdui = avitoNetworkBDUIBannerItem.f87014i;
                eVar.f87039e.d(bdui);
                eVar.f87037c.a((com.avito.android.deeplink_handler.handler.composite.a) ((WeakReference) this.f87034f).get(), bdui.f87965e);
                break;
            case 1:
                h31.e eVar2 = (h31.e) this.f87031c.get();
                AvitoNetworkBDUIBannerItem avitoNetworkBDUIBannerItem2 = (AvitoNetworkBDUIBannerItem) this.f87032d;
                if (eVar2 != null && (interfaceC44739c = (InterfaceC44739c) eVar2.get()) != null) {
                    interfaceC44739c.C1(avitoNetworkBDUIBannerItem2.f87013h, this.f87033e);
                }
                l lVar = (l) this.f87035g;
                AvitoNetworkBanner.BDUI bdui2 = avitoNetworkBDUIBannerItem2.f87014i;
                lVar.f87081e.d(bdui2);
                lVar.f87079c.a((com.avito.android.deeplink_handler.handler.composite.a) ((WeakReference) this.f87034f).get(), bdui2.f87965e);
                break;
            default:
                com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.f fVar = (com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.f) this.f87032d;
                D d12 = (D) this.f87035g;
                h31.e eVar3 = (h31.e) this.f87031c.get();
                if (eVar3 != null && (interfaceC44739c2 = (InterfaceC44739c) eVar3.get()) != null) {
                    interfaceC44739c2.C1((BannerInfo) this.f87034f, this.f87033e);
                }
                try {
                    b.a.a(fVar.f87192d, fVar.f87191c.e(Uri.parse(d12.getF88003e())), null, null, 6);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.a("DEFAULT_TAG", "ProfilePromoConstructorPresenterImpl", th2);
                }
                break;
        }
    }

    public /* synthetic */ d(WeakReference weakReference, BannerInfo bannerInfo, int i12, com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.f fVar, D d12) {
        this.f87030b = 2;
        this.f87031c = weakReference;
        this.f87034f = bannerInfo;
        this.f87033e = i12;
        this.f87032d = fVar;
        this.f87035g = d12;
    }
}
