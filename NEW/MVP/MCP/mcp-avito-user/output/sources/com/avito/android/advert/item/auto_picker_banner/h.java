package com.avito.android.advert.item.auto_picker_banner;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsAutoPickerBanner;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoPickerBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/auto_picker_banner/h;", "LTV0/d;", "Lcom/avito/android/advert/item/auto_picker_banner/j;", "Lcom/avito/android/advert/item/auto_picker_banner/AutoPickerBannerItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements TV0.d<j, AutoPickerBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f72987b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f72988c;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a aVar2) {
        this.f72987b = aVar;
        this.f72988c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        jVar.bv(new f(this));
        AdvertDetailsAutoPickerBanner advertDetailsAutoPickerBanner = ((AutoPickerBannerItem) aVar).f72972d;
        jVar.v(advertDetailsAutoPickerBanner.getBackgroundColor());
        jVar.b(advertDetailsAutoPickerBanner.getTitle());
        jVar.j(advertDetailsAutoPickerBanner.getSubtitle());
        jVar.zy(advertDetailsAutoPickerBanner.getImage());
        AdvertDetailsAutoPickerBanner.AutoPickerButton button = advertDetailsAutoPickerBanner.getButton();
        if (button == null) {
            jVar.L1();
            return;
        }
        jVar.M10(button.getTitle(), button.getStyle());
        DeepLink deepLink = button.getDeepLink();
        if (deepLink != null) {
            jVar.FE(new g(this, deepLink));
        } else {
            jVar.FE(null);
        }
    }
}
