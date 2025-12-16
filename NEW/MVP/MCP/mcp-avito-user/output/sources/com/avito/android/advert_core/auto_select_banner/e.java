package com.avito.android.advert_core.auto_select_banner;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import hc.C40912b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/auto_select_banner/e;", "Lcom/avito/android/advert_core/auto_select_banner/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f82906b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82907c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f82908d;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k @InterfaceC30174s String str, @k InterfaceC28373a interfaceC28373a) {
        this.f82906b = aVar;
        this.f82907c = str;
        this.f82908d = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AutoSelectBannerItem autoSelectBannerItem = (AutoSelectBannerItem) aVar;
        C40912b.a aVar2 = C40912b.f397290g;
        String str = autoSelectBannerItem.f82894f;
        aVar2.getClass();
        this.f82908d.c(C40912b.a.a(this.f82907c, str, autoSelectBannerItem.f82893e));
        gVar.g5(autoSelectBannerItem.f82897i);
        gVar.e(autoSelectBannerItem.f82890b);
        gVar.g(autoSelectBannerItem.f82891c);
        Image image = autoSelectBannerItem.f82895g;
        if (image != null) {
            gVar.l(image);
        }
        UniversalImage universalImage = autoSelectBannerItem.f82896h;
        if (universalImage != null) {
            gVar.pm(universalImage);
        }
        gVar.Az(autoSelectBannerItem.f82892d, new d(this, autoSelectBannerItem));
    }
}
